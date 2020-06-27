
package logindatabase;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;



public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane layersignup;
    @FXML
    private AnchorPane layer2;
    @FXML
    private ImageView imbg;
    @FXML
    private JFXButton signin;
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label s1;
    @FXML
    private Label s11;
    @FXML
    private Label s12;
    @FXML
    private Label s2;
    @FXML
    private Label s3;
    @FXML
    private JFXButton signup;
    @FXML
    private Label a2;
    @FXML
    private Label a1;
    @FXML
    private TextField u1;
    @FXML
    private TextField u2;
    @FXML
    private TextField u3;
    @FXML
    private JFXDatePicker u5;
    @FXML
    private TextField n1;
    @FXML
    private TextField n2;
    @FXML
    private JFXPasswordField p1;
    @FXML
    private JFXPasswordField p2;
    @FXML
    private JFXButton fb1;
    @FXML
    private FontAwesomeIcon fb2;
    @FXML
    private JFXButton gm1;
    @FXML
    private FontAwesomeIcon gm2;
    @FXML
    private JFXButton ln1;
    @FXML
    private FontAwesomeIcon ln2;
    @FXML
    private AnchorPane layer1;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        layer1.setVisible(true);
        imbg.setVisible(true);
        s1.setVisible(false);
        s11.setVisible(false);
        s12.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        signup.setVisible(false);
        p1.setVisible(true);
        p2.setVisible(true);
        fb1.setVisible(true);
        fb2.setVisible(true);
        gm1.setVisible(true);
        gm2.setVisible(true);
        ln1.setVisible(true);
        ln2.setVisible(true);
        n1.setVisible(true);
        n2.setVisible(true);
        u1.setVisible(true);
        u2.setVisible(true);
        u3.setVisible(true);
        u5.setVisible(true);
    }    

    @FXML
    private void btn(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(layer2);
        
        slide.setToX(491);
        slide.play();
       
       
        ParallelTransition parallelTransition = new ParallelTransition();
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.7), layer1);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.play();
        
        
        ParallelTransition parallelTransition2 = new ParallelTransition();
        FadeTransition fadeOut2 = new FadeTransition(Duration.seconds(0.7), imbg );
        fadeOut2.setFromValue(0.5);
        fadeOut2.setToValue(0.0);
        fadeOut2.play();
        
        
        layer1.setTranslateX(-309);
        
       
       layer1.setVisible(false);  
    /*    imbg.setVisible(false);  */
        s1.setVisible(true);
        s11.setVisible(true);
        s12.setVisible(true);
        s2.setVisible(true);
        s3.setVisible(true);
        signup.setVisible(true);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        signin.setVisible(false);
        a1.setVisible(false);
        a2.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        fb1.setVisible(false);
        fb2.setVisible(false);
        gm1.setVisible(false);
        gm2.setVisible(false);
        ln1.setVisible(false);
        ln2.setVisible(false);
        n1.setVisible(false);
        n2.setVisible(false);
        u1.setVisible(false);
        u2.setVisible(false);
        u3.setVisible(false);
        u5.setVisible(false);
      
        
        slide.setOnFinished((e->{
        
        
        }));
    }

    @FXML
    private void btn2(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(layer2);
        
        slide.setToX(0);
        slide.play();
        
        
       
        
        
        ParallelTransition parallelTransition = new ParallelTransition();
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.7),layer1);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
     
        
        
        ParallelTransition parallelTransition2 = new ParallelTransition();
        FadeTransition fadeIn2 = new FadeTransition(Duration.seconds(0.7),imbg);
        fadeIn2.setFromValue(0.0);
        fadeIn2.setToValue(1.0);
        fadeIn2.play();
        
        layer1.setTranslateX(0);
    
        layer1.setVisible(true);
        imbg.setVisible(true);
        s1.setVisible(false);
        s11.setVisible(false);
        s12.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        signup.setVisible(false);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        signin.setVisible(true);
        a1.setVisible(true);
        a2.setVisible(true);
        p1.setVisible(true);
        p2.setVisible(true);
        fb1.setVisible(true);
        fb2.setVisible(true);
        gm1.setVisible(true);
        gm2.setVisible(true);
        ln1.setVisible(true);
        ln2.setVisible(true);
        n1.setVisible(true);
        n2.setVisible(true);
        u1.setVisible(true);
        u2.setVisible(true);
        u3.setVisible(true);
        u5.setVisible(true);
        
        slide.setOnFinished((e->{
        
        
        }));
    }


    @FXML
    private void sign(MouseEvent event) {
        
    }

    @FXML
    private void click(ActionEvent event) {
        if("cyberdeveloper".equals(n1.getText())&&"subscribe".equals(n2.getText())){
            String tilte = "Sign In";
            String message = n1.getText();
            TrayNotification tray = new TrayNotification();
            AnimationType type = AnimationType.POPUP;
        
            tray.setAnimationType(type);
            tray.setTitle(tilte);
            tray.setMessage(message);
            tray.setNotificationType(NotificationType.SUCCESS);
            tray.showAndDismiss(Duration.millis(3000));
        }
        if(!"cyberdeveloper".equals(n1.getText())){
            String tilte = "Sign In";
            String message = "Error Username "+"'"+n1.getText()+"'"+" Wrong";
            TrayNotification tray = new TrayNotification();
            AnimationType type = AnimationType.POPUP;
        
            tray.setAnimationType(type);
            tray.setTitle(tilte);
            tray.setMessage(message);
            tray.setNotificationType(NotificationType.ERROR);
            tray.showAndDismiss(Duration.millis(3000));
        }
        if (!"subscribe".equals(n2.getText())){
            String tilte = "Sign In";
            String message = "Error Password "+"'"+n2.getText()+"'"+" Wrong";
            TrayNotification tray = new TrayNotification();
            AnimationType type = AnimationType.POPUP;
        
            tray.setAnimationType(type);
            tray.setTitle(tilte);
            tray.setMessage(message);
            tray.setNotificationType(NotificationType.ERROR);
            tray.showAndDismiss(Duration.millis(3000));
        }
        if (!"cyberdeveloper".equals(n1.getText())&&!"subscribe".equals(n2.getText())){
            String tilte = "Sign In";
            String message = "Error Username "+"'"+n1.getText()+"'"+", and Password "+"'"+n2.getText()+"'"+" Wrong";
            TrayNotification tray = new TrayNotification();
            AnimationType type = AnimationType.POPUP;
        
            tray.setAnimationType(type);
            tray.setTitle(tilte);
            tray.setMessage(message);
            tray.setNotificationType(NotificationType.ERROR);
            tray.showAndDismiss(Duration.millis(3000));
        }
    }
    }

