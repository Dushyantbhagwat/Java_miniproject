package mini.mini;

    import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

    public class Main extends Application {

        @Override
        public void start(Stage stage) throws IOException {
            try {
                Object root = FXMLLoader.load(getClass().getResource("1_startingpage.fxml")); //pass scene name here
                Scene scene = new Scene((Parent) root);
                stage.setScene(scene);
                stage.show();
                stage.setResizable(false);
                stage.setTitle("login"); // set title of app

            } catch (Exception e) {
                e.printStackTrace();
            }
        }





    }
