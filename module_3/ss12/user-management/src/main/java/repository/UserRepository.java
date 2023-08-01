package repository;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository implements IUserRepository {
    private static final String INSERT_USER = "insert into users (name,email,country) value (?,?,?);";
    private static final String DELETE = "delete from users where id = ?;";
    private static final String SELECT_BY_ID = "select * from users where id = ?;";
    private static final String EDIT = "update user set name = ? , email = ?, country = ? where id = ?;";
    private static final String DISPLAY = "select * from users;";
    private static final String SELECT_COUNTRY = "select * from users where country like ?;";

    @Override
    public void insertUser(User user) {
        Connection connection = Base.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User selectUser(int id) {
        User user = null;
        Connection connection = Base.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(name, email, country);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public Map<Integer, User> selectAllUsers() {
        Map<Integer, User> userMap = new HashMap<>();
        Connection connection = Base.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(DISPLAY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                userMap.put(id, new User(id, name, email, country));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userMap;
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        Connection connection = Base.getConnection();
        PreparedStatement statement = connection.prepareStatement(DELETE);
        statement.setInt(1,id);
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public void updateUser(int id, User user) throws SQLException {
        Connection connection = Base.getConnection();
        PreparedStatement statement = connection.prepareStatement(EDIT);
        statement.setString(1,user.getName());
        statement.setString(2,user.getEmail());
        statement.setString(3,user.getCountry());
        statement.setInt(4,user.getId());
        statement.executeUpdate();
        connection.close();
    }

    @Override
    public List<User> findCountry(String country) {
        List<User> userList = new ArrayList<>();
        Connection connection = Base.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_COUNTRY);
            statement.setString(1,country);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                userList.add(new User(name,email,country));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
