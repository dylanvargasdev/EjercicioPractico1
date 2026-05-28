/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopractico1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjercicioPractico1 {

    public static void main(String[] args) {
        //Variables
        String nombre = "", apellido = "";
        double salario = 0, impuestosAplicados = 0, salarioSem = 0, salarioIvm = 0, salarioGobierno = 0, salarioAsociacion = 0;
        
        //Variables impuestos
        double sem = (0.0925), ivm = (0.0508), gobierno = 0, asociacion = (0.025), calculoGobierno = 0;
        
        //Solicirtud de datos personales.
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        apellido = JOptionPane.showInputDialog("Digite su apellido: ");
        String precio = JOptionPane.showInputDialog("Digite su salario mensual");
        salario = Double.parseDouble(precio);
        
        if (salario >= 2373000){
            gobierno = (0.20);
            salarioSem = salario * sem;
            salarioIvm = salario * ivm;
            calculoGobierno = salario - 2373000;
            salarioGobierno = calculoGobierno * gobierno;
            salarioAsociacion = salario * asociacion;
            impuestosAplicados = salario - salarioSem - salarioIvm - salarioGobierno - salarioAsociacion;
            JOptionPane.showMessageDialog(null, impuestosAplicados);
        }
        if (salario >= 1352000 && salario < 2373000){
            gobierno = (0.15);
            salarioSem = salario * sem;
            salarioIvm = salario * ivm;
            calculoGobierno = salario - 1352000;
            salarioGobierno = calculoGobierno * gobierno;
            salarioAsociacion = salario * asociacion;
            impuestosAplicados = salario - salarioSem - salarioIvm - salarioGobierno - salarioAsociacion;
            JOptionPane.showMessageDialog(null, impuestosAplicados);
        }
        if (salario >= 922000 && salario < 1352000){
            gobierno = (0.1);
            salarioSem = salario * sem;
            salarioIvm = salario * ivm;
            calculoGobierno = salario - 922000;
            salarioGobierno = calculoGobierno * gobierno;
            salarioAsociacion = salario * asociacion;
            impuestosAplicados = salario - salarioSem - salarioIvm - salarioGobierno - salarioAsociacion;
            JOptionPane.showMessageDialog(null, impuestosAplicados);
        }
        if (salario < 922000){
            salarioSem = salario * sem;
            salarioIvm = salario * ivm;
            salarioAsociacion = salario * asociacion;
            impuestosAplicados = salario - salarioSem - salarioIvm - salarioAsociacion;
            JOptionPane.showMessageDialog(null, impuestosAplicados);
        }
        
    }
}
