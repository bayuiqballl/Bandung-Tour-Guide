/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import com.jfoenix.controls.JFXSpinner;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Ardityo Cahyo & Bayu Iqbal
 */
public class SplashActivityController implements Initializable {
    
    @FXML
    private ImageView imgSplash;
    
    @FXML
    private ImageView imgSLabel;
    
    @FXML
    private ImageView imgbottom;
    
    @FXML
    private Label labeldesc1;
    
    @FXML
    private Label labeldesc2;
    
    @FXML
    private Group GroupSpinner;
    
    @FXML
    private ImageView circle;
    
    @FXML
    private JFXSpinner spinner;
    
    @FXML
    private AnchorPane rootSplash;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        new SplashScreen().start();
    }    
    
    
    class SplashScreen extends Thread{
        
        public void run(){
            try{
            Thread.sleep(3000);
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    Parent root = null;
                    try{
                        root = FXMLLoader.load(getClass().getResource("/layout/WelcomePageActivity.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(SplashActivityController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setTitle("Sign In - Bandung Tour Guide");
                    stage.setScene(scene);
                    stage.show();
                    rootSplash.getScene().getWindow().hide();
                }
            });
            } catch (InterruptedException ex){
                Logger.getLogger(SplashActivityController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        
    }
}

