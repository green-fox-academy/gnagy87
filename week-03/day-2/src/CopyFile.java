import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.next();

    System.out.println(copyToAnotherFile(fileName));
  }
  public static boolean copyToAnotherFile (String fileName){
    try {
      Path filePath = Paths.get(fileName);
      Path filePath2 = Paths.get("C:\\Users\\gerge\\Desktop\\new-file.txt");
      List<String> originalContent = Files.readAllLines(filePath);
      Files.write(filePath2,originalContent);
    } catch (Exception e) {
    return false;
    }
    return true;
  }
}
