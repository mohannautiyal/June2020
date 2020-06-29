package com.home.decoratorDP;

public class RedShapeDecorator extends shapeDecorator{

	public RedShapeDecorator(shape decoratedShape) {
		super(decoratedShape);
	}

	
	public void draw() {
		decoratedShape.draw();
		System.out.println("Border color: RED");
	}
	
}
