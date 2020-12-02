package ivanovkm.java.javatwo.lesson1;

public class Cat  implements ObstacleCourse{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean onObstacleCourse;

    public Cat(){

    }

    public Cat(String name) {
        this.name = name;
        this.maxRunDistance = 300;
        this.maxJumpHeight = 150;
        this.onObstacleCourse = true;
    }

    public void jumpInfo(){
        System.out.println("Кошка прыгает, но не выше 150 см");
    }

    public void runInfo(){
        System.out.println("Кошка бегает, но не дальше 300 м");
    }

    public boolean isOnObstacleCourse() {
        return onObstacleCourse;
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
