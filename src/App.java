
public class App {
    public static void main(String[] args) {

        math mObj = new math();
        Notices nObj = new Notices();
        //вводятся числа для операции
        nObj.text("Пожайлуста,введите первое число");
        int x=nObj.enterr();

        nObj.text("Пожайлуста,введите второе число");
        int y=nObj.enterr();

        //вычисление
        nObj.text("Выбирите операцию");
        nObj.text("1.Сложение");
        nObj.text("2.Вычитание");
        nObj.text("3.Умножение");
        nObj.text("4.Деление");

        int operationNum=nObj.enterr();
        nObj.text("результат вычисления:  ");
        if(operationNum==1){System.out.println(mObj.sum(x, y));}
        if(operationNum==2){System.out.println(mObj.subs(x, y));}
        if(operationNum==3){System.out.println(mObj.multp(x, y));}
        if(operationNum==4){System.out.println(mObj.devide(x, y));}
        if(operationNum>4||operationNum<1){nObj.err();}

        //конец прогри






    }//main
}//class