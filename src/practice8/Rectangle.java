package practice8;

public class Rectangle extends Shape {
    double width,height;

    public Rectangle(double x, double y,double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public void draw() {
    	System.out.printf("Rectangle: (%.1f %.1f)-(%.1f %.1f)",x,y,width,height);
    }

   public double getArea() {
	   double area = width*height;
	   return area;
   }
   public double getLength() {
	   double length = 2*(width+height);
	   return length;
   }
}