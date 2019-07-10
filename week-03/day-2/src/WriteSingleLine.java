import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String textToFile = scanner.nextLine();

    System.out.println(manipulateFile(textToFile));
  }
  public static List manipulateFile (String textToFile){
    List<String> txt = new ArrayList<>();
    try {
      Path filePath = Paths.get("C:\\Users\\gerge\\Desktop\\my-file.txt");
      BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath),true));
      writer.append(textToFile);
      writer.newLine();
      writer.close();
      txt = Files.readAllLines(filePath);
    }catch (Exception e){
      System.out.println("Unable to write file: my-file.txt");
    }
    return txt;
  }
}
