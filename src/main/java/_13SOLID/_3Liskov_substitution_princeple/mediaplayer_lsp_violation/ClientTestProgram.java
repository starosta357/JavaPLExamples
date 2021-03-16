package _13SOLID._3Liskov_substitution_princeple.mediaplayer_lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

    // in any program place it must be possible to change parent object
    // to child one and your program must work the same way.
    // The behavior of @Override method must only extends the behavior of parent
    // but do not change it.
    public static void main(String[] args) {

        List<MediaPlayer> allPlayers = new ArrayList<>();

        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");

        allPlayers.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    public static void playVideoInAllMediaPlayers(final List<MediaPlayer> allPlayers) {
        allPlayers.forEach(MediaPlayer::playVideo);

        // or
//        for(var player : allPlayers) {
//            player.playVideo();
//        }
    }
}