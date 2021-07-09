/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen;

import java.sql.SQLException;
import java.util.List;
import modelo.PagosPendientes;

/**
 *
 * @author franc
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        consultas aa = new consultas();
        Conexion con = new Conexion();
        List<PagosPendientes> aaa = aa.consulta(con, "00103228");
        for(PagosPendientes pay:aaa){
            System.out.println("pagos pendientes = " + pay);
        }
    }
}
