package Excercise_3;

public class Computer {
    private final String cpu;
    private final String ram;

    private final String storage;
    private final String gpu;
    private final String os;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    public static class Builder {
        private final String cpu;
        private final String ram;
        private String storage;
        private String gpu;
        private String os;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void displayConfig() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + (storage != null ? storage : "Not included"));
        System.out.println("GPU: " + (gpu != null ? gpu : "Not included"));
        System.out.println("OS: " + (os != null ? os : "Not included"));
        System.out.println("-----------");
    }
}

