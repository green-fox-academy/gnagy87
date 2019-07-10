import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    //Scanner scanner = new Scanner(System.in);
    //String path = scanner.next();
    String path = "draw.txt";

    System.out.println(ticTacResult(path));



  }
  public static String ticTacResult(String path){
    int x = 0;
    int o = 0;
    String winner = "Draw";

    /*try {
      Path filePath = Paths.get("C:\\Users\\gerge\\Desktop\\" + path);
      List<String> ticTacToe = Files.readAllLines(filePath);
      for(int i = 0; i < ticTacToe.size(); i++){
        String[] split = ticTacToe.get(i).split("");
        for(int j = 0; j < split.length; j++){
          if(split[j].equals("X")){
            x++;
          }
          else if (split[j].equals("O")){
            o++;
          }
        }
      }
      if(x>o){
        winner = "X";
      }
      else if(o>x){
        winner = "O";
      }

    } catch (Exception e) {
    }
    return winner;*/

    try {
      Path filePath = Paths.get("C:\\Users\\gerge\\Desktop\\" + path);
      List<String> ticTacToe = Files.readAllLines(filePath);
      String[][]matrix = new String[3][3];
      for(int i = 0; i < ticTacToe.size(); i++){
        String[] split = ticTacToe.get(i).split("");
        for(int j = 0; j < split.length; j++){
          matrix[i][j]=split[j];
        }
      }
      if((matrix[0][0].equals("X") && matrix[0][1].equals("X") && matrix[0][2].equals("X")) || (matrix[0][0].equals("X") &&
              matrix[1][0].equals("X") && matrix[2][0].equals("X")) || (matrix[0][0].equals("X") && matrix[1][1].equals("X") && matrix[2][2].equals("X")));
    } catch (Exception e) {


    }


  }
}