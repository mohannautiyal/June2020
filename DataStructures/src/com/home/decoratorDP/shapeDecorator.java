package com.home.decoratorDP;

public abstract class shapeDecorator implements shape {

	shape decoratedShape;

	public shapeDecorator(shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	
	public void draw() {
      decoratedShape.draw();
	}
}
