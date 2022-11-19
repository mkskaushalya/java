public class Video {
    private String type = null, name, description, thumbnailImage, category,  rating, language;
    private String[]  setOfArtice = new String[5];


    // video data getter
    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getThumbnailImage(){
        return thumbnailImage;
    }
    public String getCategory(){
        return category;
    }
    public String getRating(){
        return rating;
    }
    public String getLanguage(){
        return language;
    }
    public String getSetOfArtice(){
        return "Actor/Actress : " + "\n01) " + setOfArtice[0]  + "\n02) " + setOfArtice[1] + "\n03) " + setOfArtice[2] + "\n04) " + setOfArtice[3] +  "\n05) " + setOfArtice[4];
    }



    // Video data setter
    public void setName(String newName){
        this.name = newName;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setThumbnailImage(String newThumbnailImage){
        this.thumbnailImage = newThumbnailImage;
    }
    public void setCategory(String newCategory){
        this.category = newCategory;
    }
    public void setRating(String newRating){
        this.rating = newRating;
    }

    public void setLanguage(String newLanguage){
        this.language = newLanguage;
    }

    public void setSetOfArtice(String actor1, String actor2, String actor3, String actor4, String actor5){
        this.setOfArtice[0] = actor1;
        this.setOfArtice[1] = actor2;
        this.setOfArtice[2] = actor3;
        this.setOfArtice[3] = actor4;
        this.setOfArtice[4] = actor5;
    }
    
}

class Movie extends Video{ // Inheritance 
    private String type = "Movie", duration;


    // polymorphism
    public String getType(){// Polymorphism 
        return type;
    }
    public String getDuration(){
        return duration;
    }


    // polymorphism
    public void setType(String newType){// Polymorphism 
        this.type = newType;
    }
    public void setDuration(String newDuration){
        this.duration = newDuration;
    }
}



class TVSeries extends Video{ // Inheritance 
    private String type = "TV Series", episode;

    public String getType(){
        return type;
    }
    public String getEpisode(){
        return episode;
    }

    
    public void setType(String newType){// Polymorphism 
        this.type = newType;
    }
    public void setEpisode(String newEpisode){
        this.episode = newEpisode;
    }
}