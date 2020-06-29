package com.home.decoratorDP;

public class shapeDraw {

	public static void main(String[] args) {

        shape circle = new circle();
        circle.draw();
        System.out.println("======================================");
        shapeDecorator drawred = new RedShapeDecorator(circle);
        drawred.draw();
	}

}
