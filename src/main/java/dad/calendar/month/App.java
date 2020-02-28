package dad.calendar.month;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
//	MonthController root = new MonthController();
	YearController root =new YearController();
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Calendar");
		primaryStage.getIcons().add(new Image(getClass().getResource("/calendar-32x32.png").toExternalForm()));
		primaryStage.setScene(new Scene(root.getRoot()));
		
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
