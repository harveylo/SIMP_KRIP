module com.putterfly.simp_krip {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.putterfly.simp_krip to javafx.fxml;
    exports com.putterfly.simp_krip.app;
    opens com.putterfly.simp_krip.app to javafx.fxml;
}