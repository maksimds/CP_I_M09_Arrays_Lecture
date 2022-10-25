import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        String[] names = {"Denis", "Ryan", "Hugh"};
        String[] items = new String[100];

        int itemCount = 0;

        items[0] = "Radio";
        itemCount++;

        System.out.println(names.length); //The amount of values in the array
        System.out.println();

        System.out.println(names[0]); //The first element of the array
        System.out.println();

        for (int r = 0; r < names.length; r++) //Display all the values pf the array
            System.out.println(names[r]);
        System.out.println();

        for (String r: names) //Display all the values pf the array
            System.out.println(r);
        System.out.println();


        Random gen = new Random(); //Some random shit
        int[] values = new int[100];

        for (int l = 0; l < values.length; l++)
            values[l] = gen.nextInt(100) + 1;

        for (int l = 0; l < values.length; l++)
            System.out.printf("%3d", values[l]);
        System.out.println();

        //Sum
        int sum = 0;
        for (int l = 0; l < values.length; l++)
            sum += values[l];

        System.out.println("\nThe sum of the array values is: " + sum);
        System.out.println("The average is: " + sum/ values.length);
        System.out.println();

        //min & max
        int min = values[0];
        int max = values[0];
        for (int l = 0; l < values.length; l++)
        {
            if (values[l] < min) //new min
                min = values[l];
            if (values[l] > max) //new max
                max = values[l];
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println();

        //Search algorithms
        int target = 53;

        boolean found = false;
        for (int t = 0; t < values.length; t++)
        {
            if (values[t] == target)
            {
                System.out.println("Found the target value " + "(" + target + ")" + " at: " + t);
                found = true;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Didn't find the values " + target);


        //Find First - terminate the search after first occurance
        for (int t = 0; t < values.length; t++)
        {
            if (values[t] == target)
            {
                System.out.println();
                System.out.println("Found the target value " + "(" + target + ")" + " at: " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Didn't find the values " + target);


        //Find Last - terminate the search after finding first occurance

    }
}