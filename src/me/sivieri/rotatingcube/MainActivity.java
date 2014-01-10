package me.sivieri.rotatingcube;

import processing.core.PApplet;

public class MainActivity extends PApplet {
	private float rotationX = 0;
	private float rotationY = 0;
	private float velocityX = 0;
	private float velocityY = 0;

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		background(255);
		lights();
		translate(this.displayWidth / 2, this.displayHeight / 2, 0);
		rotateX(radians(-this.rotationX));
		rotateY(radians(270 - this.rotationY));
		noFill();
		stroke(0);
		box(400);
		this.rotationX += this.velocityX;
		this.rotationY += this.velocityY;
		this.velocityX *= 0.95;
		this.velocityY *= 0.95;
		if (this.mousePressed) {
			this.velocityX += (this.mouseY - this.pmouseY) * 0.01;
			this.velocityY -= (this.mouseX - this.pmouseX) * 0.01;
		}
	}

	@Override
	public String sketchRenderer() {
		return P3D;
	}

}
