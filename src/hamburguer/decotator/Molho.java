package hamburguer.decotator;

import hamburguer.Decorator;
import hamburguer.Hamburguer;

public class Molho extends Decorator {

    public Molho(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoAdicional() {
        return 0.5f;
    }
}
