/**
 * Package for calculate task.
 *
 * @author TinaGVI (mailto:eleonor111@list.ru)
 * @version $Id$
 * @since 0.1
 */
 package ru.job4j.calculate;

public class Calculate {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
    
    public double getResult() {
        return this.result;
    }
	    public void subtract(double first, double second) {
        this.result = first - second;
    }
    
    public double getResult1() {
        return this.result;
    }
	    public void div(double first, double second) {
        this.result = first / second;
    }
    
    public double getResult2() {
        return this.result;
    }
	    public void multiple(double first, double second) {
        this.result = first * second;
    }
    
    public double getResult3() {
        return this.result;
    }
}

/*package ru.job4j.calculate;
public class Calculate {
    /**
     * Main.
     * @param args - args.
     */
 /*   public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
 /*   public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}
*/