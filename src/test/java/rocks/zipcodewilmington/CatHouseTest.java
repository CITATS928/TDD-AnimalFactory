package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
        Date date = new Date();
        //AnimalFactory factory = new AnimalFactory();

        Cat cat1 = AnimalFactory.createCat("newcat",date);
        CatHouse.add(cat1);
        Assert.assertEquals(1,(int)CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest(){
        Date date = new Date();
        Cat cat1 = new Cat("cat1",date,1);
        Cat cat2 = new Cat("cat2",date,2);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.remove(2);
        Assert.assertEquals(1,(int)CatHouse.getNumberOfCats());
    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removecatTest(){
        Date date = new Date();
        Cat cat1 = new Cat("name1",date,1);
        Cat cat2= new Cat("name2",date,2);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        //System.out.println(CatHouse.getNumberOfCats());
        CatHouse.remove(cat1);
        Assert.assertEquals(1,(int)CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getbyIDTest(){
        Cat cat1= new Cat("name1",null,1);
        Cat cat2 = new Cat("name2",null,2);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        Assert.assertEquals(cat2,CatHouse.getCatById(2));

    }


    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getnumofCatTest(){
        Cat cat1 = new Cat("name1",null,1);
        Cat cat2= new Cat("name2",null,2);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat1);
        Assert.assertEquals(3,(int)CatHouse.getNumberOfCats());
    }


}
