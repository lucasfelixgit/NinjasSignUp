package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
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

}
