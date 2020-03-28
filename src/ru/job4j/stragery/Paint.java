package ru.job4j.stragery;

public class Paint {

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();
        Paint paint = new Paint();
        System.out.println("Here's Square:");
        paint.draw(square);
        System.out.println("Here's Triangle:");
        paint.draw(triangle);
    }
}
