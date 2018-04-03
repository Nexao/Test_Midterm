/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monopolyreal;

/**
 *
 * @author Nexao
 */
public interface IPiece {
    int getLocation();
    void setLocation(int newLocation);
    IPlayer getPlayer();
    void addPlayer(IPlayer player);
}
