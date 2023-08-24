import com.junitmaven.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTestEscolhendoOrdemTeste {


    @Order(2)
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 15, 0));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Order(3)
    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica",
                LocalDateTime.of(2000, 1, 1, 15, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }

    @Order(1)
    @Test
    void deveRetornarSeEhMaiorDeIdade2() {
        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}