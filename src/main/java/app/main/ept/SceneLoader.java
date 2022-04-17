package app.main.ept;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;



public class SceneLoader extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SceneLoader.class.getResource("Beginning.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("EPT");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:Icon.png"));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}