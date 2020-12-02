package ivanovkm.java.javatwo.lesson1;

public class Human implements ObstacleCourse{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean onObstacleCourse;

    public Human(){

    }

    public void jumpInfo(){
        System.out.println("Человек прыгает, но не выше 100 см");
    }
    public void runInfo(){
        System.out.println("Человек бегает, но не дальше 1000 м");
    }
    public boolean isOnObstacleCourse() {
        return onObstacleCourse;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 1000;
        this.maxJumpHeight = 100;
        this.onObstacleCourse = true;
    }

    public void toRun(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал беговую дорожку");
        } else {
            System.out.println(name + " не смог пробежать");
            onObstacleCourse = false;
        }
    }

    public void toJump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " успешно преодолел препятствие");
        } else {
            System.out.println(name + " не смог преодолеть препятствие");
            onObstacleCourse = false;
        }
    }
}
