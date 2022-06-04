import beepers.Beeper;
import engines.Engine;

public class UAZ_Patriot extends Car{

    public UAZ_Patriot(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    String canClimbOnHills() {return ("Yes it can climbing");}
}
