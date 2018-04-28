package no.hauglum.rubiks;

/**
 * Default Cube gives you a solved cube with color white on the front side
 */
class Cube {

    private final Tile[][][] cube = new Tile[2][2][2];

    Cube() {
        cube[0][0][0] = new Tile("W");
        cube[0][1][0] = new Tile("W", "R");
        cube[0][0][1] = new Tile(null, null, "O");
        cube[0][1][1] = new Tile(null, "R", null);

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
    void topClockwise() {
        Tile tile000 = cube[0][0][0];
        tile000.rotateXClockwise();
        Tile tile010 = cube[0][1][0];
        tile010.rotateXClockwise();
        Tile tile001 = cube[0][0][1];
        tile001.rotateXClockwise();
        Tile tile011 = cube[0][1][1];
        tile011.rotateXClockwise();

        cube[0][0][0] = tile010;
        cube[0][1][0] = tile011;
        cube[0][0][1] = tile000;
        cube[0][1][1] = tile001;
      }

    /**
     * topClockwise n times
     * @param times
     */
    void topClockwise(int times) {
        for (int i = 0; i < times; i++) {
            topClockwise();
        }
    }
}
