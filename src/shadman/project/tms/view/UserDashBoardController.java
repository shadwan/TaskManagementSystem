package shadman.project.tms.view;



import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import shadman.project.tms.MainApp;
import shadman.project.tms.model.Person;

public class UserDashBoardController {

	@FXML
	private ComboBox<String> personCombo;
	//@FXML
	//private Label id;

	@FXML
	private Label name;
	@FXML
	private Label position;
	@FXML
	private Label department;

	//Reference to the main application

	public MainApp mainApp;
	 /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */

	public UserDashBoardController() {

	}
	 /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
	@FXML
	private void initialize() {


	}

	 /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */

	public void setMainApp(MainApp mainApp) {

		this.mainApp = mainApp;

		personCombo.getItems().clear();

		personCombo.getItems().addAll(mainApp.getPersonData());
	}

}
