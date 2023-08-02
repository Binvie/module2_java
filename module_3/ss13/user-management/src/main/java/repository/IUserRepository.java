package repository;

import model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IUserRepository {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public Map<Integer,User> selectAllUsers();

    public void deleteUser(int id) throws SQLException;

    public void updateUser( int id,User user) throws SQLException;
    public List<User> findCountry(String country);
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
}
