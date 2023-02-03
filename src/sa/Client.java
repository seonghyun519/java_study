package sa;

public class Client {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.Use(2);
        bus1.oil(-50);
        bus1.Condition();//다시 출발해줘야하지 않나요~
        bus1.oil(10);
        bus1.Use(60);
        bus1.Use(5);
        bus1.oil(-55); //차고지를 갔는데 왜애애 손님이 타고있나요? 요금도 이상해~
    }
}
