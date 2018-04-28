package no.hauglum.rubiks;

/**
 * Default Cube gives you a solved cube with color white on the front side
 */
class Cube {

    private final Tile[][][] cube = new Tile[2][2][2];

    Cube() {
        cube[0][0][0] = new Tile("W", null, "O");
        cube[0][1][0] = new Tile("W", "R", null);
        cube[0][0][1] = new Tile(null, null, "O", "Y");
        cube[0][1][1] = new Tile(null, "R", null, "Y");

        cube[1][0][0] = new Tile("W");
        cube[1][1][0] = new Tile("W");


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

    /**
     * Rotates top of cube clock wise once
     */
    void turnTopClockwise() {
        Tile tile000 = cube[0][0][0];
        Tile tile010 = cube[0][1][0];
        Tile tile001 = cube[0][0][1];
        Tile tile011 = cube[0][1][1];

        tile000.rotateXClockwise();
        tile010.rotateXClockwise();
        tile001.rotateXClockwise();
        tile011.rotateXClockwise();

        cube[0][0][0] = tile010;
        cube[0][1][0] = tile011;
        cube[0][0][1] = tile000;
        cube[0][1][1] = tile001;
      }

    /**
     * turnTopClockwise n times
     * @param times
     */
    void turnTopClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnTopClockwise();
        }
    }

    /**
     * Rotates top of cube clock wise once
     */
    public void turnTopCounterClockwise() {
        Tile tile000 = cube[0][0][0];
        Tile tile010 = cube[0][1][0];
        Tile tile001 = cube[0][0][1];
        Tile tile011 = cube[0][1][1];

        tile000.rotateXCounterClockwise();
        tile010.rotateXCounterClockwise();
        tile001.rotateXCounterClockwise();
        tile011.rotateXCounterClockwise();

        cube[0][0][0] = tile001;
        cube[0][1][0] = tile000;
        cube[0][0][1] = tile011;
        cube[0][1][1] = tile010;
    }
}
