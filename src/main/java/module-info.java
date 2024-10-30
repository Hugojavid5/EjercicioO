module org.hugo.ejercicioo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hugo.ejercicioo to javafx.fxml;
    exports org.hugo.ejercicioo;
}