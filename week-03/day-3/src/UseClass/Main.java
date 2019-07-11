package UseClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();
    int best = 0;
    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

    // Which pokemon should Ash use?

    for(int i = 0; i < pokemonOfAsh.size(); i++){
      if(pokemonOfAsh.get(i).effectiveAgainst.equals(wildPokemon.type) && !wildPokemon.effectiveAgainst.equals(pokemonOfAsh.get(i).type)){
        best=i;
        break;
      }
      else if(pokemonOfAsh.get(i).effectiveAgainst.equals(wildPokemon.type) && wildPokemon.effectiveAgainst.equals(pokemonOfAsh.get(i).type)){
        best=i;
      }
    }

    System.out.print("I choose you, " + pokemonOfAsh.get(best).name);
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Béluska", "water", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));


    return pokemon;
  }
}