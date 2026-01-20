package n1exercise1;

public class PrintClass {

    public static void printDayType(Day day){

        switch (day){
            case SATURDAY:
            case SUNDAY:
                System.out.println("Its a weekend day");
                break;
            default:
                System.out.println("Its a laborable day");
        }
    }
}
