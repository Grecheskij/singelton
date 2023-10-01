
public class Main {
    public static void main(String[] args) {
        Kazakhstan kazakhstan = Kazakhstan.getInstance("Asia", "Astana", 18000000);
        System.out.println("Hi from Kazakhstan.");
        if(Kazakhstan.getInstance() != null){
            kazakhstan.getInfo();
        }
        Kazakhstan kazakhstan1 = Kazakhstan.getInstance("North America", "Washington", 10);
        kazakhstan1.getInfo();
    }
}























