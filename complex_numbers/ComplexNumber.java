package complex_numbers;

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
        System.out.println(new_real_no + "  +" + new_imaginary_no + "i");
    }

}
