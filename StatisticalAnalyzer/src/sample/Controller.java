package sample;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import model.*;

import java.io.File;
import java.util.ArrayList;

public class Controller {
    public TextArea textArea;
    public BarChart chart;
    public CategoryAxis categoryAxis;
    Window primaryStage;
    Pipeline pipes;

    public void on_Download(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Выберите файл");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Файл", "*.txt"));
        File file = fileChooser.showOpenDialog(primaryStage);
        pipes=new Pipeline(file);
        pipes.addStep(new ReadingData(null));
        pipes.addStep(new Account(null));
        pipes.addStep(new Chart(null));
        chart.getData().clear();
        chart.getData().add(pipes.execute());
    }
}
