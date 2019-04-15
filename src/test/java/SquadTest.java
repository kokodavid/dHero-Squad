import org.junit.*;
import static org.junit.Assert.*;


public class SquadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("David",2,"Equality");
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    public void squad_instantiatesWithName_String(){
        Squad testSquad = new Squad("David",2,"Equality");
        assertEquals("David",testSquad.getName());
    }

    @Test
    public void squad_instantiateWithSize_int(){
        Squad testSquad = new Squad("David",2,"Equality");
        assertEquals(2,testSquad.getSize());
    }

    @Test
    public void squad_instantiateWith_String(){
        Squad testSquad = new Squad("David",2,"Equality");
        assertEquals("Equality",testSquad.getCause());
    }


    @Test
    public void all_displaysAllInstancesOfSquad_true() {
        Squad hero1 = new Squad("David",2,"Equality ");
        Squad hero2 = new Squad("Super",7,"Food");
        assertEquals(true, Squad.all().contains(hero1));
        assertEquals(true, Squad.all().contains(hero2));
    }



    @Test
    public void find_returnsSquadWithSameId_hero1() {
        Squad.clear();
        Squad hero1 = new Squad("David",2,"Equality ");
        Squad hero2 = new Squad("Super",7,"Food");
        assertEquals(Squad.find(hero2.getId()), hero1);
    }
    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad("David",2,"Equality");
        assertEquals(0, testSquad.getHeroes().size());
    }
    @Test
    public void addHero_addHeroToList_true(){
        Squad testSquad = new Squad("David",2,"Equality");
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
       testSquad.addHero(testHero);
       assertTrue(testSquad.getHeroes().contains(testHero));
    }

    @Test
    public void heroExists_checksIfHeroExistsInSquads_true() {
        Squad testSquad = new Squad("David",2,"Equality");
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        testSquad.addHero(testHero);
        assertTrue(testSquad.heroExists(testHero));
    }
}
