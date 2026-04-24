package com.mishchenko.components;

/**
 * Клас процесора.
 */
public class CPU extends PCComponent {
    private int coreCount;
    private double clockSpeed;

    public CPU(String name, String manufacturer, double price, double powerConsumption, double weight, int coreCount, double clockSpeed) {
        super(name, manufacturer, price, powerConsumption, weight);
        this.coreCount = coreCount;
        this.clockSpeed = clockSpeed;
    }

    /**
     * Виконує обчислення.
     */
    public void compute() {
        System.out.println(getName() + " виконує обчислення на " + clockSpeed + " ГГц з " + coreCount + " ядрами.");
    }

    /**
     * Виводить інформацію про процесор.
     */
    public void printInfo() {
        System.out.println("CPU: " + getName() + " | " + manufacturer() + " | Ядра: " + coreCount + " | Частота: " + clockSpeed + " ГГц");
    }

    private String manufacturer() { return getManufacturer(); }
}
