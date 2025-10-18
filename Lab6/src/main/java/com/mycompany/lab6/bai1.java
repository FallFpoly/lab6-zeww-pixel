/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String hoVaTen = sc.nextLine().trim();

        
        int firstSpace = hoVaTen.indexOf(" ");
        int lastSpace = hoVaTen.lastIndexOf(" ");

        
        String ho = hoVaTen.substring(0, firstSpace).toUpperCase();

        
        String ten = hoVaTen.substring(lastSpace + 1).toUpperCase();

        
        String tenDem = "";
        if (firstSpace != lastSpace) {
            tenDem = hoVaTen.substring(firstSpace + 1, lastSpace);
        }

        
        System.out.println("Ten: " + ten);
        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem);

        sc.close();
    }
}
