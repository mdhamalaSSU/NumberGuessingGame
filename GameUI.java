
//MANOJ DHAMALA
//MARCH 29 2021

package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class GameUI extends Application {
	protected Effect shadow;

	//This class provides a user interface for a guessing game	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Game guessingGame = new Game(); 
		
		//Create a new game
		FileInputStream inp = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/javabackground.jpg");
		
		//image creation
		// create a background image
		Image im = new Image(inp);
		BackgroundImage bi = new BackgroundImage(im,
		BackgroundRepeat.NO_REPEAT,
		BackgroundRepeat.NO_REPEAT,
		BackgroundPosition.DEFAULT,
		BackgroundSize.DEFAULT);
		Background bg = new Background(bi);
		
		//Game instructions
		Text prompt = new Text();
		prompt.setFont(Font.font("Brush Script MT", 36));
		prompt.setFill(Color.WHITE);;
		prompt.setText("Welcome to Number Guessing Game. \nPlease guess a number between 1 to 100.");
		prompt.setTextAlignment(TextAlignment.RIGHT);
		
		//Two messages are provided during game
		Text message = new Text();
		message.setFont(Font.font("Courier New",FontWeight.BOLD, 14));
		message.setFill(Color.WHITE);;
		Text score = new Text();
		score.setFont(Font.font("Courier New",FontWeight.BOLD, 14));
		score.setFill(Color.WHITE);;
		

		//A text field enables the user to provide input
		TextField field = new TextField();
		field.setMinWidth(400);
		field.setText("");
		
		//Backspace button
		FileInputStream inputBackspace = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/backspace.png");
	      Image imageBackspace = new Image(inputBackspace);
	      ImageView buttonimageViewBackspace = new ImageView(imageBackspace);
	      buttonimageViewBackspace.setFitWidth(50);
	      buttonimageViewBackspace.setFitHeight(30);
	      Button backspace = new Button("",buttonimageViewBackspace);
	      backspace.addEventHandler(MouseEvent.MOUSE_ENTERED,
	               new EventHandler<MouseEvent>() {
	                 @Override
	                 public void handle(MouseEvent e) {
	                   backspace.setEffect(shadow);
	                 }
	               });
		
		//Guess button
	      FileInputStream inputEnter = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/images.png");
	      Image imageEnter = new Image(inputEnter);
	      ImageView buttonimageViewEnter = new ImageView(imageEnter);
	      buttonimageViewEnter.setFitWidth(200);
	      buttonimageViewEnter.setFitHeight(50);
	      Button Enter = new Button("",buttonimageViewEnter);
	      Enter.addEventHandler(MouseEvent.MOUSE_ENTERED,
	               new EventHandler<MouseEvent>() {
	                 @Override
	                 public void handle(MouseEvent e) {
	                   Enter.setEffect(shadow);
	                 }
	               });
	      
		//New Game Button Image
		FileInputStream input = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/newgame.png");
       Image image = new Image(input);
       ImageView buttonimageView = new ImageView(image);
       buttonimageView.setFitWidth(200);
       buttonimageView.setFitHeight(50);
       Button newGame = new Button("",buttonimageView);
       newGame.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                  @Override
                  public void handle(MouseEvent e) {
                    newGame.setEffect(shadow);
                  }
                });

     //Correct Answer Button Image
       FileInputStream input2 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/correctans.jpeg");
       Image image2 = new Image(input2);
       ImageView buttonimageView2 = new ImageView(image2);
       buttonimageView2.setFitWidth(200);
       buttonimageView2.setFitHeight(80);
       Button correctAns = new Button("",buttonimageView2);
      correctAns.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   correctAns.setEffect(shadow);
                 }
               });

      //Exit button
      FileInputStream input3 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/exit.jpeg");
      Image image3 = new Image(input3);
      ImageView buttonimageView3 = new ImageView(image3);
      buttonimageView3.setFitWidth(200);
      buttonimageView3.setFitHeight(50);
      Button exitButton = new Button("",buttonimageView3);
      exitButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
              new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent e) {
               	 exitButton.setEffect(shadow);
                }
              });
      exitButton.setText("");
      exitButton.setOnAction((ActionEvent event) -> {
          Platform.exit();
      });


    //Button1
      FileInputStream input5 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num1.png");
      Image image5 = new Image(input5);
      ImageView buttonimageView5 = new ImageView(image5);
      buttonimageView5.setFitWidth(150);
      buttonimageView5.setFitHeight(150);
      Button button1 = new Button("",buttonimageView5);
    //Put shadow in button1
      button1.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
               	  button1.setEffect(shadow);
                 }
               });

    //Button2
      FileInputStream input6 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num2.png");
      Image image6 = new Image(input6);
      ImageView buttonimageView6 = new ImageView(image6);
      buttonimageView6.setFitWidth(150);
      buttonimageView6.setFitHeight(150);
      Button button2 = new Button("",buttonimageView6);
    //Put shadow in button2
      button2.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
               	  button2.setEffect(shadow);
                 }
               });

    //Button3
      FileInputStream input7 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num3.png");
      Image image7 = new Image(input7);
      ImageView buttonimageView7 = new ImageView(image7);
      buttonimageView7.setFitWidth(150);
      buttonimageView7.setFitHeight(150);
      Button button3 = new Button("",buttonimageView7);
    //Put shadow in button3
      button3.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button3.setEffect(shadow);
                 }
               });

    //Button4
      FileInputStream input8 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num4.png");
      Image image8= new Image(input8);
      ImageView buttonimageView8 = new ImageView(image8);
      buttonimageView8.setFitWidth(150);
      buttonimageView8.setFitHeight(150);
      Button button4 = new Button("",buttonimageView8);
    //Put shadow in button4
      button4.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button4.setEffect(shadow);
                 }
               });

    //Button5
      FileInputStream input9 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num5.png");
      Image image9 = new Image(input9);
      ImageView buttonimageView9 = new ImageView(image9);
      buttonimageView9.setFitWidth(150);
      buttonimageView9.setFitHeight(150);
      Button button5 = new Button("",buttonimageView9);
    //Put shadow in button5
      button5.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button5.setEffect(shadow);
                 }
               });

    //Button6
      FileInputStream input10 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num6.png");
      Image image10 = new Image(input10);
      ImageView buttonimageView10 = new ImageView(image10);
      buttonimageView10.setFitWidth(150);
      buttonimageView10.setFitHeight(150);
      Button button6 = new Button("",buttonimageView10);
    //Put shadow in button6
      button6.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button6.setEffect(shadow);
                 }
               });

    //Button7
      FileInputStream input11 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num7.png");
      Image image11= new Image(input11);
      ImageView buttonimageView11 = new ImageView(image11);
      buttonimageView11.setFitWidth(150);
      buttonimageView11.setFitHeight(150);
      Button button7 = new Button("",buttonimageView11);
    //Put shadow in button7
      button7.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button7.setEffect(shadow);
                 }
               });

    //Button8
      FileInputStream input12 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num8.png");
      Image image12= new Image(input12);
      ImageView buttonimageView12 = new ImageView(image12);
      buttonimageView12.setFitWidth(150);
      buttonimageView12.setFitHeight(150);
      Button button8 = new Button("",buttonimageView12);
    //Put shadow in button8
      button8.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button8.setEffect(shadow);
                 }
               });

    //Button9
      FileInputStream input13 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num9.png");
      Image image13 = new Image(input13);
      ImageView buttonimageView13 = new ImageView(image13);
      buttonimageView13.setFitWidth(150);
      buttonimageView13.setFitHeight(150);
      Button button9 = new Button("",buttonimageView13);
    //Put shadow in button9
      button9.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button9.setEffect(shadow);
                 }
               });

    //Button0
      FileInputStream input4 = new FileInputStream("/Users/manozdhamala/eclipse-workspace/FinalsJavafxProject/images/num0.png");
      Image image4 = new Image(input4);
      ImageView buttonimageView4 = new ImageView(image4);
      buttonimageView4.setFitWidth(150);
      buttonimageView4.setFitHeight(150);
      Button button0 = new Button("",buttonimageView4);
    //Put shadow in button0
      button0.addEventHandler(MouseEvent.MOUSE_ENTERED,
               new EventHandler<MouseEvent>() {
                 @Override
                 public void handle(MouseEvent e) {
                   button0.setEffect(shadow);
                 }
               });


		//Two buttons are provided to control the game
		//Sets text for button

		//Alignment of nodes on the screen
        HBox finalhbox = new HBox();
        HBox hboxfb = new HBox();
        VBox finalvbox = new VBox();
		VBox Vbox1 = new VBox();
		
		hboxfb.getChildren().addAll(field, backspace);
		backspace.setAlignment(Pos.TOP_RIGHT);
		Vbox1.setAlignment(Pos.CENTER);
		Vbox1.setPadding(new Insets(40, 100, 100, 100));
		Vbox1.setSpacing(10);
		Vbox1.getChildren().addAll(prompt,message,score,hboxfb,Enter,newGame,correctAns,exitButton);
		
		VBox numvbox = new VBox();
		HBox HBox1 =new HBox();
		HBox1.getChildren().addAll(button1,button2,button3);
		
		HBox HBox2 =new HBox();
		HBox2.getChildren().addAll(button4,button5,button6);
		
		HBox HBox3 =new HBox();
		HBox3.getChildren().addAll(button7,button8,button9);
		
		HBox HBox4 =new HBox();
		HBox4.getChildren().addAll(button0);
		HBox4.setAlignment(Pos.CENTER);
		
		numvbox.getChildren().addAll(HBox1,HBox2,HBox3,HBox4);
		numvbox.setAlignment(Pos.CENTER);
		finalvbox.getChildren().addAll(Vbox1, numvbox);
		finalhbox.getChildren().addAll(Vbox1,finalvbox);
		finalhbox.setBackground(bg);
		
		//Backspace button
		backspace.setOnAction(e -> {
			field.deleteNextChar();
		});
		
		//Guess button
		Enter.setOnAction(e->{
			String s = field.getText();
			int guess = Integer.parseInt(s); //Get the number
			guessingGame.scoreUp1(); //Increase the number of total guesses
			score.setText("You have guessed " + guessingGame.getScore() + " times."); //Output the number of guesses

			int number = guessingGame.getNumber(); //Check the number the game is "thinking of"
			//Provide feedback to the user about their guess.
			if (guess > number)
				message.setText(guess + " is higher than correct answer. Try again.");
			else if (guess < number)
				message.setText(guess + " is lower than correct answer. Try again.");
			else if (guess>100)
				message.setText(" Please enter number between 1 to 100.");
			else if (guess<0)
				message.setText(" Please enter number between 1 to 100.");
			else
				message.setText("Congratulations " + number + " is the correct answer.");
			field.clear(); //Clear the field
		
			} );
		
		//New game button
		newGame.setOnAction(e -> {
			//Create a new game and reset text messages.
			guessingGame.newGame();
			message.setText("");
			score.setText("");
			;
		});
	
		//Give up button
		correctAns.setOnAction(e -> {
			//Advise user of the target number
			message.setText("I was thinking of " + guessingGame.getNumber() + ". Better luck next time.");
		});
		String initialText = "";
		
		//Exit button
		exitButton.setOnAction(e -> Platform.exit());
		
		//Button1
			button1.setOnAction(e -> {
					field.appendText(initialText+"1");
					});
		//Button2
			button2.setOnAction(e -> {
					field.appendText(initialText+"2");
				});
		//Button3
			button3.setOnAction(e -> {
					field.appendText(initialText+"3");
			});
		//Button4
			button4.setOnAction(e -> {
					field.appendText(initialText+"4");
			});
		//Button5
			button5.setOnAction(e -> {
					field.appendText(initialText+"5");
			});
		//Button6
			button6.setOnAction(e -> {
					field.appendText(initialText+"6");
			});
		//Button7
			button7.setOnAction(e -> {
					field.appendText(initialText+"7");
			});
		//Button8
			button8.setOnAction(e -> {
					field.appendText(initialText+"8");
			});
		//Button9
			button9.setOnAction(e -> {
					field.appendText(initialText+"9");
			});
		//Button0
			button0.setOnAction(e -> {
					field.appendText(initialText+"0");
			});
			
			
		//When text is entered
		field.setOnAction(e -> {
			String s = field.getText(); //Get the text
			field.clear(); //Clear the field
			
			int guess;
			if (Game.isNumeral(s)) { //If the text is a number
				guess = Integer.parseInt(s); //Get the number
				guessingGame.scoreUp1(); //Increase the number of total guesses
				score.setText("You have guessed " + guessingGame.getScore() + " times."); //Output the number of guesses

				int number = guessingGame.getNumber(); //Check the number the game is "thinking of"
				//Provide feedback to the user about their guess.
				if (guess > number)
					message.setText(guess + " is higher than correct answer. Try again.");
				else if (guess < number)
					message.setText(guess + " is lower than correct answer. Try again.");
				else
					message.setText("Congratulations " + number + " is the correct answer.");
				
				
			}
			else {
				//Advise the user if they didn't enter a number
				message.setText(s + " is not a number. Please enter a number");
			}
        });

		//Window title
		primaryStage.setTitle("Guessing Game");
		primaryStage.setWidth(1200);
		primaryStage.setHeight(700);
		
		//Displaying the stage.
		primaryStage.setScene(new Scene(finalhbox));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}