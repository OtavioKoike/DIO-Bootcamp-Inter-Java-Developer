package caracteristicasII.strings;

public class StringBuilder {

    public static void main(String[] args) {

        var nome = "Otávio";

        final var builder = new java.lang.StringBuilder(nome);
        System.out.println(builder.append("Augusto")); //Add na string anterior

        final var reverse = builder.reverse(); //Nova string de tras para frente

        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#"); //Inserir caracteres em posicoes especificas
        System.out.println(insert);

    }
}
