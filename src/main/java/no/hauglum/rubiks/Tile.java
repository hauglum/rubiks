package no.hauglum.rubiks;

import java.util.Optional;

public class Tile {

    private String frontColor;
    private String rightSideColor;
    private String leftSideColor;
    private String backColor;

    public Tile(String frontColor) {
        this.frontColor = frontColor;
    }

    public Tile(String frontColor, String rightSideColor) {
        this.frontColor =  frontColor;
        this.rightSideColor = rightSideColor;
    }

    public Tile(String frontColor, String rightSideColor, String leftSideColor) {
        this.frontColor = frontColor;
        this.rightSideColor = rightSideColor;
        this.leftSideColor = leftSideColor;
    }

    public Tile(String frontColor, String rightSideColor, String leftSideColor, String backColor) {
        this.frontColor = frontColor;
        this.rightSideColor = rightSideColor;
        this.leftSideColor = leftSideColor;
        this.backColor = backColor;
    }

    @Override
    public String toString() {
        return frontColor;
    }

    public void rotateXClockwise() {
        String f = Optional.ofNullable(frontColor).orElse(new String());
        String r = Optional.ofNullable(rightSideColor).orElse(new String());
        String l = Optional.ofNullable(leftSideColor).orElse(new String());
        String b = Optional.ofNullable(backColor).orElse(new String());

        leftSideColor = f;
        frontColor = r;
        rightSideColor = b;
        backColor = l;
    }

    public void rotateXCounterClockwise() {
        String f = Optional.ofNullable(frontColor).orElse(new String());
        String r = Optional.ofNullable(rightSideColor).orElse(new String());
        String l = Optional.ofNullable(leftSideColor).orElse(new String());
        String b = Optional.ofNullable(backColor).orElse(new String());

        leftSideColor = b;
        frontColor = l;
        rightSideColor = f;
        backColor = r;

    }
}
