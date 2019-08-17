package java101;

import java.io.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/*
 * 	Parte de este código fue tomado de:
 * 	http://tutorials.jenkov.com/javafx/tableview.html
 * 	https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
 */
public class Screen extends Application{
	public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {

        TableView tableView = new TableView();
        
        TableColumn<Student, String> column1 = new TableColumn<>("Carnet");
        column1.setCellValueFactory(new PropertyValueFactory<Student, String>("carne"));


        TableColumn<Student, String> column2 = new TableColumn<>("Nombre");
        column2.setCellValueFactory(new PropertyValueFactory<Student, String>("nombre"));

        TableColumn<Student, String> column3 = new TableColumn<>("Correo");
        column3.setCellValueFactory(new PropertyValueFactory<Student, String>("correo"));

        TableColumn<Student, String> column4 = new TableColumn<>("Telefono");
        column4.setCellValueFactory(new PropertyValueFactory<Student, String>("telefono"));

        TableColumn<Student, String> column5 = new TableColumn<>("Nickname");
        column5.setCellValueFactory(new PropertyValueFactory<Student, String>("apodo"));

        TableColumn<Student, String> column6 = new TableColumn<>("Tipo");
        column6.setCellValueFactory(new PropertyValueFactory<Student, String>("type"));

        TableColumn<Student, String> column7 = new TableColumn<>("Promedio Examenes");
        column7.setCellValueFactory(new PropertyValueFactory<Student, String>("promedioExamenes"));

        TableColumn<Student, String> column8 = new TableColumn<>("Promedio Quices");
        column8.setCellValueFactory(new PropertyValueFactory<Student, String>("promedioQuices"));

        TableColumn<Student, String> column9 = new TableColumn<>("Promedio Tareas");
        column9.setCellValueFactory(new PropertyValueFactory<Student, String>("promedioTareas"));

        TableColumn<Student, String> column10 = new TableColumn<>("Proyecto 1");
        column10.setCellValueFactory(new PropertyValueFactory<Student, String>("proyectoEin"));

        TableColumn<Student, String> column11 = new TableColumn<>("Proyecto 2");
        column11.setCellValueFactory(new PropertyValueFactory<Student, String>("proyectoZwai"));

        TableColumn<Student, String> column12 = new TableColumn<>("Proyecto 3");
        column12.setCellValueFactory(new PropertyValueFactory<Student, String>("proyectoDrei"));

        TableColumn<Student, String> column13 = new TableColumn<>("Promedio A");
        column13.setCellValueFactory(new PropertyValueFactory<Student, String>("promedioExamenQuizTarea"));

        TableColumn<Student, String> column14 = new TableColumn<>("Promedio B");
        column14.setCellValueFactory(new PropertyValueFactory<Student, String>("promedioProyecto"));

        TableColumn<Student, String> column15 = new TableColumn<>("Nota Final");
        column15.setCellValueFactory(new PropertyValueFactory<Student, String>("notaFinal"));






        tableView.setItems(CSVreader());
        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);
        tableView.getColumns().add(column7);
        tableView.getColumns().add(column8);
        tableView.getColumns().add(column9);
        tableView.getColumns().add(column10);
        tableView.getColumns().add(column11);
        tableView.getColumns().add(column12);
        tableView.getColumns().add(column13);
        tableView.getColumns().add(column14);
        tableView.getColumns().add(column15);


        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public ObservableList<Student> CSVreader() throws FileNotFoundException, IOException{
    	FileChooser fileChooser = new FileChooser();
    	File file = fileChooser.showOpenDialog(null);
    	File path = null;
    	if (file != null) {
    		path = file.getAbsoluteFile();
    	}
    	String line;
    	BufferedReader br = null;
    	ObservableList<Student> info = FXCollections.observableArrayList();
    	try {
    	br = new BufferedReader(new FileReader(path));
    	while ((line = br.readLine()) != null) {
    		String[] container = line.split(",");
    		if (container[5].equals("A")|| container[5].equals("a")) {
    			// Ejemplo de instanciación: Aquí se crean los objetos StudentA y StudentB, utilizando los datos obtenidos de el archivo
    			// seleccionado.
    			StudentA student = new StudentA(container[0],container[1],container[2],container[3],container[4],
    					container[6],container[7],container[8]);
    			info.add(student);
    		} else {
    			StudentB student = new StudentB(container[0],container[1],container[2],container[3],container[4],
    					container[9],container[10],container[11]);
    			info.add(student);    			
    		}
    	}
    	
    } catch (FileNotFoundException e) {
    	e.printStackTrace();
    } catch (IOException e) {
    	e.printStackTrace();
    } finally {
    	if (br != null) {
    		try {
    			br.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
		return info;
    }
}
    	
