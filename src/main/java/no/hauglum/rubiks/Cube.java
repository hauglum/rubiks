package no.hauglum.rubiks;

/**
 * Default Cube gives you a solved cube with color white on the front side
 */
class Cube {

    private final Tile[][][] cube = new Tile[2][2][2];

    Cube() {
        cube[0][0][0] = new Tile("W", null, "O",null, "B", null);
        cube[0][1][0] = new Tile("W", "R", null, null, "B", null);
        cube[0][0][1] = new Tile(null, null, "O", "Y");
        cube[0][1][1] = new Tile(null, "R", null, "Y");

        cube[1][0][0] = new Tile("W", null, "O");
        cube[1][1][0] = new Tile("W", "R", null, null, null, "G");
        cube[1][0][1] = new Tile(null, null, "O", "Y");
        cube[1][1][1] = new Tile(null, "R", null, "Y", null, "G");

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
    private void turnTopClockwise() {
        turnXClockwise(cube[0]);
      }

    private void turnXClockwise(Tile[][] topOrBottom) {
        Tile tile00 = topOrBottom[0][0];
        Tile tile10 = topOrBottom[1][0];
        Tile tile01 = topOrBottom[0][1];
        Tile tile11 = topOrBottom[1][1];

        tile00.rotateXClockwise();
        tile10.rotateXClockwise();
        tile01.rotateXClockwise();
        tile11.rotateXClockwise();

        topOrBottom[0][0] = tile10;
        topOrBottom[1][0] = tile11;
        topOrBottom[0][1] = tile00;
        topOrBottom[1][1] = tile01;
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
     * Rotates top of cube counter clock wise once
     */
    private void turnTopCounterClockwise() {
        int x = 0;
        turnXCounterClockwise(cube[x]);
    }

    private void turnXCounterClockwise(Tile[][] topOrBottom) {
        Tile tile000 = topOrBottom[0][0];
        Tile tile010 = topOrBottom[1][0];
        Tile tile001 = topOrBottom[0][1];
        Tile tile011 = topOrBottom[1][1];

        tile000.rotateXCounterClockwise();
        tile010.rotateXCounterClockwise();
        tile001.rotateXCounterClockwise();
        tile011.rotateXCounterClockwise();

        topOrBottom[0][0] = tile001;
        topOrBottom[1][0] = tile000;
        topOrBottom[0][1] = tile011;
        topOrBottom[1][1] = tile010;
    }

    public void turnTopCounterClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnTopCounterClockwise();
        }
    }

    public void turnBottomClockwise() {
        turnXClockwise(cube[1]);
    }

    public void turnBottomClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnBottomClockwise();
        }
    }

    public void turnBottomCounterClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnBottomCounterClockwise();
        }
    }

    private void turnBottomCounterClockwise() {
        turnXCounterClockwise(cube[1]);
    }

    public void turnRightsideClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnRightsideClockwise();
        }
    }

    private void turnRightsideClockwise() {
        Tile tile010 = cube[0][1][0];
        Tile tile011 = cube[0][1][1];
        Tile tile110 = cube[1][1][0];
        Tile tile111 = cube[1][1][1];

        tile010.rotateYClockwise();
        tile011.rotateYClockwise();
        tile110.rotateYClockwise();
        tile111.rotateYClockwise();

        cube[0][1][0] = tile110;
        cube[0][1][1] = tile010;
        cube[1][1][0] = tile111;
        cube[1][1][1] = tile011;
    }
}
