package Model;

import processing.core.PApplet;

public class Polo implements Runnable {

	private float posX, posY;
	private int dirX, dirY;
	private final float SIZE = 20;
	private PApplet app;

	public Polo(float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;

	}

	public void dibujar() {
		app.fill(0,0,255);
		app.circle(posX, posY, SIZE);
	}

	public void mover() {
		posX += app.random(-2, 2);
		posY += app.random(-1, 1);

	}

	public void run() {
		mover();
	}

}
