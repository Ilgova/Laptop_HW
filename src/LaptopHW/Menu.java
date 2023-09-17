package LaptopHW;
import java.util.*;

public class Menu {
    List<Option> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Menu addGoods(Option option) {
        list.add(option);
        return this;
    }

    public List<Option> getList() {
        return list;
    }

    public void printList() {
        for (int i = 0; i < getList().size(); i++) {
            System.out.println(getList().get(i));
        }
    }

    public Map<Integer, String> searchParametr() {
        Map<Integer, String> config = new HashMap<>();
        config.put(1, "Бренд");
        config.put(2, "Размер экрана");
        config.put(3, "ОЗУ");
        config.put(4, "Объем ЖД");
        config.put(5, "Цвет");
        return config;
    }


    public void searchName(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                System.out.println(getList().get(i));
            }
        }
    }

    public void searchColour(String col) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getColour().equals(col)) {
                System.out.println(getList().get(i));
            }
        }
    }

    public void searchHdd(int hdd) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getHdd() == hdd) {
                System.out.println(getList().get(i));
            }
        }
    }

    public void searchSize(double size) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getSize() == size) {
                System.out.println(getList().get(i));
            }
        }
    }

    public void searchRam(int ram) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getRam() == ram) {
                System.out.println(getList().get(i));
            }
        }
    }

    public String getOperations() {
        String text ="выбор действия( введите цифру):\n"+"1. Товар в наличии \n" + "2. Меню поиска\n" +"3. Выход";
        System.out.println(text);
        String answer = sc.next();
        return answer;
    }

    public int getSearch() {
        String text ="выбор действия( введите цифру):\n"+"1. По бренду\n" + "2. По размеру экрана\n" + "3. По ОЗУ\n" + "4. По объему ЖД\n" + "5. По цвету\n" + "6. Выход";
        System.out.println(text);
        int answer = sc.nextInt();
        return answer;
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            String operation = getOperations();
            if (operation.equals("3")) {
                flag = false;
                sc.close();
            } else if (operation.equals("1")) {
                printList();
            } else if (operation.equals("2")) {
                int search = getSearch();
                while (search != 6) {
                    if (search == 1) {
                        System.out.println("Введите бренд: ");
                        System.out.println("Samsung\nHP\nASUS\nDell\nApple");
                        String temp = sc.next();
                        searchName(temp);
                        break;
                    }
                    if (search == 2) {
                        System.out.println("Введите размер экрана: ");
                        System.out.println("13.3\n15.6\n16\n17.3\n");
                        double temp = sc.nextDouble();
                        searchSize(temp);
                        break;
                    }
                    if (search == 3) {
                        System.out.println("Введите объем ОЗУ: ");
                        System.out.println("8\n16\n32\n96\n");
                        int temp = sc.nextInt();
                        searchRam(temp);
                        break;
                    }
                    if (search == 4) {
                        System.out.println("Введите объем ЖД: ");
                        System.out.println("256\n512\n1024\n2048\n8192\n");
                        int temp = sc.nextInt();
                        searchHdd(temp);
                        break;
                    }
                    if (search == 5) {
                        System.out.println("Введите цвет: ");
                        System.out.println("Белый\nГолубой\nКрасный\nРозовый\nСерый\nЧерный\n");
                        String temp = sc.next();
                        searchColour(temp);
                        break;

                    }
                }
            }
        }
    }
}