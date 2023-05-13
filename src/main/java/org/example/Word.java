package org.example;

public class Word {
    private Integer id;
    private String polish;
    private String norwegian;

    public Word() {
    }

    public Word(Integer id, String polish, String norwegian) {
        this.id = id;
        this.polish = polish;
        this.norwegian = norwegian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    public String getNorwegian() {
        return norwegian;
    }

    public void setNorwegian(String norwegian) {
        this.norwegian = norwegian;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", polish='" + polish + '\'' +
                ", norwegian='" + norwegian + '\'' +
                '}';
    }
}