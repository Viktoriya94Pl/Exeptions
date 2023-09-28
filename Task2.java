public class Task2 {
    
    public static void main(String[] args) {
        try {
            int d = 0;
            int [] intArray = new int[] {3, 5, 6, 7 ,3, 6, 7, 5, 7}; // инициализация массива из 8 чисел
            double catchedRes1 = intArray[8] / d; //не была инициализирована переменная intArray
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
