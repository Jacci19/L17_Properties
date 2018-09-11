package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PropertExampl_17_Contrl {

    @FXML
    private TextField nameTxtFld;

    @FXML
    private Label nameLabel;

    private Person myPerson = new Person();


    @FXML
    public void initialize(){
        nameTxtFld.textProperty().bindBidirectional(myPerson.getPropertyTextField());       //działa w obie strony, zmieniając jedno zmienia się też drugie
        nameLabel.textProperty().bind(myPerson.getPropertyTextField());                 //działa w jedną stronę, label przyjmuje wartość propertisa ale nie na odwrót
    }

    @FXML
    void onWriteBtnAction(ActionEvent event) {                                          //niepotrzebne

    }
}
