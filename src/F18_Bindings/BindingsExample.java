package F18_Bindings;

import javafx.beans.binding.*;
import javafx.beans.property.*;

public class BindingsExample {

    public static void main(String[] args) {
        bindings();                             //Różne operacje na bindingach
    }

    public static void bindings() {
        DoubleProperty a = new SimpleDoubleProperty(3.0);
        IntegerProperty b = new SimpleIntegerProperty(4);

        System.out.println("DZIAŁANIA LICZBOWE na liczbach " + a.doubleValue() + " oraz " + b.intValue());

        NumberBinding resultAdd = a.add(b);
        System.out.println("Wynik dodawania: " + resultAdd.intValue());
        System.out.println("Inny sposób zapisu: " + a.add(b).intValue());

        DoubleBinding resultDiv = a.divide(b);
        System.out.println("Wynik dzielenia: " + resultDiv.doubleValue());

        NumberBinding resultSub = a.subtract(b);
        System.out.println("Wynik odejmowania: " + resultSub.intValue());

        NumberBinding resultMultiply = a.multiply(b);
        System.out.println("Wynik mnożenia: " + resultMultiply.longValue());

        NumberBinding negate = a.negate();
        System.out.println("Negacja liczby A: " + negate.intValue());

        System.out.println("\nWARUNKI");

        BooleanBinding value = a.isEqualTo(b);
        System.out.println("Czy A jest równa B: " + value.get());

        System.out.println("Czy A jest nierówna B: " + a.isNotEqualTo(b).get());
        System.out.println("Czy A większa niż B: " + a.greaterThan(b).get());
        System.out.println("Czy A większa lub równa niż B: " + a.greaterThanOrEqualTo(b).get());
        System.out.println("Czy A jest mniejsza niż B: " + a.lessThan(b).get());
        System.out.println("Czy A jest mniejsza lub równa B: " + a.lessThanOrEqualTo(b).get());

        System.out.println("\nDZIAŁANIA NA STRINGACH");
        StringProperty s1 = new SimpleStringProperty("To jest");
        StringProperty s2 = new SimpleStringProperty(" fajny");
        StringProperty s3 = new SimpleStringProperty(" kurs JavaFX");

        StringExpression se = (s1).concat(s2).concat(s3);
        System.out.println(se.get());

        System.out.println("\nUżycie klasy WHEN");
        StringBinding result = new When(b.lessThan(a)).then("mniejsza").otherwise("większa");
        System.out.println("Wynik spawdzenia: " + result.get());

        BooleanBinding resultBoolean = new When(a.lessThan(b)).then(true).otherwise(false);
        System.out.println("Wynik spawdzenia: " + resultBoolean.get());

        System.out.println("\nFormater");
        DoubleProperty longDouble = new SimpleDoubleProperty(2.33423432423);
        StringExpression output = Bindings.format("Format liczny double: (%.2f)", longDouble);
        System.out.println(output.get());
    }
}
