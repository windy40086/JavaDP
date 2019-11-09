package principle.segregation;


interface inter {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements inter {

    public void operation1() {
        System.out.println("B1");
    }

    public void operation2() {
        System.out.println("B2");
    }

    public void operation3() {
        System.out.println("B3");
    }

    public void operation4() {
        System.out.println("B4");
    }

    public void operation5() {
        System.out.println("B5");
    }
}

class D implements inter {

    public void operation1() {
        System.out.println("D1");
    }

    public void operation2() {
        System.out.println("D2");
    }

    public void operation3() {
        System.out.println("D3");
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
    public void depend1(inter i) {
        i.operation1();
    }

    public void depend2(inter i) {
        i.operation2();
    }

    public void depend3(inter i) {
        i.operation3();
    }
}

class C {
    //C只会用到 1 4 5
    public void depend1(inter i) {
        i.operation1();
    }

    public void depend4(inter i) {
        i.operation4();
    }

    public void depend5(inter i) {
        i.operation5();
    }
}