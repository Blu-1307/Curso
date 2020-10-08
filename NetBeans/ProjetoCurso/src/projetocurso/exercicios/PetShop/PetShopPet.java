package projetocurso.exercicios.PetShop;

public class PetShopPet {

    private String nomePet;
    private String tipoPet;
    private String corPet;

    public PetShopPet(String nomePet, String tipoPet, String corPet) {
        this.nomePet = nomePet;
        this.tipoPet = tipoPet;
        this.corPet = corPet;
    }

    /**
     * Retorna o nome do pet
     *
     * @return
     */
    public String getNome() {
        return this.nomePet;
    }

    /**
     * Retorna o tipo do pet
     *
     * @return
     */
    public String getTipo() {
        return this.tipoPet;
    }

    /**
     * Retorna a cor do pet
     *
     * @return
     */
    public String getCor() {
        return this.corPet;
    }
}