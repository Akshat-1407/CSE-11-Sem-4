/** 
* Method references allow us to refer to a method without invoking it, making our code cleaner and more readable. 
* They can be used in place of a lambda expression when the lambda expression only calls an existing method.
*/

/* Method Reference to Static Method */

interface IMathOps {
    double doOp(double num);
}

public class StaticMethodReference {
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

        resultSquare = performOperation(StaticMethodReference::square, 4);

        System.out.println("Square Root of 16: "+ resultSqrt);
        System.out.println("Cube Root of 64: "+ resultCbrt);
        System.out.println("Square of 4: "+ resultSquare);        
    }
}


/* Method Reference to Instance Method */ 

// interface IPrint {
//     void doPrint(String str);
// }

// public class InstanceMethodReference {
//     void doubleStringPrint(String str) {
//         System.out.println(str + " " + str);
//     }

//     static void printOperation(IPrint ref, String str) {
//         ref.doPrint(str);
//     }

//     public static void main(String[] args) {
//         InstanceMethodReferenceExample obj = new InstanceMethodReferenceExample();
//         printOperation(System.out::print, "Meerut");
//         printOperation(System.out::println, "New Delhi");
//         printOperation(obj::doubleStringPrint, "Dehradun");
//     }
// }
