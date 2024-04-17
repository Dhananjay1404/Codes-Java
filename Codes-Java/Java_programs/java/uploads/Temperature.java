public class Temperature {
    String cities[] = { "Pune", "Mumbai", "Jalgaon", "Solapur", "Kolhapur" };
    int temp[] = { 19, 20, 27, 15, -9 };
    int max;
    int indexOfCity;

    int largest() {
        int i;

        // Initialize maximum element
        max = temp[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < temp.length; i++)
            if (temp[i] > max)
                max = temp[i];

        return max;
    }

    // Linear-search function to find the index of an element
    int findIndex(int arr[], int t) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;
        int count = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        int maxtempindex = t1.findIndex(t1.temp, t1.largest());
        System.out.println(
                "Maximum Temperature is of City " + t1.cities[maxtempindex] + " Which is " + t1.largest() + " °C");
        // System.out.println(maxtempindex);
        // System.out.println(t1.cities[maxtempindex]);
        // System.out.println(t1.temp[maxtempindex]);
    }
}
