public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    int toltalDeAvaliacoes;
    int duracaoEmMinutos;
    double somaDasAvaliacoes;


    void exibeFichaTecninca(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        toltalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / toltalDeAvaliacoes;
    }
}
