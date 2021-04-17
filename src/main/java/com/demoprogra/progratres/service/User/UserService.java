package com.demoprogra.progratres.service.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<Map<String, String>> getAgentList();

    public Map<String, String> getUserAuth(String user, String pass);

}
