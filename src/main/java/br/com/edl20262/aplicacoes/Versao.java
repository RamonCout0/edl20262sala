package br.com.edl20262.aplicacoes;

import br.com.edl20262.estruturas.ArvoreBinaria;
import java.util.Scanner;

public class Versao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArvoreBinaria versoesAtivas = new ArvoreBinaria();
        int quantidade = entrada.nextInt();

        for (int i = 0; i < quantidade; i++) {
            String acontecimento = entrada.next();
            int versao = entrada.nextInt();

            switch (acontecimento) {
                case "PUBLICAR":
                    versoesAtivas.inserir(versao);
                    break;
                case "RETIRAR":
                    versoesAtivas.remover(versao);
                    break;
                case "INSTALAR":
                    Integer escolhida = escolherVersao(versoesAtivas, versao);
                    System.out.println(escolhida == null ? "INCOMPATIVEL" : escolhida);
                    break;
                default:
                    throw new IllegalArgumentException("Acontecimento desconhecido: " + acontecimento);
            }
        }

        entrada.close();
    }

    private static Integer escolherVersao(ArvoreBinaria versoesAtivas, int limite) {
        String percursoEmOrdem = versoesAtivas.percurso("EM");
        if (percursoEmOrdem.equals("VAZIA")) {
            return null;
        }

        Integer escolhida = null;
        for (String textoVersao : percursoEmOrdem.split(" ")) {
            int versao = Integer.parseInt(textoVersao);
            if (versao > limite) {
                break;
            }
            escolhida = versao;
        }
        return escolhida;
    }
}
