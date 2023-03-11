package app;

import misc.CoordinateSystem2d;
import java.util.ArrayList;

/**
 * Класс задачи
 */
public class Task {
    /**
     * Текст задачи
     */
    public static final String TASK_TEXT = """
            ПОСТАНОВКА ЗАДАЧИ:
            Заданы два множества точек в вещественном
            пространстве. Требуется построить пересечение
            и разность этих множеств""";
    /**
     * Вещественная система координат задачи
     */
    private final CoordinateSystem2d ownCS;
    /**
     * Список точек
     */
    private final ArrayList<Point> points;

    /**
     * Задача
     *
     * @param ownCS  СК задачи
     * @param points массив точек
     */
    public Task(CoordinateSystem2d ownCS, ArrayList<Point> points) {
        this.ownCS = ownCS;
        this.points = points;
    }
}