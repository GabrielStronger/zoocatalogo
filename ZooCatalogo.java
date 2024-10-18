// Classe Animal
class Animal {
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }

    public String nome() {
        return nome;
    }

    public int comprimento() {
        return comprimento;
    }

    public int patas() {
        return patas;
    }

    public String cor() {
        return cor;
    }

    public String ambiente() {
        return ambiente;
    }

    public float velocidade() {
        return velocidade;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void alteraPatas(int patas) {
        this.patas = patas;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public void alteraAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void dados() {
        System.out.println("------------------------------");
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }
}

// Classe Peixe
class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
        super(nome, "Cinzento", "Mar", comprimento, velocidade, 0);
        this.caracteristica = caracteristica;
    }

    public String caracteristica() {
        return caracteristica;
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Caracteristica: " + caracteristica);
    }
}

// Classe Mamifero
class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, "Terra", comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    public String alimento() {
        return alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}

// Classe principal para testar o código
public class ZooCatalogo {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0f, 4);
        camelo.dados();

        Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 300, 1.5f);
        tubarao.dados();

        Mamifero ursoCanada = new Mamifero("Urso-do-canadá", "Vermelho", "Mel", 180, 0.5f, 4);
        ursoCanada.dados();
    }
}
