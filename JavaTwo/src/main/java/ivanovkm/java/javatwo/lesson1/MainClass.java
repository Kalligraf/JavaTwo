package ivanovkm.java.javatwo.lesson1;

public class MainClass {

    public static void main(String[] args) {

        Cat catInfo = new Cat();
        catInfo.jumpInfo();
        catInfo.runInfo();
        Human humanInfo = new Human();
        humanInfo.jumpInfo();
        humanInfo.runInfo();
        Robot robotInfo = new Robot();
        robotInfo.jumpInfo();
        robotInfo.runInfo();

        ObstacleCourse[] obstacleCourse = {new Human("Усейн Болт"), new Cat("Васька"), new Robot("Валли")};

//Выбираем параметры полосы препятствий:
        Treadmill treadmill = new Treadmill(1000);
        Wall wall = new Wall(75);
        StartRace[] startRaces = {treadmill, wall};
        System.out.println("\nПолоса препятствий: " + "\n   беговая дорожка - "+treadmill.getLength()+" м;\n   стена - "+wall.getHeight()+" см.");

        RaceMembers raceMembers = new RaceMembers(obstacleCourse);
        Rights rights = new Rights(startRaces);

        System.out.println("\nУчасники проходят полосу препятствий\n");
        rights.toStart(raceMembers);
    }
}
