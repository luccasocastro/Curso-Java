public class Principal {
    public static void main(String[] args) {
        Umidificador u1 = new Umidificador();
        u1.status();
        u1.turnOn();
        u1.status();
        u1.turnTimerOn(8);
        u1.turnFreezeOn();
        u1.moreSpeed();
        u1.status();
    }
}
