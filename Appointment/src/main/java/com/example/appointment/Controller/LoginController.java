package com.example.appointment.Controller;

import com.example.appointment.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


import java.lang.classfile.Label;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML private TextField userText;
    @FXML private TextField passwordText;
    @FXML private Label country;

    @FXML protected void log(ActionEvent action){
        String user = userText.getText();
        String password = passwordText.getText();


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            Connection con = DBConnection.connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("select * from users");
        StringBuffer buffer = new StringBuffer();
        //can put this in a separate class aka get users
        buffer.append("users" + rs.getString("user_name"));
        buffer.append()
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
