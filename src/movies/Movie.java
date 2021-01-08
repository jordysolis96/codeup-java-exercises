package movies;

//public class Movie {
//    private String name;
//    private String category;
//
//    public Movie(String movieName, String movieCategory) {
//        this.name = movieName;
//        this.category = movieCategory;
//    }
//
//    public String getMovieName(){
//
//        return this.name ;
//    }
//
//    public String getMovieCategory(){
//
//        return this.category;
//    }
//
//    public void setMovieName(String newName){
//        this.name = newName;
//    }
//
//    public void setMovieCategory(String newCategory){
//        this.category = newCategory;
//    }
//
//}
//-------------------------------Redo for practice--------------------------------
public class Movie{
    private String name;
    private String category;

    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }

    public String setMovieName(String newName){
        return name = newName;
    }

    public String setMovieCatagory(String newCategory){
        return category = newCategory;
    }


}