package LaptopHW;
public class Option {

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }

    private String name;
    private double size;
    private int ram;
    private int hdd;
    private String os;
    private String colour;

    public Option(String name, double size, int ram, int hdd, String os, String colour) {
        this.name = name;
        this.size = size;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Бренд: %s \nДиагональ: %.1f' \nОЗУ: %d Гб \nОбъем ЖД: %d Гб \nОС: %s \nЦвет: %s \n",
                this.name, this.size, this.ram, this.hdd, this.os, this.colour);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Option) return this.name.equals(((Option) obj).name) && this.ram == ((Option) obj).ram
                && this.hdd == ((Option) obj).hdd && this.os.equals(((Option) obj).os)
                && this.colour.equals(((Option) obj).colour) && this.size == ((Option) obj).size;
        return false;

    }
}