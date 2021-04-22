package one.innovation.digital.desafio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
//        Para Plataforma (Descomentar)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String frase;

//      Para Teste Local (Comentar)
        Scanner ler = new Scanner(System.in);
        String frase;

//        Para Plataforma (Descomentar)
//        while(!".".equals(frase = br.readLine())) {
//      Para Teste Local (Comentar)
        while(!".".equals(frase = ler.nextLine())){
            int length = frase.split(" ", -1).length - 1;
            String[] palavras = new String[length];
            palavras = frase.split(" ");

            TreeMap<Character, Alfabeto> alfabeto = new TreeMap<>();

            for (int i = 0; i < palavras.length; i++) {
                if (palavras[i].length() > 2) {
                    char letra = palavras[i].charAt(0);
                    int repeticoes = 0;

                    for (String palavra : palavras) {
                        if (palavra.equals(palavras[i])) repeticoes++;
                    }

                    int tamanho = palavras[i].length();
                    int reduzidas = repeticoes * (tamanho - 2);

                    if (!alfabeto.containsKey(letra)) {
                        alfabeto.put(letra, new Alfabeto());
                    }

                    Alfabeto dados = alfabeto.get(letra);

                    if (dados.getReduzidas() < reduzidas) {
                        dados.setPalavra(palavras[i]);
                        dados.setPosicao(i);
                        dados.setReduzidas(reduzidas);
                    } else if (palavras[i].equals(dados.getPalavra())) {
                        dados.addPosicao(i);
                    }
                }
            }

            int quantidade = 0;
            for (Map.Entry<Character, Alfabeto> utilizadas : alfabeto.entrySet()) {
                List<Integer> posicao = utilizadas.getValue().getPosicao();
                quantidade++;
                for (int i : posicao) {
                    palavras[i] = palavras[i].charAt(0) + ".";
                }
            }

            frase = "";
            for (String palavra : palavras) {
                frase = frase + " " + palavra;
            }
            frase = frase.trim();

            System.out.println(frase);
            System.out.println(quantidade);

            for (Map.Entry<Character, Alfabeto> utilizadas : alfabeto.entrySet()) {
                System.out.println(utilizadas.getValue().getPalavra().charAt(0) + ". = " + utilizadas.getValue().getPalavra());
            }
        }
    }
}

class Alfabeto {
    private String palavra;
    private List<Integer> posicao;
    private int reduzidas;

    public Alfabeto(){
        this.palavra = "";
        this.posicao = new ArrayList<>();
        this.reduzidas = 0;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public List<Integer> getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao){
        this.posicao.removeAll(this.posicao);
        this.posicao.add(posicao);
    }

    public void addPosicao(int posicao){
        this.posicao.add(posicao);
    }

    public int getReduzidas() {
        return reduzidas;
    }

    public void setReduzidas(int reduzidas) {
        this.reduzidas = reduzidas;
    }
}