package app.main.ept;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
public class Scenes {
    public static void H() throws IOException {
        Stage stage = new Stage();
        FXMLLoader SceneLoader = new FXMLLoader(SceneLoader.class.getResource("H_Scene.fxml"));
        Scene H = new Scene(SceneLoader.load());
        stage.setTitle("EPT H");
        stage.setScene(H);
        stage.getIcons().add(new Image("file:Icon.png"));
        stage.setResizable(false);
        stage.show();

    }

}
