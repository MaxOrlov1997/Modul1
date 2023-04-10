package ua.orlov.module1;
/* Ход коня по шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
Программа должна проверить, возможно ли это сделать.*/

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int[] vertical = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] horizontal = {"A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println("Введите начальное положение коня - буква");
        Scanner scan = new Scanner(System.in);
        String letter = scan.next();
        System.out.println("Введите начальное положение коня - цифра");
        int num = scan.nextInt();
        System.out.println("Куда желаете сделать ход - буква");
        String letterNext = scan.next();
        System.out.println("Куда желаете сделать ход - цифра");
        int numNext = scan.nextInt();
        letter = letter.toUpperCase();
        letterNext = letterNext.toUpperCase();
        kingMoveone(vertical, horizontal, letter, num, letterNext, numNext); // ход на +1 букву
        kingMovetwo(vertical, horizontal, letter, num, letterNext, numNext); // ход на +2 буквы
        kingMovethree(vertical, horizontal, letter, num, letterNext, numNext); // ход на -1 букву
        kingMovefour(vertical, horizontal, letter, num, letterNext, numNext); // ход на -2 буквы


    }

    public static int kingMoveone(int[] vertical, String[] horizontal, String letter, int num, String letterNext, int numNext) {
        for (int i = 0; i < horizontal.length; i++) {
            if (horizontal[i].equals(letter)) {
                if (letter.equals(horizontal[horizontal.length - 1])) {
                    return 0;
                } else if (numNext <= vertical.length) {
                    if (horizontal[i + 1].equals(letterNext)) {
                        for (int j = 0; j < vertical.length; j++) {
                            if (vertical[j] == num) {
                                if (j >= 2) {
                                    if (vertical[j - 2] == numNext) {
                                        System.out.println("Ход возможен");
                                        return 0;
                                    }
                                }
                                if (j <= 5) {
                                    if (vertical[j + 2] == numNext) {
                                        System.out.println("Ход возможен");
                                        return 0;
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int kingMovetwo(int[] vertical, String[] horizontal, String letter, int num, String letterNext, int numNext) {
        for (int i = 0; i < horizontal.length; i++) {
            if (horizontal[i].equals(letter)) {
                if (letter.equals(horizontal[horizontal.length - 2]) || (letter.equals(horizontal[horizontal.length - 1] ))) {
                    return 0;
                } else if (horizontal[i + 2].equals(letterNext)) {
                    for (int j = 0; j < vertical.length; j++) {
                        if (vertical[j] == num) {
                            if (j >= 1) {
                                if (vertical[j - 1] == numNext) {
                                    System.out.println("Ход возможен");
                                    return 0;
                                }
                            }
                            if (j <= 6) {
                                if (vertical[j + 1] == numNext) {
                                    System.out.println("Ход возможен");
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int kingMovethree(int[] vertical, String[] horizontal, String letter, int num, String letterNext, int numNext) {
        for (int i = 0; i < horizontal.length; i++) {
            if (horizontal[i].equals(letter)) {
                if (letter.equals(horizontal[0])) {
                    return 0;}
                else if (numNext >= 1) {
                    if (horizontal[i - 1].equals(letterNext)) {
                        for (int j = 0; j < vertical.length; j++) {
                            if (vertical[j] == num) {
                                if (j >= 2) {
                                    if (vertical[j - 2] == numNext) {
                                        System.out.println("Ход возможен");
                                        return 0;
                                    }
                                }
                                if (j <= 5) {
                                    if (vertical[j + 2] == numNext) {
                                        System.out.println("Ход возможен");
                                        return 0;
                                    }
                                }

                            }

                        }
                    }
                }
            }
        }

        return 0;
    }

    public static int kingMovefour(int[] vertical, String[] horizontal, String letter, int num, String letterNext,int numNext) {
        for (int i = 0; i < horizontal.length; i++) {
            if (horizontal[i].equals(letter)) {
                if ((letter.equals(horizontal[0]) || letter.equals(horizontal[1]))) {
                    return 0;}
                else if (numNext >= 2) {
                    if (horizontal[i - 2].equals(letterNext)) {
                        for (int j = 0; j < vertical.length; j++) {
                            if (vertical[j] == num) {
                                if (j >= 1) {
                                    if (vertical[j - 1] == numNext) {
                                        System.out.println("Ход возможен");
                                        return 0;
                                    }
                                }
                                if (j <= 6) {
                                    if (vertical[j + 1] == numNext) {
                                        System.out.println("Ход возможен");
                                        return 0;

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
