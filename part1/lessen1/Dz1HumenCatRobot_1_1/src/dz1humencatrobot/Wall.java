/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz1humencatrobot;

import dz1humencatrobot.Pripatstvie;
import dz1humencatrobot.CanJump;

/**
 *
 * @author safrolov
 */
public class Wall implements Pripatstvie{
    private int high;

    public Wall(int high) {
        this.high = high;
    }
    
    
    public boolean jumpWall(Sthing cj){
        if(cj.jump()>=this.high){
            System.out.println("Jumped!");
            return true;
        }
            
        else
        {
           System.out.println("Didn't jump!");
           return false;
        }            
    }

    @Override
    public boolean doit(Sthing st) {
        return jumpWall(st);
    }
    
    @Override
    public String getInfo() {
        return "Wall " + high;
    }
}
