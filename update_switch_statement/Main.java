package update_switch_statement;

public class Main {

    public static void main(String[] args){

        String day = "Sunday";
        String result = "";

        // switch(day)
        // {
        //     case "Sunday", "Saturday" -> result = "6Am";

        //     case "Monday" -> result = "8Am";

        //     default -> result = "10Am";
        // }

        // result = switch(day){
        //     case "Sunday", "Saturday" -> "6Am";

        //     case "Monday" -> "8Am";

        //     default -> "10Am";
        // };

        result = switch(day){
            case "Sunday", "Saturday" : yield "6Am";

            case "Monday" : yield "8Am";

            default : yield "10Am";
        };

        System.out.println(result);
    }
}
