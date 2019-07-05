public class Anagram {
  public static void main(String[] args) {
    String input1 = "dog";
    String input2 = "god";

    System.out.println(isAnagram(input1,input2));
  }
  public static boolean isAnagram(String input1, String input2){
    boolean anagramOrNot = false;
    int input1Counter = 0;
    int input2Counter = 0;
    if(input1.length()==input2.length()){
     for (int i = 0; i < input1.length(); i++){
       input1Counter*=0;
       input2Counter*=0;
       for (int j = 0; j < input2.length(); j++){
         if(input1.charAt(i)==input1.charAt(j)){
           input1Counter++;
         }
         if(input1.charAt(i)==input2.charAt(j)){
           input2Counter++;
         }
       }
       if (input1Counter == input2Counter) {
         anagramOrNot = true;
       }
       else {
         return false;
       }
     }
   }
   return anagramOrNot;
  }
}
