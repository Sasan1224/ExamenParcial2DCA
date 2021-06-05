package View;
import processing.core.PApplet;

public class Bola implements Runnable {

	private float posX, posY;
	private final float SIZE = 20;
	private PApplet app;
	public Bola(float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		
	}
	
	public void dibujar () {
		app.fill(0);
		app.circle(posX,posY,SIZE);
	}
	
	public void mover() {
		posX +=app.random(-2,2);
		posY +=app.random(-1,1);
	}
	public void run() {
		mover();
	}
	
}
