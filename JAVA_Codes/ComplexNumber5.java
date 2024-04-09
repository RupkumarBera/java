class ComplexNumber5 {
    double real;
    double imaginary;

    public ComplexNumber5(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber5 add(ComplexNumber5 other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber5(realPart, imaginaryPart);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber5 num1 = new ComplexNumber5(2, 3);
        ComplexNumber5 num2 = new ComplexNumber5(4, 5);

        ComplexNumber5 sum = num1.add(num2);

        System.out.println("Sum: " + sum);
    }
}
