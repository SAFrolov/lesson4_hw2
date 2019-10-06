/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr;

import dz1humencatrobot.sth.Sthing;
import dz1humencatrobot.CanRun;
import pr.Pripatstvie;

/**
 *
 * @author safrolov
 */
public class RunPath implements Pripatstvie{
    private final int lenght;

    public RunPath(int lenght) {
        this.lenght = lenght;
    }
    
    
    public boolean runRunPath(Sthing cr){
        if(cr.run()>=this.lenght){
            System.out.println("Run");
            return true;
        }            
        else
        {
            System.out.println("Didn't run");
            return false;
        }            
    }
    
        @Override
    public boolean doit(Sthing st) {
        return runRunPath(st);
    }

    @Override
    public String getInfo() {
        return "Run Path "+ lenght;
    }
}
