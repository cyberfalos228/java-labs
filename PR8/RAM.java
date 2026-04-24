package com.mishchenko.components;

/**
 * Клас оперативної пам'яті.
 */
public class RAM extends PCComponent {
    private int capacityGB;
    private int frequencyMHz;

    public RAM(String name, String manufacturer, double price, double powerConsumption, double weight, int capacityGB, int frequencyMHz) {
        super(name, manufacturer, price, powerConsumption, weight);
        this.capacityGB = capacityGB;
        this.frequencyMHz = frequencyMHz;
    }

    /**
     * Зберігає дані у пам'яті.
     */
    public void storeData() {
        System.out.println(getName() + " зберігає дані. Обсяг: " + capacityGB + " ГБ, Частота: " + frequencyMHz + " МГц.");
    }

    /**
     * Виводить інформацію про оперативну пам'ять.
     */
    public void printInfo() {
        System.out.println("RAM: " + getName() + " | " + getManufacturer() + " | " + capacityGB + " ГБ | " + frequencyMHz + " МГц");
    }
}
