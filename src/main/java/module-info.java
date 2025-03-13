module co.edu.uniquindio.poo.tiendainformatica {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.tiendainformatica to javafx.fxml;
    exports co.edu.uniquindio.poo.tiendainformatica;
}