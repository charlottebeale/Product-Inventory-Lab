package services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;
import java.util.List;
import models.Appliances;
import java.util.ArrayList;

public class AppliancesServiceTest {
   List<models.Appliances> appliancesInventory;
    AppliancesService appliancesService;

    @Before
    public void setUp() {
        this.appliancesInventory = new ArrayList<>();
        this.appliancesService = new AppliancesService();
    }

    @After
    public void tearDown() {

    }

        @Test
         void createTest(){

            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedType = "Tennis";
            int expectedSize = 10;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            Appliances testAppliances = appliancesService.create(expectedName, expectedBrand,
                    expectedType, expectedSize, expectedQty, expectedPrice);

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


        @Test

        public void findTest(int id) {
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedType = "Tennis";
            int expectedSize = 10;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            Appliances testAppliances = appliancesService.create(expectedName, expectedBrand,
                    expectedType, expectedSize, expectedQty, expectedPrice);
            Appliances actual = appliancesService.findAppliances(1);
            Assertions.assertEquals(actual, testAppliances);

        }
        @Test

         void findAllTest() {
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedType = "Tennis";
            int expectedSize = 10;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            Appliances testAppliances = appliancesService.create(expectedName, expectedBrand,
                    expectedType, expectedSize, expectedQty, expectedPrice);
            Appliances[] actual = appliancesService.findAll();
            Assertions.assertEquals(actual, appliancesInventory);

        }

        @Test
         void deleteTest(int id) {
            int expectedId = 34;
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedType = "Tennis";
            int expectedSize = 10;
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            Appliances testAppliances = appliancesService.create(expectedName, expectedBrand,
                    expectedType, expectedSize, expectedQty, expectedPrice);
            Appliances actual = appliancesService.findAppliances(1);
            Assertions.assertTrue(appliancesService.delete(1));

        }




    }

