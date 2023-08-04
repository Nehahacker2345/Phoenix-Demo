module com.example.javademo {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.javademo to javafx.fxml;
    exports com.example.javademo;
}