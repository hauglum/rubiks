package no.hauglum.rubiks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class CubeTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void canPresentFrontSideOfCube(){
        Cube cube = new Cube();
        assertThat("Should be able to presentFrontSide front side of cube",  cube.presentFrontSide(), equalTo("W|W\nW|W"));
        System.out.print(cube.presentFrontSide());
    }

    @Test
    public void canPresentFrontSideOfCubeAfterTopClockwise(){
        Cube cube = new Cube();
        cube.topClockwise();
        assertThat("Should be able to presentFrontSide front side after one operation on he cube",  cube.presentFrontSide(), equalTo("R|R\nW|W"));
        System.out.print(cube.presentFrontSide());
    }

}