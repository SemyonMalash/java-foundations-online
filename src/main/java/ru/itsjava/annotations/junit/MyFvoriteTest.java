package ru.itsjava.annotations.junit;

public class MyFvoriteTest {

    @Test
    public void test1() {}

    @Test
    public void test2() {}

    @Test
    public void test3() {
        throw new RuntimeException();
    }

    public void noTestMethod() {}
}
