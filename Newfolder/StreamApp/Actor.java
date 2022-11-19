// Abstraction
abstract class Actor {
    private String name, rating, gender; // Encapsulaton 

    // get methods
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    public String getRating(){
        return rating;
    }
    // end get methods
    



    // Abstract
    public abstract void setArtistType();


    // set methods
    public void setName(String newName){
        this.name = newName;
    }
    public void setGender(String newGender){
        this.gender = newGender;
    }

    public void setRating(String newRating){
        this.rating = newRating;
    }
    // end set methods

    public String getAssociated(){
        return "Artist Associated Videos";
    }
    

}

class TVArtice extends Actor{
    public String type;
    public void setArtistType(){
        type = "TV Series";
    }
}
class MovieArtice extends Actor{
    public String type;
    public void setArtistType(){
        type = "Movie";
    }
}

class MultiArtist extends Actor{
    public String type;
    @Override
    public void setArtistType() {
       type = "Multi Artist";        
    }
    
}

