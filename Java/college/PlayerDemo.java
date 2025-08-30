interface Player{
    void play();
}
class Child implements Player{
    @Override
    public void play(){
        System.out.println("A child plays with toys and imagines worlds beyond reality.");
    }
}
class Musician implements Player{
    @Override
    public void play(){
        System.out.println("A musician plays an instrument to express emotions and connect with others");
    }
}
class Actor implements Player{
    @Override
    public void play(){
        System.out.println("An actor plays a role to tell a story");
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        Player child=new Child();
        Player musician=new Musician();
        Player actor=new Actor();

        child.play();
        musician.play();
        actor.play();
    }
    
}
