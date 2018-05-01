package no.hauglum.rubiks;

/**
 * Default Cube gives you a solved cube with color white on the front side
 */
class Cube {

    private final Tile[][][] cube = new Tile[2][2][2];

    Cube() {
        cube[0][0][0] = new Tile("W", null, "O",null, "B", null);
        cube[0][1][0] = new Tile("W", "R", null, null, "B", null);
        cube[0][0][1] = new Tile(null, null, "O", "Y", "B", null);
        cube[0][1][1] = new Tile(null, "R", null, "Y", "B",null);

        cube[1][0][0] = new Tile("W", null, "O", null, null, "G");
        cube[1][1][0] = new Tile("W", "R", null, null, null, "G");
        cube[1][0][1] = new Tile(null, null, "O", "Y", null, "G");
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
     *
     * @return the left side of the cube
     */
    public String presentLeftSide() {
        return
                cube[0][0][1].getLeftSideColor() + "|" +
                        cube[0][0][0].getLeftSideColor() + "\n" +
                        cube[1][0][1].getLeftSideColor() + "|" +
                        cube[1][0][0].getLeftSideColor() ;
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

    private void turnBottomClockwise() {
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
        int y = 1;
        yAxis(y);
    }

    private void yAxis(int y) {
        Tile tile010 = cube[0][y][0];
        Tile tile011 = cube[0][y][1];
        Tile tile110 = cube[1][y][0];
        Tile tile111 = cube[1][y][1];

        tile010.rotateYClockwise();
        tile011.rotateYClockwise();
        tile110.rotateYClockwise();
        tile111.rotateYClockwise();

        cube[0][y][0] = tile110;
        cube[0][y][1] = tile010;
        cube[1][y][0] = tile111;
        cube[1][y][1] = tile011;
    }

    public void turnLeftsideClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnLeftsideClockwise();
        }
    }

    private void turnLeftsideClockwise() {
        yAxis(0);

    }

    public void turnRightsideCounterClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnRightsideCounterClockwise();
        }
    }

    private void turnRightsideCounterClockwise() {
        turnLeftOrRightCounterClockwise(1);
    }

    private void turnLeftOrRightCounterClockwise(int y) {
        Tile tile0y0 = cube[0][y][0];
        Tile tile0y1 = cube[0][y][1];
        Tile tile1y0 = cube[1][y][0];
        Tile tile1y1 = cube[1][y][1];

        tile0y0.rotateYCounterClockwise();
        tile0y1.rotateYCounterClockwise();
        tile1y0.rotateYCounterClockwise();
        tile1y1.rotateYCounterClockwise();

        cube[0][y][0] = tile0y1;
        cube[0][y][1] = tile1y1;
        cube[1][y][0] = tile0y0;
        cube[1][y][1] = tile1y0;
    }

    public void turnLeftsideCounterClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnLeftOrRightCounterClockwise(0);
        }
    }

    public void turnBacksideClockwise(int times) {
        for (int i = 0; i < times; i++) {
            {
                int z = 1;
                turnBackOrFrontClockwise(z);
            }
        }
    }

    private void turnBackOrFrontClockwise(int zAxis) {
        Tile tile00z = cube[0][0][zAxis];
        Tile tile01z = cube[0][1][zAxis];
        Tile tile10z = cube[1][0][zAxis];
        Tile tile11z = cube[1][1][zAxis];

        tile00z.rotateZClockwise();
        tile01z.rotateZClockwise();
        tile10z.rotateZClockwise();
        tile11z.rotateZClockwise();

        cube[0][0][zAxis] = tile10z;
        cube[0][1][zAxis] = tile00z;
        cube[1][0][zAxis] = tile11z;
        cube[1][1][zAxis] = tile01z;
    }

    public void turnBacksideCounterClockwise(int times) {
        for (int i = 0; i < times; i++) {
         turnBackCounterClockwise();
        };
    }

    private void turnBackCounterClockwise() {
        turnBackOrFrontCounterClockwise(1);
    }

    private void turnBackOrFrontCounterClockwise(int zAxis) {
        Tile tile00z = cube[0][0][zAxis];
        Tile tile01z = cube[0][1][zAxis];
        Tile tile10z = cube[1][0][zAxis];
        Tile tile11z = cube[1][1][zAxis];

        tile00z.rotateZCounterClockwise();
        tile01z.rotateZCounterClockwise();
        tile10z.rotateZCounterClockwise();
        tile11z.rotateZCounterClockwise();

        cube[0][0][zAxis] = tile01z;
        cube[0][1][zAxis] = tile11z;
        cube[1][0][zAxis] = tile00z;
        cube[1][1][zAxis] = tile10z;
    }


    public void turnFrontsideClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnBackOrFrontClockwise(0);
        }
    }

    public void turnFrontsideCounteClockwise(int times) {
        for (int i = 0; i < times; i++) {
            turnBackOrFrontCounterClockwise(0);
        }
    }

    public String presentRightSide() {
        return
                cube[0][1][0].getRightSideColor() + "|" +
                        cube[0][1][1].getRightSideColor() + "\n" +
                        cube[1][1][0].getRightSideColor() + "|" +
                        cube[1][1][1].getRightSideColor() ;

    }

    public String presentTopSide() {
        return
                cube[0][0][0].getTopcolor() + "|" +
                        cube[0][1][0].getTopcolor() + "\n" +
                        cube[0][1][0].getTopcolor() + "|" +
                        cube[0][1][1].getTopcolor() ;

    }

    public String presentBottomSide() {
        return
                cube[1][0][0].getBottomColor() + "|" +
                        cube[1][1][0].getBottomColor() + "\n" +
                        cube[1][0][1].getBottomColor() + "|" +
                        cube[1][1][1].getBottomColor() ;

    }

    public String presentBackSide() {
        return
                cube[0][1][1].getBackColor() + "|" +
                        cube[0][0][1].getBackColor() + "\n" +
                        cube[1][1][1].getBackColor() + "|" +
                        cube[1][0][1].getBackColor() ;

    }
}
