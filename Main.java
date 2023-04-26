import java.util.*;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
//Реализовать в java.


public class Main {
    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }
    public static String userSInput(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }


    public static void main(String[] args) {
        Notebook Huawei1 = new Notebook("Huawei","32", "256", "Linux", "Black");
        Notebook Asus1 = new Notebook("Asus","8", "256", "Windows 10", "White");
        Notebook Apple1 = new Notebook("Apple", "8", "256", "Mac OS", "Red");
        Notebook Honor1 = new Notebook("Honor", "16", "512", "Windows XP", "Grey");
        Notebook Huawei2 = new Notebook("Huawei","64", "512", "Linux", "Black");

        ArrayList<Notebook> laptops = new ArrayList<>();
        laptops.add(Honor1);
        laptops.add(Huawei1);
        laptops.add(Apple1);
        laptops.add(Asus1);
        laptops.add(Huawei2);

        int numPoisk = userInput("Выберите параметры сортировки:\n 1 - по марке, \n 2 - по оперативной памяти," +
                " \n 3 - по размеру SSD, \n 4 - по операционной системе, \n 5 - по цвету, \n 6 - показать весь список ");

        if (numPoisk == 6){
            for (Notebook laptop: laptops) {
                laptop.printInfo();
                System.out.println();
            }
        }

        else if (numPoisk == 1){
            String numParametr = userSInput("Напишите интресующий бренд");
            for (Notebook brand : laptops) {
                if (brand.getBrand().equalsIgnoreCase(numParametr)) {
                    System.out.println(brand.printInfo());
                }
            }
        }

        else if (numPoisk == 2){
            String numParametr = userSInput("Напишите размер ram: ");
            for (Notebook ram : laptops) {
                if (ram.getRam().equalsIgnoreCase(numParametr)) {
                    System.out.println(ram.printInfo());
                }
            }
        }

        else if (numPoisk == 3){
            String numParametr = userSInput("Напишите размер SSD: ");
            for (Notebook ssd : laptops) {
                if (ssd.getSSD().equalsIgnoreCase(numParametr)) {
                    System.out.println(ssd.printInfo());
                }
            }
        }

        else if (numPoisk == 4){
            String numParametr = userSInput("Напишите интересующую операционную систему: ");
            for (Notebook os : laptops) {
                if (os.getOs().equalsIgnoreCase(numParametr)) {
                    System.out.println(os.printInfo());
                }
            }
        }

        else if (numPoisk == 5){
            String numParametr = userSInput("Напишите интересующий цвет: ");
            for (Notebook color : laptops) {
                if (color.getColor().equalsIgnoreCase(numParametr)) {
                    System.out.println(color.printInfo());
                }
            }
        }

    }
}
