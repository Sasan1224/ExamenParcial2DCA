package View;

import java.util.ArrayList;

import Model.Polo;
import Model.World;
import processing.core.PApplet;

public class Main extends PApplet {
	private ArrayList<Polo> Politos;
	private World Mundo;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
		Politos = new ArrayList<Polo>();
		Mundo = new World(this);
		for (int i = 0; i < 20; i++) {
			float posX = random(15, 580);
			float posY = random(15, 580);

			Politos.add(new Polo(posX, posY, this));
			
		}
	}

	public void draw() {
		background(255);
		for (Polo Polito : Politos) {
			Polito.dibujar();
			new Thread(Polito).start();

		}
		Mundo.draw();
	}
}
