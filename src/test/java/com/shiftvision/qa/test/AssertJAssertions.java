package com.shiftvision.qa.test;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import org.testng.Assert;

public class AssertJAssertions {


    @Test
    public void test1(){
        String name = "Iftekhar Ivaan";

        assertThat(name)
                .startsWith("Iftekhar")
                .endsWith("Ivaan");



    }

    @Test
    void a_few_simple_assertions_testng() {
        String message = "The Lord of the Rings";
        Assert.assertNotNull(message);
        Assert.assertTrue(message.startsWith("The"));
        Assert.assertTrue(message.contains("Lord"));
        Assert.assertTrue(message.endsWith("Rings"));
    }

    @Test
    void a_few_simple_assertions_assertJ() {
        assertThat("The Lord of the Rings")
                .isNotNull()
                .startsWith("The")
                .contains("Lord")
                .endsWith("Rings");
    }

}
