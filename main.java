import java.util.Scanner;
import java.util.concurrent.Callable;

import complex_numbers.* ;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("hello user , what calculation you want to perform ?");
        System.out.println("1.complex number calculations : ");
        System.out.println("2. integration \n");
        byte choice = input.nextByte() ;

        if (choice == 1) {
            System.out.println("what do you want to do in complex number ?");
            System.out.println("1. add two complex numbers ");
            System.out.println("2. multiply two complex numbers");
            System.out.println("3. add more than two complex number ");
            System.out.println("x. plot a complex number in graph ");
            byte internal_choice = input.nextByte();
            switch (internal_choice ) {

                case 1 ://--------------------------------------------------------------------------------------------------------------
                    double a ,b ,c ,d ;
                    System.out.println(" give two complex number in the format of a + ib , only write a and b ");
                    //even if the user wrote a + ib how to ignore it and take a + b from the argument ?
                    // how to allow coma while scanning the number?
                    a = input.nextDouble()  ;
                    b = input.nextDouble() ;
                    System.out.println("give the other two complex number in the format of a + ib , only write a and b");
                    c = input.nextDouble()  ;
                    d = input.nextDouble() ;
                    ComplexNumber number = new ComplexNumber(a , b ) ;
                    ComplexNumber other_number = new ComplexNumber(c , d) ;
                    number.get_additionOf_complex(other_number);

                    //--------------------------------------------------------------------------------------------------------------

                case 2 :
                    double multiplicaiton_a , multiplicaiton_b , multiplicaiton_c , multiplicaiton_d ;
                    System.out.println(" give two complex number in the format of a + ib , only write a and b ");
                    multiplicaiton_a = input.nextDouble()  ;
                    multiplicaiton_b = input.nextDouble() ;
                    System.out.println("give the other two complex number in the format of a + ib , only write a and b");
                    multiplicaiton_c = input.nextDouble()  ;
                    multiplicaiton_d = input.nextDouble()  ;
                    ComplexNumber number1 = new ComplexNumber(multiplicaiton_a , multiplicaiton_b) ;
                    ComplexNumber other_number1 = new ComplexNumber(multiplicaiton_c , multiplicaiton_d) ;
                    number1.get_MultiplicationOf_complex(other_number1);

                case 3:
                    System.out.println("write the number of complex number you want to add  : ");
                    int e = input.nextInt()  ;
                    ComplexNumber number2 = new ComplexNumber(0,0) ;
                    number2.get_addition_of_multiple_complex_number(e);
                case 4:
                    System.out.println("write the number of complex number you want to multiply");
                    int f = input.nextInt() ;

            }

        } else if (choice ==2 ) {


        }
    }
}
