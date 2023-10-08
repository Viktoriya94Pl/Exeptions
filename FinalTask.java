import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FinalTask {
    
    public static void main(String[] args) {
        
        String data = inputData();
        dataProcessing(data);
    }


   
    public static String inputData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: Фамилию Имя Отчество, дату рождения,номер телефона и пол через пробел: ");
        String userData = scanner.nextLine();
        return userData;
    }

    /**
     * @param data
     */
    public static void dataProcessing(String data){

        String[] userDataArray = data.split(" ");
        if (userDataArray.length != 6){
            System.out.println("Неверное количество данных. Введите: Фамилию Имя Отчество, дату рождения,номер телефона и пол через пробел: ");
            return;
        }

    String lastName = userDataArray[0];
    String firstName = userDataArray[1];
    String middleName = userDataArray[2];
    String birthDate = userDataArray[3];
    String phoneNumber = userDataArray[4];
    String gender = userDataArray[5];

    if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")){
        System.out.println("Неверный формат даты. Введите дату в формате ДД.ММ.ГГГГ");
        return;
    }
    if (!phoneNumber.matches("\\+\\d{11}")){
        System.out.println("Неверный формат номера телефона. Введите номер в формате +XXXXXXXXXXX");
        return;
    }
     if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")){
        System.out.println("Неверный формат пола. Введите 'm' или 'f'");
        return;
    }

    try {
        FileWriter fileWriter = new FileWriter(lastName + ".txt", true);
        fileWriter.write(data + System.lineSeparator());
        fileWriter.close();
        System.out.println("Данные успешно записаны в файл " + lastName + ".txt");
    } catch (IOException e) {
       System.out.println("Ошибки при записи в файл");
    }
    
    }
}
