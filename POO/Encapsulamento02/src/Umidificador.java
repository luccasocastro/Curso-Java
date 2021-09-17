public class Umidificador implements Ventilador{
    private boolean ligado;
    private boolean freeze;
    private boolean timer;
    private boolean swing;
    private int tempo;
    private int speed;

    public Umidificador() {
        this.ligado = false;
        this.freeze = false;
        this.timer = false;
        this.swing = false;
        this.tempo = 0;
        this.speed = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isFreeze() {
        return freeze;
    }

    public void setFreeze(boolean freeze) {
        this.freeze = freeze;
    }

    public boolean isTimer() {
        return timer;
    }

    public void setTimer(boolean timer) {
        this.timer = timer;
    }

    public boolean isSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void status(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Freeze: " + this.isFreeze());
        System.out.println("Timer: " + this.isTimer() + ", Tempo: " + this.getTempo() + "h");
        System.out.println("Swing: " + this.isSwing());
        System.out.println("Velocidade: " + this.getSpeed());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    @Override
    public void turnOn() {
        if(this.isLigado()){
            System.out.println("O Umidificador já está ligado!");
            return;
        }
        this.setLigado(true);
        this.setSpeed(5);
    }

    @Override
    public void turnOff() {
        if(!this.isLigado()){
            System.out.println("O umidificador já está desligado!");
            return;
        }
        this.setLigado(false);
        this.setFreeze(false);
        this.setTimer(false);
        this.setSwing(false);
        this.setTempo(0);
        this.setSpeed(0);
    }

    @Override
    public void turnFreezeOn() {
        if(this.isFreeze()){
            System.out.println("A função Freeze já está ligada!");
            return;
        }
        this.setFreeze(true);
    }

    @Override
    public void turnFreezeOff() {
        if(!this.isFreeze()){
            System.out.println("A função Freeze já está desligada!");
            return;
        }
        this.setFreeze(false);
    }

    @Override
    public void turnTimerOn(int tempo) {
        if(this.isTimer()) {
            System.out.println("O Timer já está ligado!");
            return;
        }
        if(tempo > 0) {
            this.setTempo(tempo);
        }else{
            System.out.println("Informe um tempo válido!");
        }
        this.setTimer(true);
    }

    @Override
    public void turnTimerOff() {
        if(!this.isTimer()){
            System.out.println("O timer já está desligado!");
            return;
        }
        this.setTimer(false);
    }

    @Override
    public void turnSwingOn() {
        if(this.isSwing()){
            System.out.println("A função Swing já está ligada!");
            return;
        }
        this.setSwing(true);
    }

    @Override
    public void turnSwingOf() {
        if(!this.isSwing()){
            System.out.println("A função Swing já está desligada!");
            return;
        }
        this.setSwing(false);
    }

    @Override
    public void moreSpeed() {
        if(!this.isLigado()){
            System.out.println("O umidificador está desligado!");
            return;
        }
        this.setSpeed(this.getSpeed()+5);
    }

    @Override
    public void lessSpeed() {
        if(!this.isLigado()){
            System.out.println("O umidificador está desligado!");
            return;
        }
        this.setSpeed(this.getSpeed()-5);
    }
}
