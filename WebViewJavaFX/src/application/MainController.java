package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class MainController implements Initializable{
	
	@FXML
	private WebView webView;
	
	@FXML
	private Button btn, reload, zoomInBtn, zoomOutBtn;
	
	@FXML
	private TextField textField, jsText;
	
	private String homePage;
	
	private WebEngine engine;
	private WebHistory history;
	
	private double webZoom;;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		engine = webView.getEngine();
		homePage = "www.google.com";
		textField.setText(homePage);
		loadPage();
		
	}
	
	public void loadPage() {
//		engine.load("https://www.google.com");
		engine.load("https://" + textField.getText());
	}
	
	public void reload() {
		engine.reload();
	}
	
	public void zoomIn() {
		webZoom += 0.25;
		webView.setZoom(webZoom);
	}
	
	public void zoomOut() {
		webZoom -= 0.25;
		webView.setZoom(webZoom);
	}
	
	public void displayHistory() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		
		for(WebHistory.Entry entry: entries) {
//			System.out.println(entries);
			System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
		}
	}
	
	public void back() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(-1);
		textField.setText(entries.get(history.getCurrentIndex()).getUrl());
		
	}
	
	public void forward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(1);
		textField.setText(entries.get(history.getCurrentIndex()).getUrl());
		
	}
	
	public void executeJS() {
		String jsSite = jsText.getText();
		engine.executeScript("window.location = \"https://"+jsSite+"\";");
		textField.setText(jsSite);
		
	}
	
	
}
