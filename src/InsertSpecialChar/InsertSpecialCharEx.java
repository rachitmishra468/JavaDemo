package InsertSpecialChar;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertSpecialCharEx {
    public static void main(String[] args) {
        String input = "abcdefghijk";
        int n = 3;
        char specialChar = '#';
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            sb.append(input.charAt(i));
            i++;
            if (i % n == 0) {
                sb.append(specialChar);
            }

        }

        System.out.println(sb.toString());



        String str = IntStream.range(0 , input.length())
                .mapToObj(c ->{
                    char s = input.charAt(c);
                    if((c+1)%n==0){
                        return c+String.valueOf(specialChar);
                    }else {
                        return  String.valueOf(c);
                    }
                }).collect(Collectors.joining());
        System.out.println("String is -"+str);


    }
}
