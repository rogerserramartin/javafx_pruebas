package com.roger.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class AbancaViewController {

    @FXML
    private Label tituloVentana;

    @FXML
    private Pane seleccionFichero;

    @FXML
    private Label txtArrastreFich;

    @FXML
    private Button btnSeleccionFichero;

    @FXML
    private Label textArrSecundario;

    @FXML
    private ComboBox menuOpciones;

    @FXML
    private Label ficheroSeleccionado;

    @FXML
    private Button btnConfirmar;

    // Métodos que utilizan los distintos menús o botones

    @FXML
    void seleccionarOpcion() {

        this.menuOpciones.getItems().addAll(
                "Incorporar", "Validar", "Generar", "Retroceder"
        );
        String opcion = menuOpciones.getSelectionModel().getSelectedItem().toString();



    }

    @FXML
    void ejecutarOperacion() {

    }

    @FXML
    void seleccionarFichero() {

    }

}