abstract class Shape {
      abstract double area();
      abstract double volume();
  }
  
  class Sphere extends Shape {
      private double radius;
  
      Sphere(double radius) {
          this.radius = radius;
      }
  
      @Override
      double area() {
          return 4 * Math.PI * radius * radius;
      }
  
      @Override
      double volume() {
          return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
      }
  }
  
  class Cone extends Shape {
      private double radius;
      private double height;
  
      Cone(double radius, double height) {
          this.radius = radius;
          this.height = height;
      }
  
      @Override
      double area() {
          return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
      }
  
      @Override
      double volume() {
          return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
      }
  }
  
  class Cylinder extends Shape {
      private double radius;
      private double height;
  
      Cylinder(double radius, double height) {
          this.radius = radius;
          this.height = height;
      }
  
      @Override
      double area() {
          return 2 * Math.PI * radius * (radius + height);
      }
  
      @Override
      double volume() {
          return Math.PI * Math.pow(radius, 2) * height;
      }
  }
  
  public class area {
      public static void main(String[] args) {
          Sphere sphere = new Sphere(5);
          Cone cone = new Cone(3, 4);
          Cylinder cylinder = new Cylinder(2, 6);
  
          System.out.println("Area and volume of Sphere:");
          System.out.println("Area: " + sphere.area());
          System.out.println("Volume: " + sphere.volume());
  
          System.out.println("\nArea and volume of Cone:");
          System.out.println("Area: " + cone.area());
          System.out.println("Volume: " + cone.volume());
  
          System.out.println("\nArea and volume of Cylinder:");
          System.out.println("Area: " + cylinder.area());
          System.out.println("Volume: " + cylinder.volume());
      }
  }
  