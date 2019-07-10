import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    System.out.println(uniqueIpAdresses());
    System.out.println(requestRatio("get"));

  }

  public static HashSet uniqueIpAdresses (){
    HashSet<String> uniqueIpAdresses = new HashSet<>();
    try {
      Path filePath = Paths.get("C:\\Users\\gerge\\Desktop\\IpAdresses.txt");
      List<String> temp = Files.readAllLines(filePath);
      for(int i = 0; i < temp.size(); i++){
        String[] split = temp.get(i).split(" ");
        uniqueIpAdresses.add(split[8]);
      }
    } catch (Exception e){
    }
    return uniqueIpAdresses;
  }

  public static int requestRatio (String getOrPost) {
    int counter = 0;
    String getPost = getOrPost.toUpperCase();
    try {
      Path filePath = Paths.get("C:\\Users\\gerge\\Desktop\\IpAdresses.txt");
      List<String> temp = Files.readAllLines(filePath);
      for(int i = 0; i < temp.size(); i++){
        String[] split = temp.get(i).split(" ");
        if(split[11].equals(getPost)) {
          counter++;
        }
      }
    } catch (Exception e){

    }
    return counter;
  }
}