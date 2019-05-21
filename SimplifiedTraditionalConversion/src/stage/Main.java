package stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import view.MainController;

import wsclient.Conversion;

import java.io.IOException;

public class Main extends Application {

    private MainController mainController;
    private Parent root;

    // Web service local proxy object
    private Conversion conversion;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set primary stage
        primaryStage.setTitle("简繁体中文转换");
        primaryStage.setResizable(false);

        // Load layout and get controller
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainLayout.fxml"));
            root = loader.load();
            mainController = loader.getController();
        } catch (IOException e) {
            System.out.println("IO: " + e);
        }

        // Get web service proxy
        conversion = new Conversion();
        mainController.setConversion(conversion);

        // Show stage
        primaryStage.setScene(new Scene(root, 800, 450));
        primaryStage.show();
    }
}
