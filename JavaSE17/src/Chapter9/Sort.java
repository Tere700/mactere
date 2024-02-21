package Chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        List accounts = Arrays.asList( //var改成List雖然邊議會過但是會跳錯java.lang.ClassCastException
                new Customer("X1234", "Justin", "46"),
                new Customer("X1235", "Monica", "10"),
                new Customer("X1236", "Sherry", "29")
        );
        Collections.sort(accounts);
        System.out.println(accounts);
    }

    static class Customer {
        String a, b, c;

        public Customer(String a, String b, String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
