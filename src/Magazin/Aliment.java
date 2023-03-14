package Magazin;

enum Categorie {
    LACTATE,
    PAINE,
    MEZELURI
}

public class Aliment {
    private Long dataExpirarii;
    private String ingrediente;
    private Double pret;
    private final Double calorii;
    Categorie tipAliment;

    public Aliment(Long dataExpirarii, String ingrediente, Double pret, Double calorii, Categorie tipAliment) {
        this.dataExpirarii = dataExpirarii;
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.calorii = calorii;
        this.tipAliment = tipAliment;
    }

    public Long getDataExpirarii() {
        return dataExpirarii;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public Double getPret() {
        return pret;
    }

    public Double getCalorii() {
        return calorii;
    }

    public Categorie getTipAliment() {
        return tipAliment;
    }

    public void setDataExpirarii(Long dataExpirarii) {
        this.dataExpirarii = dataExpirarii;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setTipAliment(Categorie tipAliment) {
        this.tipAliment = tipAliment;
    }

    @Override
    public String toString() {
        return "Aliment{" +
                "dataExpirarii=" + dataExpirarii +
                ", ingrediente='" + ingrediente + '\'' +
                ", pret=" + pret +
                ", calorii=" + calorii +
                ", tipAliment=" + tipAliment +
                '}';
    }
}
