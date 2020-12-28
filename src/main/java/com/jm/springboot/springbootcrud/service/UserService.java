package com.jm.springboot.springbootcrud.service;

import com.jm.springboot.springbootcrud.model.Role;
import com.jm.springboot.springbootcrud.model.User;

import java.util.List;

public interface UserService {

    List<User> showAll();

    void addAndSave(User user);

    void delete(Long id);

    void edit(User user);

    User getById(Long id);

    User getUserByName(String login);

    Role getRoleByName(String role);
}


