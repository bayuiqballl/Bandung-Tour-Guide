/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo
 */
public class NavigationDrawerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private JFXButton btnDrawer1;
    
    @FXML
    private JFXButton btnDrawer2;
    
    @FXML
    private JFXButton btnDrawer3;
    
    @FXML
    private JFXButton exit;
    
    @FXML
    private VBox rootDrawer;
    
    @FXML
    private ImageView DrawerHeader;
    
    @FXML
    private ImageView iconDrawer1;
    
    @FXML
    private ImageView iconDrawer2;
    
    @FXML
    private ImageView iconDrawer3;
    
    @FXML
    private ImageView iconDrawerexit;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void ActionDrawer(ActionEvent event) {
        JFXButton btn = (JFXButton) event.getSource();
        System.out.println(btn.getText());
        switch (btn.getText()) {
            case "Home":
//                callback.updateColor("#00FF00");
                break;
            case "Category":
//                callback.updateColor("#0000FF");
                break;
            case "About":
//                callback.updateColor("#FF0000");
                break;
        }
    }
    
    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
}
