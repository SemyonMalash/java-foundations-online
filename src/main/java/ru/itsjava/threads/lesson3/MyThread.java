package ru.itsjava.threads.lesson3;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyThread extends Thread {
    private final int num;
    private ThreadPractice threadPractice = new ThreadPractice();

    @Override
    public void run() {
        threadPractice.printNum(num);
    }
}
