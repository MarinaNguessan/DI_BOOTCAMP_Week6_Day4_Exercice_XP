package atos;

public class Exercice3Rectangle {
	
	public class Rectangle {
	    private double width;
	    private double height;
	    
	    public Rectangle() {
	        this.width = 4;
	        this.height = 5;
	    }
	    
	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    public double getArea() {
	        return this.height * this.width;
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
