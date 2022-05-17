package ru.itsjava.annotations.junit;

public class MyFvoriteTest {

    @BeforeAll
    public void beforeAllMethod() {
        System.out.println("Before all");
    }

    @AfterAll
    public void afterAllMethod() {
        System.out.println("After all");
    }

    @Before
    public void beforeMethod() {
        System.out.println("Before");
    }

    @After
    public void afterMethod() {
        System.out.println("After");
    }

    @DisplayName("тест1")
    @Test
    public void test1() {
    }

    @Test
    public void test2() {
    }

    @Test
    public void test3() {
        throw new RuntimeException();
    }

    public void noTestMethod() {
    }
}
