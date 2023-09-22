package mini.mini;


    import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

    public class ChoiceBoxSceneSwitcher extends Application {

        private Stage primaryStage;
        private Scene scene1, scene2;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            this.primaryStage = primaryStage;
            primaryStage.setTitle("Scene Switcher");

            // Create a ChoiceBox with some choices
            ChoiceBox<String> choiceBox = new ChoiceBox<>();
            choiceBox.getItems().addAll("Scene 1", "Scene 2");
            choiceBox.setValue("Scene 1"); // Set default choice

            // Create Scene 1 content
            Label label1 = new Label("This is Scene 1");
            StackPane layout1 = new StackPane(label1);
            scene1 = new Scene(layout1, 300, 200);

            // Create Scene 2 content
            Label label2 = new Label("This is Scene 2");
            StackPane layout2 = new StackPane(label2);
            scene2 = new Scene(layout2, 300, 200);

            // Add an event handler to the ChoiceBox to switch scenes
            choiceBox.setOnAction(e -> {
                String selectedChoice = choiceBox.getValue();
                if (selectedChoice.equals("Scene 1")) {
                    primaryStage.setScene(scene1);
                } else if (selectedChoice.equals("Scene 2")) {
                    primaryStage.setScene(scene2);
                }
            });

            // Create the layout for the main scene
            StackPane mainLayout = new StackPane(choiceBox);
            Scene mainScene = new Scene(mainLayout, 400, 300);

            primaryStage.setScene(mainScene);
            primaryStage.show();
        }


    }


