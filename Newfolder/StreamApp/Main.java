public class Main {
    public static void main(String[] args) {
        Video teledrama = new TVSeries();

        // set tvseries data
        teledrama.setName( "Tele Drama");
        teledrama.setDescription("This teledrama is a ....");
        teledrama.setThumbnailImage("Teledrama.jpg");
        teledrama.setCategory("Short");
        teledrama.setRating("8.5*");
        teledrama.setSetOfArtice("Artist 1", "Artist 2", "Artist 3", "Artist 4", "Artist 5");
        teledrama.setLanguage("English");
        ((TVSeries) teledrama).setEpisode("245");

        // display video data
        System.out.println("Name : " + teledrama.getName());
        System.out.println("Description : " + teledrama.getDescription());
        System.out.println("nailImage : " + teledrama.getThumbnailImage());
        System.out.println("Category : " + teledrama.getCategory());
        System.out.println("Rating : " + teledrama.getRating());
        System.out.println("Episode : " + ((TVSeries) teledrama).getEpisode());
        System.out.println("Language : " + teledrama.getLanguage());
        System.out.println("SetOfArtice : " + teledrama.getSetOfArtice());
        

    }
}