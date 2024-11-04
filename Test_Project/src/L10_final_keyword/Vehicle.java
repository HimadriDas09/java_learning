package L10_final_keyword;

public  final class Vehicle {

    private final  int speedLimit ;

    public Vehicle(int speedLimit) {
        this.speedLimit = speedLimit;
    }

//    public Vehicle(){
//
//    }


    public final void airBags(){
        System.out.println("4 air bags");
    }
}

/*
* 1. final variables:
*   - they can only be initialized once. either during declaration only OR in constructor.
*   - it's a variable whose value once assigned cannot be changed.
*   - private final int varName;
*
*
* 2. final methods:
*   - a final method cannot be overridden. (USECASE: to not let child class override a method)
*
* 3. final class:
*   - cannot be extended.
*
* 4. final keyword in constructor ?
*
*   - constructor is also a method which is called when we create an instance, or is called
*   when we create a child instance.
*   - BUT we don't try to override it anywhere.
*
*   - So it's is of NO USE write final in it.
*   - AND, final keyword in constructor is NOT ALLOWED.
*
* */
