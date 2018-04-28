package no.hauglum.rubiks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class CubeTest {


    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        System.out.println();
    }

    @Test
    public void canPresentFrontSideOfCube(){
        Cube cube = new Cube();
        assertThat("Should be able to presentFrontSide front side of cube",  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        System.out.println(cube.presentFrontSide());
    }

    @Test
    public void canPresentFrontSideOfCubeAfterTopClockwise(){
        Cube cube = new Cube();
        cube.topClockwise();
        assertThat("Should be able to presentFrontSide front side after one operation on he cube",  cube.presentFrontSide(), equalTo("R|R\nW|W"));
        System.out.println(cube.presentFrontSide());
    }

    @Test
    public void canPresentFrontSideOfCubeAfter2TopClockwise(){
        Cube cube = new Cube();
        cube.topClockwise(2);
        assertThat("Should be able to presentFrontSide front side after one operation on he cube",  cube.presentFrontSide(), equalTo("Y|Y\nW|W"));
        System.out.println(cube.presentFrontSide());
    }

}