package design_patterns.adapter;
//You create a bridge called MediaAdapter — it adapts AdvancedMediaPlayer to MediaPlayer.
public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String fileName) {
      if(fileName.endsWith(".mp4")){
          advancedMediaPlayer.playMp4(fileName);
      }else if(fileName.endsWith(".vlc")){
          advancedMediaPlayer.playVlc(fileName);
      }
    }
}
