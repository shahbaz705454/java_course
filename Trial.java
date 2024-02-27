import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class HockeyPlayer{

    String name;
    int no_of_matches;
    int total_goals;
     int goal_avg;

    HockeyPlayer(String name,int no_of_matches,int total_goals){
        this.name=name;
        this.no_of_matches=no_of_matches;
        this.total_goals= total_goals;
    }

    public  int goalAavg(){
        goal_avg= total_goals/no_of_matches;
        return goal_avg;
    }
    void printDetail(){
        System.out.println("Name is : "+ name);
        System.out.println("Total matches : "+ no_of_matches);
        System.out.println("Total goals : " + total_goals);
    }
}
public class Trial {

    public static void main(String[] args) {

        HockeyPlayer shahbaz = new HockeyPlayer("mohd",5,20);
        shahbaz.printDetail();
        System.out.println(shahbaz.goalAavg());







    }





}