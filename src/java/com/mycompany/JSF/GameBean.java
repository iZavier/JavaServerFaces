/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.JSF;

import java.io.Serializable;
import java.util.Random;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Shivan
 */
@Named(value = "gameBean")
@ManagedBean
@SessionScoped
public class GameBean implements Serializable {
    private int played;
    private int number;
    private int luckyNumber;
    private String result = "Sorry you Lose";
    /**
     * Creates a new instance of LuckyBean
     */
    public GameBean() {

    }

    /**
     * @return the played
     */
    public int getPlayed() {
        return played;
    }

    /**
     * @param played the played to set
     */
    public void setPlayed(int played) {
        this.played = played;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the luckyNumber
     */
    public int getLuckyNumber() {
        Random r = new Random();
        luckyNumber = r.nextInt(1000000 - 1) + 1;
        played += 1;
        if (getNumber() == luckyNumber) {
            result = "You win";
        } else {
            result = "You lose!";
        }
        return luckyNumber;
    }

    /**
     * @param luckyNumber the luckyNumber to set
     */
    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
    /**
     * Gets the lucky Number
     * @return luckyNumber
     */

    
}
