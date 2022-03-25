public class Circle
{private double radius;
private String color;
public Circle() {
      radius = 1.0;
      color = "red";
   }
public Circle(double r,String c) {
      radius = r;
      color=c;
      }

   
   
   public double getRadius() {
     return radius; 
   }
   
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
public String getColor(){
return color;}
public static void main(String[] args)
{Circle c=new Circle();
System.out.println("The default value of radius is:"+c.getRadius());
System.out.println("The default value of color is:"+c.getColor());
System.out.println("The default value of area is:"+c.getArea());
Circle c1=new Circle(2.0,"blue");

System.out.println("The updated value of radius is:"+c1.getRadius());
System.out.println("The updated value of color is:"+c1.getColor());
System.out.println("The updated value of area is:"+c1.getArea());
}
}
