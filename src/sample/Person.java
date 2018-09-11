package sample;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty", "John Smith");

    public StringProperty getPropertyTextField() {
        return propertyTextField;
    }
    public void setPropertyTextField(StringProperty propertyTextField) {
        this.propertyTextField = propertyTextField;
    }
}
