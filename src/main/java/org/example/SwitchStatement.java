package org.example;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number from 1 to 5");
        int index = scanner.nextInt();

        switch (index){
            case 1 : {
                System.out.println('A');
                break;
            }
            switch (index){
                case 1 : {
                    System.out.println('B');
                    break;
                }
                switch (index){
                    case 1 : {
                        System.out.println('C');
                        break;
                    }
                    switch (index){
                        case 1 : {
                            System.out.println('D');
                            break;
                        }
                        switch (index){
                            case 1 : {
                                System.out.println('E');
                                break;
                                {

                                }

                            }