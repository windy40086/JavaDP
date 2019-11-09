package principle.ocb.improve;

/**
 * 对扩展(提供方)开放：增加形状和使用形状 对修改(使用方)关闭：GraphicEditor()不用改
 * 在OCP中 增加功能最好是拓展而不是修改
 */
public class ocb {
    public static void main(String[] args) {
        GraphicEditor g = new GraphicEditor();
        g.drawShape(new Rectangle());
        g.drawShape(new Circle());
        g.drawShape(new Triangle());
    }
}

//让子类实现draw方法 父类只负责提供draw()方法的接口
class GraphicEditor {
    void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    int type;

    //通过抽象方法改进
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

//新增代码
class Triangle extends Shape {
    Triangle(){
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("三角形");
    }
}