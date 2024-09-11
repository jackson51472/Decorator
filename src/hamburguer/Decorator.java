package hamburguer;

public abstract class Decorator implements Hamburguer {

    private Hamburguer hamburguer;

    public Decorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getPrecoAdicional();

    public float getPreco() {
        return this.hamburguer.getPreco()+ getPrecoAdicional();
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }
}
