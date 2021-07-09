/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import modelo.PagosPendientes;
import modelo.Prestamos;
import modelo.Tasas;

/**
 *
 * @author franc
 */
public class consultas {

    public List<PagosPendientes> consulta(Conexion conexion, String id) throws SQLException {
        List<PagosPendientes> pagos = new ArrayList<PagosPendientes>();
        Date hoy = new Date();
        List<Prestamos> prestamos = new ArrayList<Prestamos>();
        List<Tasas> tasas = new ArrayList<Tasas>();
        Prestamos pres;
        Tasas tasass;
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM prestamos WHERE Cliente LIKE '%?%' AND estado = 'Pendiente' ORDER BY Fecha;");
            consulta.setString(1, id);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                pres = new Prestamos(
                        resultado.getString("cliente"),
                        resultado.getString("id"),
                        resultado.getDate("fecha"),
                        resultado.getFloat("monto"),
                        resultado.getString("estado")
                );
                prestamos.add(pres);
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM tasas;");
            consulta.setString(1, id);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                tasass = new Tasas(
                        resultado.getInt("Plazo_MIn"),
                        resultado.getInt("Plazo_Max"),
                        resultado.getFloat("Tasa_Interes")
                );
                tasas.add(tasass);
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        
        for(Prestamos pay:prestamos){
            for(Tasas t: tasas){
                //procesamiento de fechas
                
                Integer a = (int) (hoy.getTime()-pay.getFecha().getTime());
                Float interes = 0.0f;
                
                if(t.getPlazo_min()>= a && t.getPlazo_max()<=a){
                    interes = pay.getMonto()*a*t.getTasa_interes()/360;
                }
                
                Float iva = (float) (interes * 0.016);
                Float pago = pay.getMonto()+interes+iva;
                
                pagos.add(new PagosPendientes(a, interes, iva, pago, pay, t));
            }
            
        }
        return pagos;
    }
}
