import java.util.ArrayList;

public class PersonalFinance {
  public static void main(String[] args) {
    ArrayList<Integer> personalFin = new ArrayList<>();

    personalFin.add(500);
    personalFin.add(1000);
    personalFin.add(1250);
    personalFin.add(175);
    personalFin.add(800);
    personalFin.add(120);

    System.out.println("You have spent: " + spentAmount(personalFin));
    System.out.println("Greatest expense was: " + greatestExpense(personalFin));
    System.out.println("Cheapest spending was: " + cheapestSpending(personalFin));
    System.out.println("Average amount of spending was: " + averageAmount(personalFin));

  }
  public static int spentAmount(ArrayList<Integer> spend){
    int sum = 0;
    for (int i = 0; i < spend.size(); i++){
      sum+=spend.get(i);
    }
    return sum;
  }
  public static int greatestExpense(ArrayList<Integer> greatestExp){
    int largestNumber = greatestExp.get(0);
    for (int i = 1; i < greatestExp.size(); i++){
      if(greatestExp.get(i) > largestNumber){
        largestNumber = greatestExp.get(i);
      }
    }
    return largestNumber;
  }
  public static int cheapestSpending(ArrayList<Integer> cheapestSp){
    int smallestNumber = cheapestSp.get(0);
    for (int i = 1; i < cheapestSp.size(); i++){
      if(cheapestSp.get(i) < smallestNumber){
        smallestNumber = cheapestSp.get(i);
      }
    }
    return smallestNumber;
  }
  public static double averageAmount(ArrayList<Integer> average){
    int sum = 0;
    int element = 0;

    for (int i = 0; i < average.size(); i++){
      sum+=average.get(i);
      element++;
    }
    return sum/element;
  }
}
