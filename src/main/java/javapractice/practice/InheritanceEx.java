package javapractice.practice;

public class InheritanceEx {
    public static void main(String[] args) {
        class Animal{
            void walk(){
                System.out.println("I can walk!");
            }
        }
        class Bird extends Animal{

            @Override
            void walk(){
                System.out.println("I am a Bird and I can walk");
            }
            void fly(){
                System.out.println("I can fly!");
            }
            void sing(){
                System.out.println("I can Sing!");
            }
        }
        Bird bird = new Bird();
        bird.fly();
        bird.walk();
        bird.sing();
    }
}
