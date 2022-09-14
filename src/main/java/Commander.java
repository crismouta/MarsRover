public class Commander {

    public char moveLeft(char orientation) {
        if (orientation == 'N') {
            return 'W';
        }
        if (orientation == 'E') {
            return 'N';
        }
        if (orientation == 'S') {
            return 'E';
        }
        return 'S';
    }

    public char moveRight(char orientation) {
        if (orientation == 'N') {
            return 'E';
        }
        if (orientation == 'E') {
            return 'S';
        }
        if (orientation == 'S') {
            return 'W';
        }
        return 'N';
    }

    public int[][] moveForward(char orientation, int[][] coordinates) {
        return null;
    }
}
