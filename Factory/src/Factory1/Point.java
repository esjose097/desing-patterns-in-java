/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory1;

/**
 * Imaginemos que tenemos un punto para un mapa cartesiano o un mapa Polar pero
 * es dificil definir que tipo de valor se otorgara al momento de crear una
 * instancia con el constructor, pues utilizando el patrón Factory esto se
 * soluciona.
 *
 * @author jose casal
 */
public class Point {

    private double x, y;

    /*
    Observe como no se utiliza directamente el constructor de la clase sino que
    primero se verifica el tipo de punto que será y despues se instancia.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static class Factory {

        /**
         * Método encargado de asignar valores cartesianos al punto.
         *
         * @param x <-- X en cartesiano @param y <-
         * - Y en cartesiano. @return una
         * instancia de Point.
         */
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        /**
         * Método encargado de asignar valores Polares al punto.
         *
         * @param rho <-- rho en polar @param t
         * heta <-- theta en polar @return in
         * stancia de Point.
         */
        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}
