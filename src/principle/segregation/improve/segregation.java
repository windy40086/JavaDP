package principle.segregation.improve;

public class segregation{
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface inter1 {
    void operation1();
}

interface inter2 {
    void operation2();

    void operation3();
}

interface inter3 {
    void operation4();

    void operation5();
}

class B implements inter1, inter2 {

    public void operation1() {
        System.out.println("B1");
    }

    public void operation2() {
        System.out.println("B2");
    }

    public void operation3() {
        System.out.println("B3");
    }
}

class D implements inter1, inter3 {

    public void operation1() {
        System.out.println("D1");
    }

    public void operation4() {
        System.out.println("D4");
    }

    public void operation5() {
        System.out.println("D5");
    }
}

class A {
    //A只会用到 1 2 3
    public void depend1(inter1 i) {
        i.operation1();
    }

    public void depend2(inter2 i) {
        i.operation2();
    }

    public void depend3(inter2 i) {
        i.operation3();
    }
}

class C {
    //C只会用到 1 4 5
    public void depend1(inter1 i) {
        i.operation1();
    }

    public void depend4(inter3 i) {
        i.operation4();
    }

    public void depend5(inter3 i) {
        i.operation5();
    }
}