package principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.calculate(12, 23));

        B b = new B();
        System.out.println(b.calculate(12, 23));
    }
}

//创建一个更加基础的类
class Base {
    public int calculate(int a, int b) {
        return a - b;
    }
}

class A extends Base {
    public int calculate(int a, int b) {
        return a - b;
    }
}

//让B类不再和A发生关系
class B extends Base {
    //如果B需要用A
    private A a = new A();

    //仍然想用A
    public int calculateA(int a, int b) {
        return this.a.calculate(a, b);
    }

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