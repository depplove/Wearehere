package dee;

public class MethodOverloading {
    public static void main(String[] args){


        System.out.println("Method with two parameters "+calcFeetAndInchesToCentimeters(2,12));
        System.out.println("Method with one parameters "+ calcFeetAndInchesToCentimeters(12));

        // instantiating Area class
        Area ar= new Area();
        System.out.println("Area of circle: "+ ar.area(3.8));
        System.out.println("Area of rectangle: "+ ar.area(3,6));

    }
    static int calcFeetAndInchesToCentimeters(int feet, int inches){
        int toCenti;
        if(feet>=0 && inches>=0){
               toCenti=(int)(feet*12*2.54);
               toCenti+=(int)(inches*2.54);
               return toCenti;
        }
        return -1;
    }
    static int calcFeetAndInchesToCentimeters(int inches){
        int toCenti;
        if(inches>=0){
            toCenti=(int)(inches*2.54);
            return toCenti;
        }
        return -1;
    }

}

class Area{
    double area(double radius){
        if (radius>=0)return Math.PI*radius*radius;
        else return -1;
    }
    double area(int x, int y){
        if(x>=0 && y>=0) return x*y;
        else return -1;
    }
}

