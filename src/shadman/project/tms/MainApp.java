package shadman.project.tms;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import shadman.project.tms.model.Person;
import shadman.project.tms.view.UserDashBoardController;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	private ObservableList<String> personData = FXCollections.observableArrayList();
	//private ArrayList<Person> allPersonInfo = new ArrayList();

	//allPersonInfo.add(new Person("test22-1", 1 ,"test22-2" , "test22-3"));

	//constructor
	Person p1 = new Person("Noob",1,"Test1","Test1");

	public MainApp() {
		personData.add(p1.getName());
		personData.add("Shadman");
		personData.add("Deep");
		personData.add("Limon");
	}

	//returns data as an observable list
	public ObservableList<String> getPersonData() {
		return personData;
	}


	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Task Management System");
		this.primaryStage.setResizable(false);

		initRootLayout();

		showUserDashBoard();
	}

	private void showUserDashBoard() {

		try {
			FXMLLoader loader = new FXMLLoader();;
			loader.setLocation(MainApp.class.getResource("view/UserDashBoard.fxml"));
			AnchorPane userDashBoard = (AnchorPane) loader.load();

			rootLayout.setCenter(userDashBoard);

			UserDashBoardController controller = loader.getController();
			controller.setMainApp(this);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	private void initRootLayout() {

		try {
			// Load Root Layout from FXML
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			//showing userdashboard in root layout

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
		System.out.println("Hello!");
	}
}
