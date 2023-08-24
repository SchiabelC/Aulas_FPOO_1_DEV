package Atividade03;

public enum CategoriaEnum {
    BRONZE("1° Etapa do curso", 1),PRATA("2° Etapa do curso", 2),OURO("3° Etapa do cuso", 3),DIAMANTE("Etapa final do curso", 4);

    private String categoria;
    private int Etapacategoria;

    CategoriaEnum(String categoria, int etapacategoria) {
        this.categoria = categoria;
        Etapacategoria = etapacategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getEtapacategoria() {
        return Etapacategoria;
    }
}
