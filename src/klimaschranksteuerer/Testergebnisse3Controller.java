package klimaschranksteuerer;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Testergebnisse3Controller {
	@FXML
    private Label slotnummer3T1, slotnummer3T2, slotnummer3T3, slotnummer3T4;
	
	@FXML
    private Label geratid3T1, geratid3T2, geratid3T3, geratid3T4;
	
	@FXML
    private Label ausfallzeitText1, ausfallzeitText2, ausfallzeitText3, ausfallzeitText4;
	
	@FXML
	private Button zuruckButton;
	
	public void zuruck_b(ActionEvent e) {
		
		Stage stageold = (Stage) zuruckButton.getScene().getWindow();
		stageold.close();

		try {
			Stage stage = new Stage();
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("loginPage.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("Klimaschranksteuerer");
			stage.setWidth(600);
			stage.setHeight(400);
			stage.setResizable(false);
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(((Node) e.getSource()).getScene().getWindow());

			stage.show();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	
}


