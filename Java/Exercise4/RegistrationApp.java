import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);
        
        TextField nameField = new TextField();
        Label nameLabel = new Label("Student Name");
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 0, 1);
        TextField courseField = new TextField();
        Label courseLabel = new Label("Course Code");
        Label status = new Label("Status: Incomplete");
        Button register = new Button("Register");
        grid.add(courseLabel, 0, 2);
        grid.add(courseField, 0, 3);
        grid.add(status, 0, 5);
        grid.add(register, 0, 4);
        register.setOnAction(e -> {
            String name = nameField.getText();
            String course = courseField.getText();
            status.setText("Registration Successful for " + name + " in " + course + "!");
        });

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Lehman Course Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

