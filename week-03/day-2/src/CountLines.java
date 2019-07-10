import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.next();

    System.out.println(linesOfFile(fileName));
  }
  public static int linesOfFile (String fileName){
    int counter = 0;
    try {
      String path = "C:\\Users\\gerge\\Desktop\\" + fileName;
      Path filePath = Paths.get(path);
      List<String> lines = Files.readAllLines(filePath);
      for(int i = 0; i < lines.size(); i++){
        counter++;
      }
    } catch(Exception e) {
      System.out.println(e);
      return 0;
    }
    return counter;
  }
}
