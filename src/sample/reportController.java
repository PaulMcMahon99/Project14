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
    private void initialize(){

        comboBoxReport.getItems().setAll("Aberporth", "Armagh", "Ballypatrick Forest", "Bradford", "Braemar", "Camborne",
                "Cambridge NIAB", "Cardiff Bute Park", "Chievnor", "Cwmystwyth", "Dunstaffnage", "Durham", "Eastbourne",
                "Eskdalemuir", "Heathrow", "Hurn", "Lerwick", "Leuchars", "Lowestoft", "Manston", "Nairn", "Newton Rigg", "Oxford",
                "Paisley", "Ringway", "Ross-on-Wye", "Shawbury", "Sheffield", "Southampton", "Stornoway Airport", "Sutton Bonington",
                "Tiree", "Valley", "Waddington", "Whitby", "Wick Airport", "Yeovilton");
    }

    //For an unknown reason tabReport.fxml will not accept #selectReport in "onAction".  This is stopping this working.
    public void selectReport(ActionEvent select) {

        Image report = new Image("sample/img/" + comboBoxReport.getValue() + ".png");
        imgViewReport.setImage(report);

        Printer printer = Printer.getDefaultPrinter();
        PrinterJob printerJob = PrinterJob.createPrinterJob(printer);
        PageLayout pageLayout = printerJob.getJobSettings().getPageLayout();

        printerJob.getJobSettings().setPageLayout(pageLayout);
        printerJob.endJob();
    }
}






