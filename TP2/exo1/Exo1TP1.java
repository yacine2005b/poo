/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1tp1;

/**
 *
 * @author yybou
 */
public class Exo1TP1 {
public static void main(String[] args) {
    C1 a = new C5();
    C1 b = new C3();
    C2 c = a;//incompatible types: C1 cannot be converted to C2
    C4 d = new C1();//incompatible types: C1 cannot be converted to C4
    b = a;
    b = new C6();
    c = b;//incompatible types: C1 cannot be converted to C2
    d = b;//incompatible types: C1 cannot be converted to C2
    C4 e;
    b = new C5();
    e = (C4) b;
}

}
