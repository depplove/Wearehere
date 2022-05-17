package dee;

public class LeapYearCalc {
    static boolean isLeapYear(int year){
        if (year>=1 && year<=9999){
            if (year%4==0) {
                if (year%100==0){
                    if ( year%400==0){
                        return true;
                    }
                    return false;
                }
                return  true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isLeapYear(148));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(5));
        System.out.println(isLeapYear(12));

    }
}
