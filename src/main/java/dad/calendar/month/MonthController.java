package dad.calendar.month;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class MonthController extends GridPane implements Initializable {

	@FXML
	private GridPane view;

	@FXML
	private Label mesLabel;

	@FXML
	private Label lunes;

	@FXML
	private Label martes;

	@FXML
	private Label miercoles;

	@FXML
	private Label jueves;

	@FXML
	private Label viernes;

	@FXML
	private Label sabado;

	@FXML
	private Label domingo;

	@FXML
	private Label label1;

	@FXML
	private Label label2;

	@FXML
	private Label label3;

	@FXML
	private Label label4;

	@FXML
	private Label label5;

	@FXML
	private Label label6;

	@FXML
	private Label label7;

	@FXML
	private Label label8;

	@FXML
	private Label label9;

	@FXML
	private Label label10;

	@FXML
	private Label label11;

	@FXML
	private Label label12;

	@FXML
	private Label label13;

	@FXML
	private Label label14;

	@FXML
	private Label label15;

	@FXML
	private Label label16;

	@FXML
	private Label label17;

	@FXML
	private Label label18;

	@FXML
	private Label label19;

	@FXML
	private Label label20;

	@FXML
	private Label label21;

	@FXML
	private Label label22;

	@FXML
	private Label label23;

	@FXML
	private Label label24;

	@FXML
	private Label label25;

	@FXML
	private Label label26;

	@FXML
	private Label label27;

	@FXML
	private Label label28;

	@FXML
	private Label label29;

	@FXML
	private Label label30;

	@FXML
	private Label label31;

	@FXML
	private Label label32;

	@FXML
	private Label label33;

	@FXML
	private Label label34;

	@FXML
	private Label label35;

	@FXML
	private Label label36;

	@FXML
	private Label label37;

	@FXML
	private Label label38;

	@FXML
	private Label label39;

	@FXML
	private Label label40;

	@FXML
	private Label label41;

	@FXML
	private Label label42;

	private IntegerProperty yearProperty = new SimpleIntegerProperty();
	private IntegerProperty monthProperty = new SimpleIntegerProperty();
	private StringProperty mesNombre = new SimpleStringProperty();
	private StringProperty day1Property = new SimpleStringProperty();
	private StringProperty day2Property = new SimpleStringProperty();
	private StringProperty day3Property = new SimpleStringProperty();
	private StringProperty day4Property = new SimpleStringProperty();
	private StringProperty day5Property = new SimpleStringProperty();
	private StringProperty day6Property = new SimpleStringProperty();
	private StringProperty day7Property = new SimpleStringProperty();
	private StringProperty day8Property = new SimpleStringProperty();
	private StringProperty day9Property = new SimpleStringProperty();
	private StringProperty day10Property = new SimpleStringProperty();
	private StringProperty day11Property = new SimpleStringProperty();
	private StringProperty day12Property = new SimpleStringProperty();
	private StringProperty day13Property = new SimpleStringProperty();
	private StringProperty day14Property = new SimpleStringProperty();
	private StringProperty day15Property = new SimpleStringProperty();
	private StringProperty day16Property = new SimpleStringProperty();
	private StringProperty day17Property = new SimpleStringProperty();
	private StringProperty day18Property = new SimpleStringProperty();
	private StringProperty day19Property = new SimpleStringProperty();
	private StringProperty day20Property = new SimpleStringProperty();
	private StringProperty day21Property = new SimpleStringProperty();
	private StringProperty day22Property = new SimpleStringProperty();
	private StringProperty day23Property = new SimpleStringProperty();
	private StringProperty day24Property = new SimpleStringProperty();
	private StringProperty day25Property = new SimpleStringProperty();
	private StringProperty day26Property = new SimpleStringProperty();
	private StringProperty day27Property = new SimpleStringProperty();
	private StringProperty day28Property = new SimpleStringProperty();
	private StringProperty day29Property = new SimpleStringProperty();
	private StringProperty day30Property = new SimpleStringProperty();
	private StringProperty day31Property = new SimpleStringProperty();
	private StringProperty day32Property = new SimpleStringProperty();
	private StringProperty day33Property = new SimpleStringProperty();
	private StringProperty day34Property = new SimpleStringProperty();
	private StringProperty day35Property = new SimpleStringProperty();
	private StringProperty day36Property = new SimpleStringProperty();
	private StringProperty day37Property = new SimpleStringProperty();
	private StringProperty day38Property = new SimpleStringProperty();
	private StringProperty day39Property = new SimpleStringProperty();
	private StringProperty day40Property = new SimpleStringProperty();
	private StringProperty day41Property = new SimpleStringProperty();
	private StringProperty day42Property = new SimpleStringProperty();
	private StringProperty day43Property = new SimpleStringProperty();
	private ArrayList<StringProperty> days=new ArrayList<StringProperty>();

	public MonthController(int year , int month) {
		monthProperty.set(month);
		yearProperty.set(year);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MonthCalendar.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		bind();
		rellenaArrayDias();
		yearProperty.addListener((o,ov,nv)->newMonth());
		newMonth();
		
		
	}

	public void unBind() {
		label1.textProperty().unbind();
		label2.textProperty().unbind();
		label3.textProperty().unbind();
		label4.textProperty().unbind();
		label5.textProperty().unbind();
		label6.textProperty().unbind();
		label7.textProperty().unbind();
		label8.textProperty().unbind();
		label9.textProperty().unbind();
		label10.textProperty().unbind();
		label11.textProperty().unbind();
		label12.textProperty().unbind();
		label13.textProperty().unbind();
		label14.textProperty().unbind();
		label15.textProperty().unbind();
		label16.textProperty().unbind();
		label17.textProperty().unbind();
		label18.textProperty().unbind();
		label19.textProperty().unbind();
		label20.textProperty().unbind();
		label21.textProperty().unbind();
		label22.textProperty().unbind();
		label23.textProperty().unbind();
		label24.textProperty().unbind();
		label25.textProperty().unbind();
		label26.textProperty().unbind();
		label27.textProperty().unbind();
		label28.textProperty().unbind();
		label29.textProperty().unbind();
		label30.textProperty().unbind();
		label31.textProperty().unbind();
		label32.textProperty().unbind();
		label33.textProperty().unbind();
		label34.textProperty().unbind();
		label35.textProperty().unbind();
		label36.textProperty().unbind();
		label37.textProperty().unbind();
		label38.textProperty().unbind();
		label39.textProperty().unbind();
		label40.textProperty().unbind();
		label41.textProperty().unbind();
		label42.textProperty().unbind();
	}

	public void bind() {
		mesLabel.textProperty().bind(mesNombre);
		label1.textProperty().bind(day1Property);
		label2.textProperty().bind(day2Property);
		label3.textProperty().bind(day3Property);
		label4.textProperty().bind(day4Property);
		label5.textProperty().bind(day5Property);
		label6.textProperty().bind(day6Property);
		label7.textProperty().bind(day7Property);
		label8.textProperty().bind(day8Property);
		label9.textProperty().bind(day9Property);
		label10.textProperty().bind(day10Property);
		label11.textProperty().bind(day11Property);
		label12.textProperty().bind(day12Property);
		label13.textProperty().bind(day13Property);
		label14.textProperty().bind(day14Property);
		label15.textProperty().bind(day15Property);
		label16.textProperty().bind(day16Property);
		label17.textProperty().bind(day17Property);
		label18.textProperty().bind(day18Property);
		label19.textProperty().bind(day19Property);
		label20.textProperty().bind(day20Property);
		label21.textProperty().bind(day21Property);
		label22.textProperty().bind(day22Property);
		label23.textProperty().bind(day23Property);
		label24.textProperty().bind(day24Property);
		label25.textProperty().bind(day25Property);
		label26.textProperty().bind(day26Property);
		label27.textProperty().bind(day27Property);
		label28.textProperty().bind(day28Property);
		label29.textProperty().bind(day29Property);
		label30.textProperty().bind(day30Property);
		label31.textProperty().bind(day31Property);
		label32.textProperty().bind(day32Property);
		label33.textProperty().bind(day33Property);
		label34.textProperty().bind(day34Property);
		label35.textProperty().bind(day35Property);
		label36.textProperty().bind(day36Property);
		label37.textProperty().bind(day37Property);
		label38.textProperty().bind(day38Property);
		label39.textProperty().bind(day39Property);
		label40.textProperty().bind(day40Property);
		label41.textProperty().bind(day41Property);
		label42.textProperty().bind(day42Property);
	}

	private void inicia() {
		day1Property.set(" ");
		day2Property.set(" ");
		day3Property.set(" ");
		day4Property.set(" ");
		day5Property.set(" ");
		day6Property.set(" ");
		day7Property.set(" ");
		day8Property.set(" ");
		day9Property.set(" ");
		day10Property.set(" ");
		day11Property.set(" ");
		day12Property.set(" ");
		day13Property.set(" ");
		day14Property.set(" ");
		day15Property.set(" ");
		day16Property.set(" ");
		day17Property.set(" ");
		day18Property.set(" ");
		day19Property.set(" ");
		day20Property.set(" ");
		day21Property.set(" ");
		day22Property.set(" ");
		day23Property.set(" ");
		day24Property.set(" ");
		day25Property.set(" ");
		day26Property.set(" ");
		day27Property.set(" ");
		day28Property.set(" ");
		day29Property.set(" ");
		day30Property.set(" ");
		day31Property.set(" ");
		day32Property.set(" ");
		day33Property.set(" ");
		day34Property.set(" ");
		day35Property.set(" ");
		day36Property.set(" ");
		day37Property.set(" ");
		day38Property.set(" ");
		day39Property.set(" ");
		day40Property.set(" ");
		day41Property.set(" ");
		day42Property.set(" ");
	}

	private void newMonth() {
		LocalDate date = LocalDate.of(yearProperty.get(), monthProperty.get(), 1);
		inicia();
		setNameMoth();
		switch (date.getDayOfWeek()) {
		case MONDAY:
			rellenaCalendario(0);
			break;
		case TUESDAY:
			rellenaCalendario(1);
			break;
		case WEDNESDAY:
			rellenaCalendario(2);
			break;
		case THURSDAY:
			rellenaCalendario(3);
			break;
		case FRIDAY:
			rellenaCalendario(4);
			break;
		case SATURDAY:
			rellenaCalendario(5);
			break;
		case SUNDAY:
			rellenaCalendario(6);
			break;
		}
	}

	private void rellenaCalendario(int dia) {
	int tam = 0;
	int annio = yearProperty.get();
	if (monthProperty.get()==2) {
		if (Year.of(annio).isLeap())
			tam = 29;
		else
			tam = 28;

	} else {
		switch (monthProperty.get()) {
		case 4:
		case 6:
		case 9:
		case 11:
			tam = 30;
			break;
		default:
			tam = 31;
			break;

		}
	}
		int numDay=1;
		for (int i = dia; i < days.size(); i++) {
			if (numDay<=tam) {
			days.get(i).set(String.valueOf(numDay));
			numDay++;
			}
		}
	}
	
	private void setNameMoth() {
		switch (monthProperty.get()) {
		case 1:
			mesNombre.set("Enero");
			break;
		case 2:
			mesNombre.set("Febrero");
			break;
		case 3:
			mesNombre.set("Marzo");
			break;
		case 4:
			mesNombre.set("Abril");
			break;
		case 5:
			mesNombre.set("Mayo");
			break;
		case 6:
			mesNombre.set("Junio");
			break;
		case 7:
			mesNombre.set("Julio");
			break;
		case 8:
			mesNombre.set("Agosto");
			break;
		case 9:
			mesNombre.set("Septiembre");
			break;
		case 10:
			mesNombre.set("Octubre");
			break;
		case 11:
			mesNombre.set("Noviembre");
			break;

		case 12:
			mesNombre.set("Diciembre");
			break;
		}
	}

	private void rellenaArrayDias() {
		days.add(day1Property);
		days.add(day2Property);
		days.add(day3Property);
		days.add(day4Property);
		days.add(day5Property);
		days.add(day6Property);
		days.add(day7Property);
		days.add(day8Property);
		days.add(day9Property);
		days.add(day10Property);
		days.add(day11Property);
		days.add(day12Property);
		days.add(day13Property);
		days.add(day14Property);
		days.add(day15Property);
		days.add(day16Property);
		days.add(day17Property);
		days.add(day18Property);
		days.add(day19Property);
		days.add(day20Property);
		days.add(day21Property);
		days.add(day22Property);
		days.add(day23Property);
		days.add(day24Property);
		days.add(day25Property);
		days.add(day26Property);
		days.add(day27Property);
		days.add(day28Property);
		days.add(day29Property);
		days.add(day30Property);
		days.add(day31Property);
		days.add(day32Property);
		days.add(day33Property);
		days.add(day34Property);
		days.add(day35Property);
		days.add(day36Property);
		days.add(day37Property);
		days.add(day38Property);
		days.add(day39Property);
		days.add(day40Property);
		days.add(day41Property);
		days.add(day42Property);

	}
	public final IntegerProperty yearPropertyProperty() {
		return this.yearProperty;
	}

	public final int getYearProperty() {
		return this.yearPropertyProperty().get();
	}

	public final void setYearProperty(final int yearProperty) {
		this.yearPropertyProperty().set(yearProperty);
	}

	public final IntegerProperty monthPropertyProperty() {
		return this.monthProperty;
	}

	public final int getMonthProperty() {
		return this.monthPropertyProperty().get();
	}

	public final void setMonthProperty(final int monthProperty) {
		this.monthPropertyProperty().set(monthProperty);
	}
}
