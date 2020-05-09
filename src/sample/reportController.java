package sample;

import javafx.fxml.FXML;
import javafx.print.PageLayout;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.event.ActionEvent;

public class reportController {
    //the variable calls to the reportController are made here.  Some do not link as there is an ongoing error between here
//    and the tabReport FXML where the #selectReport will not link.
    @FXML
    private ComboBox comboBoxReport;

    @FXML
    private ImageView imgViewReport;

    @FXML
    private Printer printer;

    @FXML
    private PrinterJob printerJob;

    @FXML
    private PageLayout pageLayout;

    @FXML
    private Boolean success;


    @FXML
    private void initialize(){

        comboBoxReport.getItems().setAll("Aberporth", "Armagh", "Ballypatrick Forest", "Bradford", "Braemar", "Camborne",
                "Cambridge NIAB", "Cardiff Bute Park", "Chievnor", "Cwmystwyth", "Dunstaffnage", "Durham", "Eastbourne",
                "Eskdalemuir", "Heathrow", "Hurn", "Lerwick", "Leuchars", "Lowestoft", "Manston", "Nairn", "Newton Rigg", "Oxford",
                "Paisley", "Ringway", "Ross-on-Wye", "Shawbury", "Sheffield", "Southampton", "Stornoway Airport", "Sutton Bonington",
                "Tiree", "Valley", "Waddington", "Whitby", "Wick Airport", "Yeovilton");
    }

    //For an unknown reason tabReport.fxml will not accept #selectReport in "onAction".  This is stopping this working,
//    as this method containing the print command will never fire.  Over on the FXML file, the #selectReport is
//    commented out. It should at least do the same as the Detail pane, as it is in theory identical but it refuses.
    public void selectReport(ActionEvent select) {

        Image report = new Image("sample/img/" + comboBoxReport.getValue() + ".png");
        imgViewReport.setImage(report);

//        this also sends the Image report object to the printer, as well as the screen:

        Printer printer = Printer.getDefaultPrinter();
        PrinterJob printerJob = PrinterJob.createPrinterJob(printer);
        PageLayout pageLayout = printerJob.getJobSettings().getPageLayout();
        printerJob.getJobSettings().setPageLayout(pageLayout);


//  The line below is never going to work as the report object is not of compatible type to the printerJob call.
//        in the abscence of a solution this code is the nearest thing to.
        if (printerJob != null) {
//            boolean success = printerJob.printPage(report);
        }
        printerJob.endJob();
    }
}






