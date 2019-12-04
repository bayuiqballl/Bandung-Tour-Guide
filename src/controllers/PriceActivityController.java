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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
    


public class PriceActivityController implements Initializable {

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
    private ImageView imgprice;
    
    @FXML
    private JFXButton btnprice;
    
    @FXML
    private ImageView imgreservation;
    
    @FXML
    private JFXButton btnreservation;
    
    @FXML
    private ImageView imgCategory;
    
    @FXML
    private JFXButton btnCategory;
    
    @FXML
    private ImageView icon;
    
    @FXML
    private Label space;
    
    @FXML
    private VBox drawer;
    
    @FXML
    private BorderPane rootVR;
    
    @FXML
    private VBox CenterVB;
    
    @FXML
    private ImageView header;
    
    @FXML
    private JFXTabPane TabPanePackages;
    
    @FXML
    private Tab TabEconomy;
    
    @FXML
    private Tab TabPremEconomy;
    
    @FXML
    private Tab TabBusiness;
    
    @FXML
    private Tab TabFirstClass;
    
    @FXML
    private ScrollPane CenterScrollPane;
    
    @FXML
    private ScrollPane economy;
    
    @FXML
    private ScrollPane economyPrem;
    
    @FXML
    private ScrollPane business;
    
    @FXML
    private ScrollPane firstclass;
    
    @FXML
    private BorderPane BorderEconomy;
    
    @FXML
    private BorderPane BorderEconomyPrem;
    
    @FXML
    private BorderPane BorderBusiness;
    
    @FXML
    private BorderPane BorderFirstClass;
   
    @FXML
    private ImageView headerEconomy;
    
    @FXML
    private ImageView headerEconomyPrem;
    
    @FXML
    private ImageView headerBusiness;
    
    @FXML
    private ImageView headerFirstClass;
    
    @FXML
    private RadioButton RBEco1;
    
    @FXML
    private RadioButton RBEco2;
    
    @FXML
    private RadioButton RBEcoPrem1;
    
    @FXML
    private RadioButton RBEcoPrem2;
    
    @FXML
    private RadioButton RBBusiness;
    
    @FXML
    private RadioButton RBFirstClass;
    
    @FXML
    private ImageView paketeco1;
    
    @FXML
    private ImageView pakereco2;
    
    @FXML
    private ImageView paketecoprem1;
    
    @FXML
    private ImageView paketecoprem2;
    
    @FXML
    private ImageView paketbusiness;
    
    @FXML
    private ImageView paketfirstclass;
    
    @FXML
    private ImageView hargaeco1;
    
    @FXML
    private ImageView hargaeco2;
    
    @FXML
    private ImageView hargaecoprem1;
    
    @FXML
    private ImageView hargaecoprem2;
    
    @FXML
    private ImageView hargabusiness;
    
    @FXML
    private ImageView hargafirstclass;
    
    @FXML
    private AnchorPane AnchorEconomy;
    
    @FXML
    private AnchorPane AnchorEconomyPrem;
    
    @FXML
    private AnchorPane AnchorBusiness;
    
    @FXML
    private AnchorPane AnchorFirstClass;
    
    @FXML
    private Label labelconfirm;
    
    @FXML
    private JFXButton btnconfirm;
    
    @FXML
    private Label labelClass;

    @FXML
    private TextField txtNamaDepan;

    @FXML
    private JFXButton btnEdit;

    @FXML
    private TextField txtNamaBelakang;

    @FXML
    private JFXButton btnConfirm;

    @FXML
    private TextField txtNomorTelepon;

    @FXML
    private ImageView headerpesanan;

    @FXML
    private RadioButton RBLaki;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private RadioButton RBPerempuan;

    @FXML
    private Label labelAlamat;

    @FXML
    private BorderPane rootVacation;

    @FXML
    private ComboBox<?> CBClass;

    @FXML
    private TableView<?> table;

    @FXML
    private AnchorPane TablePane;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private TextField txtEmail;

    @FXML
    private Label labelKelamin;

    @FXML
    private Label labelConfirm;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private JFXButton btnNew;

    @FXML
    private Label labelEmail;

    @FXML
    private Label labelNomorTelepon;

    @FXML
    private TextField txtAlamat;

    @FXML
    private AnchorPane FormPane;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnprice.setDisable(true);
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
    
    //Perintah menuju Category
    public void Category(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/CategoryActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Category - Bandung Tour Guide");
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
    
    //Perintah menuju Logout
    public void Logout(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/LoginActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.setTitle("Sign In - Bandung Tour Guide");
        stage.centerOnScreen(); 
    }    
    
//    private void resetRadio(){
//        ToggleGroup toggleGroup = new ToggleGroup();
//        RBEco1.setToggleGroup(toggleGroup);
//        RBEco2.setToggleGroup(toggleGroup);
//        RBEcoPrem1.setToggleGroup(toggleGroup);
//        RBEcoPrem2.setToggleGroup(toggleGroup);
//        RBBusiness.setToggleGroup(toggleGroup);
//        RBFirstClass.setToggleGroup(toggleGroup);
//    }
//    
//    public void Confirmation(MouseEvent mouseEvent) throws IOException{
//        if(RBEco1.isSelected()){
//            
//        }else if(RBEco2.isSelected()){
//            
//        }else if(RBEcoPrem1.isSelected()){
//            
//        }else if(RBEcoPrem1.isSelected()){
//            
//        }else if(RBBusiness.isSelected()){
//            
//        }else if(RBFirstClass.isSelected()){
//            
//        }
//    }
}
