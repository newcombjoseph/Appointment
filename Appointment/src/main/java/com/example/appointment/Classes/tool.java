package com.example.appointment.Classes;

import com.example.appointment.DBConnection;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class tool {
    public Alert alert(String text, String confirmButton, String canButton){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yesButton = new ButtonType(confirmButton);
        ButtonType cancelButton = new ButtonType(canButton);
        alert.setContentText(text);
        alert.getButtonTypes().setAll(yesButton, cancelButton);
        return alert;
    }

    public String returnContactName(int contactID){

        return "0";
    }

    public int returnContactID(String contactName){
        return 0;
    }

}
