package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //get - list all ninjas
    public List<NinjaDTO> getNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    //get - find ninja by ID
    public NinjaDTO getNinjaByID(Long id) {
        Optional<NinjaModel> ninjaByID = ninjaRepository.findById(id);
        return ninjaByID.map(ninjaMapper::map).orElse(null);
    }

    //post - create a new ninja
    public NinjaDTO createNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    //delete - delete a ninja
    public String deleteNinjaByID(Long id) {

        if (ninjaRepository.existsById(id)){
            ninjaRepository.deleteById(id);
            return "Ninja deleted succesfully!";
        }else{
            return "Deletion failed! The Ninja selected doesn't exist in database.";
        }
    }

    //put - update a ninja
    public NinjaDTO updateNinja(Long id, NinjaDTO ninja) {
        Optional<NinjaModel> existentNinja = ninjaRepository.findById(id);
        if(existentNinja.isPresent()){
            NinjaModel updatedNinja  = ninjaMapper.map(ninja);
            updatedNinja.setId(id);
            NinjaModel savedNinja = ninjaRepository.save(updatedNinja);
            return ninjaMapper.map(savedNinja);
        }
        return null;
    }

}
