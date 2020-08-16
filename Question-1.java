class Calculator{
    interface add {
         void add(int a, int b);
    }

    interface difference {
         void difference(int a, int b);
    }

    interface product {
         void product(int a, int b);
    }

    interface safeDivision {
         void safeDivision(float a, float b);
    }
}

public class Q1 {

    public static void main(String[] args) {

        Calculator.add c1 = (a,b)-> System.out.println(a+b);
        Calculator.difference c2 = (a,b) -> System.out.println(a-b);
        Calculator.product c3 = (a,b)-> System.out.println(a*b);
        Calculator.safeDivision c4 = (a,b)->{
            try{
                if (b==0) throw new ArithmeticException();
                else System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println("Denominator cannot be zero");
            }
        };

        c1.add(5,6);
        c2.difference(8,7);
        c3.product(20,12);
        c4.safeDivision(15f,3f);
        c4.safeDivision(13f,0f);
    }
}
