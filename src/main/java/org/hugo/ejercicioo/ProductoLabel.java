package org.hugo.ejercicioo;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class ProductoLabel extends GridPane {

    @FXML
    protected Label lbl_Nombre;

    @FXML
    protected Label lbl_Stock;

    /** The img producto. */
    @FXML
    private ImageView img_Producto;

    /**
     * Instantiates a new producto label.
     */
    public ProductoLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EjercicioO.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }


    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        lbl_Stock.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    public void setImage(Image imagen) {
        img_Producto.setImage(imagen);
    }

    public void setName(String nombre) {
        lbl_Nombre.setText(nombre + "");
    }
}