package diego.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PrimeirosPassosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PrimeirosPassosApplication.class, args);

        Calculadora calculadora = context.getBean(Calculadora.class);

        System.out.println("O resultado é " + calculadora.somar(2, 7));

        context.close();
    }
}