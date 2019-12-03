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
import javafx.scene.control.ScrollPane;
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
 * @author Ardityo Cahyo & Bayu Iqbal
 */
public class HomeActivityController implements Initializable {
    
    @FXML
    private ImageView imgLogoutHome;
    
    @FXML
    private JFXButton btnLogoutHome;
    
    @FXML
    private ImageView imgHomeHome;
    
    @FXML
    private JFXButton btnHomeHome;
    
    @FXML
    private ImageView imgAboutHome;
    
    @FXML
    private JFXButton btnAbouthome;
    
    @FXML
    private ImageView imgCategoryHome;
    
    @FXML
    private JFXButton btnCategoryHome;
    
    @FXML
    private ImageView iconHome;
    
    @FXML
    private ImageView imgHomeHeader;
    
    @FXML
    private ImageView imgStackHeader;
    
    @FXML
    private VBox DrawerHome;
    
    @FXML
    private Label spaceHome;
    
    @FXML
    private BorderPane rootHome;
    
    @FXML
    private ScrollPane ScrollPaneHome;
    
    @FXML
    private ImageView imgRingkasan;
    
    @FXML
    private ImageView imgInfoGeo;
    
    @FXML
    private ImageView imgLogoBandung;
    
    @FXML
    private ImageView geo1;
    
    @FXML
    private ImageView geo2;
    
    @FXML
    private ImageView geo3;
    
    @FXML
    private ImageView imgKumpulanFoto;
    
    @FXML
    private ImageView imgFoto;
    
    @FXML
    private AnchorPane AnchorPaneHome;
    
    @FXML
    private AnchorPane InfoPaneHome;
    
    @FXML
    private Pane CapsuleInfoPaneHome;
    
    @FXML
    private Pane RingkasanPane;
    
    @FXML
    private Label LabelRingkasan;
    
    @FXML
    private Pane InfoGeoPane;
    
    @FXML
    private Label labelsemboyan;
    
    @FXML
    private Label labelgeo1;
    
    @FXML
    private Label labelgeo2;
    
    @FXML
    private Label labelgeo3;
    
    @FXML
    private Pane FotoPane;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnHomeHome.setDisable(true);
    }
    
    //=====================================NAVIGATION DRAWER=====================================

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
    
//    private void initHome(){
//        try {
//            AnchorPane Home = FXMLLoader.load(getClass().getResource("/layout/HomeLayout.fxml"));
//            HomePane.
//        } catch (IOException ex) {
//            Logger.getLogger(HomeActivityController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    private void initDrawer(){
//        try {
//            VBox rootDrawer = FXMLLoader.load(getClass().getResource("/layout/NavigationDrawer.fxml"));
//            drawer.setSidePane(rootDrawer);
//        } catch (IOException ex) {
//            Logger.getLogger(HomeActivityController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
//        transition.setRate(-1);
//        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
//            transition.setRate(transition.getRate() * -1);
//            transition.play();
//
//            if (drawer.isOpened()) {
//                drawer.close();
//            } else {
//                drawer.open();
//            }
//        });
//    }

        
    
}
