package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.util.StringUtils;
import org.opentest4j.AssertionFailedError;

public class FurnitureTest {

        @Test
    public void constructorTest(){

        // (2)
        int expectedId = 344;
        String expectedName = "Love Seat";
        String expectedType = "Couch";
        String expectedBrand = "Ashley";
        int expectedSize = 24;
        int expectedQty = 30;
        float expectedPrice = 80.00f;

        // (3)
        Furniture testFurniture = new Furniture(expectedId, expectedType, expectedName, expectedBrand, expectedSize, expectedQty, expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testFurniture.getId());
        Assertions.assertEquals(expectedType, testFurniture.getType());
        Assertions.assertEquals(expectedName, testFurniture.getName());
        Assertions.assertEquals(expectedBrand, testFurniture.getBrand());
        Assertions.assertEquals(expectedSize, testFurniture.getSize());
        Assertions.assertEquals(expectedQty, testFurniture.getQty());
        Assertions.assertEquals(expectedPrice, testFurniture.getPrice());
    }
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Love Seat";

        //when (2)
        Furniture testFurniture = new Furniture();
        testFurniture.setName(expected);

        //then (3)
        Assertions.assertEquals(expected, testFurniture.getName());
    }

    @Test
    public void setIdTest() {
        int expected = 344;

        Furniture testFurniture = new Furniture();
        testFurniture.setId(344);

        Assertions.assertEquals(expected, testFurniture.getId());
    }

    @Test
    public void setBrandTest() {
        String expected = "Ashley";

        Furniture testFurniture = new Furniture();
        testFurniture.setBrand(expected);

        Assertions.assertEquals(expected, testFurniture.getBrand());
    }

    @Test
    public void setTypeTest() {
        String expected = "Couch";

        Furniture testFurniture = new Furniture();
        testFurniture.setType(expected);

        Assertions.assertEquals(expected, testFurniture.getType());
    }

    @Test
    public void setSizeTest() {
        int expected = 72;

        Furniture testFurniture = new Furniture();
        testFurniture.setSize(expected);

        Assertions.assertEquals(expected, testFurniture.getSize());
    }

    @Test
    public void setQtyTest() {
        int expected = 20;

        Furniture testFurniture = new Furniture();
        testFurniture.setQty(expected);

        Assertions.assertEquals(expected, testFurniture.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = 200;

        Furniture testFurniture = new Furniture();
        testFurniture.setPrice(expected);

        Assertions.assertEquals(expected, testFurniture.getPrice());
    }
}
