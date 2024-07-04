package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {


    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        Cat cat = new Cat();
        Mammal catt=new Cat();
        cat.setName("catName");
        Assert.assertEquals("catName",cat.getName());
    }


    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Cat cat = new Cat();
        Assert.assertEquals("meow!",cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat();
        Date data = new Date();
        cat.setBirthDate(data);
        Assert.assertEquals(data,cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat cateat = new Cat();
        Food food = new Food();

        cateat.eat(food);
        //cateat.eat(food);
        int num = cateat.getNumberOfMealsEaten();
        Assert.assertEquals(1,num);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Cat catid = new Cat(null,null,5);
        int num = catid.getId();
        Assert.assertEquals(5,num);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalTest(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammal(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
