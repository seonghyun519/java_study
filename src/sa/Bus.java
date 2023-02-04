package sa;

public class Bus extends Transport implements TransportInterface {
    private static int transportNumber;
    final int MAX_COSTOMER = 28; //최대 탑승객
    final int COST = 1000; //요금
    final String state3 = "차고지행";

    public Bus() {
        setTransportNumber(getTransportNumber() + 1);
        System.out.println(getTransportNumber() + "번 버스객체 만들어짐!");
        setOil(100);
    }

    public static int getTransportNumber() {
        return transportNumber;
    }

    public static void setTransportNumber(int transportNumber) {
        Bus.transportNumber = transportNumber;
    }

    @Override
    public void Condition() {
        if (getStateNow()==state1){
            setStateNow(state2);
            setNowCosomer(0);
            setNowSpeed(0);
            setTotalMoney(0);
            System.out.println("상태: " + state2);
        }else {
            setStateNow(state1);
            System.out.println("상태: " + state1);
        }
    }

    @Override
    public void Use(int cosomer) {
        if (this.MAX_COSTOMER > cosomer) {
            this.setNowCosomer(getNowCosomer()+cosomer);
            this.setTotalMoney(COST*cosomer);
            System.out.println("현재 탑승객 수 = " + this.getNowCosomer());
            System.out.println("잔여 승객 수 = " + (this.MAX_COSTOMER-this.getNowCosomer()));
            System.out.println("요금 확인 = " + getTotalMoney());
//            System.out.println("주유량: " + getOil());
        }else {
            System.out.println("최대 승객 수 초과했습니다.");
        }
    }

    @Override
    public void speed() {
        this.setNowSpeed(getNowSpeed()+1);
    }
}
