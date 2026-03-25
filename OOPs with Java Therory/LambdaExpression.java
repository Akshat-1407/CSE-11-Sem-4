
interface IOperations {
    double doOperation(double n);
}

public class LambdaExpression {
    public static void main(String[] args) {
        IOperations obj1 = (double n) -> { 
            return (n + n);
        };
        System.out.println(obj1.doOperation(5));

        IOperations obj2 = (double n) -> { 
            return (n * n);
        };
        System.out.println(obj2.doOperation(5));
    }
}
