package FactoryDesign;


interface  Notification{
    public void send();
}


class Emain implements Notification{

    @Override
    public void send(){
        System.out.println("Email sent ");
    }
}

class SMS implements Notification{
    @Override
    public void send(){
        System.out.println("SMS sent ");
    }
}



class FactoryProvide{


    public Notification getNotification(String Type){

        if(Type.equalsIgnoreCase("Email")){
            return new Emain();
        }
        else {
            return new SMS();
        }
    }

}

public class FactoryDesignEx {


    public static void main(String[] args) {

        FactoryProvide factoryProvide = new FactoryProvide();
      Notification notification=  factoryProvide.getNotification("SMS");
        notification.send();

    }

}
