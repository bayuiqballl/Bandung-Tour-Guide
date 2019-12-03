/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;
import database.Config;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */
    


public class VacationReservationsActivityController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private JFXButton btnreservation;

    @FXML
    private Label labelClass;

    @FXML
    private TextField txtNamaDepan;

    @FXML
    private JFXButton btnEdit;

    @FXML
    private BorderPane rootVR;

    @FXML
    private ImageView icon;

    @FXML
    private TextField txtNamaBelakang;

    @FXML
    private JFXButton btnConfirm;

    @FXML
    private Label space;

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
    private ImageView imgCategory;

    @FXML
    private Label labelAlamat;

    @FXML
    private ComboBox<String> CBClass;
    
    @FXML
    private ComboBox<String> CBKelamin;

    @FXML
    TableView table;

    @FXML
    private JFXButton btnHome;

    @FXML
    private AnchorPane TablePane;

    @FXML
    private BorderPane rootVacation;

    @FXML
    private JFXButton btnCategory;

    @FXML
    private ImageView imgprice;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private TextField txtEmail;

    @FXML
    private VBox drawer;

    @FXML
    private JFXButton btnAbout;

    @FXML
    private Label labelKelamin;

    @FXML
    private ImageView imgAbout;

    @FXML
    private ScrollPane CenterScrollPane;

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
    private JFXButton btnprice;

    @FXML
    private AnchorPane FormPane;

    @FXML
    private ImageView imgreservation;

    @FXML
    private ImageView imgLogout;

    @FXML
    private ImageView imgHome;
    
    @FXML
    private DatePicker date;
    

    @FXML
    Label lblStatus;
