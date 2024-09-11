package hamburguer.decotator;

import hamburguer.Decorator;
import hamburguer.Hamburguer;

public class Bacon extends Decorator {
    public Bacon(Hamburguer hamburguer){
    super(hamburguer);
    }

    public float getPrecoAdicional() {
        return 1;
    }
}
