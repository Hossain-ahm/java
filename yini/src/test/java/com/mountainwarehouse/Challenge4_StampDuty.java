package com.mountainwarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Challenge4_StampDuty {
        @Parameters
        public static Collection<Object[]> data() {
                return Arrays.asList(new Object[][] {
                                { 125000, 0 },
                                { 300000, 0 },
                                { 300001, (int) Math.ceil(1 * 0.05) },
                                { 500000, (int) Math.ceil((500000 - 300001) * 0.05) },
                                { 925000, (int) Math.ceil((925000 - 300001) * 0.05) },
                                { 925001, (int) Math.ceil((925000 - 300001) * 0.05) },
                                { 1500000, (int) Math.ceil((574999 * 0.1) + ((925000 - 300001) * 0.05)) },
                                { 2500000, (int) Math.ceil(((2500000 - 1500001) * 0.12) + (574999 * 0.1)
                                                + ((925000 - 300001) * 0.05)) },
                                { 1595000, 100150 }
                });
        }

        private int fPropertyPrice;
        private int fExpectedResult;

        public Challenge4_StampDuty(int propertyPrice, int expectedResult) {
                fPropertyPrice = propertyPrice;
                fExpectedResult = expectedResult;
        }

        @Test
        public void test() {
                assertEquals(fExpectedResult, Challenge_4.StampDuty(fPropertyPrice));
        }
}
