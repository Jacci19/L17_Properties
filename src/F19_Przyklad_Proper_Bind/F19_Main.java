package F19_Przyklad_Proper_Bind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class F19_Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/F19_Przyklad_Proper_Bind/F19_Form_ProperBind.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);

        //VBox myVBox = loader.load();
        //Scene scene = new Scene(myVBox);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Przykład properties");
        stage.setResizable(false);
        stage.show();
    }

}