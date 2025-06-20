package Excercise_3;

public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                                        .build();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                                        .setGpu("NVIDIA RTX 3080")
                                        .setStorage("1TB SSD")
                                        .setOs("Windows 11")
                                        .build();

        Computer workstation = new Computer.Builder("AMD Ryzen 9", "64GB")
                                        .setGpu("AMD Radeon Pro")
                                        .setStorage("2TB NVMe")
                                        .setOs("Linux")
                                        .build();

        System.out.println("Basic Computer:");
        basicComputer.displayConfig();

        System.out.println("Gaming Computer:");
        gamingComputer.displayConfig();

        System.out.println("Workstation:");
        workstation.displayConfig();
    }
}

