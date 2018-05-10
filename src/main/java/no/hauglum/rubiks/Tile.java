package no.hauglum.rubiks;

import java.util.Optional;

public class Tile {

    public enum Color {Y,R,G,B,O,W}
    private String frontColor;
    private String rightSideColor;
    private String leftSideColor;
    private String backColor;
    private String bottomColor;
    private String topcolor;


    public Tile(String frontColor, String rightSideColor, String leftSideColor, String backColor, String topColor, String bottomColor) {
        this.frontColor = frontColor;
        this.rightSideColor = rightSideColor;
        this.leftSideColor = leftSideColor;
        this.backColor = backColor;
        this.topcolor = topColor;
        this.bottomColor = bottomColor;
    }

    @Override
    public String toString() {
        return frontColor;
    }

    public void rotateXClockwise() {
        String f = getColor(frontColor);
        String r = getColor(rightSideColor);
        String l = getColor(leftSideColor);
        String b = getColor(backColor);
        //Do not inline!
        leftSideColor = f;
        frontColor = r;
        rightSideColor = b;
        backColor = l;
    }

    public void rotateXCounterClockwise() {
        String f = getColor(frontColor);
        String r = getColor(rightSideColor);
        String l = getColor(leftSideColor);
        String b = getColor(backColor);
        //Do not inline!
        leftSideColor = b;
        frontColor = l;
        rightSideColor = f;
        backColor = r;

    }

    public void rotateYClockwise() {
        String f = getColor(frontColor);
        String bo = getColor(bottomColor);
        String ba = getColor(backColor);
        String t = getColor(topcolor);
        //Do not inline!
        frontColor = bo;
        bottomColor = ba;
        backColor = t;
        topcolor = f;
    }

    private String getColor(String frontColor) {
        return Optional.ofNullable(frontColor).orElse(new String());
    }

    public void rotateYCounterClockwise() {
        String f = getColor(frontColor);
        String bo = getColor(bottomColor);
        String ba = getColor(backColor);
        String t = getColor(topcolor);
        //Do not inline!
        frontColor = t;
        bottomColor = f;
        backColor = bo;
        topcolor = ba;

    }

    public void rotateZClockwise() {
        String t = getColor(topcolor);
        String r = getColor(rightSideColor);
        String l = getColor(leftSideColor);
        String b = getColor(bottomColor);
        //Do not inline!
        leftSideColor = b;
        topcolor = l;
        rightSideColor = t;
        bottomColor = r;
    }

    public String getFrontColor() {
        return frontColor;
    }

    public String getRightSideColor() {
        return rightSideColor;
    }

    public String getLeftSideColor() {
        return leftSideColor;
    }

    public String getBackColor() {
        return backColor;
    }

    public String getBottomColor() {
        return bottomColor;
    }

    public String getTopcolor() {
        return topcolor;
    }

    public void rotateZCounterClockwise() {
        String t = getColor(topcolor);
        String r = getColor(rightSideColor);
        String l = getColor(leftSideColor);
        String b = getColor(bottomColor);
        //Do not inline!
        leftSideColor = t;
        topcolor = r;
        rightSideColor = b;
        bottomColor = l;
    }
}
