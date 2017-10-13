package com.company;

import java.util.*;


    public class Main {

        public static void main(String[] args) {
            // word input
            String sub = "";
            int j = 0, i = 0, c = 1;
            Scanner wIn = new Scanner(System.in);
            System.out.println("Please enter the first word");
            String word1 = wIn.nextLine();
            Scanner wIn2 = new Scanner(System.in);
            System.out.println("Please enter the second word");
            String word2 = wIn2.nextLine();
            // check if length are equal
            //Big for loop to allow for words of any length?
            for (c = 1; c <= word2.length(); c++) {
                for (i = 0; i < word1.length(); i++) {
                    if (word1.substring(i, i + 1).equals(word2.substring(word2.length() - c, (word2.length() - c) + 1))) {
                        System.out.println(word1.substring(i, i + 1));
                        break;
                    } else {
                        System.out.println("miss");
                    }
                }
                /*getting rid of duplicate letters.  doesn't work with j-- but works with j++
                with the c for loop/length calculator has to use j-- to correctly accomplish letter removal */
                for (j = 0; j < word1.length(); j++) {
                    if (j == i) {
                        System.out.println(" ");
                    } else {
                        sub += word1.substring(word1.length() - j, word1.length() - j + 1);
                        System.out.println(sub);
                    }
                    word1 = sub;
                }
            }
        }

    }