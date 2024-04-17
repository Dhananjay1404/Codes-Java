
import java.util.*;

public class cityTemperature {
    String city_nm;
    double city_Temp;
    static double max_temp = 0;
    static double m_temp = 0;

    void getTempData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter City Name : ");
        city_nm = in.next();
        System.out.print("Enter Temperature : ");
        city_Temp = in.nextDouble();
        System.out.print("");
    }

    public static void main(String[] args) {
        String city_nm = "";
        int i = 0;
        cityTemperature t[] = new cityTemperature[5]; // Created array of objects
        for (i = 0; i < 5; i++) {
            t[i] = new cityTemperature(); // Called Constructor for every object of array
            t[i].getTempData(); // Called to get city and temperature data
        }
        for (i = 0; i < 5; i++) {
            if (t[i].city_Temp > max_temp) {
                max_temp = t[i].city_Temp; // compare object temperature with ma_temp one by one
                city_nm = t[i].city_nm;
            }
        }
        // To Print The Maximum Temperature city name and temperature
        System.out.println("\n Max Temperature \n City : " + city_nm + "\n Temperature : " + max_temp);
    }
}
