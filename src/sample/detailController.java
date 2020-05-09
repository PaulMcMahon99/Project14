package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class detailController {

    @FXML
    private ComboBox comboBoxDetail;

    @FXML
    private Label labelDetail;

    @FXML
    private ImageView imgViewDetail;


    @FXML
    private void initialize(){

        comboBoxDetail.getItems().setAll("Aberporth", "Armagh", "Ballypatrick Forest", "Bradford", "Braemar", "Camborne",
                "Cambridge", "Cambridge NIAB", "Cardiff Bute Park", "Chivenor", "Cwmystwyth", "Dunstaffnage", "Durham", "Eastbourne",
                "Eskdalemuir", "Heathrow", "Hurn", "Lerwick", "Leuchars", "Lowestoft", "Manston", "Nairn", "Newton Rigg", "Oxford",
                "Paisley", "Ringway", "Ross-on-Wye", "Shawbury", "Sheffield", "Southampton", "Stornoway Airport", "Sutton Bonington",
                "Tiree", "Valley", "Waddington", "Whitby", "Wick Airport", "Yeovilton");

    }

    public void selectCombo(ActionEvent select) {

//        labelDetail.setText(comboBoxDetail.getValue());

        Image image = new Image("sample/img/" + comboBoxDetail.getValue() + ".png");
        imgViewDetail.setImage(image);


    }


}
