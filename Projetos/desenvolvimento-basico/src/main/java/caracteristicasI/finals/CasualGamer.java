package caracteristicasI.finals;

//public class CasualGamer extends HardcoreGamer{}  //NOK não pode extender de classe final
public class CasualGamer extends Gamer{

    @Override
    public String keyboard(){ return "Simple keyboard..."; }

    //@Override
    //public String mouse(){ return super.mouse(); }    //NOK but final

    public String play(final String game){
        //game = "WoW"; //NOK não pode alterar valor da variavel final
        return "Jogando " + game;
    }
}
