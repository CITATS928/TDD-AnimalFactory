package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`


    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Dog dog = new Dog(null,null,null);
        Assert.assertEquals("bark!",dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirTest(){
        Date date = new Date();
        Dog dog = new Dog(null,null,null);
        dog.setBirthDate(date);
        Assert.assertEquals(date,dog.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Dog dog = new Dog(null,null,null);
        Food Bone = new Food();
        dog.eat(Bone);
        int numBone=dog.getNumberOfMealsEaten();
        Assert.assertEquals(1,(int)dog.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void IdTest(){
        Dog dog = new Dog(null,null,5);
        Assert.assertEquals(5,(int)dog.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void dogAnimalTest(){
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void dogMammal(){
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
