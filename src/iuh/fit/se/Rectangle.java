package iuh.fit.se;

public class Rectangle {
    // Thuộc tính
    private double length;
    private double width;

    // Constructor
    public Rectangle() {
        // Constructor mặc định
    }

    public Rectangle(double length, double width) {
        if (length < 0.0 || width < 0.0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải lớn hơn hoặc bằng 0");
        }
        this.length = length;
        this.width = width;
    }

    // Getter và Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("Chiều rộng phải lớn hơn hoặc bằng 0");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Chiều dài phải lớn hơn hoặc bằng 0");
        }
        this.length = length;
    }

    // Phương thức
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
