package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    public static void main(String[] args) throws Throwable {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainView.fxml"));
        stage.setTitle("HTMLViewer");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
