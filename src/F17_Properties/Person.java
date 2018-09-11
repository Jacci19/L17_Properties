package F17_Properties;

import javafx.beans.property.*;

public class Person {

    private StringProperty myPropertyTextField = new SimpleStringProperty(this, "nameProperty", "John Smith");

/*omówienie wrappera i readOnlyString
    private IntegerProperty myIntegerProperty = new SimpleIntegerProperty(12345);                           //przykład int-propertisu
    private ReadOnlyStringWrapper myPropertyWrapper = new ReadOnlyStringWrapper(this, "read only", "tylko odczyt");
    private ReadOnlyStringProperty myReadOnlyString = myPropertyWrapper.getReadOnlyProperty();          //propertis tylko do odczytu, nie można go ustawić więc musi pobrać wartość pocz z wrappera

    public Person(){
        myPropertyWrapper.set("Nowa wartość");  //aby zmienić wartość w myReadOnlyString to trzeba ją ustawić w myPropertyWrapper a tam się też wtedy ustawi.
    }
*/

    public StringProperty getMyPropertyTextField() {
        return myPropertyTextField;
    }
    public void setMyPropertyTextField(StringProperty myPropertyTextField) {
        this.myPropertyTextField = myPropertyTextField;
    }
}
