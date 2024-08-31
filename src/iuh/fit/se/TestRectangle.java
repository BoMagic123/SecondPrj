package iuh.fit.se;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);

        System.out.println("Chiều dài r1: " + r1.getLength());
        System.out.println("Chiều dài r2: " + r2.getLength());

        System.out.println("Diện tích r1: " + r1.getArea());
        System.out.println("Diện tích r2: " + r2.getArea());

        System.out.println("Chu vi r1: " + r1.getPerimeter());
        System.out.println("Chu vi r2: " + r2.getPerimeter());

        try {
            r1.setLength(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Bắt ngoại lệ: " + e.getMessage());
        }

        System.out.println("Chiều dài r1 sau khi thiết lập không hợp lệ: " + r1.getLength());
        System.out.println("Diện tích r2 sau khi thiết lập không hợp lệ: " + r2.getArea());
    }
}
