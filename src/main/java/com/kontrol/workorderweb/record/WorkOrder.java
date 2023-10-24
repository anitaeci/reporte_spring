/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kontrol.workorderweb.record;

import java.util.Date;

/**
 *
 * @author anita
 */
public record WorkOrder(String id, String cliente, Date fecha, String equipo, String tecnico) {
    
}
