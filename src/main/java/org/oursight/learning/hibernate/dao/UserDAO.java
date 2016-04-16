package org.oursight.learning.hibernate.dao;

import org.oursight.learning.hibernate.bo.User;
import java.util.List;

/**
 * Created by neyao@github.com on 2016/3/11.
 */
public interface UserDAO {
    public List<User> list();

    public User get(int id);

    public User find(String userName);

    public void saveOrUpdate(User user);

    public void delete(int id);
}
