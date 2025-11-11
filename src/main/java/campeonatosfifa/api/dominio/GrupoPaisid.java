package campeonatosfifa.api.dominio;

public class GrupoPaisid {

    private int grupo;
    private int pais;

    public GrupoPaisid() {
    }

    public GrupoPaisid(int grupo, int pais) {
        this.grupo = grupo;
        this.pais = pais;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    
}
