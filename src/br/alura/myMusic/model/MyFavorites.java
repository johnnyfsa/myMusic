package br.alura.myMusic.model;

public class MyFavorites {
    public void addAudio(Audio audio)
    {
        if(audio.getRating()>=9)
        {
            System.out.println("nice!" + audio.getTitle()+ "is one of the most played in our platform");
        }
        else
        {
            System.out.println(audio.getTitle() + " is not performing so great");
        }
    }
}
