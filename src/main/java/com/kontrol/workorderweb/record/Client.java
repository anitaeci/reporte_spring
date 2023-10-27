/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kontrol.workorderweb.record;

import org.springframework.data.annotation.Id;

/**
 *
 * @author anita
 */
public record Client(@Id String id, String name, String code, String idNumber){}
