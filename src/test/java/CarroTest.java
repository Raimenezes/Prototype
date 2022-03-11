import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarroTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Carro  carro = new Carro(new Fabricante ("Volkswagen","Inglaterra"),"Volkswagenpolo", 2012);

        Carro carroClone = carro.clone();
        carroClone.getFabricante().setMarca("FIAT");
        carroClone.getFabricante().setPais("Inglaterra");
        carroClone.setModelo("Fiati Mobi");
        carroClone.setAno(2000);

        assertEquals("Carro{fabricante=Fabricante{marca='Volkswagen', pais='Inglaterra'}, modelo='Volkswagenpolo', ano=2012",carro.toString());
        assertEquals("Carro{fabricante=Fabricante{marca='FIAT', pais='Inglaterra'}, modelo='Fiati Mobi', ano=2000",carroClone.toString());
    }
}
