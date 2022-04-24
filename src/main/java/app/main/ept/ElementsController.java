package app.main.ept;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

public class ElementsController implements Initializable {
    String ID = "H";

    @FXML
    private Label AtomMass, Pos, Desc, Name;

    @FXML
    private AnchorPane FuckingAnchor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    public void ChangeInformation(String Element, Integer Position, Float Mass, String Description){
        Name.setText(Element);
        Pos.setText(Integer.toString(Position));
        AtomMass.setText(Float.toString(Mass));
        Desc.setText(Description);
    }
}
