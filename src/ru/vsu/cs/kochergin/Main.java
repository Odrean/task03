package ru.vsu.cs.kochergin;

import ru.vsu.cs.kochergin.figures.Circle;
import ru.vsu.cs.kochergin.figures.HorizontalParabola;
import ru.vsu.cs.kochergin.figures.VerticalParabola;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    private static Circle CIRCLE = new Circle(5, 3, 2);
    private static HorizontalParabola HP1 = new HorizontalParabola(0, 6, 0.25);
    private static HorizontalParabola HP2 = new HorizontalParabola(5, 2, 0.11);
    private static VerticalParabola VP = new VerticalParabola(-4, 2, 1);

    private static Picture picture = new Picture(CIRCLE, HP1, HP2, VP);
    private static Test test = new Test();

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        if (!test.test(picture)) {
            System.out.println("Tests failed");
            return;
        }

        System.out.println("All tests passed");

        double coordinateX = readCoordinatesOfPoint("x");
        double coordinateY = readCoordinatesOfPoint("y");

        Point p1 = new Point(coordinateX, coordinateY);
        printColorForPoint(p1.x, p1.y);
    }

    static double readCoordinatesOfPoint(String name) {
        Scanner scanner = new Scanner(System.in);
        double coordinate = 0;
        System.out.printf("input %s: ", name);

        while (!scanner.hasNextDouble()) {
            System.out.println("Incorrect data");
            System.out.printf("input %s: ", name);
            scanner.next();
        }
        coordinate = scanner.nextDouble();

        while (!(coordinate >= -10 && coordinate <= 10)) {
            System.out.println("not included in the range{-10; 10}");
            System.out.printf("input %s: ", name);
            coordinate = scanner.nextDouble();
        }

        return coordinate;
    }

    static void printColorForPoint(double x, double y) {
        SimpleColor color = picture.getColor(x, y);

        System.out.printf("(%.1f, %.1f) -> %s%n", x, y, color);
    }
}