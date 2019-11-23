package Modelo;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Gustavo
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        mainWindow(stage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void mainWindow(Stage stage) {
        try {
            //Llamada a un formulario principal más completa:
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/Vista/FXML_main.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane, 800, 550);//En esta línea ponemos dimencionar el formulario
            
            //Agregamos una hoja de estilo
            scene.getStylesheets().addAll(getClass().getResource("/Recursos/estilos/Main_estilo.css").toExternalForm());
            
            stage.setResizable(true);//Esto nos permite redimencionar el formulario
            
            //Esta linea de código quita los controles de cerrar minimizar y agrandar
            //stage.initStyle(StageStyle.UNDECORATED);
                        
            stage.setTitle("MENÚ PRINCIPAL");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
