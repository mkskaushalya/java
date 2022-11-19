//Interfaces
interface Users { // Interfaces
    public void register();
    public void addFavorite();

}

// implement interfaces
class GeneralUser implements Users {
    public void register(){
        // Register
    };
    public void addFavorite(){
        // Add favorite
    };
    public void watchVideo(){
        // play video
    };
    public void manageProfile(){
        // Update / Delete account
    }
}
