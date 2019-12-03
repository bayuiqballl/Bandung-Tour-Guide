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
    private ImageView imgLogout;
    
    @FXML
    private JFXButton btnLogout;
    
    @FXML
    private ImageView imgWisataKuliner;
    
    @FXML
    private JFXButton btnWisataKuliner;
    
    @FXML
    private ImageView imgHome;
    
    @FXML
    private JFXButton btnHome;
    
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnCategory.setDisable(true);
    }    
    
    //=====================================NAVIGATION DRAWER=====================================

    //Perintah menuju Home
    public void Home(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/HomeActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Home - Bandung Tour Guide");
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
    
    //=====================================TOMBOL NAVIGASI CATEGORY=====================================
    
    //Perintah menuju Destinasi Wisata
    public void DestinasiWisataLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/DestinasiCategoryActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Destinasi Wisata - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
    //Perintah menuju Wisata Religi
    public void WisataReligiLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/ReligiLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Wisata Religi - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
    //Perintah menuju Wisata Kuliner
    public void WisataKulinerLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/KulinerLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Wisata Kuliner - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
    //Perintah menuju Lokasi Hotel
    public void LokasiHotelLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/HotelLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Lokasi Hotel - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
    //Perintah menuju Wisata Budaya
    public void WisataBudayaLayout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/BudayaLayout.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Wisata Budaya - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }
    
}