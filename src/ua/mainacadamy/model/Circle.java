package ua.mainacadamy.model;

public class Circle extends AbstractFigure{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getTrueArea();
    }

    protected double getTrueArea() {
        return radius * radius * Math.PI;
    }

}
