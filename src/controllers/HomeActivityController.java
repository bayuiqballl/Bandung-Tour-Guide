/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import main.BandungTourGuide;

/**
 * FXML Controller class
 *
 * @author Ardityo Cahyo & Bayu Iqbal
 */
public class HomeActivityController implements Initializable {
    
    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXHamburger hamburger;
    
    @FXML
    private JFXButton btnActionBar1;
    
    @FXML
    private JFXButton btnActionBar2;
    
    @FXML
    private JFXButton btnActionBar3;
    
    @FXML
    private JFXButton btnActionBar4;
    
    @FXML
    private JFXButton btnActionBar5;
    
    @FXML
    private BorderPane BrdrPaneHome;
    
    @FXML
    private Pane HeaderHome;
    
    @FXML
    private Pane HomePane;
    
    @FXML
    private ImageView imgHomeHeader;
    
    @FXML
    private ImageView imgStackHeader;
    
    @FXML
    private ScrollPane scrlPaneHome;
    
    @FXML
    private HBox ActionBar;
    
    @FXML
    private Label space1;
    
    @FXML
    private Label space2;
    
    @FXML
    private ImageView icon1;
    
    @FXML
    private ImageView icon2;
    
    @FXML
    private ImageView icon3;
    
    @FXML
    private ImageView icon4;
    
    @FXML
    private ImageView icon5;
    
    @FXML
    private BorderPane rootHome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/layout/NavigationDrawer.fxml"));
            VBox box = loader.load();
            NavigationDrawerController controller = loader.getController();
            drawer.setSidePane(box);
        } catch (IOException ex) {
            Logger.getLogger(HomeActivityController.class.getName()).log(Level.SEVERE, null, ex);
        }

        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
            transition.setRate(transition.getRate() * -1);
            transition.play();

            if (drawer.isShown()) {
                drawer.close();
            } else {
                drawer.open();
            }
        });
    }

        
    
}
