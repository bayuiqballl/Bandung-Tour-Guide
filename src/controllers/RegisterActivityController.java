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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author Ardityo Cahyo & Bayu Iqbal
 */
public class RegisterActivityController implements Initializable {
    
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
    
    public void handleButtonRegister(MouseEvent event) {

        if (event.getSource() == btnRegister) {
            //login here
            if (Register().equals("sukses")) {
                try {
                    //add you loading or delays - ;-)
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    //stage.setMaximized(true);
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/layout/LoginActivity.fxml")));
                    stage.setScene(scene);
                    stage.show();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }


            }
        }
    }
     
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet res;
    Statement stm;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if (conn == null) {
            System.out.println("error Database");
        }else {
            System.out.println("Go");
        }
    
    
    }

    public RegisterActivityController() throws SQLException {
        conn = Config.configDB();
    
    }
    
    
    private String Register(){
            String status = "sukses";
            String username = txtUsername.getText();
            int id = 0;
            String password = txtPassword.getText();
        if(username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "wajib isi semua !");
            status = "Error";
        } else {
            try {
            
            String sql = "INSERT INTO user VALUES ('"+id+"','"+username+"','"+password+"') ";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
            
            }catch (SQLException ex){
                 System.err.println(ex.getMessage());
            }
        }
        return status;
    }
    
    
}
