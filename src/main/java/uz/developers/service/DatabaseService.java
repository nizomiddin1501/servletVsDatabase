package uz.developers.service;

import uz.developers.model.Laptop;
import uz.developers.model.PC;
import uz.developers.model.Printer;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseService {

    private String url = "jdbc:postgresql://localhost:5432/computer_db";
    private String dbUser = "postgres";
    private String dbPassword = "1234";


    Connection connection = null;


    public ArrayList<Laptop> getLaptop() {
        ArrayList<Laptop> laptopArrayList = new ArrayList<Laptop>();
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select model,price from Laptop";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String model = resultSet.getString(1);
                int price = resultSet.getInt(2);
                Laptop laptop = new Laptop(model, price);
                laptopArrayList.add(laptop);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return laptopArrayList;
    }



    public ArrayList<PC> getPC() {
        ArrayList<PC> pcArrayList = new ArrayList<PC>();
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select model,price from PC";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String model = resultSet.getString(1);
                int price = resultSet.getInt(2);
                PC pc = new PC(model, price);
                pcArrayList.add(pc);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return pcArrayList;
    }

    public ArrayList<Printer> getPrinter() {
        ArrayList<Printer> printerArrayList = new ArrayList<Printer>();
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String query = "select model,price from Printer";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String model = resultSet.getString(1);
                int price = resultSet.getInt(2);
                Printer printer = new Printer(model, price);
                printerArrayList.add(printer);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return printerArrayList;
    }
}
