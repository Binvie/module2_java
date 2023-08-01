package service;

import model.User;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.Map;

public class UserService implements IUserService{
    UserRepository userRepository = new UserRepository();
    @Override
    public void insertUser(User user)  {
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
    }

    @Override
    public void updateUser(int id,User user) throws SQLException {

    }
}
