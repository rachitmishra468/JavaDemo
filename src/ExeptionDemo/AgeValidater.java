package ExeptionDemo;

public class AgeValidater {
   public void checkAge(int Age) throws Customexception{
       if(Age<18){
           throw new Customexception("Age should be less then 18");
       }

   }

}
