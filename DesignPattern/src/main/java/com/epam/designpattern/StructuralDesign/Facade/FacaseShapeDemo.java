package com.epam.designpattern.StructuralDesign.Facade;

public class FacaseShapeDemo {
	   public static void main(String[] args) {
		      FacadeShapeMaker shapeMaker = new FacadeShapeMaker();

		      shapeMaker.drawCircle();
		      shapeMaker.drawRectangle();
		      shapeMaker.drawSquare();		
		   }
}
