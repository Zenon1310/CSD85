// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {

        LandPhone obj1 = new LandPhone("Land Phone",1999);
        ButtonPhone obj2 = new ButtonPhone("Button Phone", 2004,"Nokia");
        SmartPhone obj3 = new SmartPhone("Smart Phone",2024,"Apple","iPhone 15 Pro Max");

        System.out.println();
        obj1.Call();
        obj1.Dial();

        System.out.println();
        obj2.Call();
        obj2.Dial();
        obj2.SMS();

        System.out.println();
        obj3.Dial();
        obj3.Call();
        obj3.SMS();
        obj3.Games();
        obj3.Internet();

    }
}