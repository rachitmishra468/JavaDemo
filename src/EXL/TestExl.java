package EXL;


interface a {

    void sun();

    default int sum(int a, int b){
        return a+b;
    }
}
public class TestExl  implements a{

    public static void main(String[] args) {

    }

    @Override
    public void sun() {

    }
}
