
import java.awt.Canvas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jmccabe
 */
public class Game extends Canvas implements Runnable{
    
    public static final int WIDTH = 640, HEIGHT = WIDTH /12 *9;
    public Game(){
        new Window(WIDTH, HEIGHT, "Let's Build a Game!", this);
    }

   public synchronized void start(){
       
   }
   
   public void run(){
       
   }
   
   public static void main(String args[]){
       new Game();
   
   
    
    }
}
