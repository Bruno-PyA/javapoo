import br.com.alura.screenmatch.cauculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.cauculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecninca();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());



        System.out.println(meuFilme.pegaMedia());

        Serie Atirador = new Serie();
        Atirador.setNome("Atirador");
        Atirador.setAnoDeLancamento(2018);
        Atirador.exibeFichaTecninca();
        Atirador.setTemporadas(10);
        Atirador.setEpisodiosPorTemporada(10);
        Atirador.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Atirador " + Atirador.getDuracaoEmMinutos());

        Filme AnotherFilme = new Filme();
        AnotherFilme.setNome("Avatar");
        AnotherFilme.setAnoDeLancamento(1945);
        AnotherFilme.setDuracaoEmMinutos(312);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(AnotherFilme);
        calculadora.inclui(Atirador);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Atirador);
        episodio.setTotalDeVizualizacoes(300);
        filtro.filtra(episodio);


    }
}
