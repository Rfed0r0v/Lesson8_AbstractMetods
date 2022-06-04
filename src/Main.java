import beepers.Horn;
import beepers.Horn2;
import engines.EngineV12;
import engines.EngineV6;
import engines.TractorEngine;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Horn horn = new Horn();
        EngineV12 engineV12 =  new EngineV12();
        Horn2 horn2 = new Horn2();
        EngineV6 engineV6 = new EngineV6();
        TractorEngine tractorEngine = new TractorEngine();

        Lamba lamba = new Lamba (horn, engineV12);
        System.out.println(lamba.beeper.makeSound());
        System.out.println(lamba.engine.getSpeed());
        System.out.println(lamba.canDrift());

        UAZ_Patriot patriot = new UAZ_Patriot(horn2, engineV6);
        System.out.println(patriot.beeper.makeSound());
        System.out.println(patriot.engine.getSpeed());
        System.out.println(patriot.canClimbOnHills());

        Tractor dt150 = new Tractor(horn2, tractorEngine);
        System.out.println(dt150.beeper.makeSound());
        System.out.println(dt150.engine.getSpeed());
        System.out.println(dt150.canHarvesting());

        ArrayList <Car> transporter = new ArrayList<>();
        transporter.add(lamba);
        transporter.add(patriot);
        transporter.add(dt150);
        transporter.forEach((Car car)->{
            System.out.println(car.getClass());
            System.out.println(car.beeper.makeSound());
            System.out.println(car.engine.getSpeed());
        });
    }




}