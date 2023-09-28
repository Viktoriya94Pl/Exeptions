import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
      float number = numberInput();
      System.out.println("Your number: " + number);;
}
    
    public static float numberInput () {
        
          Scanner scanner = new Scanner(System.in); 
          float number = 0f;
          boolean validInput = false;

            while(!validInput){
                System.out.print("Input a number: ");
                if (scanner.hasNextFloat()) {
                    number = scanner.nextFloat();
                    validInput = true;
                }else {
                    System.out.println("Input error! Please input float number! ");
                    scanner.next();
                    
                }
            }
            return number;
        }
    }
