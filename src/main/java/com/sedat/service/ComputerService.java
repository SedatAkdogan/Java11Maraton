package com.sedat.service;

import com.sedat.repository.ComputerRepository;
import com.sedat.repository.entity.Computer;

public class ComputerService {
    ComputerRepository computerRepository;
    public ComputerService(){
        this.computerRepository= new ComputerRepository();
    }

    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }
}
