package projetocurso.exercicios.CadUsuarioCarro;

public class CarroUsuario {

    private String nomeCarro;
    private int anoCarro;

    /**
     * Seta o nome e ano do carro
     *
     * @param nomeCarro
     * @param anoCarro
     */
    public CarroUsuario(String nomeCarro, int anoCarro) {
        this.nomeCarro = nomeCarro;
        this.anoCarro= anoCarro;
    }

    /**
     * Retorna o nome do carro
     *
     * @return
     */
    public String getNomeCarro() {
        return this.nomeCarro;
    }

    /**
     * Retorna o ano do carro
     *
     * @return
     */
    public int getAnoCarro() {
        return this.anoCarro;
    }
}
