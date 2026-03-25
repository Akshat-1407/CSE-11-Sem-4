interface IMathOps {
    double doOp(double num);
}

public class MethodReference {
    static double square(double num) {
        return num * num;
    }

    static double performOperation(IMathOps ref, double n) {
        return ref.doOp(n);
    }

    public static void main(String[] args) {
        double resultSqrt, resultCbrt, resultSquare;
            
        resultSqrt = performOperation(Math::sqrt, 16);
        resultCbrt = performOperation(Math::cbrt, 64);

        resultSquare = performOperation(MethodReference::square, 4);

        System.out.println("Square Root of 16: "+resultSqrt);
        System.out.println("Cube Root of 64: "+resultCbrt);
        System.out.println("Square of 4: "+resultSquare);        
    }
}
