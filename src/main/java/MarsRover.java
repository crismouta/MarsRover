public class MarsRover {
    public String execute(String command) {

        Commander comm = new Commander();
        int[][] coordinates = new int[10][10];
        char orientation = 'N';
        for (char c : command.toCharArray()) {
            if (c == 'R') {
                orientation = comm.moveRight(orientation);
            }
            if (c == 'L') {
                orientation = comm.moveLeft(orientation);
            }
            if (c == 'M') {
                coordinates = comm.moveForward(orientation, coordinates);
            }
        }
        return String.valueOf(orientation);
    }
}
