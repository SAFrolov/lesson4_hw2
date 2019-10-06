/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz1humencatrobot;

import pr.Wall;
import pr.RunPath;
import pr.Pripatstvie;
import dz1humencatrobot.sth.Sthing;
import dz1humencatrobot.sth.Cat;
import dz1humencatrobot.sth.Humen;
import dz1humencatrobot.sth.Robot;

/**
 *
 * @author safrolov
 */
public class Dz1HumenCatRobot_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humen h = new Humen();
        Cat c = new Cat();
        Robot r = new Robot();
        
        Pripatstvie [] myPrip = new Pripatstvie[] {new Wall(1), 
            new RunPath(50), new Wall(2), new RunPath(100),new RunPath(3),new Wall(2),new RunPath(150)};
        Sthing [] mySt = new Sthing []{new Humen(), new Cat(), new Humen(), new Robot()};
        
        for (int i = 0; i < mySt.length; i++) {
            System.out.println(mySt[i].getInfo());
            for (int j = 0; j < myPrip.length; j++) {
                System.out.println(myPrip[j].getInfo());
                if (myPrip[j].doit(mySt[i])==false){
                    System.out.println("finished");
                    System.out.println();
                    break;
                }
                    
                    
            }
 
        }
    }
    
}
