/**
 * Innervehicle
 */
interface Innervehicle {
    public void wheels();
    public void speed();
    public void gear();
} 
class Car implements Innervehicle{
    public void wheels(){
        System.out.println("cars have 4 wheels.");
    }
    public void speed (){
        System.out.println("Mostly cars speed is 70kmph.");
    }
    public void gear(){
        System.out.println("Cars have maximum 5 to 10 gears.");
    }
}
class Bike implements Innervehicle{
    public void wheels(){
        System.out.println("Bikes have 2 Wheels");
    }
    public void speed (){
        System.out.println("Mostly Bike speed is 100kmph.");
    }
    public void gear(){
        System.out.println("Bikes have maximum 5 to 6 gears.");
    }
}
class Bicycle implements Innervehicle{
    public void wheels(){
        System.out.println("Bicycle have 2 wheels.");
    }
    public void speed (){
        System.out.println("Mostly Bicycle speed is 40kmph.");
    }
    public void gear(){
        System.out.println("Normal Cycles does't have gear");
    }
}
class vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Bicycle cycle = new Bicycle();
        System.out.println("-------------car---------------");
        car.wheels();
        car.gear();
        car.speed();
        System.out.println("-------------bike---------------");
        bike.wheels();
        bike.gear();
        bike.speed();
        System.out.println("-------------cycle---------------");
        cycle.wheels();
        cycle.gear();
        cycle.speed();
    }
}