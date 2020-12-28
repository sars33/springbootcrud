package com.jm.springboot.springbootcrud.service;

import com.jm.springboot.springbootcrud.dao.UserDao;
import com.jm.springboot.springbootcrud.model.Role;
import com.jm.springboot.springbootcrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }



    @Override
    @Transactional
    public List<User> showAll() {
        return userDao.showAll();
    }

    @Transactional
    @Override
    public void addAndSave(User user) {
        user.setPassword((passwordEncoder.encode(user.getPassword())));
        userDao.addAndSave(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Transactional
    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public User getUserByName(String login) {
        return userDao.getUserByName(login);
    }

    @Override
    public Role getRoleByName(String role) {
        return userDao.getRoleByName(role);
    }
}



