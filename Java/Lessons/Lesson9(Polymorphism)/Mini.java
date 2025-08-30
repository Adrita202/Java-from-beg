// package Lesson9(Polymorphism);

public class Mini {
    public static void main(String[] args) {
        Bank b1=new ABC();
        Bank b2=new DEF();
        Bank b3=new XYZ();

        System.out.println(b1.getInterestrate());
        System.out.println(b2.getInterestrate());
        System.out.println(b3.getInterestrate());

        
    }
    
}

class Bank{
    int getInterestrate(){
        return 1;
    }

}
class ABC extends Bank{
    int getInterestrate(){
        return 5;
    }
}
class DEF extends Bank{
    int getInterestrate(){
        return 10;
    }

}
class XYZ extends Bank{
    int getInterestrate(){
        return 13;
    }

}