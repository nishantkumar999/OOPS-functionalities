public abstract class Car {
    int wheels = 4;
    int steeringWheel = 1;
    String name;

    Car(){
        System.out.println("Inside default constructor");
    }

    Car(String name){
        this(); //constuctor call should be your first line when calling another constuctor in a constuctor.
        this.name = name;
        System.out.println("Inside parametrized constructor");
    }

    // for abstract method class needs to be abstract also and objects of that class cannot be created.
    public abstract void accelerate();

    public void start(){

    }

    public void stop(){

    }
}
