import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
     * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
     * retornar um valor.
     */
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        Consumer<Integer> imprimirNumeroPar = numeros -> {
            if (numeros % 2 == 0) {
                System.out.println(numero);
            }
        };

    numero.stream()
            .filter(n -> n % 2 == 0)
                    .forEach(System.out::println);
    }
}

