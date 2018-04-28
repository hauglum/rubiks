package no.hauglum.rubiks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class CubeTest {


    private Cube cube;

    @Before
    public void setUp() {
        cube = new Cube();
    }

    @After
    public void tearDown() {
        System.out.println(cube.presentFrontSide());
        System.out.println();
    }

    @Test
    public void canPresentFrontSideOfCube(){
        assertThat("Should be able to presentFrontSide front side of cube",  cube.presentFrontSide(), equalTo("W|W\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterTopClockwise(){
        int times = 1;
        cube.turnTopClockwise(times);
        assertThat(getMainReason(times),  cube.presentFrontSide(), equalTo("R|R\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2TopClockwise(){
        int n = 2;
        cube.turnTopClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("Y|Y\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3TopClockwise(){
        int n = 3;
        cube.turnTopClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("O|O\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter4TopClockwise(){
        cube.turnTopClockwise(4);
        assertThat("Should be able to present front side after one complete turn of top of the  cube",  cube.presentFrontSide(), equalTo("W|W\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter5TopClockwise(){
        int n = 5;
        cube.turnTopClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("R|R\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterTopCounterClockwise(){
        cube.turnTopCounterClockwise();
        assertThat(getMainReason(1),  cube.presentFrontSide(), equalTo("O|O\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2TopCounterClockwise(){
        int n = 2;
        cube.turnTopCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("Y|Y\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3TopCounterClockwise(){
        int n = 3;
        cube.turnTopCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("R|R\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter4TopCounterClockwise(){
        int n = 4;
        cube.turnTopCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterBottomClockwise(){
        cube.turnBottomClockwise();
        assertThat(getMainReason(1),  cube.presentFrontSide(), equalTo("W|W\nR|R"));
    }

    private String getMainReason(int n) {
        return "Should be able to present front side after "+ n + " operation on he cube";
    }
}