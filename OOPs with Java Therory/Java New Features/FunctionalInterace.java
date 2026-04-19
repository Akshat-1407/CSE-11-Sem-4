interface IOperations {
    double doOperation(double n);
}

class A implements IOperations {
    public double doOperation(double n) {
        return n+n;
    }
}

class B implements IOperations {
    public double doOperation(double n) {
        return n*n;
    }
}

public class FunctionalInterace {
    public static void main(String[] args) {
        IOperations obj = new A();
        double result = obj.doOperation(5);
        System.out.println(result);

        IOperations object = new B();
        double res = object.doOperation(5);
        System.out.println(res);
    }
}
