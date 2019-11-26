package services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.util.StringUtils;
import org.opentest4j.AssertionFailedError;
import models.Furniture;

public class FurnitureServiceTest {

        @Test
        public void createTest(){

            // (1)
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedSport = "Tennis";
            int expectedSize = 10;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            // (2)
            FurnitureService furnitureService = new FurnitureService();
            Furniture testFurniture = FurnitureService.create(expectedName, expectedBrand,
                    expectedSport, expectedSize, expectedQty, expectedPrice);

            // (3)
            int actualId = testFurniture.getId();
            String actualName = testFurniture.getName();
            String actualBrand = testFurniture.getBrand();
            String actualType = testFurniture.getType();
            int actualSize = testFurniture.getSize();
            int actualQty = testFurniture.getQty();
            float actualPrice = testFurniture.getPrice();

            // (4)
            Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
            Assertions.assertEquals(expectedName, actualName);
            Assertions.assertEquals(expectedBrand, actualBrand);
            Assertions.assertEquals(expectedSport, actualType);
            Assertions.assertEquals(expectedSize, actualSize);
            Assertions.assertEquals(expectedQty, actualQty);
            Assertions.assertEquals(expectedPrice, actualPrice);

        }
}

