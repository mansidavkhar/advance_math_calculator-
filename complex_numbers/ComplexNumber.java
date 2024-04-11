package complex_numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexNumber {
    public double real_number ;
    public  double imaginary_number ;
    public ComplexNumber(double real_number , double imaginary_number){
        this.real_number = real_number ;
        this.imaginary_number = imaginary_number ;
    }
    public void Print_current_complex_number(){
        double real_no  = real_number ;
        double imaginary_no = imaginary_number ;
        System.out.println(real_no + "  + " +  imaginary_no+"i");
    }
    Scanner input = new Scanner(System.in) ;


    public double getReal_number(){
        return real_number ;
    }
    public double getImaginary() {
        return imaginary_number;
    }

    /** created a method of addition with return type complex number which will take the parameter as another  complex number and
     * will add internally and return the addition of two complex numbers.
     */
    public void get_additionOf_complex(ComplexNumber other){
        double new_real_no = real_number + other.real_number ;
        double new_imaginary_no = imaginary_number + other.imaginary_number ;
        System.out.println(new_real_no  + "  +"  +new_imaginary_no + "i"  )  ;
    }
    public void get_MultiplicationOf_complex(ComplexNumber other) {
        double new_real_no = real_number * other.real_number;
        double new_imaginary_no = imaginary_number * other.imaginary_number;
        System.out.println(STR."\{new_real_no}  +\{new_imaginary_no}i"); // recommended change
        // previous  : System.out.println(new_real_no + "  +" + new_imaginary_no + "i");
    }
//    public void get_addition_of_multiple_complex_number(int n){
//        //n = no of complex number the user wants to add
//        //take n inputs from the user.
//        ComplexNumber[] complexNumbers = new ComplexNumber[n] ;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("give the other two complex number in the format of a + ib , only write a and b");
//            double a = input.nextDouble()  ;
//            double b = input.nextDouble() ;
//            //storing the input in arr of data type complex number in object ComplexNumber .
//            complexNumbers[i] = new ComplexNumber(a , b) ;
//        }
//        //adding the stored data from the complex number .
//        ComplexNumber sum = new ComplexNumber(0 , 0) ;
//        for (int i = 0; i < complexNumbers.length; i++) {
//            sum.real_number += complexNumbers[i].real_number ;
//            sum.imaginary_number += complexNumbers[i].imaginary_number ;
//        }
//        // print the final answer
//        System.out.println("the sum of the complex number is : "  + sum.real_number + "+" +  sum.imaginary_number  +"i" );
    //}

}
