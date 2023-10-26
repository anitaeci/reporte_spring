/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kontrol.workorderweb.record;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author anita
 */

public record WorkOrder(@Id String id, String client, Date date, String asset, String technician) {
    
}
