package ru.vsu.cs.kochergin;

import ru.vsu.cs.kochergin.figures.Circle;
import ru.vsu.cs.kochergin.figures.HorizontalParabola;
import ru.vsu.cs.kochergin.figures.VerticalParabola;

public class Picture {
    private final Circle CIRCLE;
    private final HorizontalParabola HP1;
    private final HorizontalParabola HP2;
    private final VerticalParabola VP;

    public Picture(Circle CIRCLE, HorizontalParabola HP1, HorizontalParabola HP2, VerticalParabola VP) {
        this.CIRCLE = CIRCLE;
        this.HP1 = HP1;
        this.HP2 = HP2;
        this.VP = VP;
    }

    public SimpleColor getColor(double x, double y) {
        if (VP.isPointUppOfParabola(x, y)
                || (HP2.isPointRightOfParabola(x ,y) && CIRCLE.isPointInCircle(x, y) && !HP1.isPointRightOfParabola(x, y)) ) {
            return SimpleColor.YELLOW;
        }
        if (HP1.isPointRightOfParabola(x, y) && !HP2.isPointRightOfParabola(x, y) && !CIRCLE.isPointInCircle(x, y)) {
            return SimpleColor.BLUE;
        }
        if ( (CIRCLE.isPointInCircle(x, y) && !HP2.isPointRightOfParabola(x, y))
                || (HP2.isPointRightOfParabola(x, y) && HP1.isPointRightOfParabola(x, y) && !CIRCLE.isPointInCircle(x, y)) ) {
            return SimpleColor.ORANGE;
        }
        if (HP2.isPointRightOfParabola(x, y) && HP1.isPointRightOfParabola(x, y) && CIRCLE.isPointInCircle(x, y)) {
            return SimpleColor.GREEN;
        }

        return SimpleColor.WHITE;
    }
}