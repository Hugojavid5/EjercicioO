package org.hugo.ejercicioo;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Clase que representa un etiqueta de producto, que se compone de un nombre,
 * un stock y una imagen. Extiende de {@link GridPane} para facilitar el diseño.
 */
public class ProductoLabel extends GridPane {

    /** Etiqueta para mostrar el nombre del producto. */
    @FXML
    protected Label lbl_Nombre;

    /** Etiqueta para mostrar la cantidad en stock del producto. */
    @FXML
    protected Label lbl_Stock;

    /** Imagen del producto. */
    @FXML
    private ImageView img_Producto;

    /**
     * Crea una nueva instancia de {@code ProductoLabel}.
     * Carga el archivo FXML correspondiente para definir la interfaz gráfica.
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

    /**
     * Establece la cantidad de stock del producto y aplica un estilo
     * visual basado en la cantidad.
     *
     * @param cantidad La cantidad de stock del producto.
     */
    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde"; // Estilo para stock alto
        } else if (cantidad > 20) {
            style = "azul"; // Estilo para stock medio
        } else {
            style = "rojo"; // Estilo para stock bajo
        }
        lbl_Stock.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    /**
     * Establece la imagen del producto.
     *
     * @param imagen La imagen a establecer para el producto.
     */
    public void setImage(Image imagen) {
        img_Producto.setImage(imagen);
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nombre a establecer para el producto.
     */
    public void setName(String nombre) {
        lbl_Nombre.setText(nombre + "");
    }
}
