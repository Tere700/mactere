package Chapter6;

class Parent1 {
    Parent1() {
        System.out.println("Parent's default constructor");
    }

    Parent1(String message) {
        System.out.println("Parent's constructor with message: " + message);
    }
}

class Child extends Parent1 {
    Child() {
        // 隱式呼叫父類別的無參數建構子
        System.out.println("Child's default constructor");
    }

    Child(String message) {
        // 顯式呼叫父類別的有參數建構子
        super(message);
        System.out.println("Child's constructor with message: " + message);
    }
}

public class Parent {
    public static void main(String[] args) {
        // 創建 Child 實例，會依序呼叫 Parent 的無參數建構子和 Child 的無參數建構子
        Child child1 = new Child();

        // 創建 Child 實例，會依序呼叫 Parent 的有參數建構子和 Child 的有參數建構子
        Child child2 = new Child("Hello");
    }
}
