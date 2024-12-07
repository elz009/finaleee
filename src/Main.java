public class Main {

    public static void main(String[] args) {

        Genre pop = new Genre("POP");
        Author clean_bandit = new Author("Clean", "Bandit");
        Author kavinsky = new Author("Kavinsky", "Kavinsky");
        Author mitski = new Author("Mitski", "Matsubara");

//
        Music symphony = new Music("symphony",  clean_bandit, pop,
                "https://www.youtube.com/watch?v=aatr_2MstrI", 246, 40);
        Music night_call = new Music("Night call",kavinsky, pop,
                "https://www.youtube.com/watch?v=MV_3Dpw-BRY", 256, 55);
        Music real_hero = new Music("Real Hero", clean_bandit,pop,
                "https://www.youtube.com/watch?v=BHgYtKkSEDA",267, 60);
        Music my_love = new Music("My Love Mine All Mine ", mitski, pop,
                "https://www.youtube.com/watch?v=CwGbMYLjIpQ", 138, 50);

        Music never_gone = new Music("Never Gone give you ap", clean_bandit, pop,
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 212, 40);

        User Ryan = new User("Ryan Gosling", "POP", 500);
        User Temi = new User("Temirlan Emilbekov", "Metal", 120);

        Ryan.buyMusic(night_call, 5);


//        Ryan.getBalance();
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(my_love, 5);
//        Ryan.getBalance();
//        Ryan.getPlaylist();

//        Temi.getBalance();
//        Temi.buyMusic(symphony);
//        Temi.buyMusic(night_call);
//        Temi.buyMusic(my_love);
//        Temi.buyMusic(my_love);
//        Temi.buyMusic(my_love);
//        Temi.cashIn(700);
//        Temi.buyMusic(my_love, 0);
//        Temi.buyMusic(my_love, -1);
//        Temi.buyMusic(my_love, 3);
//        Temi.buyMusic(subeme);
//        Temi.buyMusic(real_hero);
//        Temi.getBalance();
//        Temi.getPlaylist();
//
//        Ryan.listenMusic(real_hero);
//        Ryan.listenMusic(night_call);
//        Ryan.listenMusic(my_love);
//        Ryan.listenMusic(my_love);
//        Ryan.listenMusic(my_love);
//        Ryan.listenMusic(my_love);
//
//        Temi.listenMusic(my_love);
//        Temi.listenMusic(my_love);
//        Temi.listenMusic(my_love);
//
//        my_love.getDownloads();
//        my_love.getViews();
//        my_love.getRate();

        never_gone.openVideo();

    }

}