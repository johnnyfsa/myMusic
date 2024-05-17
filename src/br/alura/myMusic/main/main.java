package br.alura.myMusic.main;

import br.alura.myMusic.model.Music;
import br.alura.myMusic.model.MyFavorites;
import br.alura.myMusic.model.Podcast;

public class main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("The Chain");
        myMusic.setArtist("Fleetwood Mac");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }
        Podcast myPodcast = new Podcast();
        myPodcast.setHost("Ynnhoj Ramioj");
        myPodcast.setTitle("Vaqueiros do Console");
        myPodcast.setDescription("Corra que a polícia vem aí");
        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites myFaves = new MyFavorites();
        myFaves.addAudio(myPodcast);
        myFaves.addAudio(myMusic);
    }
}
