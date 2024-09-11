package test;

import hamburguer.Hamburguer;
import hamburguer.HamburguerPadrao;
import hamburguer.decotator.Bacon;
import hamburguer.decotator.Molho;
import hamburguer.decotator.Vegetariano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {
    Hamburguer hamburguer;

    @BeforeEach
    void setUp() {
        hamburguer = new HamburguerPadrao(10.f);
    }

    @Test
    void deveRetornarPrecoHamburguer() {
        assertEquals(10.f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        hamburguer = new Bacon(hamburguer);
        assertEquals(11.f, hamburguer.getPreco());
    }
    @Test
    void deveRetornarPrecoHamburguerComMolho() {
        hamburguer = new Molho(hamburguer);
        assertEquals(10.5f, hamburguer.getPreco());
    }
    @Test
    void deveRetornarPrecoHamburguerComVegetariano() {
        hamburguer = new Vegetariano(hamburguer);
        assertEquals(20.f, hamburguer.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburguerComBaconMaisMolho() {
        hamburguer = new Molho(new Bacon(hamburguer));
        assertEquals(11.5f, hamburguer.getPreco());
    }
    @Test
    void deveRetornarPrecoHamburguerComBaconMaisMolhoMaisVegetariano() {
        hamburguer = new Vegetariano(new Molho(new Bacon(hamburguer)));
        assertEquals(21.5f, hamburguer.getPreco());
    }

}