package br.com.alura.screenmatch.cauculos;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
     }
    }
