package br.com.edl20262.aplicacoes;
import br.com.edl20262.estruturas.Arvore;;
public class DemoArvore {
    public static void main(String[] args) {
        Arvore arvore=new Arvore();
        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(12);
        String lista="";
        arvore.vistarPreOrdem(arvore.getRaiz(), lista);
        System.out.println(lista);
    }
}
