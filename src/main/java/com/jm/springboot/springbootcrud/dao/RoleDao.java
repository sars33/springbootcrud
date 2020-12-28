package com.jm.springboot.springbootcrud.dao;

import com.jm.springboot.springbootcrud.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> allRoles();

    void add(Role role);

    void edit(Role role);

    void delete(Role role);

    Role getByid(Long id);

    Role getByName(String name);
}
