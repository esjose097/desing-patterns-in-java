/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter1;

import java.util.ArrayList;

/**
 * Se empieza a adaptar el patrón de diseño "Adapter"
 *
 * @author jose casal
 */
public class LineToPointAdapter extends ArrayList<Point> {

    private static int count = 0;

    public LineToPointAdapter(Line line) {
        System.out.println(String.format("%d: Generating points for line [%d,%d]-[%d,%d] (no caching)",
                ++count, line.start.x, line.start.y, line.end.x, line.end.y));

        int left = Math.min(line.start.x, line.end.x);        
        int right = Math.max(line.start.x, line.end.x);
        int top = Math.min(line.start.y, line.end.y);
        int bottom = Math.max(line.start.y, line.end.y);
        int dx = right - left;
        int dy = line.end.y - line.start.y;

        if (dx == 0) {
            for (int y = top; y <= bottom; ++y) {
                add(new Point(left, y));
            }
        } else if (dy == 0) {
            for (int x = left; x <= right; ++x) {
                add(new Point(x, top));
            }
        }
    }
}
