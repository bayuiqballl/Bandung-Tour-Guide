/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */
    


public class AboutActivityController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView imgLogoutAbout;
    
    @FXML
    private JFXButton btnLogoutAbout;
    
    @FXML
    private ImageView imgHomeAbout;
    
    @FXML
    private JFXButton btnHomeAbout;
    
    @FXML
    private ImageView imgAboutAbout;
    
    @FXML
    private JFXButton btnAboutAbout;
    
    @FXML
    private ImageView imgCategoryAbout;
    
    @FXML
    private JFXButton btnCategoryAbout;
    
    @FXML
    private ImageView iconAbout;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void Home(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/HomeActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen();  
    }
    
    public void Category(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/CategoryActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen();  
    }
    
    public void Logout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/LoginActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen(); 
    }
    
}
