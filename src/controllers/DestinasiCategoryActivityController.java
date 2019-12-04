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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */
public class DestinasiCategoryActivityController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private ImageView imgWisataAlam;
    
    @FXML
    private JFXButton btnWisataAlam;
    
    @FXML
    private ImageView imgWisataSejarah;
    
    @FXML
    private JFXButton btnWisataSejarah;
    
    @FXML
    private ImageView imgBack;
    
    @FXML
    private JFXButton btnBack;
    
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
    private VBox Drawer;
    
    @FXML
    private Label space;
    
    @FXML
    private BorderPane rootCategory;
    
    @FXML
    private AnchorPane AnchorPaneCategory;
    
    @FXML
    private ImageView imgprice;
    
    @FXML
    private ImageView imgreservation;
    
    @FXML
    private JFXButton btnprice;
    
    @FXML
    private JFXButton btnreservation;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    //=====================================NAVIGATION DRAWER=====================================

    //Perintah kembali ke Category
    public void Back(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/CategoryActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Category - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
    //Perintah menuju Home
    public void Home(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/HomeActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Home - Bandung Tour Guide");
        stage.centerOnScreen();  
    }
    
    //Perintah menuju Category
    public void Category(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/CategoryActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Category - Bandung Tour Guide");
        stage.centerOnScreen();  
    }
    
    //Perintah menuju Daftar Harga
    public void Price(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/PriceActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Price - Bandung Tour Guide");
        stage.centerOnScreen();  
    }
    
    //Perintah menuju Vacation Reservation
    public void Order(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/VacationReservationsActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Order - Bandung Tour Guide");
        stage.centerOnScreen();  
    }
    
    //Perintah menuju About
    public void About(MouseEvent mouseEvent) throws IOException{
        FXMLLoader root = new FXMLLoader();
        root.setLocation(getClass().getResource("/layout/WelcomePageActivitynonLogin.fxml"));
        Scene scene = new Scene(root.load(),800,600);
        Stage stage = new Stage();
        stage.setTitle("Newbie Guide - Bandung Tour Guide");
        stage.setScene(scene);
        stage.show();
    }
    
    //Perintah menuju Logout
    public void Logout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/LoginActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Sign In - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
    //=====================================TOMBOL NAVIGASI ARTIKEL=====================================
    
    //Perintah menuju Artikel Destinasi Wisata ke-1 (Gedung Sate)
    public void WisataAlam(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/AlamLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Destinasi Wisata: Wisata Alam");
        stage.centerOnScreen();
    }
    
    //Perintah menuju Artikel Destinasi Wisata ke-2 (Tangkuban Perahu)
    public void WisataSejarah(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/SejarahLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Destinasi Wisata: Wisata Sejarah");
        stage.centerOnScreen();
    }
    
}
