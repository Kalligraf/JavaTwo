package ivanovkm.java.javatwo.lesson1;

public class Robot implements ObstacleCourse{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean onObstacleCourse;

    public Robot(){

    }

    public void jumpInfo(){
        System.out.println("Робот прыгает, не выше 50 см");
    }
    public void runInfo(){
        System.out.println("Робот бегает, но не дальше 3000 м");
    }

    public boolean isOnObstacleCourse() {
        return onObstacleCourse;
    }

    public Robot(String name) {
        this.name = name;
        this.maxRunDistance = 3000;
        this.maxJumpHeight = 50;
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
