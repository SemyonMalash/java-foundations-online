package ru.itsjava.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Bird implements Flyable {

    private final String habitat;
    private final int lifespan;

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public String flyMaxDistance(String maxDistance) {
        return maxDistance = "1000";
    }

//    public Bird(String habitat, int lifespan) {
//        this.habitat = habitat;
//        this.lifespan = lifespan;
//    }

//    //переопределение метода equals в классе Object
//    @Override
//    //создание метода equals типа boolean с входящим параметром типа Object и именем o
//    public boolean equals(Object o) {
//        //проверка на равенство самому себе
//        if (this == o) return true;
//        //проверка на равенство нулю и соответствие одному классу
//        if (o == null || getClass() != o.getClass()) return false;
//        //приведение типа Object к типу Bird
//        Bird bird = (Bird) o;
//        //cравнение первого параметра lifespan
//        if (lifespan != bird.lifespan) return false;
//        //сравнение второго параметра habitat
//        return habitat.equals(bird.habitat);
//    }

//    //переопределение метода hashCode
//    @Override
//    //создание метода hashCode типа int
//    public int hashCode() {
//        //возврат значения хэш-кода поля habitat
//        return habitat.hashCode();
//    }
//
    @Override
    public String toString() {
        return "Bird {" +
                "habitat='" + habitat + '\'' +
                ", lifespan=" + lifespan +
                '}';
    }
}
