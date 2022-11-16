public class Main {
    public static void main(String[] args) {


        car myCar = new car(); // constructing an instance of another class
        car myCar1 = new car(); /*You can reuse a class to instantiate multiple instances of this class.
                                 This means we can use class car to create several objects*/


        //object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer,coffee cup)

        System.out.println(myCar.color);
        System.out.println(myCar.make);
        System.out.println();// to input a space in my two objects
        System.out.println(myCar1.make);
        System.out.println(myCar1.color);

        //myCar.drive();//called the method drive
        //myCar.brake();//calling the method brake()


    }
}