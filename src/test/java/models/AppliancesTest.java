package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.util.StringUtils;
import org.opentest4j.AssertionFailedError;

public class AppliancesTest {

        @Test // (1)
        public void constructorTest(){

            // (2)
            int expectedId = 344;
            String expectedName = "Easy Bake Oven";
            String expectedType = "Stove";
            String expectedBrand = "GE";
            int expectedSize = 24;
            int expectedQty = 30;
            float expectedPrice = 80.00f;

            // (3)
            Appliances testAppliances = new Appliances(expectedId, expectedName, expectedType, expectedBrand, expectedSize, expectedQty, expectedPrice);
            testAppliances.setId(expectedId);
            testAppliances.setName(expectedName);
            testAppliances.setType(expectedType);
            testAppliances.setBrand(expectedBrand);
            testAppliances.setSize(expectedSize);
            testAppliances.setQty(expectedQty);
            testAppliances.setPrice(expectedPrice);

            // (4)
            Assertions.assertEquals(expectedId, testAppliances.getId());
            Assertions.assertEquals(expectedName, testAppliances.getName());
            Assertions.assertEquals(expectedType, testAppliances.getType());
            Assertions.assertEquals(expectedBrand, testAppliances.getBrand());
            Assertions.assertEquals(expectedSize, testAppliances.getSize());
            Assertions.assertEquals(expectedQty, testAppliances.getQty());
            Assertions.assertEquals(expectedPrice, testAppliances.getPrice());
        }

    @Test
    public void setNameTest() {
        String expected = "Easy Bake Oven";

        Appliances testAppliances = new Appliances();
        testAppliances.setName(expected);

        Assertions.assertEquals(expected, testAppliances.getName());
    }

        @Test
        public void setIdTest () {
            int expected = 344;

            Appliances testAppliances = new Appliances();
            testAppliances.setId(expected);

            Assertions.assertEquals(expected, testAppliances.getId());
        }
        @Test
        public void setBrandTest () {
            String expected = "GE";

            Appliances testAppliances = new Appliances();
            testAppliances.setBrand(expected);

            Assertions.assertEquals(expected, testAppliances.getBrand());
        }

        @Test
        public void setTypeTest () {
            String expected = "Stove";

            Appliances testAppliances = new Appliances();
            testAppliances.setType(expected);

            Assertions.assertEquals(expected, testAppliances.getType());
        }

        @Test
        public void setSizeTest () {
            int expected = 24;

            Appliances testAppliances = new Appliances();
            testAppliances.setSize(expected);

            Assertions.assertEquals(expected, testAppliances.getSize());
        }

        @Test
        public void setQtyTest () {
            int expected = 30;

            Appliances testAppliances = new Appliances();
            testAppliances.setQty(expected);

            Assertions.assertEquals(expected, testAppliances.getQty());
        }

        @Test
        public void setPriceTest () {
            float expected = 560f;

            Appliances testAppliances = new Appliances();
            testAppliances.setPrice(expected);

            Assertions.assertEquals(expected, testAppliances.getPrice());
        }
    }

