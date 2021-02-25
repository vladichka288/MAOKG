package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) // start - is the main entry point for all JavaFX applications
	{
	Group root = new Group(); // making the root of all scene's objects
	Scene scene = new Scene (root, 800, 600); // making the scene for root object with size of 500*400 pixels
	scene.setFill(Color.rgb(218,112,213)); // set the color of scene
	Ellipse ellipse = new Ellipse();
	ellipse.setFill(Color.rgb(0, 0, 255));
	ellipse.setCenterX(250.0f);
	ellipse.setCenterY(300.0f);
	ellipse.setRadiusX(50.0f);
	ellipse.setRadiusY(200.0f);
	Rectangle r = new Rectangle(200, 100, 400, 100); //створення фігури
	 r.setFill(Color.rgb(0,128,2));
	 Ellipse ellipse2 = new Ellipse();
	 ellipse2.setFill(Color.rgb(255, 255, 0));
	 ellipse2.setCenterX(550.0f);
	 ellipse2.setCenterY(300.0f);
	 ellipse2.setRadiusX(50.0f);
	 ellipse2.setRadiusY(200.0f);
	 Rectangle r2 = new Rectangle(200, 400, 400, 100); //створення фігури
	 Rectangle r3 = new Rectangle(200, 100, 100, 100); //створення фігури
	 r3.setFill(Color.rgb(0,128,2));
	 r2.setFill(Color.rgb(255,0,0));
	 root.getChildren().add(r);
	 root.getChildren().add(ellipse2);
	 root.getChildren().add(r2);
	 root.getChildren().add(ellipse);
	 root.getChildren().add(r3);

	 
	
	/*
	// elements of scene will insert here
	 Polygon polygon0 = new Polygon(62, 44, 136, 223, 342, 223);
	 Polygon polygon1 = new Polygon(62, 401, 136, 222, 342, 222);


	 polygon0.setFill(Color.BLUE);
	 polygon1.setFill(Color.BLUE);

	 Polygon LittlePolygon = new Polygon(564, 223, 670, 157, 625, 223, 670, 288);
	 root.getChildren().add(LittlePolygon);
	 LittlePolygon.setFill(Color.BLUE);

	 Circle circle = new Circle(220,223,56);
	 Color colorOfWhole = Color.web("FF0000",1.0);
	 circle.setFill(colorOfWhole);

	 root.getChildren().add(polygon0);
	 root.getChildren().add(polygon1);
	 root.getChildren().add(circle);

	 Line l = new Line(192, 196, 616, 196); //
	 Line l1 = new Line(192, 205, 616, 205); //
	 Line l2 = new Line(192, 214, 616, 214); //
	 Line l3 = new Line(192, 223, 616, 223); //
	 Line l4 = new Line(192, 232, 616, 232); //
	 Line l5 = new Line(192, 241, 616, 241); //
	 Line l6 = new Line(192, 250, 616, 250); //
	 
	 

	 Line ll = new Line(192, 197, 616, 197); //
	 Line ll1 = new Line(192, 206, 616, 206); //
	 Line ll2 = new Line(192, 215, 616, 215); //
	 Line ll3 = new Line(192, 224, 616, 224); //
	 Line ll4 = new Line(192, 233, 616, 233); //
	 Line ll5 = new Line(192, 242, 616, 242); //
	 Line ll6 = new Line(192, 251, 616, 251); //
	 
	 
	 
	 root.getChildren().add(l);
	 root.getChildren().add(l1);
	 root.getChildren().add(l2);
	 root.getChildren().add(l3);
	 root.getChildren().add(l4);
	 root.getChildren().add(l5);
	 root.getChildren().add(l6);
	 
	 root.getChildren().add(ll);
	 root.getChildren().add(ll1);
	 root.getChildren().add(ll2);
	 root.getChildren().add(ll3);
	 root.getChildren().add(ll4);
	 root.getChildren().add(ll5);
	 root.getChildren().add(ll6);
	 
	 Color bassStringOfGuitar = Color.web("000000",1.0);
	 Color bassStringOfGuitarAdditional = Color.web("ebebeb",1.0);
	 
	 

	 l.setStroke(bassStringOfGuitar);
	 l1.setStroke(bassStringOfGuitar);
	 l2.setStroke(bassStringOfGuitar);
	 l3.setStroke(bassStringOfGuitar);
	 l4.setStroke(bassStringOfGuitar);
	 l5.setStroke(bassStringOfGuitar);
	 l6.setStroke(bassStringOfGuitar);
	 
	 ll.setStroke(bassStringOfGuitar);
	 ll1.setStroke(bassStringOfGuitarAdditional);
	 ll2.setStroke(bassStringOfGuitarAdditional);
	 ll3.setStroke(bassStringOfGuitarAdditional);
	 ll4.setStroke(bassStringOfGuitarAdditional);
	 ll5.setStroke(bassStringOfGuitarAdditional);
	 ll6.setStroke(bassStringOfGuitarAdditional);
	//////////////////*/

	//adding the object Text as a child to the root object
	primaryStage.setScene(scene); // specifying the scene to be used on this stage
	primaryStage.show(); // show the scene
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
