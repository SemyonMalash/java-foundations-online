package ru.itsjava.jdbc.dao;

import java.sql.*;

public class UserJdbcImpl implements UserDAO {
    public static final String DB_URL = "jdbc:MySql://localhost:3306/new_schema?serverTimezone=UTC";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "root";

    @Override
    public int getAgeByUserName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT age FROM new_schema.users where name = ?")
        ) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;

//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT age FROM new_schema.users where name = '" + name + "'");
//            resultSet.next();
//            return resultSet.getInt("age");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return -1;
    }
}
