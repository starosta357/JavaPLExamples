package _13SOLID._3Liskov_substitution_princeple.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {

    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
