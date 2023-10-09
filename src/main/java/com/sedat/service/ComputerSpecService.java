package com.sedat.service;

import com.sedat.repository.ComputerSpecRepository;
import com.sedat.repository.entity.ComputerSpec;

public class ComputerSpecService {

    ComputerSpecRepository computerSpecRepository;
    public ComputerSpecService(){
        this.computerSpecRepository= new ComputerSpecRepository();
    }

    public ComputerSpec save(ComputerSpec computerSpec) {
        return computerSpecRepository.save(computerSpec);
    }
}