//    private String query, namaDepan, Telp, Email, Alamat, Class;
//    private boolean EDIT = false, ADD = false;
//    DataAccessObject dao;
//    private Config database;
//    private Connection connect;
//    private Map<String, Object> map;
//    private int ID;
    
    PreparedStatement preparedStatement;
    Connection connection;

    public VacationReservationsActivityController() throws SQLException {
        connection = (Connection) Config.configDB();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Mematikan Tombol Order
        btnreservation.setDisable(true);
        
        //Mengisi Item Class
        CBClass.getItems().removeAll(CBClass.getItems());
        CBClass.getItems().addAll("Economy", "Premium Economy", "Business", "First Class");
        CBClass.getSelectionModel().select("Economy");
        
        //Mengisi Item Kelamin
        CBKelamin.getItems().removeAll(CBClass.getItems());
        CBKelamin.getItems().addAll("Male", "Female", "Other");
        CBKelamin.getSelectionModel().select("Male");
        fetColumnList();
        fetRowList();
        
        
//        dao = new DataAccessObject();
////        initGender();
//        CBClass.setOnMouseClicked(e->{
////            initClass;
//        });
//        
//        btnConfirm.setOnAction(e->{
//           saveAccount(); 
//        });
//        
//        btnNew.setOnAction(e->{
//           EDIT = false;
//           ADD = true;
//           insertNewAccount();
//        });
//        
//        btnEdit.setOnAction(e->{
//           ADD = false;
//           EDIT = true;
//           editAccount(); 
//        });
    }    
    
    //==========================
    
    @FXML
    private void HandleEvents(MouseEvent event) {
        //check jika tidak kosong
        if (txtEmail.getText().isEmpty() || txtNamaDepan.getText().isEmpty() || txtNamaBelakang.getText().isEmpty() || CBClass.getValue().equals(null)) {
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText("Enter all details");
        } else {
            saveData();
        }

    }

    private void clearFields() {
        txtNamaDepan.clear();
        txtNamaBelakang.clear();
        txtEmail.clear();
        txtNomorTelepon.clear();
    }

    private String saveData() {

        try {
            String st = "INSERT INTO pesanan ( firstname, lastname, telepon, email, gender, class, date) VALUES (?,?,?,?,?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(st);
            preparedStatement.setString(1, txtNamaDepan.getText());
            preparedStatement.setString(2, txtNamaBelakang.getText());
            preparedStatement.setString(3, txtNomorTelepon.getText());
            preparedStatement.setString(4, txtEmail.getText());
            preparedStatement.setString(5, CBKelamin.getValue().toString());
            preparedStatement.setString(6, CBClass.getValue().toString());
            preparedStatement.setString(7, date.getValue().toString());

            preparedStatement.executeUpdate();
            lblStatus.setTextFill(Color.GREEN);
            lblStatus.setText("Added Successfully");

            fetRowList();
            //Menghapus
            clearFields();
            return "Success";

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText(ex.getMessage());
            return "Exception";
        }
    }

    private ObservableList<ObservableList> data;
    String SQL = "SELECT * from pesanan";

    //Hanya untuk Fetching Kolom
    private void fetColumnList() {

        try {
            ResultSet rs = connection.createStatement().executeQuery(SQL);

            //SQL FOR SELECTING ALL OF CUSTOMER
            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                //Menggunakan non Property Table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1).toUpperCase());
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                table.getColumns().removeAll(col);
                table.getColumns().addAll(col);

                System.out.println("Column [" + i + "] ");

            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());

        }
    }

    //Untuk Fetching Row pada List
    private void fetRowList() {
        data = FXCollections.observableArrayList();
        ResultSet rs;
        try {
            rs = connection.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            table.setItems(data);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
//    private void insertNewAccount(){ //Untuk menambah Akun
//        txtNamaDepan.setText("");
//        txtNomorTelepon.setText("");
//        txtEmail.setText("");
//        txtAlamat.setText("");
//    }
//    
//    private void saveAccount(){//Untuk menimpan Akun
//        
//        namaDepan = txtNamaDepan.getText();
//        Telp = txtNomorTelepon.getText();
//        Email = txtEmail.getText();
//        Alamat = txtAlamat.getText();
//        Class = CBClass.getSelectionModel().getSelectedIndex()+1+"";
//        
//        if(EDIT){
//            query = "UPDATE [[isi bal]] SET namaDepan="+namaDepan+", Telp="+Telp+", Email="+Email+", Alamat="+Alamat+", Class="+Class+" WHERE account_ID="+ID+"";
//        }else if(ADD){
//            insertNewAccount();
//            query = "SELECT INTO [[isi bal]] VALUES(null, '"+namaDepan+"', '"+Telp+"','"+Email+"','"+Alamat+"', "+Class+")";
//        }
//        
//        dao.saveData(query);
//        
//        txtNamaDepan.setText("");
//        txtNomorTelepon.setText("");
//        txtEmail.setText("");
//        txtAlamat.setText("");
//    }
//    
//    private void editAccount(){
//        Pstring selected = (Pstring) table.getSelectionModel().getSelectedItem();
//        ID = selected.getpID().get();
//        txtNamaDepan.setText(selected.getpFirstname().get());
//        
//        txtNomorTelepon.setText(selected.getpTelp().get());
//        txtEmail.setText(selected.getpEmail().get());
//        txtAlamat.setText(selected.getpAlamat().get());
//        CBClass.getSelectionModel().select(selected.getpClass().get());
//    }
//    
//    private void deleteAccount(){
//        Pstring selected = (Pstring) table.getSelectionModel().getSelectedItem();
//        query = "DELETE FROM [[isi bal]] WHERE account_ID="+ID+"";
//    }
//    
//   private void initTable(){
//       column_nama.setCellValueFactory(cell->cell.getValue().getpFirstname());
//       column_telp.setCellValueFactory(cell->cell.getValue().getpTelp());
//       column_email.setCellValueFactory(cell->cell.getValue().getpEmail());
//       column_alamat.setCellValueFactory(cell->cell.getValue().getpAlamat());
//       column_class.setCellValueFactory(cell->cell.getValue().getpClass());
//       column_ID.setCellValueFactory(cell->cell.getValue().getpID());
//   }
    
//   private void refreshTable(){
//       table.setItems(dao.getAccountData(query));
//   }
   
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
