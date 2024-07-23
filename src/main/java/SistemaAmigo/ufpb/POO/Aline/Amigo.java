package SistemaAmigo.ufpb.POO.Aline;

public class Amigo {
    private String nomeAmigo;
    private String emailAmigo;
    private String emailAmigoSorteado;
    private String amigoSecreto;

    public Amigo(String nomeAmigo, String emailAmigo) {
        this.nomeAmigo = nomeAmigo;
        this.emailAmigo = emailAmigo;

    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }
    public void setNomeAmigo(String nome) {
        this.nomeAmigo = nomeAmigo;
    }
    public String getEmailAmigo() {
        return emailAmigo;
    }
    public void setEmailAmigo(String emailAmigoSorteado) {
        this.emailAmigo = emailAmigo;
    }
    public String getEmailDoAmigoSorteado() {
        return emailAmigoSorteado;
    }

    public void setEmailDoAmigoSorteado(String amigoSecreto) {
        this.emailAmigoSorteado = amigoSecreto;
    }

    public void setAmigoSecreto(String amigoSecreto) {
        this.amigoSecreto = amigoSecreto;
    }

    public String getAmigoSecreto() {
        return amigoSecreto;
    }
}


