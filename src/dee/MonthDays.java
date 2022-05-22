package dee;

public class MonthDays {
    public static void main(String[] args){
        System.out.println(getDaysInMonth(2,1600));
    }

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

    static int getDaysInMonth(int month, int year){
        if(month>=1 && month<=12 && year>=1 && year<9999){
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return 31;
                }
                case 2 -> {
                    if (isLeapYear(year)){
                        System.out.println("Leap year "+ year);
                        return 29;
                    }
                    System.out.println("Non-Leap year "+ year);
                    return 28;
                }
                case 4, 6, 9, 11 -> {
                    return 30;
                }
            }
        }
        return -1;

    }

}
