package app.main.ept;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
public class Loader {
    public static void Load(String Element) throws IOException {
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:Icon.png"));
        String WhatToLoad = "Element.fxml";
        FXMLLoader SceneLoader = new FXMLLoader(SceneLoader.class.getResource(WhatToLoad));
        Scene Window = new Scene(SceneLoader.load());
        stage.setTitle(Element);stage.setScene(Window);
        stage.show();       
    }
}
