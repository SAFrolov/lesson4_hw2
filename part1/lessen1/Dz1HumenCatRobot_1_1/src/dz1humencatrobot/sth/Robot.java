/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz1humencatrobot.sth;

import dz1humencatrobot.sth.Sthing;
import dz1humencatrobot.CanJump;
import dz1humencatrobot.CanJump;
import dz1humencatrobot.CanRun;
import dz1humencatrobot.CanRun;

/**
 *
 * @author safrolov
 */
public class Robot implements CanJump, CanRun, Sthing{
    @Override
    public int jump(){
        int high=10;
        System.out.println("Robot can jump on " + high + " meter");
        return high;
    }
    
    @Override
    public int run(){
        int dis=10000;
        System.out.println("Robot can run  " + dis + " meter");
        return dis;       
    } 
    
    @Override
    public String getInfo() {
        return "Robot";
    }
}
