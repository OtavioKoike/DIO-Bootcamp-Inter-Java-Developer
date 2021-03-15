package caracteristicasII.strings;

public class Strings {

    public static void main(String[] args) {
        var nome = "Otávio";
        var sobreNome = "Koike";
        final var nomeCompleto = nome + " " + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        var string = new String(" Minha String ");  //Redundante

        System.out.println("Char na posição : " + string.charAt(5));
        System.out.println("Quantidade=" + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Contém X? " + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "$"));
        System.out.println("Equals? " + string.equals(" Minha String "));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
        System.out.println("Substring(1,6)=" + string.substring(1, 6));

        //EXERCICIOS FINAIS

        String abc = "A B C D E F G";
        char[] vet = abc.toCharArray(); //Transforma a string em um vetor de char
        for(int i = 0; i < abc.length(); i++){
            System.out.println(vet[i]);
        }

        String aula = "Aula de Java";
        String aulas[] = new String[3];
        aulas = aula.split(" "); //Quebra em varias Strings
        for(int i = 0; i < aulas.length; i++){
            System.out.println(aulas[i]);
        }

        System.out.println("Aula".concat(" de Java")); //Concatena

        System.out.println("1234 asda qw".replaceAll("[0-9]", "#")); //Substitui
    }
}
