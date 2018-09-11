package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PropertExampl_17_Contrl_OLD_bezProper {

    @FXML
    private TextField nameTxtFld;

    @FXML
    private Label nameLabel;

    private Person_OLD_bezProper myPersonOLDbezProper = new Person_OLD_bezProper();


    @FXML
    public void initialize(){
        nameTxtFld.setText(myPersonOLDbezProper.getName());
        nameLabel.setText(myPersonOLDbezProper.getName());
    }

    @FXML
    void onWriteBtnAction(ActionEvent event) {
        nameLabel.setText(nameTxtFld.getText());
        myPersonOLDbezProper.setName(nameTxtFld.getText());

    }
}
