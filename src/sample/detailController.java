package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//import javafx.scene.control.Label;

public class detailController {

//    All of the variable declarations for the detail tab controller are made and work fine here, as does the
//    associated methods below.  Despite being the same, the report tab's equivalent is in unknown error.

    @FXML
    private ComboBox comboBoxDetail;

//    @FXML
//    private Label labelDetail;

    @FXML
    private ImageView imgViewDetail;


    @FXML
    private void initialize(){

//    This initial method populates the combobox with values.

        comboBoxDetail.getItems().setAll("Aberporth", "Armagh", "Ballypatrick Forest", "Bradford", "Braemar", "Camborne",
                "Cambridge NIAB", "Cardiff Bute Park", "Chievnor", "Cwmystwyth", "Dunstaffnage", "Durham", "Eastbourne",
                "Eskdalemuir", "Heathrow", "Hurn", "Lerwick", "Leuchars", "Lowestoft", "Manston", "Nairn", "Newton Rigg", "Oxford",
                "Paisley", "Ringway", "Ross-on-Wye", "Shawbury", "Sheffield", "Southampton", "Stornoway Airport", "Sutton Bonington",
                "Tiree", "Valley", "Waddington", "Whitby", "Wick Airport", "Yeovilton");

    }

    public void selectCombo(ActionEvent select) {

//        this label below is meant to display the name of the selection, but unfortunately refuses to work

//        labelDetail.setText(comboBoxDetail.getValue());


//        this object call brings the image data file into the ImageView pane.
        Image image = new Image("sample/img/" + comboBoxDetail.getValue() + ".png");
        imgViewDetail.setImage(image);

//        Bradford throws an unknown error, despite being apparently the same as the others. This was not resolved.

    }


}
