import beepers.Beeper;
import engines.Engine;
import headlights.HeadLight;

public class Tractor extends Car{
    public Tractor(Beeper beeper, Engine engine, HeadLight headLight) {
        super(beeper, engine,headLight);

    }
    String canHarvesting() {return ("Yes, it can harvesting");}
    String headlight() {return ("Torch Lights");}
}
