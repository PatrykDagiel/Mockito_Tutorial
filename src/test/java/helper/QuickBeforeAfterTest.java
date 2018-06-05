package helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    StringHelper helper = new StringHelper();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void setup() {
        System.out.println("Before Test");

    }

    @Test
    public void test1() {
        System.out.println("Test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("Test2 executed");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @After
    public void teardown() {
        System.out.println("finishing tests. Clear everything.");
    }
}
