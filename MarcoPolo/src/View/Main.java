package View;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {
	private ArrayList<Bola>Bolitas;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
		Bolitas = new ArrayList<Bola>();
		for (int i = 0; i < 20; i++) {
			float posX = random(15, 580);
			float posY = random(15, 580);

			Bolitas.add(new Bola(posX, posY, this));
		}
	}

	public void draw() {
		background(255);
for (Bola Bolita : Bolitas) {
	Bolita.dibujar();
	new Thread(Bolita).start();
	
}
	}
}
