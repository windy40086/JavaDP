package principle.demeter.improve;

//一个对象应该对其他对象有最少的了解-使用另一个类时全部是朋友
public class improve {
}

class A {
    B b = new B();//直接朋友

    public void test(B b){}//直接朋友

    public void test2(B b){
        /**
         * 如果此处的b为陌生人
         * 则需要将b提升至直接朋友范围
         */
        //B b = new B();//陌生人
        b.fun();
        A a = new A();//自身
    }
}

class B {
    void fun(){}
}
