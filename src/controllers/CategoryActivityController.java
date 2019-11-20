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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */
public class CategoryActivityController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView imgLogoutCategory;
    
    @FXML
    private JFXButton btnLogoutCategory;
    
    @FXML
    private ImageView imgWisataKuliner;
    
    @FXML
    private JFXButton btnWisataKuliner;
    
    @FXML
    private ImageView imgHomeCategory;
    
    @FXML
    private JFXButton btnHomeCategory;
    
    @FXML
    private ImageView imgWisataBudaya;
    
    @FXML
    private JFXButton btnWisataBudaya;
    
    @FXML
    private ImageView imgLokasiHotel;
    
    @FXML
    private JFXButton btnLokasiHotel;
    
    @FXML
    private ImageView imgWisataReligi;
    
    @FXML
    private JFXButton btnWisataReligi;
    
    @FXML
    private ImageView imgAboutCategory;
    
    @FXML
    private JFXButton btnAboutCategory;
    
    @FXML
    private ImageView imgCategoryCategory;
    
    @FXML
    private JFXButton btnCategoryCategory;
    
    @FXML
    private ImageView iconCategory;
    
    @FXML
    private VBox DrawerCategory;
    
    @FXML
    private Label spaceCategory;
    
    @FXML
    private BorderPane rootCategory;
    
    @FXML
    private AnchorPane AnchorPaneCategory;
    
    
    
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
    
    public void DestinasiWisataLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/DestinasiLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen(); 
    }
    
    public void WisataReligiLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/ReligiLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen(); 
    }
    
    public void WisataKulinerLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/KulinerLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen(); 
    }
    
    public void LokasiHotelLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/HotelLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen(); 
    }
    
    public void WisataBudayaLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/BudayaLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        
        stage.centerOnScreen(); 
    }
    
}
