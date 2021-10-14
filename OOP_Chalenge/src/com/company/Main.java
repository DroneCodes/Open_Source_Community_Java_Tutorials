package com.company;

import java.util.Scanner;

public class Main {
     // this is the min class where we would be instantiating all the classes

    public static void main(String[] args) {
        Patient patient = new Patient("Segun Adebayo", 21,
                new Eye("Left Eye", "Short Sighted", "Brown", true),
                new Eye("Right Eye", "Normal", "Brown", true),
                new Heart("Heart", "Normal", 68),
                new Stomach("Stomach","Ulcer", false),
                new Skin("Skin", "Ecdysis", "Brown", 40/100));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an Organ to examine:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Stop the Program (Quit)");  // the backslash n moves the cursor to the next line

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // If user picks the Left Eye
                    patient.getLeftEye().getInfo();
                    if (patient.getLeftEye().isOpeneye()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().Close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().Open();
                        }else {
                            continue;
                        }
                    }

                    break;


                case 2: // If user picks the Right Eye
                    patient.getRightEye().getInfo();
                    if (patient.getRightEye().isOpeneye()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().Close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().Open();
                        }else {
                            continue;
                        }
                    }

                    break;

                case 3:  // if user picks the heart
                    patient.getHeart().getInfo();
                    System.out.println("\t\t1. Check and Change the Heart Rate");

                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter the new Heart Rate"); // to change heart rate
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart Rate has been changed successfully");
                        System.out.println("Your heart rate is now " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getInfo();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().Digest();
                    }else {
                        continue;
                    }
                    break;


                case 5:
                    patient.getSkin().getInfo();
                    break;

                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
