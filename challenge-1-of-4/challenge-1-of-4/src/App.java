import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.divisosofttech.Movie;


public class App {
    public static void main(String[] args) throws Exception {
        
        // First Set of Solutions
        levelOne() ;


        // Second Set (Optional) for those who are ready to push the limits
        levelTwoOnlyForTheDareDevils();
        
    }


    /**
     * 
     */
    static void levelOne(){
        // Dataset and code can be added here

        // Questions:

        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here
    List<Movie> l1 = Movie.getMovies();
    System.out.println("Movie with rating 8 and above : ");
	for (Movie m : l1) {
		
			if (m.getRating() >= 8) {
				System.out.println(m);

			}
		}
    
        
        // 2. Find all movies released after the year 2000.
        // Code your solution here
	   System.out.println("Movies released after year 2000 : ");
        for(Movie m1:l1) {
        	if(m1.getReleaseYear()>2000) {
        		System.out.println(m1);
        	}
        }
        
          

        // 3. Get a distinct list of all genres available.
        // Code your solution here
          Set<Movie> set =new HashSet<Movie>();
       

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        System.out.println("Movies that belong to the genre Drama : ");
        for(Movie m3:l1) {
        	 if(m3.getGenre()=="Drama") {
        		 System.out.println(m3);
        	 }
         }
        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
      
        Map<String,String> map=new HashMap<String, String>();



        // 6. Count how many movies belong to each genre.
        // Code your solution here
        
        



        // 7. Find the highest-rated movie.
        // Code your solution here
     
        

        // 8. Get the average rating of all movies.
        // Code your solution here
       
        


        // 9. Find the longest movie (by duration).
        // Code your solution here
        


        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
    System.out.println("Moviie rating between 7 and 9");
    for(Movie m7:l1) {
 	   if(m7.getRating()>=7 && m7.getRating() <=9) {
 		   System.out.println(m7);
 	   }
    }
     

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        

        // 12. Check if any movie has a rating below 5.
        // Code your solution here
    System.out.println("Check if any movie has a rating below 5 : ");
    boolean check=false;
        for(Movie m5:l1) {
        	if(m5.getRating()<5)
        	{
        	check=true;
        	}
        }
        if(check==true) {
       System.out.println("Yes there are movies rated below 5");
        }
        else {
        	System.out.println("No there are no movies rated below 5");
        }
        
        
        
        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        System.out.println("Check if all movies are rated 6 or above ");
        boolean check1=false;
            for(Movie m6:l1) {
            	if(m6.getRating()>=6)
            	{
            	check1=true;
            	}
            }
            if(check1==true) {
           System.out.println("Yes all the movies are rated 6 or above");
            }
            else {
            	System.out.println("No movies are rated 6 or above");
            }


        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
       


        // 15. Get the movie with the shortest duration.
        // Code your solution here
       

        // 16. Find the most recent movie released.
        // Code your solution here
        

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
       


        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
       

          
        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        


       

        // 20. Find the total duration of all movies combined.
        // Code your solution here
       

        

    }


    static void levelTwoOnlyForTheDareDevils(){

         // Complex Questions:

        // 1. Find the top 3 highest-rated movies for each genre.
        // Code your solution here

        // 2. Get a map of the average rating of movies per genre.
        // Code your solution here

        // 3. Find the movie with the maximum duration in each genre.
        // Code your solution here

        // 4. Get a list of movies that have both 'Action' and 'Drama' as genres.
        // Code your solution here

        // 5. Find the second highest-rated movie.
        // Code your solution here

        // 6. Get a list of movies whose title starts with the letter 'A'.
        // Code your solution here

        // 7. Get a map of movie titles and their respective durations in hours and minutes.
        // Code your solution here

        // 8. Find all movies released in the last 10 years.
        // Code your solution here

        // 9. Get a list of movies sorted by rating, and for ties, by title alphabetically.
        // Code your solution here

        // 10. Find the total number of genres that each movie belongs to.
        // Code your solution here

    }
}
