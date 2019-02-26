package pacote.teste.TV;

public class Tv {

    //Atributos
    private boolean ligada = false;
    private int volume;
    private int canal = 3;
    private String modelo;

    //Construtor que passa o modelo
    public Tv(String modelo) {
        this.modelo = modelo;
        this.ligada = false;
    }

    //metodo para ligar a TV
    public boolean ligarTv() {
        if (this.ligada == false) {
            this.ligada = true;
            System.out.println("TV " + this.modelo + " foi ligada");

        }
        return true;
    }

    //método para desligar a TV
    public boolean desligarTv() {
        if (this.ligada == true) {
            this.ligada = false;
            System.out.println("TV " + this.modelo + " foi desligada");
        }
        return false;
    }

    //método para aumentar o volume
    public void aumentarVolume() {
        if (this.ligada) {
            volume++;
            System.out.println("TV " + this.modelo + " Volume: " + volume);
        } else {
            System.out.println("TV está desligada, por favor ligue a TV!!");
        }

    }

    //método para definir o volume
    public void definirVolume(int volume) {
        if (this.ligada) {
            this.volume = volume;
            System.out.println("TV " + this.modelo + " Volume: " + volume);
        } else {
            System.out.println("Ligue a TV");
        }

    }

    //metodo para diminuir o volume
    public void diminuirVolume() {
        if (this.ligada) {
            this.volume--;
            System.out.println("TV " + this.modelo + " Volume: " + volume);
        }
    }

    //método para aumentar o canal
    public void canalMais() {
        if (this.ligada == true && this.canal >= 3) {
            this.canal++;
            informacaoCanal();
        }else{
            System.out.println("Não foi Possivel mudar o canal da TV pois ela está desligada");
        }

    }

    //metodo para definir o canal
    public void canalMais(int definirCanal) {
        if (this.ligada == true && this.canal >= 3) {
            this.canal = definirCanal;
            informacaoCanal();
        }else{
            System.out.println("Não foi Possivel mudar o canal da TV pois ela está desligada");
        }

    }

    //metodo para diminuir o canal
    public void canalMenos() {
        if (this.ligada == true && this.canal >= 3) {
            this.canal--;
            informacaoCanal();
        }else{
            System.out.println("Não foi Possivel mudar o canal da TV pois ela está desligada");
        }

    }

    //metodo para obter informações da tv
    public void info() {
        if (this.ligada == true) {
            System.out.println("");
            System.out.println("TV " + this.modelo);
            System.out.println("Volume atual: " + this.volume);
            System.out.println("Canal Atual: " + this.canal);
            System.out.println("");
        } else {
            System.out.println("Não foi possivel obter informações da Tv!!");
        }

    }

    public void informacaoCanal() {
        if (this.canal == 3) {
            System.out.println("Canal " + this.canal + ": A/V");
        } else if (this.canal == 4) {
            System.out.println("Canal " + this.canal + ": SBT");
        } else if (this.canal == 5) {
            System.out.println("Canal " + this.canal + ": Record");
        } else if (this.canal == 6) {
            System.out.println("Canal " + this.canal + ": RedeTV");
        } else if (this.canal == 7) {
            System.out.println("Canal " + this.canal + ": Band");
        } else if (this.canal == 8) {
            System.out.println("Canal " + this.canal + ": Record");
        } else if (this.canal == 11) {
            System.out.println("Canal " + this.canal + ": Globo");
        } else {
            System.out.println("Canal " + this.canal + " Sem Sinal");
        }
    }

}
