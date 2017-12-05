package practice8;

public class Circle extends Shape{
    double radius;

    public Circle(double x, double y,double radius) {
        super(x, y);
        this.radius = radius;
    }
    
    public void draw() {
    	System.out.printf("Circle center: (%.1f %.1f)-radius(%.1f)",x,y,radius);
    }
    public double getArea() {
    	double area = radius*radius*(3.14);
    	return area;
    }
    public double getLength() {
    	double length = 2*(3.14)*radius;
    	return length;
    }

    
}

