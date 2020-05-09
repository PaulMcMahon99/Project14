package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.event.ActionEvent;

public class reportController {

    @FXML
    private ComboBox comboBoxReport;

    @FXML
    private ImageView imageViewReport;

    @FXML
    private void initialize(){

        comboBoxReport.getItems().setAll("Aberporth", "Armagh", "Ballypatrick Forest", "Bradford", "Braemar", "Camborne",
                "Cambridge", "Cambridge NIAB", "Cardiff Bute Park", "Chivenor", "Cwmystwyth", "Dunstaffnage", "Durham", "Eastbourne",
                "Eskdalemuir", "Heathrow", "Hurn", "Lerwick", "Leuchars", "Lowestoft", "Manston", "Nairn", "Newton Rigg", "Oxford",
                "Paisley", "Ringway", "Ross-on-Wye", "Shawbury", "Sheffield", "Southampton", "Stornoway Airport", "Sutton Bonington",
                "Tiree", "Valley", "Waddington", "Whitby", "Wick Airport", "Yeovilton");
    }

    public void selectReport(ActionEvent select) {

        Image image = new Image("sample/img/" + comboBoxReport.getValue() + ".png");
        imageViewReport.setImage(image);
    }


}
