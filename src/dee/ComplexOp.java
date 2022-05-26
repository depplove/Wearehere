package dee;

public class ComplexOp {
    public static void main(String[] args) {
        // instantiate class
        ComplexNumber complex= new ComplexNumber(1.2,3.2);
        // getting real and imaginary numbers
        System.out.println("real: "+ complex.getReal());
        System.out.println("imaginary: "+ complex.getImg());
        System.out.println();
        // add with two parameter
        complex.add(1,2);
        System.out.println();
        //add with one parameter
        complex.add(new ComplexNumber(3,4));
        System.out.println();
        // subtract with two parameter
        complex.subtract(1,2);
        System.out.println();
        // subtract with one parameter
        complex.subtract(new ComplexNumber(1.2,2));
    }
}

class ComplexNumber{
    double real;
    double img;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }
    public void add(double real, double img){
        this.real+=real;
        this.img+=img;
        System.out.println("This is add with two parameter");

        System.out.println("real: "+ this.real+" "+ "Imaginary: "+ this.img);
        System.out.println("Complex Number: "+this.real +" + "+this.img+"i");
    }
    void add(ComplexNumber com){
        this.real+=com.real;
        this.img+=com.img;
        System.out.println("This is add with one parameter");
        System.out.println("real: "+ this.real+" "+ "Imaginary: "+ this.img);
        System.out.println("Complex Number: "+this.real +" + "+this.img+"i");

    }

    public void subtract(double real, double img){
        this.real-=real;
        this.img-=img;
        System.out.println("This is Subtract with two parameter");
        System.out.println("real: "+ this.real+" "+ "Imaginary: "+ String.format("%.2f",this.img));
        System.out.println("Complex Number: "+this.real +" + "+String.format("%.2f",this.img)+"i");
    }
    void subtract(ComplexNumber com){
        this.real-=com.real;
        this.img-=com.img;
        System.out.println("This is Subtract with one parameter");
        System.out.println("real: "+ this.real+" "+ "Imaginary: "+ String.format("%.2f",this.img));
        System.out.println("Complex Number: "+this.real +" + "+String.format("%.2f",this.img)+"i");
    }
}
