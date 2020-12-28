package com.jm.springboot.springbootcrud.service;

import com.jm.springboot.springbootcrud.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> allRoles();

    void add(Role role);

    void edit(Role role);

    void delete(Role role);

    Role getById(Long id);

    Role getByName(String name);
}
