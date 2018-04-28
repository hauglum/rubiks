package no.hauglum.rubiks;

/**
 * Default Cube gives you a solved cube with color white on the front side
 */
class Cube {

    private final String[][][] cube = new String[2][2][2];

    Cube() {
        cube[0][0][0] = "W";
        cube[0][1][0] = "W";
        cube[1][0][0] = "W";
        cube[1][1][0] = "W";

    }

    /**
     *
     * @return the front side of the cube
     */
    String presentFrontSide() {
        return
                cube[0][0][0] + "|" +
                        cube[0][1][0] + "\n" +
                        cube[1][0][0] + "|" +
                        cube[1][1][0] ;

    }

    void topClockwise() {
        cube[0][0][0] = "R";
        cube[0][1][0] = "R";
        cube[1][0][0] = "W";
        cube[1][1][0] = "W";
    }

    void topClockwise(int times) {
        for (int i = 0; i < times; i++) {
            topClockwise();
        }
    }
}
