import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {

    @Test
    void testeClone() throws CloneNotSupportedException {
        Compra compra = new Compra("bolo de chocolate", "rua do Yan casa bonita", 15,
                new Cartao(10, 9, "Marco Antonio Araujo", "29/30"));

        Compra compraClone = compra.clone();
        compraClone.setItem("bolo de laranja");
        compraClone.setEndereco("rua do Alison Israel casa mais bonita ainda");
        compraClone.setValor(20);

        assertEquals("Compra{item='bolo de chocolate', endereco='rua do Yan casa bonita', valor=15, cartao=Cartao{numero=10, CVV=9, nome='Marco Antonio Araujo', validade='29/30'}}", compra.toString());
        assertEquals("Compra{item='bolo de laranja', endereco='rua do Alison Israel casa mais bonita ainda', valor=20, cartao=Cartao{numero=10, CVV=9, nome='Marco Antonio Araujo', validade='29/30'}}", compraClone.toString());
    }
}
