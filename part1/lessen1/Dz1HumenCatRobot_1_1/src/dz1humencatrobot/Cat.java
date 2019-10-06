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
public class Cat implements CanJump, CanRun, Sthing{
    @Override
    public int jump(){
        int high=5;
        System.out.println("cat can jump on " + high + " meter");
        return high;
    }
    
    @Override
    public int run(){
        int dis=100;
        System.out.println("Cat can run  " + dis + " meter");
        return dis;       
    }    

    @Override
    public String getInfo() {
        return "Cat";
    }
}
