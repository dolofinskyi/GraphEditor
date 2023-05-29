public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(),
                new Rectangle(),
                new Square(),
                new Pentagon(),
                new Star(),
                new UnknownShape()
        };

        for (Shape shape: shapes){
            ShapeUtil.printName(shape);
        }
    }
}












