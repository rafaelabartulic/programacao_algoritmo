/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploswithcase;

/**
 *
 * @author CAMARGO
 */
public class ExemploSwithCase {

        public static void main(String[] args) {
        int dia = 8;
        String nomeDoDia;

        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terca-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia invalido";
                break;
        }

        System.out.println("O dia eh: " + nomeDoDia);
    }
    
}
