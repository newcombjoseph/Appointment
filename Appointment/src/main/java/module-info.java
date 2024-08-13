module com.example.appointment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.appointment to javafx.fxml;
    exports com.example.appointment;
}