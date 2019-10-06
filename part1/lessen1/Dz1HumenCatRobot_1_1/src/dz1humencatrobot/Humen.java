/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dz1humencatrobot;

import dz1humencatrobot.CanJump;
import dz1humencatrobot.CanRun;

/**
 *
 * @author safrolov
 */
public class Humen implements CanJump, CanRun,Sthing{
    @Override
    public int jump(){
        int high=1;
        System.out.println("Humen can jump on " + high + " meter");
        return high;
    }
    
    @Override
    public int run(){
        int dis=1000;
        System.out.println("Humen can run  " + dis + " meter");
        return dis;       
    }
    
    @Override
    public String getInfo() {
        return "Humen";
    }
}
