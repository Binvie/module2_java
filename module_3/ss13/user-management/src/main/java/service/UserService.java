package service;

import model.User;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserService implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public Map<Integer, User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        userRepository.deleteUser(id);
    }

    @Override
    public void updateUser(int id, User user) throws SQLException {
        userRepository.updateUser(id, user);
    }

    @Override
    public List<User> findCountry(String country) throws SQLException {
        return userRepository.findCountry(country);
    }

    @Override
    public User getUserById(int id) {
       return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }
}
