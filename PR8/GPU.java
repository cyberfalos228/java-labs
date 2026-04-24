package com.mishchenko.components;

/**
 * Клас відеокарти.
 */
public class GPU extends PCComponent {
    private int vramGB;
    private String architecture;

    public GPU(String name, String manufacturer, double price, double powerConsumption, double weight, int vramGB, String architecture) {
        super(name, manufacturer, price, powerConsumption, weight);
        this.vramGB = vramGB;
        this.architecture = architecture;
    }

    /**
     * Виконує рендеринг зображення.
     */
    public void render() {
        System.out.println(getName() + " виконує рендеринг з " + vramGB + " ГБ VRAM.");
    }

    /**
     * Виводить інформацію про відеокарту.
     */
    public void printInfo() {
        System.out.println("GPU: " + getName() + " | " + getManufacturer() + " | VRAM: " + vramGB + " ГБ | Архітектура: " + architecture);
    }
}
