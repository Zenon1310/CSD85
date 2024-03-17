public class ButtonPhone extends LandPhone {

    String Brand;

    ButtonPhone(String Name, int Year, String Brand){
        super(Name, Year);
        this.Brand = Brand;
    }

    void SMS(){
        System.out.println("By using " + Name + " we can send SMS");
    }
}
