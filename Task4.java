import java.util.Scanner;

public class Task4 {
    
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      try {
        System.out.print("Input data: ");
        String input = scanner.nextLine();
        if(input.isEmpty()){
            throw new Exception("Error! You can not enter emty lines! Try again!");
        }
        System.out.println("You entered: " + input);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }finally {
        scanner.close();
      }
    }
}
