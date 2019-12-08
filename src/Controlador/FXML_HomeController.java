package Controlador;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Sistemas
 */
public class FXML_HomeController implements Initializable {

    @FXML
    private AnchorPane pane1;
    @FXML
    private AnchorPane pane2;
    @FXML
    private AnchorPane pane3;
    @FXML
    private AnchorPane pane4;

    @FXML
    private ImageView ImageV;
    @FXML
    private JFXButton btn_seccion1;
    @FXML
    private AnchorPane opacityPane;
    @FXML
    private AnchorPane drawerPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        opacityPane.setVisible(false);

        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), opacityPane);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();

        TranslateTransition animacionMenu = new TranslateTransition(Duration.seconds(0.5), drawerPane);
        animacionMenu.setByX(-200);
        animacionMenu.play();

        Image image = new Image("Recursos/iconos/drawer.png");
        ImageV.setImage(image);
        animacion();

        ImageV.setOnMouseClicked(evento1 -> {

            opacityPane.setVisible(true);
            
            FadeTransition fade2 = new FadeTransition(Duration.seconds(0.5), opacityPane);
            fade2.setFromValue(0);
            fade2.setToValue(0.39);
            fade2.play();

            TranslateTransition animacionMenu1 = new TranslateTransition(Duration.seconds(0.5), drawerPane);
            animacionMenu1.setByX(+200);
            animacionMenu1.play();
        });
        
        
        opacityPane.setOnMouseClicked(evento1 -> {

            
            
            FadeTransition fade2 = new FadeTransition(Duration.seconds(0.5), opacityPane);
            fade2.setFromValue(0.39);
            fade2.setToValue(0);
            fade2.play();
            
            fade2.setOnFinished(evento3 ->{
                opacityPane.setVisible(false);
            });

            TranslateTransition animacionMenu1 = new TranslateTransition(Duration.seconds(0.5), drawerPane);
            animacionMenu1.setByX(-200);
            animacionMenu1.play();
            
            
        });

    }

    public void animacion() {
        FadeTransition fade4 = new FadeTransition(Duration.seconds(3), pane4);
        fade4.setFromValue(3);
        fade4.setToValue(0);
        fade4.play();
        fade4.setOnFinished(event4 -> {
            FadeTransition fade3 = new FadeTransition(Duration.seconds(3), pane3);
            fade3.setFromValue(3);
            fade3.setToValue(0);
            fade3.play();
            fade3.setOnFinished(event3 -> {
                FadeTransition fade2 = new FadeTransition(Duration.seconds(3), pane2);
                fade2.setFromValue(3);
                fade2.setToValue(0);
                fade2.play();
                fade2.setOnFinished(event2 -> {
                    FadeTransition fade1 = new FadeTransition(Duration.seconds(3), pane1);
                    fade1.setFromValue(3);
                    fade1.setToValue(0);
                    fade1.play();
                    fade1.setOnFinished(event1 -> {
                        FadeTransition fade11 = new FadeTransition(Duration.seconds(3), pane1);
                        fade11.setFromValue(0);
                        fade11.setToValue(3);
                        fade11.play();
                        fade11.setOnFinished(event11 -> {
                            FadeTransition fade22 = new FadeTransition(Duration.seconds(3), pane2);
                            fade22.setFromValue(0);
                            fade22.setToValue(3);
                            fade22.play();
                            fade22.setOnFinished(event22 -> {
                                FadeTransition fade33 = new FadeTransition(Duration.seconds(3), pane3);
                                fade33.setFromValue(0);
                                fade33.setToValue(3);
                                fade33.play();
                                fade33.setOnFinished(event33 -> {
                                    FadeTransition fade44 = new FadeTransition(Duration.seconds(3), pane4);
                                    fade44.setFromValue(0);
                                    fade44.setToValue(3);
                                    fade44.play();
                                    fade44.setOnFinished(event44 -> {
                                        animacion();
                                    });
                                });
                            });
                        });
                    });
                });
            });
        });
    }//Fin animación principal.

    @FXML
    private void menu(MouseEvent event) {
    }

}
