package com.KiraYagamov.DaryaLessons.SeaBattle;

public class Ship {
    boolean horizontal;
    int x, y;
    Cell[][] grid;
    int length;
    public Ship(boolean horizontal, int x, int y, Cell[][] grid, int length){
        this.horizontal = horizontal;
        this.x = x;
        this.y = y;
        this.grid = grid;
        this.length = length;
    }

    public boolean setShip(){
        if(horizontal){
            if(x+length < grid.length){
                boolean canSet = true;
                for(int i = 0; i < length; i++){
                    if(grid[y][x+i].getOccupied()){
                        canSet = false;
                        break;
                    }
                }
                if(canSet) {
                    for (int i = 0; i < length; i++) {
                        grid[y][x + i].fillCell();
                        grid[y][x + i].occupy();

                        grid[y][x + i + 1].occupy();
                        grid[y][x + i - 1].occupy();
                        grid[y + 1][x + i].occupy();
                        grid[y - 1][x + i].occupy();
                        grid[y + 1][x + i + 1].occupy();
                        grid[y - 1][x + i + 1].occupy();
                        grid[y + 1][x + i - 1].occupy();
                        grid[y - 1][x + i - 1].occupy();
                    }
                }
                else{
                    return false;
                }
            }
        }
        else{
            if(y+length < grid.length){
                boolean canSet = true;
                for(int i = 0; i < length; i++){
                    if(grid[y+i][x].getOccupied()){
                        canSet = false;
                        break;
                    }
                }
                if(canSet) {
                    for (int i = 0; i < length; i++) {
                        grid[y + i][x].fillCell();
                        grid[y + i][x].occupy();

                        grid[y + i][x + 1].occupy();
                        grid[y + i][x - 1].occupy();
                        grid[y + 1 + i][x].occupy();
                        grid[y - 1 + i][x].occupy();
                        grid[y + 1 + i][x + 1].occupy();
                        grid[y - 1 + i][x + 1].occupy();
                        grid[y + 1 + i][x - 1].occupy();
                        grid[y - 1 + i][x - 1].occupy();
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}