// A year is a leap year if the following conditions are satisfied: 

// The year is multiple of 400.
// The year is multiple of 4 and not multiple of 100.

// pseudo code
// if year is divisible by 400 then is_leap_year
// else if year is divisible by 100 then not_leap_year
// else if year is divisible by 4 then is_leap_year
// else not_leap_year

import java.util.*;

public class LeapYearOrNot {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year :- ");
        year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " Is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " Is NOT a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " Is a Leap Year");
        } else {
            System.out.println(year + " Is NOT a Leap Year");
        }
        sc.close();
    }
}
