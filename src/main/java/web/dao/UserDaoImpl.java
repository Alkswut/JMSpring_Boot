package web.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findByUsername(String name) {
        Query query = entityManager.createQuery("FROM User where username =?1");
        query.setParameter(1, name);
        return (User) query.getSingleResult();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(user);
    }

    @Override
    public User getUserById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.find(User.class, id);
    }

    @Override
    public void deleteUser(User user) {
        User merge = entityManager.merge(user);
        entityManager.remove(merge);
    }

    @Override
    public void editUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.update(user);
    }
}