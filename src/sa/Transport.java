package sa;

public class Transport {
    final String state1 = "운행";
    final String state2 = "차고지행";
    private String stateNow = "운행";

    private int oil = 0;
    private int nowSpeed = 0;
    private int nowCosomer = 0;
    private int totalMoney = 0;


    public String getStateNow() {
        return stateNow;
    }

    public void setStateNow(String stateNow) {
        this.stateNow = stateNow;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getNowSpeed() {
        return nowSpeed;
    }

    public void setNowSpeed(int nowSpeed) {
        this.nowSpeed = nowSpeed;
    }

    public int getNowCosomer() {
        return nowCosomer;
    }

    public void setNowCosomer(int nowCosomer) {
        this.nowCosomer = nowCosomer;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void oil(int oilL) {
        if (oilL > 0) {
            setOil(getOil() + oilL);
            System.out.println("주유량:" + getOil());
            return;
        }
        if (getOil()-oilL>= 0) {
            setOil(getOil() + oilL);
            System.out.println("주유량: " + getOil());
            if (getOil() <= 10) {
                System.out.println("주유가 필요합니다");
            }
        } else {
            setNowCosomer(0);
            setNowSpeed(0);
            setStateNow(state2);
            setTotalMoney(0);
            System.out.println("주유량: " + getOil());
        }

    }
}
