package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class overviewController {

    @FXML
    private ImageView imgView;

    @FXML
    private void initialize(){
        Image image = new Image("sample/img/OverviewTest.png");
        imgView.setImage(image);
    }

}
