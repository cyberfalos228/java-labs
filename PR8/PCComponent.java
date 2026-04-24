package com.mishchenko.components;

/**
 * Батьківський клас для комплектуючих ПК.
 */
public abstract class PCComponent {
    private String name;
    private String manufacturer;
    private double price;
    private double powerConsumption;
    private double weight;

    public PCComponent(String name, String manufacturer, double price, double powerConsumption, double weight) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
    }
  
    public void install() {
        System.out.println(name + " встановлено у систему.");
    }

    public String getName() { return name; }
    public String getManufacturer() { return manufacturer; }
    public double getPrice() { return price; }
    public double getPowerConsumption() { return powerConsumption; }
    public double getWeight() { return weight; }
}
