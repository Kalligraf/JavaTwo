package ivanovkm.java.javatwo.lesson1;

public class Wall extends StartRace {
    private  int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public  void  toStart(ObstacleCourse obstacleCourse){
        obstacleCourse.toJump(height);
    }

    public int getHeight() {
        return height;
    }
}