/*
 *  Program:    Exercise 14.2
 *  Date:       2/4/18
 *  Developer:  Garrett Wolfe
 *  Purpose:    Write a program that displays a tic-tac-toe board. A cell may be X, O, or empty. What to display
                in each cell is randomly decided.
 */
package exercise14_2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_2 extends Application{
    @Override
    public void start(Stage primaryStage) {
	Image imageX = new Image("file:x.gif");
	Image imageO = new Image("file:o.gif");
        GridPane pane = new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setPadding(new Insets(50, 50, 50, 50));
	for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
		int randomGraphic = (int)(Math.random() * 3);
		if (randomGraphic == 0) {
                    pane.add(new ImageView(imageX), col, row);
		} else if (randomGraphic == 1) {
                    pane.add(new ImageView(imageO), col, row);
		}
            }
	}
	Scene scene = new Scene(pane);
	primaryStage.setTitle("Exercise 14_2");
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    public static void main(String[] args) {
	launch(args);
    }
}