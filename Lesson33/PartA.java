 /*Question #1: Consider the interface declaration below:
public interface Resizable {
   void resize(double factor);
}'

Question #1
Assuming that classes Square, Circle, and Triangle all implement Resizable, which of the following statements will cause a compilation error and why?
Resizable shape = new Resizable(); //this would be the compliation error because 'Resizable' is an interface and cannot be implemented here
Resizable shape = new Square();
Resizable shape = new Circle();
Resizable shape = new Triangle();



Question #2: Consider the interface and class declarations below:
public interface Resizable {
   void resize(double factor);
}

public class Circle implements Resizable {
  private double radius;...

  public Circle(double theRadius) { ... }

  public double getRadius() { ... }

  public void setRadius(double theRadius) { ... }

  public double getArea() { ... }

  public void resize(double factor) { ... }...
}
Given the declaration  
Resizable circle = new Circle(5.5);

Which of the following statements will compile successfully and why?

System.out.println(circle.getRadius());
circle.resize(2.5); // this is the statment that will compile correctly because it is defined in the Resizable interface, the others dont because they are a part of cirlce not resizable
System.out.println(circle.getArea());
circle.setRadius(7.8); */

