import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual() {
        System.out.println("--------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if(Objects.equals(tipo, "cc")) {
            this.setSaldo(50f);
        }else if(Objects.equals(tipo, "cp")) {
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        }else if(this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depositado realizado na conta de " + this.getDono());
        }else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float v) {
        if(this.getStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if(Objects.equals(this.getTipo(), "cc")) {
            v = 12;
        }else if(Objects.equals(this.getTipo(), "cp")) {
            v = 20;
        }
        if(this.getStatus()) {
            if(this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por " + this.getDono() + " com sucesso!");
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Impossível pagar!");
        }
    }
}
