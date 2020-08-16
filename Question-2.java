import java.util.Scanner;

class Rectangle{
    int height,width;

    public void display(){
        System.out.println("Width: " + width +" "+ "Height: " + height);
    }
}
class RectangleArea extends Rectangle{

    public void read_input() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();
    }
    public void display() {
        super.display();
        System.out.println( "Area: " + width*height);
    }
}

public class abhi {
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.read_input();
        rectangleArea.display();

    }
}
