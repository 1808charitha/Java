public class Java {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(7,8);
        Rectangle rectangle2=new Rectangle(3,4);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());


    }

}






class Rectangle{
    double length,breadth;

    public Rectangle(double length,double breadth) {
        this.length = length;
        this.breadth=breadth;
    }

    double calculateArea()
    {
        return length*breadth;
    }
    double calculatePerimeter()
    {
        return 2*(length+breadth);
    }

}
