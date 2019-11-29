package services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;
import java.util.List;
import models.Furniture;
import services.FurnitureService;
import java.util.ArrayList;


public class FurnitureServiceTest1 {
    List<models.Furniture> furnitureInventory;
    FurnitureService furnitureService;

    @Before
    public void setUp() {
        this.furnitureInventory = new ArrayList<>();
        this.furnitureService = new FurnitureService();

        FurnitureService furnitureService = new FurnitureService();
    }

    @After
    public void tearDown() {

    }


    @Test
    void createTest() {

        // (1)
        String expectedName = "Love Seat";
        String expectedType = "Couch";
        String expectedBrand = "Ashley";
        int expectedSize = 24;
        int expectedQty = 30;
        float expectedPrice = 80.00f;

        //(2)
        models.Furniture testFurniture = furnitureService.create(expectedName, expectedBrand,
                expectedType, expectedSize, expectedQty, expectedPrice);


        // (3)
        int actualId = testFurniture.getId();
        String actualName = testFurniture.getName();
        String actualBrand = testFurniture.getBrand();
        String actualType = testFurniture.getType();
        int actualSize = testFurniture.getSize();
        int actualQty = testFurniture.getQty();
        float actualPrice = testFurniture.getPrice();

        //(4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

        // (4)

    }

    @Test
    void findTest() {
        int expectedId = 34;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedType = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        models.Furniture testFurniture = FurnitureService.create(expectedName, expectedBrand,
                expectedType, expectedSize, expectedQty, expectedPrice);
        models.Furniture actual = furnitureService.findFurniture(1);
        Assertions.assertEquals(actual, testFurniture);
    }

    @Test
    void findAllTest() {
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedType = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        Furniture testFurniture = FurnitureService.create(expectedName, expectedBrand,
                expectedType, expectedSize, expectedQty, expectedPrice);
        models.Furniture[] actual = furnitureService.findAll();
        Assertions.assertEquals(actual, furnitureInventory);


    }


    @Test
    void deleteTest() {
        int expectedId = 34;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedType = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        Furniture testAppliances = FurnitureService.create(expectedName, expectedBrand,
                expectedType, expectedSize, expectedQty, expectedPrice);
    Furniture actual = furnitureService.findFurniture(1);
        Assertions.assertTrue(furnitureInventory.delete(1));

    }


}