class Car {
     String name;

     Car(String name){
        this.name = name;
     }

};

class Garage{
    void park(Car Vehicle){
        System.out.println("The " + Vehicle.name +" is parked in the garage");
    }
};
// this code tries to Pass Objects as Arguments in Java Language
public class PassByValue{
    public static void main(String[] args) {
    // we will have to declare and instantiate some objects from the classses we create above

    Car car1 = new Car("BMW");
    Car car2 = new Car("Benz");
    Garage garage = new Garage();

    garage.park(car2);
    garage.park(car1);

// this is an implementation of passing object by reference in this code


        
    }
}