package sa;

public interface TransportInterface {
    public abstract void Condition(); //차량 현재 상태
    public abstract void Use(int cosomer); //탑승 인원 및 탑승가능 여부
    public abstract void speed(); //속도
}