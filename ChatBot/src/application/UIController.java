package application;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class UIController {
	@FXML
	private TextField chatField;
	@FXML
	private VBox chatBox;
	
	public void chatBot(String message) {
		Label bot = new Label(" Bot");
		bot.getStyleClass().add("user");
		bot.setAlignment(Pos.TOP_LEFT);
		bot.setMaxWidth(chatBox.getPrefWidth());
		
		Label text = new Label("Tuấn đẹp trai");
		text.setWrapText(true);
		text.getStyleClass().add("botText");
		text.setMinHeight(Region.USE_PREF_SIZE);
		text.setMaxWidth(chatBox.getPrefWidth());
		
		chatBox.getChildren().addAll(bot, text);
	}
	
	public void send() {
		String message = chatField.getText();
		
		if (!message.isEmpty()) {
			
			Label you = new Label("You ");
			you.getStyleClass().add("user");
			you.setAlignment(Pos.TOP_RIGHT);
			you.setMaxWidth(chatBox.getPrefWidth());
			
			Label text = new Label(message);
			text.setAlignment(Pos.TOP_RIGHT);
			text.setWrapText(true);
			text.getStyleClass().add("userText");
			text.setMinHeight(Region.USE_PREF_SIZE);
			text.setMaxWidth(chatBox.getPrefWidth());
			
			chatBox.getChildren().addAll(you, text);
			
			chatField.clear();
			
			chatBot(message);
		}
	}
}
