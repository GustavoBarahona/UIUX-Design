package Controlador;


import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Gustavo
 */
public class Controlador_main implements Initializable {
    
    @FXML
    private Label label;    
    @FXML
    private JFXButton btnAnimacion1;

    @FXML
    private Button button;
    @FXML
    private JFXButton btn_logoSlides;
    @FXML
    private JFXButton btn_homepage;
    @FXML
    private JFXButton btn_TableTreeView;
    
        
    @FXML
    private void animacion_slides(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane animacion1 = (AnchorPane)loader.load(getClass().getResource("/Vista/FXML_Animacion_Slides1.fxml").openStream());
        Scene scene = new Scene(animacion1);
        scene.getStylesheets().addAll(getClass().getResource("/Recursos/estilos/Main_estilo.css").toExternalForm());
        stage.setScene(scene);
        stage.alwaysOnTopProperty();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void FormLogoSlide(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane animacion2 = (AnchorPane)loader.load(getClass().getResource("/Vista/FXML_Slide_Login.fxml").openStream());
        Scene scene = new Scene(animacion2);
        scene.getStylesheets().addAll(getClass().getResource("/Recursos/estilos/Main_estilo.css").toExternalForm());
        stage.setScene(scene);
        stage.alwaysOnTopProperty();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }    

    @FXML
    private void Form_Home_Page(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane home = (AnchorPane)loader.load(getClass().getResource("/Vista/FXML_Home.fxml").openStream());
        Scene scene = new Scene(home);
        scene.getStylesheets().addAll(getClass().getResource("/Recursos/estilos/Home.css").toExternalForm());
        stage.setScene(scene);
        stage.alwaysOnTopProperty();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private void Form_TableTreeView(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane home = (AnchorPane)loader.load(getClass().getResource("/Vista/FXML_TableTreeView.fxml").openStream());
        Scene scene = new Scene(home);
        stage.setScene(scene);
        stage.alwaysOnTopProperty();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
}
