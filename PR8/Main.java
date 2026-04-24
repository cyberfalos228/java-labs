package com.mishchenko.main;

import com.mishchenko.components.CPU;
import com.mishchenko.components.GPU;
import com.mishchenko.components.RAM;

public class Main {

    /**
     * Демонструє роботу з процесором.
     */
    public static void runCpu() {
        CPU cpu = new CPU("Ryzen 5 5600X", "AMD", 220.0, 65.0, 0.04, 6, 3.7);
        cpu.printInfo();
        cpu.install();
        cpu.compute();
    }

    /**
     * Демонструє роботу з відеокартою.
     */
    public static void runGpu() {
        GPU gpu = new GPU("RTX 3060", "NVIDIA", 350.0, 170.0, 0.9, 12, "Ampere");
        gpu.printInfo();
        gpu.install();
        gpu.render();
    }

    /**
     * Демонструє роботу з оперативною пам'яттю.
     */
    public static void runRam() {
        RAM ram = new RAM("Vengeance LPX", "Corsair", 55.0, 5.0, 0.03, 16, 3200);
        ram.printInfo();
        ram.install();
        ram.storeData();
    }

    public static void main(String[] args) {
        runCpu();
        System.out.println();
        runGpu();
        System.out.println();
        runRam();
    }
}
