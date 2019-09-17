package sample;

import javafx.event.ActionEvent;

public class Controller {


    public void generate (ActionEvent event){
        System.out.println("Generate Maze");

    }

    public void recursiveGo (ActionEvent event){
        System.out.println("Recursive solve");

    }
    public void aStarGo (ActionEvent event){
        System.out.println("A* solve");

    }
}
