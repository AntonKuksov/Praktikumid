package praktikum11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application 
{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.show();
		Pane paigutus = new Pane();
		Scene steen = new Scene(paigutus, 600, 300);
		primaryStage.setScene(steen);
		
		Rectangle kast1 = new Rectangle(0, 0, 300, 100);
		kast1.setFill(Color.BLUE); 
		
		Rectangle kast2 = new Rectangle(0, 100+0, 300, 100+100);
		kast2.setFill(Color.BLACK);
		
		Rectangle kast3 = new Rectangle(0, 200+0, 300, 200+100);;
		kast3.setFill(Color.WHITE); 
		
		paigutus.getChildren().addAll(kast1, kast2, kast3);
	}
	
}