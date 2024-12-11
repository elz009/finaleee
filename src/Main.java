public class Main {
    public static void main(String[] args) {

        // Creating genres and authors
        Genre pop = new Genre("POP");
        Author cleanBandit = new Author("Clean", "Bandit");
        Author kavinsky = new Author("Kavinsky", "Kavinsky");
        Author mitski = new Author("Mitski", "Matsubara");

        // Creating music objects
        Music birdsOfAFeather = new Music("Symphony", cleanBandit, pop,
                "https://www.youtube.com/watch?v=V9PVRfjEBTI", 246, 40);
        Music nightCall = new Music("Night Call", kavinsky, pop,
                "https://www.youtube.com/watch?v=k2tRMP-V5y4", 256, 55); // Fixed the syntax error here
        Music realHero = new Music("Real Hero", cleanBandit, pop,
                "https://www.youtube.com/watch?v=fwfjsDsMuz8", 267, 60);
        Music myLoveMineAllMine = new Music("My Love Mine All Mine", mitski, pop,
                "https://www.youtube.com/watch?v=jFBJnbTW_z8", 138, 50);
        Music neverGoneGiveYouAp = new Music("Never Gone Give You Ap", cleanBandit, pop,
                "https://www.youtube.com/watch?v=vnYm_kguurE", 212, 40);

        // Creating users
        User ryan = new User("Ryan Gosling", "POP", 500);
        User elzar = new User("Elzar Zholdoshev", "Metal", 120);

        // Users buying music
        ryan.buyMusic(nightCall, 5);
        elzar.buyMusic(birdsOfAFeather, 3);

        // Display balance and playlist
        ryan.getBalance();
        ryan.getPlaylist();
        elzar.getBalance();
        elzar.getPlaylist();

        // Users listening to music
        ryan.listenMusic(realHero);
        ryan.listenMusic(nightCall);
        elzar.listenMusic(myLoveMineAllMine);

        // Display music stats
        myLoveMineAllMine.getDownloads();
        myLoveMineAllMine.getViews();
        myLoveMineAllMine.getRate();

        // Open video for a specific music
        neverGoneGiveYouAp.openVideo();
    }
}
