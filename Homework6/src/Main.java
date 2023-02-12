import java.util.*;

public class Main {
    public static void main(String[] args) {

        Notebook n1 = new Notebook(2, 128, "Windows 10", "red");
        Notebook n2 = new Notebook(4, 256, "Windows 11", "dark");
        Notebook n3 = new Notebook(32, 512, "Windows 10", "blue");
        Notebook n4 = new Notebook(16, 256, "Windows 11", "yellow");
        Notebook n5 = new Notebook(2, 1024, "Windows 11", "green");
        System.out.println(n1.toString());
        Map<Integer, List<Notebook>> ramMap = new HashMap<>();
        List<Notebook> notebooksList = List.of(n1, n2, n3, n4, n5);
        for (int i = 0; i < notebooksList.size(); i++) {
            Notebook exnotebook = notebooksList.get(i);
            if (ramMap.containsKey(exnotebook.getRam())) {
                List<Notebook> ramList = ramMap.get(exnotebook.getRam());
                ramList.add(exnotebook);
            } else {
                List<Notebook> ramList = new ArrayList<>();
                ramList.add(exnotebook);
                ramMap.put(exnotebook.getRam(), ramList);
            }
        }
        System.out.println(ramMap);


        System.out.println("Введите цифру, соответствующую необходимому критерию");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int input = iScanner.nextInt();


        if (input == 1){
            System.out.printf("Введите значение: ");
            int ram = iScanner.nextInt();
            if (ramMap.containsKey(ram)) {
                System.out.println(ramMap.get(ram));
            }
            else {
                System.out.println("Такого значения нет");
            }

        }
       // else if (){

       //}

        iScanner.close();
    }
}
        /*   Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int input = iScanner.nextInt();
        iScanner.close();

        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if(){
                System.out.println();
            }

        }else if(choice == 2){

            System.out.println("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if(){
                System.out.println();
            }

        }else if(choice == 3){

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if()){
                System.out.println();
            };
        }

    }

}
*/