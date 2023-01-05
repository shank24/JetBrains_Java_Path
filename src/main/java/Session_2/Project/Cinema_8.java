package Session_2.Project;

import java.util.Scanner;

public class Cinema_8 {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object


        // the rows and seats as integers
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        // the cinema room as an array
        String[][] array = new String[rows][seats];

        // amount of sold tickets - metaData[0]
        //int currentIncome = 0;
        // total income
        int totalIncome = 0;

        // create the empty room
        createACinema(array, rows, seats);
        Integer option = displayOptions();
        while(option != 0){
            if(option == 2){
                selectOptionTwo(array, rows, seats);
                option = displayOptions();
            } else if (option == 1){
                selectOptionOne(array, rows, seats);
                option = displayOptions();
            } else if (option == 3){
                statistics(rows, seats, totalIncome, array);
                option = displayOptions();
            } else {
                System.out.print("You should input a valid option");
            }
        }
    }

    public static String[][] createACinema(String[][] array, int rows, int seats){
        //populate the array
        for(int i = 0; i<rows; i++){
            for(int j = 0; j < seats; j++){
                array[i][j] = " S";
            }
        }
        // return the value
        return array;
    }

    public static Integer displayOptions(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
        Integer option = scanner.nextInt();
        return option;
    }

    public static String[][] selectOptionOne(String[][] array, Integer rows, Integer seats){
        //Render the room - create the first row
        String firstRow = "";
        for(int i = 0; i<seats; i++){
            firstRow += " "+ (i+1);
        }

        //Render the room - print the according map based on the array
        String oneRow = "";
        System.out.println("Cinema:");
        System.out.println(" " + firstRow);
        for(int i = 0; i<rows; i++){
            for(int j = 0; j < seats; j++){
                oneRow += array[i][j];
            }
            System.out.println((i+1) +oneRow);
            oneRow = "";
        }
        return array;
    }

    public static void statistics(int rows, int seats, int totalIncome, String[][] array){
        //The number of purchased tickets;
        System.out.println("Number of purchased tickets: "+ ticketsSold(array, rows, seats));
        //The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
        System.out.printf("Percentage: %.2f", occupRate(array, rows, seats));
        System.out.println("");
        //Current income;
        System.out.println("Current income: $"+ currentIncome(rows, seats, array));
        //The total income that shows how much money the theatre will get if all the tickets are sold.
        if(rows * seats < (8*8)){
            float maxIncome = rows * seats * 10;
            System.out.println("Total income: $"+ maxIncome);
        } else {
            float maxIncome = (((rows * seats)/2) * 10) + (((rows * seats)/2) * 8);
            System.out.println("Total income: $"+ maxIncome);
        }

    }

    public static int currentIncome(int rows, int seats, String[][] array){
        int ticketsSold = 0;
        int currentIncome = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] == " B"){ticketsSold++;}
            }
        }
        if ((rows * seats) < 60) {
            currentIncome = ticketsSold* 10;
        } else if (rows % 2 == 0) {
            currentIncome = ((rows / 2) * 10) + ((rows / 2) * 8);
        } else if (rows % 2 != 0) {
            currentIncome += (((rows-1) / 2) * 10) + (((rows+1) / 2) * 10);
        }
        return currentIncome;
    }

    public static int ticketsSold(String[][] array, Integer rows, float seats){
        int ticketsSold = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] == " B"){ticketsSold++;}
            }
        }
        return ticketsSold;
    }

    public static float occupRate(String[][] array, Integer rows, float seats){
        int ticketsSold = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] == " B"){ticketsSold++;}
            }
        }
        float average = (ticketsSold * 100) / (rows * seats);
        return average;
    }

    public static String[][] selectOptionTwo(String[][] array, Integer rows, Integer seats){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        Boolean seatFree = false;

        //Enter a seat and row
        System.out.println("Enter a row number:");
        Integer row = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        Integer seat = scanner.nextInt();

        if(row > rows || seat > seats){
            System.out.println("Select a valid option");
        } else {
            if (array[row - 1][seat - 1] == " B") {
                System.out.println("That ticket has already been purchased!");
            } else {
                array[row - 1][seat - 1] = " B";
                if ((rows * seats) < 60) {
                    System.out.println("Ticket price: $10");
                } else if (rows % 2 == 0) {
                    if (row <= (rows / 2)) {
                        System.out.println("Ticket price: $10");
                    } else {
                        System.out.println("Ticket price: $8");
                    }
                } else if (rows % 2 != 0) {
                    if (row <= ((rows) / 2)) {
                        System.out.println("Ticket price: $10");
                    } else {
                        System.out.println("Ticket price: $8");
                    }
                }
            }
        }
        return array;
    }
}
