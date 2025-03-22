package assignmentOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Voter {
    private String voterName;
    private int voterAge;
    private boolean hasVoted;


// no arg constructor
    public Voter() {
    }


    // initialization an object when it is created and also sets initial values
    //for the object's attributes
    public Voter(String voterName, int voterAge) {
        this.voterName = voterName;
        this.voterAge = voterAge;
         this.hasVoted = false;
    }

    public void voterEligibility(){
       if(voterAge >= 18 && !hasVoted){
           hasVoted = true; // to make sure for voted
           System.out.println("you have voted");
       }
        else if (voterAge < 18){
           System.out.println("you are not eligible to vote. you must be 18 or older");
       }
        else {
           System.out.println( voterName + " has already voted");
       }
    }



    public static void main(String[] args) {
        Voter voter = new Voter("Pratik", 20);
        voter.voterEligibility();
        Voter voter1 = new Voter("Manish", 20 );
        voter1.voterEligibility();
        voter.voterEligibility();


    }

}
