import beepers.Beeper;
import engines.Engine;
import headlights.HeadLight;

public class UAZ_Patriot extends Car{

    public UAZ_Patriot(Beeper beeper, Engine engine, HeadLight headLights) {
        super(beeper, engine, headLights);
    }

    String canClimbOnHills() {return ("Yes it can climbing");}

    String headlight() {return ("Halogen");}
}
