package ivanovkm.java.javatwo.lesson1;

public class Treadmill extends StartRace {
    private int length;

    public Treadmill (int length){
        this.length = length;
    }
    @Override
    public  void toStart(ObstacleCourse obstacleCourse){
        obstacleCourse.toRun(length);
    }

    public int getLength() {
        return length;
    }
}
