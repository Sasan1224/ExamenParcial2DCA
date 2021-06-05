package Model;

import processing.core.PApplet;

public class Marco implements Runnable {
	PApplet app;

	private float posX;
	private float posY;
	private final float SIZE = 40;
	private String Mensaje;

	public Marco(PApplet app, float posX, float posY) {

		this.app = app;
		this.posX = posX;
		this.posY = posY;

	}

	public void dibujar() {

		app.fill(255, 0, 0);
		app.circle(posX, posY, SIZE);

	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}

	public void search() {

		Mensaje = "Algo";

	}

	@Override
	public void run() {

		try {
		Thread.sleep(2000);
			search();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
