package ivanovkm.java.javatwo.lesson1;

public class RaceMembers {
    ObstacleCourse[] raceMembers;

    public RaceMembers(ObstacleCourse[] teamMembers){
        this.raceMembers = teamMembers;
    }

    public ObstacleCourse[] getMembers(){
        return raceMembers;
    }
}
