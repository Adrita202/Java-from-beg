class Tasty{
    void showoff(){
        System.out.println("1");

    }
}
class VeryTasty extends Tasty{
    void showoff(){
        super.showoff();
        System.out.println("22");
    }
}
public class Meowww{
    public static void main(String[] args) {
        VeryTasty ob=new VeryTasty();
        ob.showoff();
    }
}