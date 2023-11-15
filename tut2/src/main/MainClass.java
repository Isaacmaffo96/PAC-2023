package main;

import model.Model;
import view.View;
import controller.Controller;

public class MainClass {

	public static void main(String[] args) {

		Model model = new Model();
		
		View view = new View(model);
		
		Controller controller = new Controller(model,view);
		
		view.setVisible(true);
	}

}