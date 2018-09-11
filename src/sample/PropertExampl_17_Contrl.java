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
        nameTxtFld.setText(myPerson.getName());
        nameLabel.setText(myPerson.getName());
    }

    @FXML
    void onWriteBtnAction(ActionEvent event) {
        nameLabel.setText(nameTxtFld.getText());
        myPerson.setName(nameTxtFld.getText());

    }
}
