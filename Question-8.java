class customException extends Exception {
    public customException(String message) {
        super(message);
    }
}

class genericClass {

    public <T> void genericMethod(T value) {
        try {
            if (value instanceof String) throw new customException("String value detected..!");
            double v = Double.parseDouble(String.valueOf(value));
            System.out.println((v * 2) / 3);
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class abhi {
    public static void main(String[] args) {
        genericClass g = new genericClass();
        g.genericMethod(1);
        g.genericMethod(23.5f);
        g.genericMethod(54.3d);
        g.genericMethod("String");
    }
}
