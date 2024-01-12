package controller;
import adapterDemo.AudioPlayer;

public class AdapterLauncher {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        System.out.println("Playing MP3 file:");
        audioPlayer.play("mp3", "beyond_the_horizon.mp3");

        System.out.println("\nPlaying MP4 file:");
        audioPlayer.play("mp4", "alone.mp4");

        System.out.println("\nPlaying VLC file:");
        audioPlayer.play("vlc", "far_far_away.vlc");

        System.out.println("\nPlaying AVI file:");
        audioPlayer.play("avi", "mind_me.avi");


    }
}
