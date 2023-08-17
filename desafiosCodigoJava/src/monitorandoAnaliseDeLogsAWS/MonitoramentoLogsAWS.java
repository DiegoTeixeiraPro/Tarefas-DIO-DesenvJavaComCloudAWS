package monitorandoAnaliseDeLogsAWS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];

            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        String servicoMaisProblemas = null;
        String servicoMenosProblemas = null;
        long maxProblemas = Long.MIN_VALUE;
        long minProblemas = Long.MAX_VALUE;

        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            String servico = entry.getKey();
            long quantidadeLogsServico = entry.getValue();

            if (quantidadeLogsServico > maxProblemas) {
                maxProblemas = quantidadeLogsServico;
                servicoMaisProblemas = servico;
            }

            if (quantidadeLogsServico < minProblemas) {
                minProblemas = quantidadeLogsServico;
                servicoMenosProblemas = servico;
            }
        }

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            String servico = entry.getKey();
            long quantidadeLogsServico = entry.getValue();
            System.out.println(servico + ":" + quantidadeLogsServico);
        }
        System.out.println("Maior:" + servicoMaisProblemas);
        System.out.println("Menor:" + servicoMenosProblemas);
    }
}