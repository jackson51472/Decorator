package hamburguer;

public class HamburguerPadrao implements Hamburguer{

    private float preco;

    public HamburguerPadrao(Float preco) {
        this.setPreco(preco);
    }


    @Override
    public float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}
