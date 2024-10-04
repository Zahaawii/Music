/*
Create an enum named Genre that represents different music genres. Each
genre should have a descriptive attribute explaining its characteristics

The Genre enum should include the following values (Done)
Each enum value should have a description string that explains the genre (Done)

1) Create the Enum:
Define the Genre enum in a separate file
Include a constructor and a method to return the description of each genre.

done
 */

//Created an enum class to take the enums genres
public enum Genre {

    POP("Popular music"),
    ROCK("Hardcore white music"),
    HIP_HOP("Hoppy de hop"),
    R_AND_B("Chill and dirty"),
    COUNTRY("Raging negros");
    private String desc;

    //initialize a constructor
    Genre(String desc){
        this.desc = desc;
    }

    //Creating a getter method to showcase the description
    public String getDesc() {
        return desc;
    }
}
