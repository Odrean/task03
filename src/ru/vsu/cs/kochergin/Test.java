package ru.vsu.cs.kochergin;

public class Test {
    public boolean test(Picture picture) {
        if (picture.getColor(2, 4) != SimpleColor.BLUE) {
            printResultOfTest("First");
            return false;
        }
        if (picture.getColor(5, 8) != SimpleColor.BLUE) {
            printResultOfTest("Second");
            return false;
        }
        if (picture.getColor(-3, 7) != SimpleColor.YELLOW) {
            printResultOfTest("Third");
            return false;
        }
        if (picture.getColor(-4, 3) != SimpleColor.YELLOW) {
            printResultOfTest("Fourth");
            return false;
        }
        if (picture.getColor(5.2, 1.2) != SimpleColor.YELLOW) {
            printResultOfTest("Fifth");
            return false;
        }
        if (picture.getColor(4, 2) != SimpleColor.ORANGE) {
            printResultOfTest("Sixth");
            return false;
        }
        if (picture.getColor(5, 4) != SimpleColor.ORANGE) {
            printResultOfTest("Seventh");
            return false;
        }
        if (picture.getColor(10, 1) != SimpleColor.ORANGE) {
            printResultOfTest("Eighth");
            return false;
        }
        if (picture.getColor(9, 5) != SimpleColor.ORANGE) {
            printResultOfTest("Ninth");
            return false;
        }
        if (picture.getColor(6, 2) != SimpleColor.GREEN) {
            printResultOfTest("Tenth");
            return false;
        }
        if (picture.getColor(6, 4) != SimpleColor.GREEN) {
            printResultOfTest("Eleventh");
            return false;
        }
        if (picture.getColor(1, 1) != SimpleColor.WHITE) {
            printResultOfTest("Twelfth");
            return false;
        }
        if (picture.getColor(3, -7) != SimpleColor.WHITE) {
            printResultOfTest("Thirteenth");
            return false;
        }

        return true;
    }

    static void printResultOfTest(String numberTest) {
        System.out.printf("%s test failed%n", numberTest);
    }
}
