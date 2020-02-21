import java.util.Arrays;
import java.util.Scanner;

public class StatInfo {

    public  void start () {

       //create array
        Scanner s = new Scanner(System.in);
                       System.out.println("Please, enter number of elements of the Array: ");
        int n = s.nextInt();
        int data [] =new int[n];

        System.out.println("Please, enter elements of the Array. Please, enter repeated elements: ");

        for (int i=0;i<n;i++)
            {data[i]=s.nextInt();}


        //searching arithmetic mean

        int i;
        int j;
        float sum = 0;

        for (i = 0; i<data.length; i++) {
            sum = sum + data[i];}

        float mean = sum / data.length;

        /*for sum of all elements we can use such code:
             for(int num : data) {
                    sum += num;}*/

        System.out.println("Your input Array: " +Arrays.toString(data));

        //searching of median
        Arrays.sort(data); //Util for sorting the array
        int median;

        if (data.length % 2 !=0) {
            median =  data [data.length / 2];}
        else{median = (data [(data.length -1) /2] + data [data.length/2])/2;}


        // mode of the Array
        double mode = 0;
        double maxCount = 0;

        for (i = 0; i < data.length; ++i) {
            int count = 0;
            for (j = 0; j < data.length; ++j) {
                if (data[j] == data[i])
                    ++count;}

            if (count > maxCount) {
                maxCount = count;
                mode = data[i];}
        }


        //Standard Deviation, information is from https://www.geeksforgeeks.org/mathematics-mean-variance-and-standard-deviation/
        double vv = 0;

        for (i = 0; i<data.length; i++) {
           vv =  vv + Math.pow((data[i]-mean), 2);}

        double variance  = vv/data.length;

        double  standardDeviation = Math.sqrt(variance);

        System.out.println(" " );
        System.out.println("Your Array after sorting:  " +Arrays.toString(data));
        System.out.println(" " );
        System.out.println("Arithmetic mean of the Array = " +mean);
        System.out.println("Median of the Array = " +median);
        System.out.println("Mode of the Array = " +mode);
        System.out.println("Variance of the Array = " +mode);
        System.out.println("Standard Deviation of the Array = " +  standardDeviation );
       }
    }








