package GeniricClassDemo;

public class GeniricC<T> {

    public T value;

    GeniricC(T value){
        this.value=value;
    }

    public  T getType(){
        return value;
    }

}

class Text{
    public static void main(String[] args) {
        GeniricC<String> geniricC = new GeniricC<>("Rachit");
        System.out.println(geniricC.getType());


        GeniricC<Integer> geniricC1 = new GeniricC<>(23);
        System.out.println(geniricC1.getType());


    }
}


