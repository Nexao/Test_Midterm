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
public interface IGameController {
    void move(IPlayer player) throws Exception;
    IGameController connect(IPlayer player, IPiece piece);
    void startGame();
}
