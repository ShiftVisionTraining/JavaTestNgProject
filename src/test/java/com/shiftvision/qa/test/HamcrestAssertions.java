package com.shiftvision.qa.test;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestAssertions {

    @Test
    public void test1(){
        String message = "Iftekhar Ivaan";
        assertThat(message, equalTo("Iftekhar Ivaan"));
    }

    @Test
    public void test2(){
        String message = "Iftekhar Ivaan";
        assertThat(message, startsWith("Iftekhar"));
    }
}
