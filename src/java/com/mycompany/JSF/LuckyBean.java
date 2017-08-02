/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.JSF;

import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Shivan
 */
@Named(value = "luckyBean")
@Dependent
public class LuckyBean {
    private int luckyNumber;
    public LuckyBean() {
        Random r = new Random();
        luckyNumber = r.nextInt(1000000 - 1) + 1;
    }
    /**
     * @return the luckyNumber
     */
    public int getLuckyNumber() {
        return luckyNumber;
    }

    /**
     * @param luckyNumber the luckyNumber to set
     */
    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    
    
}
