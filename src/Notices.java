import java.util.Scanner;
public class Notices {
    Scanner scObj = new Scanner(System.in);

    void text (String x){
        System.out.println(x);
    }

    void err(){
        System.err.println("Ошибка");
    }

    void choice(){
        System.out.println("Пожайлуста, сделайте выбор");
    }

    void number(){
        System.out.print("Ошибка. Пожайлуста,введите число..");
    }


    int enterr(){
        int x;
        if(scObj.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            x = scObj.nextInt();
            return x;
        }


        else{

            number();
            return 0;
        }

    }
}


