import beepers.Beeper;
import engines.Engine;
import headlights.HeadLight;

public abstract class Car {
    Beeper beeper;
    Engine engine;
    HeadLight headlight;

    public Car(Beeper beeper, Engine engine, HeadLight headlight) {
    this.beeper = beeper;
    this.engine = engine;
    this.headlight = headlight;
    }
}
