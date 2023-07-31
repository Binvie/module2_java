package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements IProductRepository{
    private static final String INSERT = "insert into products (name,price,description) value(?,?,?);";
    private static final String DISPLAY = "select * from products;";
    private static final String DELETE = "delete from products where id =?;";
    private static final String UPDATE = "update products set name = ?, price = ?, description = ? where id = ?;";
    @Override
    public Map<Integer, Product> displayList() {
        Map<Integer,Product> productMap = new HashMap<>();
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(DISPLAY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String description = resultSet.getString("description");
                productMap.put(id, new Product(id,name,price,description));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productMap;
    }

    @Override
    public void createProduct(Product product) {
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findByName(int id) {
        return null;
    }

    @Override
    public void editProduct(int id, Product product) {
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2,product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int id) {
        Connection connection = Base.getConnection();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Overrides
    public void save(Product product) {
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2,product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
