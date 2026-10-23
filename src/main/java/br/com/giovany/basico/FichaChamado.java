package br.com.giovany.basico;

public class FichaChamado {
    static void main() {
        int numero = 1999;
        String titulo = "Criação de Variáveis";
        char prioridade = 'A'; // 'A', 'M' ou 'B'
        boolean urgente = true;
        double horasEstimadas = 30.0;

        System.out.printf("Número do chamado: %d%n", numero);
        System.out.printf("Título: %s%n", titulo);
        System.out.printf("Prioridade: %c%n", prioridade);
        System.out.printf("Urgente: %b%n", urgente);
        System.out.printf("Horas estimadas: %.1f%n", horasEstimadas);
    }
}
