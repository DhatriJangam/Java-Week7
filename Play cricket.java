interface CricketPlayer {
    void beABatter();
    void beABowler();
}

class PlayCricket implements CricketPlayer {
    public void beABatter() {
        System.out.println("Playing as a batter.");
    }

    public void beABowler() {
        System.out.println("Playing as a bowler.");
    }

    public static void main(String[] args) {
        PlayCricket player = new PlayCricket();
        player.beABatter();
        player.beABowler();
    }
}
