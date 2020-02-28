package dad.calendar.month;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class YearController implements Initializable {

	@FXML
	private BorderPane root;

	@FXML
	private GridPane gridpane;

	@FXML
	private Button anteriorButton;

	@FXML
	private Button siguenteButton;

	@FXML
	private Label yearLabel;

	LocalDate date = LocalDate.now();
	private MonthController enero = new MonthController(date.getYear(), 1);
	private MonthController febrero = new MonthController(date.getYear(), 2);
	private MonthController marzo = new MonthController(date.getYear(), 3);
	private MonthController abril = new MonthController(date.getYear(), 4);
	private MonthController mayo = new MonthController(date.getYear(), 5);
	private MonthController junio = new MonthController(date.getYear(), 6);
	private MonthController julio = new MonthController(date.getYear(), 7);
	private MonthController agosto = new MonthController(date.getYear(), 8);
	private MonthController septiembre = new MonthController(date.getYear(), 9);
	private MonthController octubre = new MonthController(date.getYear(), 10);
	private MonthController noviembre = new MonthController(date.getYear(), 11);
	private MonthController diciembre = new MonthController(date.getYear(), 12);

	private IntegerProperty yearProperty = new SimpleIntegerProperty();

	private @FXML void onAnteriorButton(ActionEvent event) {
		yearProperty.set(yearProperty.get()-1);
	}

	@FXML
	void onSiguenteButton(ActionEvent event) {
			yearProperty.set(yearProperty.get()+1);
	}

	public YearController() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/YearCalendar.fxml"));
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		yearProperty.set(date.getYear());
		Bindings.bindBidirectional(yearLabel.textProperty(), yearProperty, new NumberStringConverter());
		gridpane.addRow(0, enero, febrero, marzo, abril);
		gridpane.addRow(1, mayo, junio, julio, agosto);
		gridpane.addRow(2, septiembre, octubre, noviembre, diciembre);
		enero.yearPropertyProperty().bind(yearProperty);
		febrero.yearPropertyProperty().bind(yearProperty);
		marzo.yearPropertyProperty().bind(yearProperty);
		abril.yearPropertyProperty().bind(yearProperty);
		mayo.yearPropertyProperty().bind(yearProperty);
		junio.yearPropertyProperty().bind(yearProperty);
		julio.yearPropertyProperty().bind(yearProperty);
		agosto.yearPropertyProperty().bind(yearProperty);
		septiembre.yearPropertyProperty().bind(yearProperty);
		noviembre.yearPropertyProperty().bind(yearProperty);
		diciembre.yearPropertyProperty().bind(yearProperty);
		
		
	}

	public BorderPane getRoot() {
		return root;
	}
}
