package com.sedat.service;

import com.sedat.repository.UserRepository;
import com.sedat.repository.entity.User;

import java.util.Optional;

public class UserService {

    UserRepository userRepository;

    public UserService() {
        this.userRepository=new UserRepository();
    }


    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> kullaniciAdinaGoreKullaniciBul(String username) {
        return userRepository.kullaniciAdinaGoreKullaniciBul(username);
    }
}
