package br.com.edl20262.estruturas;

public class Arvore {

    private static class No{
        int valor;
        No esquerda;
        No direita;
        public No(int valor){
            this.valor=valor;
            this.esquerda=null;
            this.direita=null;
        }
    }

    No raiz;
    int tamanho;

    public No getRaiz(){
        return this.raiz;
    }

    public Arvore(){
        this.raiz=null;
        this.tamanho=0;
    }

    public boolean inserir(int valor){
        if (raiz==null){
            raiz=new No(valor);
            tamanho++;
            return true;
        }
        No no=raiz;
        while(true){
            if (no.valor==valor){
                return false;
            }else if(no.valor>valor){
                if (no.esquerda==null){
                    no.esquerda=new No(valor);
                    tamanho++;
                    return true;
                }
                no=no.esquerda;
            }else if(no.valor<valor){
                if (no.direita==null){
                    no.direita=new No(valor);
                    tamanho++;
                    return true;
                }
                no=no.direita;
            }
        }
    }

    public void vistarPreOrdem(No no,String lista){
       if (no==null){
            return;
       }
        lista=lista.concat(Integer.toString(no.valor)+" ");
        System.out.println(no.valor);
        if (no.esquerda !=null){
            vistarPreOrdem(no.esquerda, lista);
        }
        
        if(no.direita!=null){
            vistarPreOrdem(no.direita, lista);
        }
    }

}
