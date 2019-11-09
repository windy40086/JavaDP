package principle.ocb;

public class ocb {
    public static void main(String[] args) {
        GraphicEditor g = new GraphicEditor();
        g.drawShape(new Rectangle());
        g.drawShape(new Circle());
        g.drawShape(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.type == 1) {
            drawRectangle(s);
        } else if (s.type == 2) {
            drawCircle(s);
        }

        //新增代码
        else if (s.type == 3) {
            drawRectangle(s);
        }
    }

    private void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    private void drawCircle(Shape r) {
        System.out.println("圆形");
    }

    //新增代码
    private void drawTriangle(Shape r) {
        System.out.println("三角形");
    }
}

class Shape {
    int type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}

//新增代码
class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }
}