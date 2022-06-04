import beepers.Beeper;
import engines.Engine;

public class Tractor extends Car{
    public Tractor(Beeper beeper, Engine engine) {
        super(beeper, engine);

    }
    String canHarvesting() {return ("Yes, it can harvesting");}
}
