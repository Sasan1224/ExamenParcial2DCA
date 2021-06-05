package Model;

import java.util.ArrayList;
import Model.Marco;
import processing.core.PApplet;

public class World {

	PApplet app;

	Marco marco;

	public World(PApplet app) {

		this.app = app;
		marco = new Marco(app, 300, 300);

		for (int i = 0; i < 20; i++) {

			float posX = app.random(20, 550);
			float posY = app.random(20, 550);

		}
	}

	public void draw() {

		marco.dibujar();
		new Thread(marco).start();
		marco.getMensaje();
		if (marco.getMensaje()=="Algo");
	}

}
