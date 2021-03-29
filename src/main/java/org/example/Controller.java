package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import org.example.classes.Address;
import org.example.classes.Flat;
import org.example.classes.Student;
import org.example.classes.Worker;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane window;

    @FXML
    private Button in;

    @FXML
    private Button out;

    @FXML
    private Button student;

    @FXML
    private Button worker;
    @FXML
    private TextArea build;

    @FXML
    private Text street;

    @FXML
    private Text house;

    @FXML
    private Text flat;

    @FXML
    void pin( ActionEvent event) {
        Address adr = new Address("Гикало", 9, 501);
        street.setText("улица: " + adr.getStreet());
        house.setText("дом: " + Integer.toString(adr.getHouse()));
        flat.setText("квартира: " + Integer.toString(adr.getFlat()));
        Flat f = new Flat(adr,0,0);
        f.setLodgers(f.getLodgers() + 1);
        if (f.getLodgers() > 0)
            room.setText("комната: занята");
    }

    @FXML
    void pout( ActionEvent event) {
        Address adr = new Address("Гикало", 9, 501);
        street.setText("улица: " + adr.getStreet());
        house.setText("дом: " + Integer.toString(adr.getHouse()));
        flat.setText("квартира: " + Integer.toString(adr.getFlat()));
        Flat f = new Flat(adr,0,1);
        f.setLodgers(f.getLodgers() - 1);
        if (f.getLodgers() == 0)
            room.setText("комната: свободна");
    }

    @FXML
    private TextArea say;

    @FXML
    private Text room;

    @FXML
    void pstudent ( ActionEvent event) {
        Student std = new Student("", "");
        say.setText(std.study());
    }

    @FXML
    void  pworker( ActionEvent event) {
        Worker wrk = new Worker("", "");
        say.setText(wrk.work());
    }
}