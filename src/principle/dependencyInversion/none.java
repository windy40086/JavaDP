package principle.dependencyInversion;

public class none {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}

class Email{
    void getInfo(){
        System.out.println("Email: hello");
    }
}

//此时Person被固定了只能接受Email ，如果有新的接受类型则需要新增类和方法
class Person{
    void receive(Email e){
        e.getInfo();
    }
}