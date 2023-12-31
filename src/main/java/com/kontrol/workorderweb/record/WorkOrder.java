/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kontrol.workorderweb.record;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Definición del documento WorkOrder
 * @author anita
 */

public record WorkOrder(@Id String id, 
        Date date, 
        String asset, 
        String technician, 
        @DBRef Client client) {
    
}
