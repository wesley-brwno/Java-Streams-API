package comportamento.test;

import comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByAge(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green"))
                greenCars.add(car);
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red"))
                greenCars.add(car);
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color))
                filteredCars.add(car);
        }
        return filteredCars;
    }

    private static List<Car> filterCarByAge(List<Car> cars, int year) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year)
                greenCars.add(car);
        }
        return greenCars;
    }
}
