package ua.mainacadamy.model;

public class Square extends AbstractFigure{
    private double sideA;



    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getArea() {
        return sideA * sideA;
    }
}
