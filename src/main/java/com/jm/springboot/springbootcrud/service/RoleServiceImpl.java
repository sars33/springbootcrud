package com.jm.springboot.springbootcrud.service;

import com.jm.springboot.springbootcrud.dao.RoleDao;
import com.jm.springboot.springbootcrud.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> allRoles() {
        return roleDao.allRoles();
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public void edit(Role role) {
        roleDao.edit(role);
    }

    @Override
    public void delete(Role role) {
        roleDao.delete(role);
    }

    @Override
    public Role getById(Long id) {
        return roleDao.getByid(id);
    }

    @Override
    public Role getByName(String name) {
        return roleDao.getByName(name);
    }
}

