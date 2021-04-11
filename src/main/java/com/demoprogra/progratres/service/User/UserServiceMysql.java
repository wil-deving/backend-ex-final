package com.demoprogra.progratres.service.User;

import com.demoprogra.progratres.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceMysql implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Map<String, String>> getAgentList() {
        return userRepository.getAgentList();
    }
}
