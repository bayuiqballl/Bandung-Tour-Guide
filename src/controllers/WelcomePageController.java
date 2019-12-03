/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */

public class WelcomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
@FXML
private AnchorPane rootWP;

@FXML
private VBox VBoxWP;

@FXML
private HBox HBoxWP;

@FXML
private JFXTabPane TabPaneWP;

@FXML
private Label space;

@FXML
private Label space2;

@FXML
private ImageView ActionBarLogo;

@FXML
private AnchorPane ButtonPane;

@FXML
private JFXButton LoginButton;

@FXML
private Tab TabOverview;

@FXML
private Tab TabHowtouse;

@FXML
private Tab TabFAQ;

@FXML
private Tab TabCredit;

@FXML
private ScrollPane ScrollPaneOverview;

@FXML
private ScrollPane ScrollPaneCredits;

@FXML
private ImageView headeroverview;

@FXML
private BorderPane BorderFAQ;

@FXML
private BorderPane BorderHowtouse;

@FXML
private AnchorPane AnchorCredits;

@FXML
private ScrollPane ScrollPaneHowtouse;

@FXML
private ScrollPane ScrollPaneFAQ;

@FXML
private ImageView headerbteam;

@FXML
private ImageView headercredit;

@FXML
private ImageView btnig1;

@FXML
private ImageView btngithub1;

@FXML
private ImageView btnlinkedin1;

@FXML
private ImageView btnig2;

@FXML
private ImageView btngithub2;

@FXML
private ImageView btnlinkedin2;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //Perintah menuju Login
    public void Login(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/LoginActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Sign In - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
}
