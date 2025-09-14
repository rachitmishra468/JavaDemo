package SetterGetterEx;

public class Emp {

    private  String firstName;
    private String lastName;

    public  Emp(){

    }

    public Emp (String firstName , String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
     }


     public void setFirstName(String name){
         firstName = name;
     }
     public  void  setLastName(String lName){
         lastName = lName;
     }

     public String getFirstName(){
         return firstName;
     }
     public  String getLastName(){
         return  lastName;
     }


     public String toString(){

         return firstName +" ---- ----- "+lastName;
     }
}
