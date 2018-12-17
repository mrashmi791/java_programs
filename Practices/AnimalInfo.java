import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Animals {
    String name;
    String color;
    String sound;

    Animals(String name, String color, String sound) {
        this.name = name;
        this.color = color;
        this.sound = sound;
    }

    void getInfo() {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.sound);
    }
}

class AnimalInfo extends Animals {
    AnimalInfo(String name, String color, String sound) {

        super(name, color, sound);
        // this.getInfo();
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        List<AnimalInfo> lf = new ArrayList<AnimalInfo>();

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter " + i + 1 + " value:");
            String name = sc.nextLine();
            String color = sc.nextLine();
            String sound = sc.nextLine();
            AnimalInfo f = new AnimalInfo(name, color, sound);
            lf.add(f);
            // f.getInfo();
        }

        for (AnimalInfo ai : lf) {
            ai.getInfo();
        }
    }
}