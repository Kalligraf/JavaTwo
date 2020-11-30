package ivanovkm.java.javatwo.lesson1;

public class Rights {
    StartRace[] startRaces;

    public Rights(StartRace[] obstacles){
        this.startRaces = obstacles;
    }

    public void toStart(RaceMembers raceMembers){
        ObstacleCourse[] teamMembers = raceMembers.getMembers();
            for (ObstacleCourse c: teamMembers){
                for (StartRace o: startRaces){
                    o.toStart(c);
                    if (!c.isOnObstacleCourse()) break;
                }
            }
    }

}
