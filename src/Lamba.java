import beepers.Beeper;
import engines.Engine;

public class Lamba extends Car {
    public Lamba(Beeper beeper, Engine engine) {super(beeper, engine);}

    String canDrift() {return ("Yes it can drift");}
}
