package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.sql.*;

//import org.w3c.dom.Text;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1 );

        Label userName = new Label("User Name:"); //adds User name
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField(); //adds user name field
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:"); //adds Password
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField(); //adds password field
        //grid.setGridLinesVisible(true); //used for debugging remove if lines not desired
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in"); //adds sign in button
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BASELINE_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });


        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        //The background image is applied to the .root style,
        // which means it is applied to the root node of the Scene instance.
        // The style definition consists of the name of the property (-fx-background-image)
        // and the value for the property (url(“background.jpg”)).
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
