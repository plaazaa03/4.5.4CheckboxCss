module es.ieslosmontecillos.checkboxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.checkboxcss to javafx.fxml;
    exports es.ieslosmontecillos.checkboxcss;
}