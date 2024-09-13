/*Realizar una clase realice las 4 operaciones aritméticas fundamentales, sumar, restar multiplicar dividir,
y sobreescribir los métodos para operaciones escalares  sumar, restar multiplicar. en la misma clase*/

package math;

public class App {
    public static void main(String[] args) throws Exception {
        VectorOperation operation = new VectorOperation();
        VectorOperation operation2 = new VectorOperation();
        VectorOperation operation3 =new VectorOperation();
        System.out.println("*****ADD*****");
        Vector a = new Vector(8, 8);
        Vector b = new Vector( 4,4);
        operation.add(a, b);
        Integer result = operation.add(4, 3);
        Vector vectorResult = operation.add(a, b);
        operation.print(result);
        operation.print(vectorResult);

        System.out.println("*****SUBTRACT*****");

        operation2.subtract(a, b);
        Integer result2 = operation2.subtract(4, 3);
        Vector vectorResult2 = operation2.subtract(a, b);
        operation2.print(result2);
        operation2.print(vectorResult2);

        System.out.println("*****MULTIPLY*****");

        operation3.multiply(a, b);
        Integer result3 = operation3.multiply(4,3);
        Vector vectorResult3 = operation3.multiply(a, b);
        operation3.print(result3);
        operation3.print(vectorResult3);


    }
}
