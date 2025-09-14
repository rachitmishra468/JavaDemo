package ExeptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExeptionD {

    public static void main(String[] args) throws FileNotFoundException {
       // readFile();
       // unCheckEx();
       // errorD();;

        AgeValidater ageValidater = new AgeValidater();
        try {
            ageValidater.checkAge(6);
        } catch (Customexception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    //Checked Exeption

    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("main.txt");
    }

    //UnCheckExeption

    public static Integer unCheckEx(){
        return  (10/0);
    }

    //Error

    public static void errorD(){
        for(int i=0 ; i<=(1000000*1000000) ; i++){
            String s= new String("Name"+i);
        }
    }
}
