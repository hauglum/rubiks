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
        int times = 1;
        cube.turnTopCounterClockwise(times);
        assertThat(getMainReason(times),  cube.presentFrontSide(), equalTo("O|O\nW|W"));
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
        cube.turnBottomClockwise(1);
        assertThat(getMainReason(1),  cube.presentFrontSide(), equalTo("W|W\nR|R"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2BottomClockwise(){
        int n = 2;
        cube.turnBottomClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nY|Y"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3BottomClockwise(){
        int n = 3;
        cube.turnBottomClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nO|O"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter4BottomClockwise(){
        int n = 4;
        cube.turnBottomClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterBottomCounterClockwise(){
        int n = 1;
        cube.turnBottomCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nO|O"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterRightSideClockwise(){
        int n = 1;
        cube.turnRightsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|G\nW|G"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2RightSideClockwise(){
        int n = 2;
        cube.turnRightsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|Y\nW|Y"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3RightSideClockwise(){
        int n = 3;
        cube.turnRightsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|B\nW|B"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterLeftSideClockwise(){
        int n = 1;
        cube.turnLeftsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("G|W\nG|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2LeftSideClockwise(){
        int n = 2;
        cube.turnLeftsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("Y|W\nY|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3LeftSideClockwise(){
        int n = 3;
        cube.turnLeftsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("B|W\nB|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterRightSideCounterClockwise(){
        int n = 1;
        cube.turnRightsideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|B\nW|B"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2RightSideCounterClockwise(){
        int n = 2;
        cube.turnRightsideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|Y\nW|Y"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3RightSideCounterClockwise(){
        int n = 3;
        cube.turnRightsideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|G\nW|G"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfterLeftSideCounterClockwise(){
        int n = 1;
        cube.turnLeftsideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("B|W\nB|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2LeftSideCounterClockwise(){
        int n = 2;
        cube.turnLeftsideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("Y|W\nY|W"));
    }

    @Test
    public void canPresentFrontSideOfCubeAfter3LeftSideCounterClockwise(){
        int n = 3;
        cube.turnLeftsideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("G|W\nG|W"));
    }

    @Test
    public void canPresentAfterBackSideClockwise(){
        int n = 1;
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
        cube.turnBacksideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("G|O\nG|O"));
        cube.turnBacksideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("R|O\nR|O"));
        cube.turnBacksideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("B|O\nB|O"));
        cube.turnBacksideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
    }

    @Test
    public void canPresentAfterBackSideCounterClockwise(){
        int n = 1;
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
        cube.turnBacksideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("B|O\nB|O"));
        cube.turnBacksideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("R|O\nR|O"));
        cube.turnBacksideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("G|O\nG|O"));
        cube.turnBacksideCounterClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
    }

    @Test
    public void canPresentAfterFrontSideClockwise(){
        int n = 1;
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
        cube.turnFrontsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|G\nO|G"));
        cube.turnFrontsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|R\nO|R"));
        cube.turnFrontsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|B\nO|B"));
        cube.turnFrontsideClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
    }


    @Test
    public void canPresentAfterFrontSideCounterClockwise(){
        int n = 1;
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
        cube.turnFrontsideCounteClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|B\nO|B"));
        cube.turnFrontsideCounteClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|R\nO|R"));
        cube.turnFrontsideCounteClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|G\nO|G"));
        cube.turnFrontsideCounteClockwise(n);
        assertThat(getMainReason(n),  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("O|O\nO|O"));
    }

    @Test
    public void canPresentCorrectAfterCombosOfOperation(){
        cube.turnTopClockwise(2);
        assertThat("",  cube.presentFrontSide(), equalTo("Y|Y\nW|W"));
        assertThat("",  cube.presentLeftSide(), equalTo("R|R\nO|O"));
        assertThat("",  cube.presentRightSide(), equalTo("O|O\nR|R"));
        assertThat("",  cube.presentTopSide(), equalTo("B|B\nB|B"));
        assertThat("",  cube.presentBottomSide(), equalTo("G|G\nG|G"));
        assertThat("",  cube.presentBackSide(), equalTo("W|W\nY|Y"));
        cube.turnBottomClockwise(1);
        cube.turnTopCounterClockwise(2);
        cube.turnRightsideClockwise(1);
        cube.turnLeftsideCounterClockwise(2);
        cube.turnRightsideCounterClockwise(1);
        cube.turnFrontsideCounteClockwise(2);
        cube.turnBottomCounterClockwise(1);
        cube.turnBacksideClockwise(2);
        cube.turnLeftsideClockwise(1);
        cube.turnBacksideCounterClockwise(2);
        cube.turnFrontsideClockwise(1);
        assertThat("",  cube.presentFrontSide(), equalTo("B|B\nR|Y"));
        assertThat("",  cube.presentLeftSide(), equalTo("W|Y\nO|B"));
        assertThat("",  cube.presentRightSide(), equalTo("O|O\nB|Y"));
        assertThat("",  cube.presentTopSide(), equalTo("G|W\nR|W"));
        assertThat("",  cube.presentBottomSide(), equalTo("W|O\nG|R"));
        assertThat("",  cube.presentBackSide(), equalTo("G|R\nG|Y"));

    }

    private String getMainReason(int n) {
        return "Should be able to present front side after "+ n + " operation on he cube";
    }
}