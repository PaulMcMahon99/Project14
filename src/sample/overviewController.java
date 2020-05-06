package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class overviewController {

    @FXML
    private ComboBox comboBoxOverview;

    @FXML
    private void initialize(){

        comboBoxOverview.getItems().setAll("Aberporth", "Armagh", "Ballypatrick Forest", "Bradford", "Braemar", "Camborne",
                "Cambridge", "Cambridge NIAB", "Cardiff Bute Park", "Chivenor", "Cwmystwyth", "Dunstaffnage", "Durham", "Eastbourne",
                "Eskdalemuir", "Heathrow", "Hurn", "Lerwick", "Leuchars", "Lowestoft", "Manston", "Nairn", "Newton Rigg", "Oxford",
                "Paisley", "Ringway", "Ross-on-Wye", "Shawbury", "Sheffield", "Southampton", "Stornoway Airport", "Sutton Bonington",
                "Tiree", "Valley", "Waddington", "Whitby", "Wick Airport", "Yeovilton");

    }

}
