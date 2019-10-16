/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdakeyevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.UP;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class LambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Text texto=new Text(20,20,"A");
        Pane root = new Pane();
        root.getChildren().add(texto);
        texto.setFocusTraversable(true);
        
        texto.setOnKeyPressed(e->{
            if(e.getCode()==KeyCode.UP)
                texto.setY(texto.getY()-10);
            else if(e.getCode()==KeyCode.DOWN)
                texto.setY(texto.getY()+10);
            else if(e.getCode()==KeyCode.LEFT)
                texto.setX(texto.getX()-10);
            else if(e.getCode()==KeyCode.RIGHT)
                texto.setX(texto.getX()+10);
            else
                System.out.println("La tecla pulsada no hace nada");
        });
        
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
