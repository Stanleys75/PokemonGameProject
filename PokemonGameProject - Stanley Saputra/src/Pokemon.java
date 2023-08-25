import java.util.Vector;

public class Pokemon {
    Vector<String> PokemonName = new Vector<>();
    Vector<Integer> PokemonPower = new Vector<>();

    public Pokemon(Vector<String> PokemonName, Vector<Integer> PokemonPower){
        super();
        this.PokemonName = PokemonName;
        this.PokemonPower = PokemonPower;
    }

    public Vector<String> getPokemonName(){
        return PokemonName;
    }
    public void setPokemonName(Vector<String> PokeName){
        this.PokemonName = PokeName;
    }
    public Vector<Integer> getPokemonPower(){
        return PokemonPower;
    }
    public void setPokemonPower(Vector<Integer> PokemonPower){
        this.PokemonPower = PokemonPower;
    }

    int i;

    public void printPokemon(){
        System.out.println("--------------------------");
        System.out.println("| Pokemon Name - CP      |");
        System.out.println("--------------------------");
        for(i = 0; i < PokemonName.size(); i++){
            System.out.println(i+1 + ". " + toString());
        }
        System.out.println("--------------------------");
    }

    public String toString(){
        return "" + PokemonName.get(i) + " - " + PokemonPower.get(i);
    }
}
