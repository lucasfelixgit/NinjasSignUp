package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //get - list all ninjas
    public List<NinjaModel> getNinjas() {
        return ninjaRepository.findAll();
    }

    //get - find ninja by ID
    public NinjaModel getNinjaByID(Long id) {
        Optional<NinjaModel> ninjaByID = ninjaRepository.findById(id);
        return ninjaByID.orElse(null);
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
    public NinjaModel updateNinja(Long id, NinjaModel updatedNinja) {

        if (ninjaRepository.existsById(id)){
            updatedNinja.setId(id);
            return ninjaRepository.save(updatedNinja);
        }

        return null;
    }

}
