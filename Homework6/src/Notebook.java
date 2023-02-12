
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

 */
public class Notebook {
    int ram;
    int ssd;
    String os;
    String color;

    public Notebook(int ram, int ssd, String os, String color) {
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public void getInfo() {
        System.out.println(ram + " " + ssd + " " + os + " " + color);
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", ssd=" + ssd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

