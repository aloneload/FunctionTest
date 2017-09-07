public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();//输出Inside Circle::draw() method.
        shapeFactory.getShape("RECTANGLE").draw();//输出Inside Rectangle::draw() method.
    }
}

interface Shape {
    void draw();
}

class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return ()->System.out.println("Inside Circle::draw() method.");
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return ()-> System.out.println("Inside Rectangle::draw() method.");
        }
        return null;
    }
}