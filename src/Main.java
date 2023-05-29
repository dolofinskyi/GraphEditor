public class Main {
    public static void main(String[] args) {

        //testing shapes
        Shape[] shapes = new Shape[]{
                new Circle(),
                new Rectangle(),
                new Square(),
                new Pentagon(),
                new Star(),
                new UnknownFigure()
        };

        for (Shape shape: shapes){
            ShapeUtil.printName(shape);
        }

    }
}

class ShapeUtil{
    private ShapeUtil(){

    }
    public static void printName(Shape shape){
        System.out.println(shape.getName());
    }
}

interface Shape{
    default String getName(){
        return "Unsigned shape name. Pls fix it ;)";
    }
}

class Circle implements Shape{
    public String getName(){
        return "Circle";
    }
}

class Rectangle implements Shape{
    public String getName(){
        return "Rectangle";
    }
}

class Square implements Shape{
    public String getName(){
        return "Square";
    }
}

class Pentagon implements Shape{
    public String getName(){
        return "Pentagon";
    }
}

class Star implements Shape{
    public String getName(){
        return "Star";
    }
}

class UnknownFigure implements Shape{

}


