package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.io.*;

public class Main extends Application {
	//declare buttons, labels, and variables
	private Button btGenerate = new Button("Generate");
	private Button btClear = new Button("Clear");
	
	private Label fullTitleLabel = new Label();
	private Label genreLabel = new Label();
	private Label platformLabel = new Label();
	private Label devLabel = new Label();
	private Label dateLabel = new Label();;
	private Label genLabel = new Label();
	
	private int generations;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//create pane
			GridPane root = new GridPane();
			root.setVgap(5);
			root.setHgap(5);
			
			//add to pane
			root.add(new Label("Title: "), 0, 0);
			root.add(fullTitleLabel, 1, 0);
			root.add(new Label("Genre: "), 0, 1);
			root.add(genreLabel, 1, 1);
			root.add(new Label("Platform: "), 0, 2);
			root.add(platformLabel, 1, 2);
			root.add(new Label("Developer: "), 0, 3);
			root.add(devLabel, 1, 3);
			root.add(new Label("Date Released: "), 0, 4);
			root.add(dateLabel, 1, 4);
			root.add(new Label("Generations Done: "), 0, 5);
			root.add(genLabel, 1, 5);
			root.add(btGenerate, 0, 6);
			root.add(btClear, 1, 6);
			
			//add generation function to btGenerate
			//this generates the game
			btGenerate.setOnAction(e -> {
				//declare the game
				GameGeneration game = new GameGeneration();
				
				//add a generation
				generations++;
				
				//generate a title
				String title = game.generateTitle();
				String title2 = game.generateTitle();
				String subtitle = game.generateSubtitle();
				String subtitle2 = game.generateSubtitle();
				String SQN = game.generateSQN();
				
				if (subtitle != "" && subtitle2 != "") {
					fullTitleLabel.setText(title + " " + title2 + ": " + subtitle + " " + subtitle2 + " " + SQN);
				}
				else if (subtitle == "" && subtitle2 != "") {
					fullTitleLabel.setText(title + " " + title2 + ": " + subtitle2 + " " + SQN);
				}
				else if (subtitle != "" && subtitle2 == "") {
					fullTitleLabel.setText(title + " " + title2 + ": " + subtitle + " " + SQN);
				}
				else if (subtitle == "" && subtitle2 == "") {
					fullTitleLabel.setText(title + " " + title2 + " " + SQN);
				}
				
				
				//generate a genre, platform, and developer
				String genre = game.generateGenre();
				genreLabel.setText(genre);
				
				String platform = game.generatePlatform();
				platformLabel.setText(platform);
				
				String dev = game.generateDev();
				devLabel.setText(dev);
				
				//generate a date
				String day = game.generateDay();
				String month = game.generateMonth();
				String year = game.generateYear();
				dateLabel.setText(month + " " + day + ", " + year);
				
				//get generations
				genLabel.setText(String.valueOf(generations));

			});
			
			//add clear function to btClear
			//this clears the labels
			btClear.setOnAction(e -> {
				fullTitleLabel.setText("");
				genreLabel.setText("");
				platformLabel.setText("");
				devLabel.setText("");
				dateLabel.setText("");
				genLabel.setText("0");
				generations = 0;
			});
			
			Scene scene = new Scene(root, 400, 163);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Make a Game!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}