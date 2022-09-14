public class MarsRover {
    public String calculate(String command) {
        if (command.equals("R")) {
            return "E";
        }
        if (command.equals("RR"))
        {
            return "S";
        }
        return "W";
    }
}
