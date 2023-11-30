package com.KiraYagamov.DaryaLessons.SeaBattle;

public class Cell {
    boolean isFilled;
    boolean isAttacked;
    boolean isOccupied;
    public Cell(boolean isFilled){
        this.isFilled = isFilled;
        this.isAttacked = false;
    }
    public Cell(){
        isFilled = false;
        isAttacked = false;
    }
    public void fillCell(){
        isFilled = true;
    }
    public void attackCell(){
        isAttacked = true;
    }
    public void occupy(){
        isOccupied = true;
    }
    public String getCell(){
        if(isFilled){
            return "1";
        }
        else if(isOccupied){
            return "2";
        }
        else{
            return "0";
        }
    }
    public boolean getOccupied(){
        return isOccupied;
    }
}