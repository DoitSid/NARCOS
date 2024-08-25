import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main1 {
  public static void main(String[] args) 
  {
    try {
      File f1 = new File("filename.txt");
      Scanner input = new Scanner(f1);
      while (input.hasNextLine()) 
      {
        String data = input.nextLine();
        System.out.println(data);
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}