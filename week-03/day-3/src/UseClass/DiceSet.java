package UseClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {
  ArrayList<Integer> dice = new ArrayList<>();

  public List<Integer> roll() {
    for (int i = 0; i < 6; i++) {
      dice.add((int) (Math.random() * 6) + 1);
    }
    return dice;
  }

  public List<Integer> getCurrent() {
    return dice;
  }

  public int getCurrent(int i) {
    return dice.get(i);
  }

  public void reroll() {
    for (int i = 0; i < dice.size(); i++) {
      dice.set(i, (int) (Math.random() * 6) + 1);
    }
  }

  public void reroll(int k) {
    dice.set(k, (int) (Math.random() * 6) + 1);
  }

  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();
    diceSet.roll();
    int counter = 0;
    int whileLoopCircles = 0;
    while (counter<6){
      counter=0;
      whileLoopCircles++;
      diceSet.reroll();
      for(int i = 0; i < 6; i++){
        if(diceSet.getCurrent().get(i)==6){
          counter++;
        }
      }
    }
    System.out.println(diceSet.getCurrent());
    System.out.println("while loop circles: " + whileLoopCircles);
  }
}