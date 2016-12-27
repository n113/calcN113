/**
 * Created by Freelance on 24.12.16.
 */
public class math {
    String error ="error"; //doesnt using
    //math functions
    int sum(int a,int b){
        return a+b;

    }

    int subs (int a,int b){
        return a-b;
    }

    int multp (int a,int b){

        if (a==0 || b==0 ){
            return 666;
        }
        else{
            return a*b;
        }
    }

    int devide (int a,int b){

        if (a==0 || b==0 ){
            return 666;
        }
        else{
            return a/b;
        }
    }

}

