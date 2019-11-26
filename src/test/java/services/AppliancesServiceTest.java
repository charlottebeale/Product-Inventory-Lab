package services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.util.StringUtils;
import org.opentest4j.AssertionFailedError;
import models.Appliances;

public class AppliancesServiceTest {


        @Test
        public void createTest(){

            // (1)
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedType = "Tennis";
            int expectedSize = 10;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            // (2)
            AppliancesService appliancesService = new AppliancesService();
            Appliances testAppliances = AppliancesService.create(expectedName, expectedBrand,
                    expectedType, expectedSize, expectedQty, expectedPrice);

            // (3)
            int actualId = testAppliances.getId();
            String actualName = testAppliances.getName();
            String actualBrand = testAppliances.getBrand();
            String actualType = testAppliances.getType();
            int actualSize = testAppliances.getSize();
            int actualQty = testAppliances.getQty();
            float actualPrice = testAppliances.getPrice();

            // (4)
            Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
            Assertions.assertEquals(expectedName, actualName);
            Assertions.assertEquals(expectedBrand, actualBrand);
            Assertions.assertEquals(expectedType, actualType);
            Assertions.assertEquals(expectedSize, actualSize);
            Assertions.assertEquals(expectedQty, actualQty);
            Assertions.assertEquals(expectedPrice, actualPrice);

        }
    }

