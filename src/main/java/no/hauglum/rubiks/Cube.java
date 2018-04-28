package no.hauglum.rubiks;

/**
 * Default Cube gives you a solved cube with color white on the front side
 */
public class Cube {

    private final String[][][] cube = new String[2][2][2];

    public Cube() {
        cube[0][0][0] = "W";
        cube[0][1][0] = "W";
        cube[1][0][0] = "W";
        cube[1][1][0] = "W";
    }

    /**
     *
     * @return the front side of the cube
     */
    public String presentFrontSide() {
        return  "W|W\n" +
                "W|W";
    }

    public void topClockwise() {
    }
}
