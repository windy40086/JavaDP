package principle.dependencyInversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
        p.receive(new QQ());
    }
}

//通过接口实现依赖传递
interface IReceive{
    void getInfo();
}

class Email implements IReceive{

    public void getInfo() {
        System.out.println("Email :hello");
    }
}

class QQ implements IReceive{

    @Override
    public void getInfo() {
        System.out.println("QQ :hello");
    }
}

class Person{
    //对接口依赖
    void receive(IReceive rec){
        rec.getInfo();
    }
}

//通过构造方法实现依赖传递
class Test2{
    public static void main(String[] args) {
        OpenAndClose oac = new OpenAndClose(new ITV() {
            @Override
            public void play() {
                System.out.println("le shi tv play");
            }
        });

        oac.open();
    }
}
interface IOpenAndClose{
    void open();
}

interface ITV{
    void play();
}

class OpenAndClose implements IOpenAndClose{
    private ITV tv;
    OpenAndClose(ITV tv){
        this.tv = tv;
    }
    public void open(){
        this.tv.play();
    }
}

//通过set方式