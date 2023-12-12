public class Computer {
    private final String processor;
    private final String ram;
    private final String hdd;
    private final String graphicsCard;
    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.graphicsCard = builder.graphicsCard;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
    public static class Builder {
        private String processor;
        private String ram;
        private String hdd;
        private String graphicsCard;

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
