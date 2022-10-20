package basic;

public class SingleThreadMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        while(true) {
            //Some heavy task
            stringBuilder.append(1);
        }
    }
}
