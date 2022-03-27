package com.company.jdbcintro;
import java.sql.*;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4080);
            System.out.println(statement.executeUpdate());
            System.out.println("kayıt silindi");
        } catch (SQLException exception) {
            dbHelper.showErorMessage(exception);

        } finally {
            statement.close();
            connection.close();


        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Capital,Code2 from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Capital"),
                        resultSet.getString("Code2")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            dbHelper.showErorMessage(exception);

        } finally {
            connection.close();


        }
    }

    public static void insortDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Info) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce");
            statement.setString(2, "TUR");
            statement.setString(3, "Düzce");
            statement.setString(4, "890060");
            System.out.println(statement.executeUpdate());
            System.out.println("kayıt eklendi");
        } catch (SQLException exception) {
            dbHelper.showErorMessage(exception);

        } finally {
            statement.close();
            connection.close();


        }
    }

    public static void updateDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();
            String sql = "update city set Info ='900000',Name='Düzcegüncel' where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4080);
            System.out.println(statement.executeUpdate());
            System.out.println("kayıt değiştirildi");
        } catch (SQLException exception) {
            dbHelper.showErorMessage(exception);

        } finally {
            statement.close();
            connection.close();


        }
    }
}
