/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Gustavo
 */
public class Control_Animacion_Slides1 implements Initializable {

    @FXML
    private AnchorPane Slide1;
    @FXML
    private AnchorPane Slide2;
    @FXML
    private AnchorPane Slide3;
    @FXML
    private JFXButton btnNext;
    @FXML
    private JFXButton btnBack;
    @FXML
    private Label lblContador;

    
    public void animacion(double duracion, Node nodo, double byX){
        TranslateTransition desplazamiento = new TranslateTransition(Duration.seconds(duracion), nodo);
        desplazamiento.setByX(byX);
        desplazamiento.play();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        animacion(0.1, Slide2, 600);
        animacion(0.1, Slide3, 600);
    }

    int showSlide=0;

    @FXML
    private void nextAction(ActionEvent event) {
        if(showSlide==0){
            animacion(0.5, Slide2, -600);
            showSlide++; //showSlide = 1
            lblContador.setText("2/3");
        }else if(showSlide==1){
            animacion(0.5, Slide3, -600);
            showSlide++; //showSlide = 2
            lblContador.setText("3/3");
        }
    }

    @FXML
    private void backAction(ActionEvent event) {
        if(showSlide==2){
            animacion(0.5, Slide3, 600);
            showSlide--; //showSlide = 1
            lblContador.setText("2/3");
        }else if(showSlide==1){
            animacion(0.5, Slide2, 600);
            showSlide--; //showSlide = 0
            lblContador.setText("1/3");
        }
    }
    
}
