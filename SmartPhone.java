public class SmartPhone extends ButtonPhone{

    String Model;

    SmartPhone(String Name, int Year, String Brand, String Model){
        super(Name, Year, Brand);
        this.Model = Model;
    }

    void Games(){
        System.out.println("We can play games in " + Model);
    }
    void Internet(){
        System.out.println("By using " + Model + " we can access internet.");
    }


}
