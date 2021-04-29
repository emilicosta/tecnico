package sample.model;

public class Contato {
    //atributo
    private String whatsapp;
    private String email;
    private String twitter;

    //getters e setters

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    //toString
    public String toString(){
        return "Whatsapp: " + whatsapp
                + " E-mail: " + email
                + " Twitter: " + twitter;
    }
}