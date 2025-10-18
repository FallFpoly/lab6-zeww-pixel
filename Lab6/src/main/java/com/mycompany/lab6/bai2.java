/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> dsSanPham = new ArrayList<>();

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap(sc);
            dsSanPham.add(sp);
            System.out.println();
        }

        
        System.out.println("Danh sach san pham hang Nokia:");
        for (SanPham sp : dsSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }

        sc.close();
    }
}
class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap hang san xuat: ");
        hang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ten SP: " + tenSp + ", Gia: " + donGia + ", Hang: " + hang);
    }
}