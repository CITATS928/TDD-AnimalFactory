package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        Date date = new Date();
        AnimalFactory factory = new AnimalFactory();

        Dog dog1 = AnimalFactory.createDog("dogname", date);

        //Dog dog2 = AnimalFactory.createDog("dogname1", date);
        //DogHouse.add(dog1);
        //DogHouse.add(dog2);
        //System.out.println(DogHouse.getNumberOfDogs());
        Assert.assertEquals("dogname",dog1.getName());
        //Assert.assertEquals(1, (int)dog2.getId());

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void creatCatTest(){
        Date date = new Date();
        Cat cat = AnimalFactory.createCat("catname",date);
        Assert.assertEquals("catname",cat.getName());
    }



}
