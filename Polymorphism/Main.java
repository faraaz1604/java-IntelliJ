package Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Movie movie = new Adventure("Jumanji");
//        movie.watchMovie();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Please type\n A for Adventure Movie type\n, C for Comedy Movie type\n, " +
                    "and Q to Quit : ");
            String type = sc.nextLine();
            if("qQ".contains(type)){
                break;
            }
            System.out.println("which movie would you like to watch please type: ");
            String title = sc.nextLine();
            Movie newMovie = Movie.getMovie(type,title);
            newMovie.watchMovie();
        }



    }
}
