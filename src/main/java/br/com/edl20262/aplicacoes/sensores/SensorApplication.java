package br.com.edl20262.aplicacoes.sensores;

import br.com.edl20262.estruturas.ListaEncadeada;
import java.util.Scanner;

public class SensorApplication {
    public static void main(String[] args) {
        ListaEncadeada<Integer> sensores=new ListaEncadeada<>();
        Scanner scanner=new Scanner(System.in);
        int operacoes=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<operacoes;i++){
            String linha=scanner.nextLine();
            String[] comando=linha.split(" ");
            if (comando[0].equals("ADICIONAR")){
                int codigoSensor=Integer.parseInt(comando[1]);
                sensores.adicionar(codigoSensor);
            }else if(comando[0].equals("BUSCAR")){
                int codigoSensor=Integer.parseInt(comando[1]);
                boolean achei=false;
                for(int j=0;j<sensores.tamanho();j++){
                    if(sensores.obter(j)==codigoSensor){
                        System.out.println("ENCONTRADO");
                        achei=true;
                        break;
                    }
                }
                if (!achei){
                    System.out.println("NAO_ENCONTRADO");
                }
            }else if(comando[0].equals("REMOVER")){
                int codigoSensor=Integer.parseInt(comando[1]);
                boolean achei=false;
                for(int j=0;j<sensores.tamanho();j++){
                    if(sensores.obter(j)==codigoSensor){
                        System.out.println("REMOVIDO");
                        sensores.remover(j);
                        achei=true;
                        break;
                    }
                }
                if (!achei){
                    System.out.println("NAO_ENCONTRADO");
                }
            }else{
                for(int j=0;j<sensores.tamanho();j++){
                    System.out.print(sensores.obter(j));
                    if (j!=sensores.tamanho()-1){
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
        scanner.close();
    }
}
