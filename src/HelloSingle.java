public class HelloSingle {
    public static void main(String[] args) {
        SingletonEx1 se1;
        se1=SingletonEx1.getInstance();
        se1.connection();
    }
}
