package design_patterns.adapter;

//You have an existing class: AdvancedMediaPlayer — it can play mp4 and vlc files, but its interface doesn't match MediaPlayer.
public class AdvancedMediaPlayer {
    public void playMp4(String fileName){
        System.out.println("Playing mp4 file: "+fileName);
    }
    public void playVlc(String fileName){
        System.out.println("Playing vlc file: "+fileName);
    }
}
