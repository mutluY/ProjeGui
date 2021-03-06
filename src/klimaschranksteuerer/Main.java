package klimaschranksteuerer;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Klimaschranksteuerer");
		stage.setWidth(600);
		stage.setHeight(400);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
}
