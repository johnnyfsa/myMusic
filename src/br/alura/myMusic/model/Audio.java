package br.alura.myMusic.model;

public class Audio {
    private String title;
    private double duration;
    private int rating;
    private int totaTimesPlayed;
    private int likeCOunt;

    public double getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }

    public int getTotaTimesPlayed() {
        return totaTimesPlayed;
    }

    public int getLikeCOunt() {
        return likeCOunt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void like()
    {
        this.likeCOunt++;
    }

    public void play()
    {
        this.totaTimesPlayed++;
    }
}
