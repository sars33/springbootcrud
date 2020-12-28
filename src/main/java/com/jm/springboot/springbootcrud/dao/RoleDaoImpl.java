package com.jm.springboot.springbootcrud.dao;

import com.jm.springboot.springbootcrud.model.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> allRoles() {
        return (List<Role>) entityManager.createQuery("from Role").getResultList();
    }

    @Override
    public void add(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void edit(Role role) {
        entityManager.merge(role);
    }

    @Override
    public void delete(Role role) {
        entityManager.remove(role);
    }

    @Override
    public Role getByid(Long id) {
        return entityManager.createQuery("from Role where id = :id", Role.class).setParameter("id", id).getSingleResult();
    }

    @Override
    public Role getByName(String name) {
        return entityManager.find(Role.class, name);
    }
}
