package Facade;

import org.junit.Test;

public class HomeTheaterFacadeTest {
    @Test
    public void testHomeTheatreFacade() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
