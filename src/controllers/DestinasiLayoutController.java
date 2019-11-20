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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */
public class DestinasiLayoutController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView imgLogout;
    
    @FXML
    private JFXButton btnLogout;
    
    @FXML
    private ImageView imgHome;
    
    @FXML
    private JFXButton btnHome;
    
    @FXML
    private ImageView imgAbout;
    
    @FXML
    private JFXButton btnAbout;
    
    @FXML
    private ImageView imgCategory;
    
    @FXML
    private JFXButton btnCategory;
    
    @FXML
    private ImageView icon;
    
    @FXML
    private Button btn1;
    
    @FXML
    private Button btn2;
    
    @FXML
    private Button btn3;
    
    @FXML
    private ImageView Cardview1;
    
    @FXML
    private ImageView Cardview2;
    
    @FXML
    private ImageView Cardview3;
    
    @FXML
    private BorderPane root;
    
    @FXML
    private AnchorPane AnchorPane;
    
    @FXML
    private AnchorPane CenterAnchorPane;
    
    @FXML
    private Label judul1;
    
    @FXML
    private Label desc1;
    
    @FXML
    private Label judul2;
    
    @FXML
    private Label desc2;
    
    @FXML
    private Label judul3;
    
    @FXML
    private Label desc3;
    
    @FXML
    private Label space;
    
    @FXML
    private ImageView Header;
    
    @FXML
    private Pane Pane1;
    
    @FXML
    private Pane Pane2;
    
    @FXML
    private Pane Pane3;
    
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
    
    public void About(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/AboutActivity.fxml")));
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
    
    public void btnArticle1(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/DestinasiActivity_1.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen();
    }
    
    public void btnArticle2(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/DestinasiActivity_2.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen();
    }
    
    public void btnArticle3(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/DestinasiActivity_3.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen();
    }
    
}
