import beepers.Beeper;
import engines.Engine;
import headlights.HeadLight;

public class Lamba extends Car {
    public Lamba(Beeper beeper, Engine engine, HeadLight headlights) {super(beeper, engine, headlights);}

    String canDrift() {return ("Yes it can drift");}
    String headlight() {return ("Led lights");}
}
