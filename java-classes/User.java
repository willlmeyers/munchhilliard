import java.util.Random;
import java.time.LocalDate;

/**
  describe this class
*/
public class User
{
    // declare private instance vars
    private Restaurant favRestaurant;
    private FoodReview lastReview;
    private int reviewCount;
    private double reviewScoreTotal;
    private int totalLikes;
    private LocalDate lastLogin;
    private int userAge;
    private String userName;
    private String name;
    private LocalDate birthday;
    private String gender;
    private String userEmail;
    private String location;
    private int followers;
    // add more??

    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        // TO DO
    }

    // accessors and mutators here
  
    /**
      sets the users's email
      @param String the users Email
    */
    public void setUserEmail(String _userEmail){
      userEmail = _userEmail;
    }
  
   /**
      returns the users's email
       @return returns the users email
    */
    public String getUserEmail(){
      return userEmail;
    }
  
    /**
      setUserLocation(String location)
      Sets the user's location 
      
    */
  
     public void setLocation(String _location){
      // TO DO
    }
  
    /**
    getLocation()
    Acesses the user location 
    
    
    */
     public String getLocation(){
      return ""; // TO DO
    }
  
     /**
        returns the total number of likes
        @return returns the total amount of likes for the user <3
    */
    public int getTotalLikes(){
      return totalLikes;
    }

  
     /**
        sets the total number of likes
        @param int total like amount <3
    */
    public void setTotalLikes(_totalLikes){
      totalLikes = _totalLikes;
    }
  
    /**
    return the users age
    
    */
    public int getUserAge(){
      return 0; // TO DO
    }
  
    /**
    set the users gender
    
    */ 
    public void setUserGender(String _gender){
      // TO DO
    }
  
    public double getAverageReview()
    {
      return 0.0; // TO DO
    }
  
    /**
      Returns the user name
      
    */
    public String getUserName()
    {
      return ""; // TO DO
    }
  
     /**
      Returns the gender of the user
      
    */
    public String userGender();
    {
      return ""; // TO DO
    }

    /**
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      // TO DO
    }
  
    /**
      Sets the user's name
      
    */
    public void setUserName(String _userName)
    {
      // TO DO
    }
  
  
    /**
      Sets the age of the user
      
    */
    public void setUserAge(int _age)
    {
      // TO DO
    }
  

    /**
      setName(String _name)
      Sets the user's name to a string.
      
    */
    public void setName(String _name)
    {
      // TO DO
    }
    
    /**
      getName()
      Accesses the name of the user.
      
    */
    public String getName()
    {
      return ""; // TO DO
    }
  
    /**
      Accesses the last login day of the user.
      
    */
    public LocalDate getLastLogin()
    {
      return null; // TO DO
    }
  
    /**
      Sets the last login of the user to the current date/time
    */
    public void setLastLogin(){
      // TO DO
    }
  
    /**
      Sets the user's birthday
    */
    public void setBirthday(LocalDate _birthday){
      // TO DO
    }
  
    /**
    getBirthday()
    Accesses the user's birthday
    
    */
    public LocalDate getBirthday(){
      return null; // TO DO
    }
  
    /**
      setUserEmail(String email)
      Sets the user's email
      
    */
    public void setUserEmail(String email){
      // TO DO
    }
    
    /**
      getUserEmail()
      Accesses the user's email
      
    */
    public String getUserEmail(){
      return ""; // TO DO
    }
      
    /**
      getFollowers()
      Returns the user's followers.
      
    */
    public int getFollowers(){
      return 0; // TO DO
    }

    /**
      setfollowers(int _followers)
      Sets the user's followers
      
    */
    public void setFollowers(String _followers){
      // TO DO
    }
}
