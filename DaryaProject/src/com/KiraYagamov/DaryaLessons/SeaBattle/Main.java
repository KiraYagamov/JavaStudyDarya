package com.KiraYagamov.DaryaLessons.SeaBattle;

public class Main {
    Cell[][] grid;

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
    public void start(){
        grid = generateGrid(10);
        Ship ship = new Ship(true, 4, 4, grid, 4);
        Ship ship1 = new Ship(false, 1, 1, grid, 4);
        System.out.println(ship.setShip());
        System.out.println(ship1.setShip());
        for(int i = 0; i < grid.length; i++){
            for(int b = 0; b < grid.length; b++){
                System.out.print(grid[i][b].getCell());
            }
            System.out.println();
        }
    }
    public Cell[][] generateGrid(int size){
        Cell[][] grid = new Cell[size][size];
        for(int i = 0; i < size; i++){
            for(int b = 0; b < size; b++){
                grid[i][b] = new Cell();
            }
        }
        return grid;
    }
}
