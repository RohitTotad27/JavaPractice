package javapractice.practice;

class SingletonEx {
    private static SingletonEx singletonEx;
    private SingletonEx() {
    }
    static SingletonEx getInstance() {
        //If obj is not craeted then
        if (singletonEx == null) {
            singletonEx = new SingletonEx();
        }
        return singletonEx;
    }
    public void getConnection(){
        System.out.println("You are now connected!");
    }
}
class Main{
    public static void main(String[] args) {
        SingletonEx s1;

        s1 = SingletonEx.getInstance();
        s1.getConnection();
    }
}
