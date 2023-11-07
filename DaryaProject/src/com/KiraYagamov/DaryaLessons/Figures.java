package com.KiraYagamov.DaryaLessons;

public class Figures {
    public static char[][] grid = new char[8][8];
    public static char O = 'O';
    public static char space = ' ';
    public static void Square(){
        fillSpace();
        for(int i = 0; i < grid.length; i++){
            for(int b = 0; b < grid.length; b++){
                grid[i][b] = O;
            }
        }
        printGrid();
    }

    public static void Triangle(){
        fillSpace();
        int width = 1;
        int height = (int) (grid.length / grid[0].length);
        for(int i = 0; i < grid.length; i++){
            for(int b = 0; b < width; b++){
                grid[i][b] = O;
            }
            if(i % height == 0 && i <= grid[0].length + 1){
                width++;
            }
        }
        printGrid();
    }

    public static void Romb(){
        fillSpace();
        int left;
        int right;
        int startLeft;
        boolean upping = true;
        if(grid[0].length % 2 == 0){
            left = grid[0].length / 2 - 1;
            right = left + 1;
            startLeft = left;
        }
        else {
            left = (int) grid[0].length / 2;
            right = left;
            startLeft = left;
        }
        for(int i = 0; i < grid.length; i++){
            for(int b = left; b <= right; b++){
                grid[i][b] = O;
            }
            if(upping){
                left--;
                right++;
            }
            else{
                left++;
                right--;
            }
            if(left == 0){
                upping = !upping;
            }
        }
        printGrid();
    }
    public static void printGrid(){
        for(int i = 0; i < grid.length; i++){
            for(int b = 0; b < grid[i].length; b++){
                System.out.print(grid[i][b]);
            }
            System.out.println();
        }
    }
    public static void fillSpace(){
        for(int i = 0; i < grid.length; i++){
            for(int b = 0; b < grid[i].length; b++){
                grid[i][b] = space;
            }
        }
    }
}
