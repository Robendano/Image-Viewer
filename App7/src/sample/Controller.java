package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {

    @FXML
    Button btnScene1, btnScene2, btnScene3, btnScene4;
    @FXML
    private Button btn_exit;

    public void handleBtn1() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("page2.fxml"));
        Stage window = (Stage) btnScene1.getScene().getWindow();
        window.setScene(new Scene(root, 808, 532));

    }

    public void handleBtn2() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("page3.fxml"));
        Stage window = (Stage) btnScene1.getScene().getWindow();
        window.setScene(new Scene(root, 808, 532));
    }

    public void handleBtn3 () throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("page1.fxml"));
        Stage window = (Stage) btnScene3.getScene().getWindow();
        window.setScene(new Scene(root, 808, 532));
    }

    public void handleBtn4 () throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("page1.fxml"));
        Stage window = (Stage) btnScene4.getScene().getWindow();
        window.setScene(new Scene(root, 808, 532));
    }

    @FXML
    public void onClick_btn_exit(ActionEvent event){
        System.exit(0);
    }

    @FXML
    ImageView myImageView;
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("meme2.jpg"));
    public void displayImage() {
        myImageView.setImage(myImage);
    }
}
