import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    Dodgems dodgems;
    Park park;
    Playground playground;
    Rollercoaster rollercoaster;

    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        dodgems = new Dodgems("Hanks Bad knee");
        park = new Park("Dude Chilling Park");
        playground = new Playground("Spanky's drop-off");
        rollercoaster = new Rollercoaster("Hell Or High Rides");
        candyFlossStall = new CandyFlossStall("Blow ya mouf out", "Annette Flannigan", "C9");
        iceCreamStall = new IceCreamStall("Licky-Licky five dollars", "Bernard Germain", "W14");
        tobaccoStall = new TobaccoStall("Hacky McHackface's Smoke Hole", "Loretta Johnson", "E24");

        attractions = new ArrayList<>();
        attractions.add(dodgems);
        attractions.add(park);
        attractions.add(playground);
        attractions.add(rollercoaster);

        stalls = new ArrayList<>();
        stalls.add(candyFlossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);

        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void hasAttractions() {
        assertEquals(4, themePark.getAttractions().size());
    }

    @Test
    public void hasStalls() {
        assertEquals(3, themePark.getStalls().size());
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(5, themePark.getAllReviewed().size());
    }

    @Test
    public void returnAllReviewedInString() {
        assertEquals("Dodgems: 8, Park: 2, Rollercoaster: 4, IceCreamStall: 6, TobaccoStall: 1, ", themePark.getAllReviewedString());
    }
}
