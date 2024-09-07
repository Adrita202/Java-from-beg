public class Main {
    public static void main(String[] args) {
        Animal ani=new Animal();
        Animal doggo=new Dog();//Creating dog object upcasting

        ani.Sound();
        doggo.Sound();
        
    }
    
}
class Animal{
    protected void Sound(){
        System.out.println("Makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void Sound(){
        System.out.println("Dog Barks");

    }
}