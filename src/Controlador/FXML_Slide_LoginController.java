package Controlador;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Gustavo
 */
public class FXML_Slide_LoginController implements Initializable {

    @FXML
    private Pane pane1;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane4;
    @FXML
    private JFXTextField txt_UserName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        backgroundAnimation();
    }

    private void backgroundAnimation() {
        FadeTransition fade3 = new FadeTransition(Duration.seconds(5), pane3);
        fade3.setFromValue(5);
        fade3.setToValue(0);
        fade3.play();

        fade3.setOnFinished(event3 -> {
            FadeTransition fade2 = new FadeTransition(Duration.seconds(5), pane2);
            fade2.setFromValue(5);
            fade2.setToValue(0);
            fade2.play();

            fade2.setOnFinished(event2 -> {
                FadeTransition fade1 = new FadeTransition(Duration.seconds(5), pane2);
                fade1.setFromValue(0);
                fade1.setToValue(5);
                fade1.play();

                fade1.setOnFinished(event1 -> {
                    FadeTransition fade0 = new FadeTransition(Duration.seconds(5), pane3);
                    fade0.setFromValue(0);
                    fade0.setToValue(5);
                    fade0.play();
                    
                    fade0.setOnFinished(event0 ->{
                        backgroundAnimation();
                    });
                    
                });

            });

        });//fin fade3
    }

}
