package com.jm.springboot.springbootcrud.service;

import com.jm.springboot.springbootcrud.dao.UserDao;
import com.jm.springboot.springbootcrud.model.User;
import com.jm.springboot.springbootcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public  UserDao userDao;

    @Autowired
    private UserRepository userRepository;

    public UserDetailsServiceImpl() {

    }


    @Autowired
    public UserDetailsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByName(username);
      // User user = userRepository.findByUsername(username);
       if(user == null) {
           throw new UsernameNotFoundException("Login and or password was incorrect");
       }
        return user;
    }
}
