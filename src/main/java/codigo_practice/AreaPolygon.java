package codigo_practice;

public class AreaPolygon {


        public static void main(String[] args) {
            area(new Triangle(10.0, 5.0));
            area(new Rectangle(5.0, 7.0));
            area(new Square(4.0));
        }

        private static void area(Polygon polygon) {
            polygon.printArea();
        }
    }

    interface Polygon {

        double area();
        void printArea();
    }

    class Triangle implements Polygon {

        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return (base * height) / 2;
        }

        @Override
        public void printArea() {
            System.out.println("El área del triángulo es " + area());
        }
    }

    class Rectangle implements Polygon {

        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        @Override
        public void printArea() {
            System.out.println("El área del rectángulo es " + area());
        }
    }

    class Square implements Polygon {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }

        @Override
        public void printArea() {
            System.out.println("El área del cuadrado es " + area());
        }
    }


