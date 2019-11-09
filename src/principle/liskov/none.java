package principle.liskov;

public class none {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.calculate(12, 23));

        B b = new B();
        System.out.println(b.calculate(12, 23));
    }
}

class A {
    public int calculate(int a, int b) {
        return a - b;
    }
}

class B extends A {
    @Override
    //B 不知道 A 的 calculate 是啥
    //重写了A
    public int calculate(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return calculate(a, b) + 9;
    }
}