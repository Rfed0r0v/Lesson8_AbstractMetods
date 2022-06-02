public class Main {

    public static void main(String[] args) {
        Horn horn = new Horn();
        EngineV12 engineV12 =  new EngineV12();
        Lamba lamba = new Lamba(horn, engineV12);
        System.out.println(lamba.beeper.makeSound());
        System.out.println(lamba.engine.getSpeed());
    }




}