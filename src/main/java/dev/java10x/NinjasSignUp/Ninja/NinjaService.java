package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;

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

}
