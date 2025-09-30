import java.util.Scanner;

public class DogwalkCompany {
    private int [] schedule;
    public DogwalkCompany() {
        schedule = new int[24];
    }
    public String toString () {
        String s = "";
        for (int i = 0; i < schedule.length; i++)
            // fix this line -- cannot find "i"
            s += i + " " + schedule[i] + "\n";
        return s;

    public int addDogs()
        {
        Scanner s = new Scanner(System.in);
        System.out.println("What hour?");
        int hour = s.nextInt();
        schedule[hour] = dogs;
        return hour;
        }

    }
}