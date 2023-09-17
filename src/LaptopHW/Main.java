package LaptopHW;
public class Main {
    public static void main(String[] args) {
        Menu option = new Menu();
        option.addGoods(new Option("Samsung", 15.6, 8, 256, "Linux", "Черный"))
                .addGoods(new Option("HP", 13.3, 16, 512, "Windows", "Белый"))
                .addGoods(new Option("HP", 17.3, 32, 256, "Windows", "Красный"))
                .addGoods(new Option("ASUS", 15.6, 16, 1024, "Linux", "Серый"))
                .addGoods(new Option("Dell", 17.3, 32, 2048, "Windows", "Розовый"))
                .addGoods(new Option("Apple", 16, 96, 8192, "macOS", "Голубой"));

        option.start();

    }
}