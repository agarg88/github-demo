import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public static void main(String args[]) throws IOException {
        Season season;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any month of the year: ");
        String month = br.readLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("You didn't enter a valid month.");
        }
    }
}