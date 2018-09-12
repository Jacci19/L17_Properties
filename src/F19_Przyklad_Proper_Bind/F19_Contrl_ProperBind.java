package F19_Przyklad_Proper_Bind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class F19_Contrl_ProperBind {

    @FXML
    private TextField nameTextField;

    @FXML
    private Label nameOkLabel;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Label surnameOkLabel;

    @FXML
    private TextField bornYearTextField;

    @FXML
    private CheckBox confirmCheckBox;

    @FXML
    private Button loginBtn;

    @FXML
    private Label yourAgeLabel;

    private PersonViewModel myPersonViewModel = new PersonViewModel();

    @FXML
    public void initialize() {
        // textProperty bindujemy z property typu String
        nameTextField.textProperty().bindBidirectional(myPersonViewModel.getNameProperty());
        // textProperty bindujemy z property typu String
        surnameTextField.textProperty().bindBidirectional(myPersonViewModel.getSurnameProperty());

        // disableProperty bidnujemy z property typu Boolen - bedzie wlaczac
        // wylaczac pole
        surnameTextField.disableProperty().bind(myPersonViewModel.getDisableSurnameProperty());

        // konwenter to konwertowania String na Number
        StringConverter conventer = new NumberStringConverter();
        // bindowanie z konwenterem, textProperty bindujemy z IntegerProperty
        bornYearTextField.textProperty().bindBidirectional(myPersonViewModel.getYearProperty(), conventer);

        // selectedProperty bindujemy z property typi Boolean
        confirmCheckBox.selectedProperty().bindBidirectional(myPersonViewModel.getConfirmProperty());

        // Label bindujemy z property typu String, obliczona wartoscia wieku
        yourAgeLabel.textProperty().bind(myPersonViewModel.getAgeProperty());

        // dwa labele bindujemy z property typu Boolean, steruje ich
        // widocznoscia
        nameOkLabel.visibleProperty().bind(myPersonViewModel.getNameOkProperty());
        surnameOkLabel.visibleProperty().bind(myPersonViewModel.getSurnameOKProperty());

        // przycisk bindujemy z property typu Boolean
        loginBtn.disableProperty().bind(myPersonViewModel.getButtonProperty());
    }

}