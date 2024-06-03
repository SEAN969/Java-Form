/*
* @authour Sean
* This Form takes in customer details and saves them in the database
* Date-13 September 2023
*
*
 */

package gui;

import databaseconnection.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class GUI extends JFrame {

    private JTextField customerCodeField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField unitNumberField;
    private JTextField streetNumberField;
    private JTextField streetNameField;
    private JTextField townField;
    private JTextField cityField;
    private JButton insertButton;

    public GUI() {
        setTitle("Customer Information Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        customerCodeField = new JTextField(20);
        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        unitNumberField = new JTextField(20);
        streetNumberField = new JTextField(20);
        streetNameField = new JTextField(20);
        townField = new JTextField(20);
        cityField = new JTextField(20);
        insertButton = new JButton("Submit");

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertCustomer();
            }
        });

        setLayout(new GridLayout(9, 2));
        add(new JLabel("Customer Code:"));
        add(customerCodeField);
        add(new JLabel("First Name:"));
        add(firstNameField);
        add(new JLabel("Last Name:"));
        add(lastNameField);
        add(new JLabel("Unit Number:"));
        add(unitNumberField);
        add(new JLabel("Street Number:"));
        add(streetNumberField);
        add(new JLabel("Street Name:"));
        add(streetNameField);
        add(new JLabel("Town:"));
        add(townField);
        add(new JLabel("City:"));
        add(cityField);
        add(insertButton);

        setVisible(true);
    }

    private void insertCustomer() {
        String customerCode = customerCodeField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String unitNumber = unitNumberField.getText();
        String streetNumber = streetNumberField.getText();
        String streetName = streetNameField.getText();
        String town = townField.getText();
        String city = cityField.getText();

        try {
            Connection connection = DatabaseConnection.getConnection();
            String query = "INSERT INTO tblCustomerDetails (CustomerCode, FirstName, LastName, UnitNumber, StreetNumber, StreetName, Town, City) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customerCode);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, unitNumber);
            preparedStatement.setString(5, streetNumber);
            preparedStatement.setString(6, streetName);
            preparedStatement.setString(7, town);
            preparedStatement.setString(8, city);
            preparedStatement.executeUpdate();

            // Optionally, show a success message or clear the form fields.
            JOptionPane.showMessageDialog(this, "Customer inserted successfully");
            clearFields();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting customer");
        }
    }

    private void clearFields() {
        customerCodeField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        unitNumberField.setText("");
        streetNumberField.setText("");
        streetNameField.setText("");
        townField.setText("");
        cityField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}
