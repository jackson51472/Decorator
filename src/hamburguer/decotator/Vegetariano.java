package hamburguer.decotator;

import hamburguer.Decorator;
import hamburguer.Hamburguer;

public class Vegetariano extends Decorator {

    public Vegetariano(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoAdicional() {
        return 10;
    }
}
