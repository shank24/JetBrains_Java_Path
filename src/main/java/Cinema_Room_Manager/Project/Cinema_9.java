package Cinema_Room_Manager.Project;
import java.util.Scanner;

import static java.lang.System.out;
public class Cinema_9 {
    static int currentIncome = 0;
    static int totalIncome = 0;
    static int ticketPrice = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter the number of rows:");

        int rows = sc.nextInt();
        out.println("Enter the number of seats in each row:");
        int seatsPerRow = sc.nextInt();

        int rowNum = 0, seatNum = 0, counter = 0;
        char[][] cinema = getArray(rows, seatsPerRow);
        Menu(cinema, rows, seatsPerRow, rowNum, seatNum, counter);
        System.exit(0);
    }
    public static void Menu(char[][] cinema,int rows, int seatsPerRow, int rowNum, int seatNum, int counter) {
        Scanner sc = new Scanner(System.in);
        do {
            out.println("1. Show the seats");
            out.println("2. Buy a ticket");
            out.println("3. Statistics");
            out.println("0. Exit");
            switch (sc.nextInt()) {
                case 1: display(cinema,rowNum,seatNum);
                    Menu(cinema, rows, seatsPerRow, rowNum, seatNum, counter);
                    break;
                case 2:
                    out.println("Enter a row number:");
                    rowNum = sc.nextInt();
                    out.println("Enter a seat number in that row:");
                    seatNum = sc.nextInt();
                    if (seatNum > cinema[0].length - 1 || rowNum > cinema.length - 1) {
                        do{
                            out.println("Wrong input!");
                            out.println("Enter a row number:");
                            rowNum = sc.nextInt();
                            out.println("Enter a seat number in that row:");
                            seatNum = sc.nextInt();
                        } while (seatNum > cinema[0].length - 1 || rowNum > cinema.length - 1);
                    } else {
                        if (alreadyPurchased(cinema, rowNum, seatNum)) {
                            do{
                                out.println("That ticket has already been purchased!");
                                out.println("Enter a row number:");
                                rowNum = sc.nextInt();
                                out.println("Enter a seat number in that row:");
                                seatNum = sc.nextInt();
                            } while (alreadyPurchased(cinema, rowNum, seatNum));
                        }
                        char[][] booked = booking(cinema,rowNum,seatNum);
                        out.println("Ticket price: $" + calculateTicketPrice(rows,seatsPerRow,rowNum));
                        counter++;
                        Menu(booked, rows, seatsPerRow, rowNum ,seatNum, counter);
                    }
                    break;
                case 3:
                    Statistics(rows, seatsPerRow, counter);
                    Menu(cinema, rows, seatsPerRow, rowNum, seatNum, counter);
                    break;
                case 0:
                    return;
            }
        } while (sc.nextInt() != 0);
    }
    public static char[][] getArray(int rows, int seatsPerRow) {
        int row, col;
        row = rows;
        col = seatsPerRow;
        row++;
        col++;
        return new char[row][col];
    }
    public static void display(char[][] cinema, int rowNum, int seatNum) {
        char[][] booked = booking(cinema, rowNum, seatNum);
        out.println("Cinema:");
        for (int i = 0; i < booked.length; i++) {
            for (int j = 0; j < booked[i].length; j++) {
                out.print(booked[i][j] + " ");
            }
            out.println();
        }
    }
    public static char[][] booking(char[][] cinema, int rowNum, int seatNum) {
        char numCharI = 48;//Unicode --> char '0'
        char numCharJ = 48;

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[0][0] = ' ';
                if (rowNum > 0 && seatNum > 0) {
                    cinema[rowNum][seatNum] = 'B';
                }
                if (cinema[i][j] == cinema[0][j]) {
                    cinema[i][j] = numCharI++;
                }
                if (cinema[i][j] == cinema[i][0]) {
                    cinema[i][j] = numCharJ++;
                } else if (cinema[i][j] != cinema[0][j]
                        && cinema[i][j] != cinema[i][0]
                        && cinema[i][j] != cinema[rowNum][seatNum]) {
                    cinema[i][j] = 'S';
                }
            }
        }
        return cinema;
    }
    public static boolean alreadyPurchased(char[][] cinema, int rowNum, int seatNum) {
        boolean isAlreadyPurchased = false;

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length && !isAlreadyPurchased; j++) {
                if (cinema[rowNum][seatNum] == 'B') {
                    isAlreadyPurchased = true;
                    break;
                }
            }
        }
        return isAlreadyPurchased;
    }
    public static int calculateTicketPrice(int rows, int seatsPerRow, int rowNum) {

        if (rows % 2 != 0 && rows * seatsPerRow > 60) {
            int frontHalf = rows / 2;
            if (rowNum > frontHalf) {
                currentIncome += 8;
                return ticketPrice = 8;
            } else {
                currentIncome += 10;
                return ticketPrice = 10;
            }
        } else if (rows % 2 == 0 && rows * seatsPerRow > 60) {
            int frontHalf = rows / 2;
            if (rowNum > frontHalf) {
                currentIncome += 8;
                return ticketPrice = 8;
            } else {
                currentIncome += 10;
                return ticketPrice = 10;
            }
        } else if (rows * seatsPerRow <= 60) {
            currentIncome += 10;
            return ticketPrice = 10;
        }
        return ticketPrice;
    }
    public static int calculateTotalIncome(int rows, int seatsPerRow) {

        if (rows % 2 != 0 && rows * seatsPerRow > 60) {
            int frontHalf = rows / 2;
            int backHalf = (rows % 2) + frontHalf;
            return totalIncome = (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8);
        } else if (rows % 2 == 0 && rows * seatsPerRow > 60) {
            int frontHalf = rows / 2;
            return totalIncome = (frontHalf * seatsPerRow * 10) + (frontHalf * seatsPerRow * 8);
        } else if (rows * seatsPerRow <= 60) {
            return totalIncome = (rows * seatsPerRow) * 10;
        }
        return totalIncome;
    }
    public static void Statistics(int rows, int seatsPerRow, int numberOfPurchasedTickets) {
        final double PERCENT = 100.0;

        int totalIncome = calculateTotalIncome(rows, seatsPerRow);
        double percentage = (numberOfPurchasedTickets / (double) (rows * seatsPerRow)) * PERCENT;

        out.println("Number of purchased tickets: " + numberOfPurchasedTickets);
        out.printf("Percentage: %.2f%%", percentage);
        out.println("\nCurrent income: $" + currentIncome);
        out.println("Total income: $" + totalIncome);
    }
}

/* Problem Statement

Running a cinema theatre is no easy business. To help our friends, let's add statistics to your program. The stats will show the current income, total income, the number of available seats, and the percentage of occupancy.

In addition, our friends asked you to take care of a small inconvenience: it's not good when a user can buy a ticket that has already been purchased by another user. Let's fix this!

Objectives
Now your menu should look like this:

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
When the item Statistics is chosen, your program should print the following information:

The number of purchased tickets;
The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
Current income;
The total income that shows how much money the theatre will get if all the tickets are sold.
The rest of the menu items should work the same way as before, except the item Buy a ticket shouldn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat, print That ticket has already been purchased! and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print Wrong input! and ask to enter different seat coordinates until the user picks an available seat.

Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Enter the number of rows:
> 6
Enter the number of seats in each row:
> 6

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 0
Percentage: 0.00%
Current income: $0
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 2.78%
Current income: $10
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!

Enter a row number:
> 4
Enter a seat number in that row:
> 4

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 0
 */