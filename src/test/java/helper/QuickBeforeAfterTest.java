package helper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class QuickBeforeAfterTest {

    StringHelper helper;

    @BeforeEach
    public void setup() {
        helper = new StringHelper();
    }

    @Test
    public void test1() {
        System.out.println("Test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("Test2 executed");
    }

    @AfterEach
    public void teardown() {
        System.out.println("finishing tests. Clear everything.");
    }


}
