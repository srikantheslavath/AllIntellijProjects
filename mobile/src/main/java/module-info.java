module com.ebay.testgroup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ebay.testgroup to javafx.fxml;
    exports com.ebay.testgroup;
}