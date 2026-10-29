package br.com.edl20262.aplicacoes;
import br.com.edl20262.estruturas.ArvoreBinaria;
public class DemoArvoreApplication {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();
        int[] valores = {40, 20, 60, 10, 30, 50, 70};
        for (int v : valores) a.inserir(v);
        System.out.println("INSERIDA " + a.inserir(25));
        System.out.println("REPETIDA " + a.inserir(20));
        System.out.println("ENCONTRADO " + a.contem(50));
        System.out.println("EM " + a.percurso("EM"));
        System.out.println("LARGURA " + a.largura());
        System.out.println("ALTURA " + a.altura());
        System.out.println("REMOVIDA " + a.remover(40));
        System.out.println("APOS " + a.percurso("EM"));
    }
}
