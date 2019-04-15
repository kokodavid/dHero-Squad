import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals(true, testHero instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithName_String() {
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals("Supermodo", testHero.getName());
    }

    @Test
    public void Hero_instantiatesWithSize_int() {
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals(10, testHero.getAge());
    }

    @Test
    public void Hero_instantiatesWithPower_String() {
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals("Walk", testHero.getPower());
    }

    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals("olo", testHero.getWeakness());
    }

    @Test
    public void all_displaysAllInstancesOfHeroes() {
        Hero hero1 = new Hero("Supermodo", 10, "Walk", "olo");
        Hero hero2 = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals(true, Hero.all().contains(hero1));
        assertEquals(true, Hero.all().contains(hero2));
    }

    @Test
    public void clear_deletesAllInstancesOfHeroes_0() {
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    @Test
    public void getId_heroesInstantiateWithSpecificId_1() {
        Hero.clear();
        Hero testHero = new Hero("Supermodo", 10, "Walk", "olo");
        assertEquals(1, testHero.getId());
    }

@Test
    public void find_returnsHeroWithSameId_hero1(){
    Hero hero1 = new Hero("Supermodo", 10, "Walk", "olo");
    Hero hero2 = new Hero("Supermodo", 10, "Walk", "olo");
    assertEquals(Hero.find(hero1.getId()),hero1);
}



}


