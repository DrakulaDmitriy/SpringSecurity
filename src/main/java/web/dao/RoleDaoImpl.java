package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("SELECT role from Role role", Role.class).getResultList();
    }

    @Override
    public Role getRole(String userRole) {
        return entityManager.createQuery("SELECT role from Role role where role.userRole =: userRole", Role.class)
                .setParameter("userRole", userRole).getSingleResult();
    }

    @Override
    public Role getRoleById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }
}
