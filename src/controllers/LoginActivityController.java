/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import database.Config;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;
import main.BandungTourGuide;


/**
 *
 * @author Ardityo Cahyo & Bayu Iqbal
 */
public class LoginActivityController implements Initializable {
    
    @FXML
    private ImageView imgBanner;
    
    @FXML
    private ImageView imgStack;
    
    @FXML
    private ImageView imgLogo;
    
    @FXML
    private ImageView imgSignIn;
    
    @FXML
    private Button btnRegister;
            
    @FXML
    private Button btnSignIn;
    
    @FXML
    private TextField txtUsername;
    
    @FXML
    private TextField txtPassword;
    
    @FXML
    private AnchorPane rootLogin;
    
    @FXML
    private Label status;
    
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet res;
    Statement stm;
    
     public void handleButtonAction(MouseEvent event) {

        if (event.getSource() == btnSignIn) {
            //login here
            if (Login().equals("sukses")) {
                try {
                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/layout/HomeActivity.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        if (!BandungTourGuide.isSplashLoaded) {
//            loadSplashScreen();
//        }
        if (conn == null) {
            status.setTextFill(Color.web("#FF2B2B"));
            status.setText("Status : Tidak Terhubung dengan Database!");
        }else {
            status.setTextFill(Color.web("#00A022"));
            status.setText("Status : Terhubung dengan Database.");
        }
       
    }
    
     public LoginActivityController() throws SQLException {
        conn = Config.configDB();
    
    }

    public void btnRegisterPressed(MouseEvent mouseEvent) throws IOException{
        Parent rootRegis = FXMLLoader.load(getClass().getResource(("/layout/RegisterActivity.fxml")));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(rootRegis));
        stage.centerOnScreen();            
    }
    
//    private void loadSplashScreen() {
//        try {
//            BandungTourGuide.isSplashLoaded = true;
//
//            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/layout/SplashActivity.fxml")));
//            rootLogin.getChildren().setAll(pane);
//
//            FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
//            fadeIn.setFromValue(0);
//            fadeIn.setToValue(1);
//            fadeIn.setCycleCount(1);
//
//            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
//            fadeOut.setFromValue(1);
//            fadeOut.setToValue(0);
//            fadeOut.setCycleCount(1);
//
//            fadeIn.play();
//
//            fadeIn.setOnFinished((e) -> {
//                fadeOut.play();
//            });
//
//            fadeOut.setOnFinished((e) -> {
//                try {
//                    AnchorPane parentContent = FXMLLoader.load(getClass().getResource(("/layout/LoginActivity.fxml")));
//                    rootLogin.getChildren().setAll(parentContent);
//                } catch (IOException ex) {
//                    Logger.getLogger(HomeActivityController.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            });
//
//        } catch (IOException ex) {
//            Logger.getLogger(HomeActivityController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
     private String Login(){
            String status = "sukses";
            String username = txtUsername.getText();
            String password = txtPassword.getText();
        if(username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh Kosong!");
            status = "Error";
        } else {
            String sql = "SELECT * from user  WHERE username = '"+username+"' AND password = '"+password+"' ";
            try {
                preparedStatement = conn.prepareStatement(sql);
                stm =  conn.createStatement();
//                preparedStatement.setString(1, username);
//                preparedStatement.setString(2, password);
                res = stm.executeQuery(sql);
                 if(!res.next()){
                    JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                       status = "Error"; 
                }else{
                     if(username.equals(res.getString("username")) && password.equals(res.getString("password"))){
                        JOptionPane.showMessageDialog(null, "Berhasil Login!");   
                    }
                    
                }
            
            }catch (SQLException ex){
                 System.err.println(ex.getMessage());
                 status = "Exception";
            }
        }
        return status;
    }
    
    
    
    
}
