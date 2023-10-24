/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kontrol.workorderweb.controller;
import com.kontrol.workorderweb.record.WorkOrder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anita
 */
@RestController
public class WorkOrderController {
    /**
     * Devuelve una orden de trabajo
     * @param id Identificador de la orden de trabajo
     * @return 
     */
    @RequestMapping(path = "/workorder/{id}",method = RequestMethod.GET)
    public WorkOrder workOrder(@PathVariable String id){
        return new WorkOrder(id, "nombre", Calendar.getInstance().getTime(),"","");
    }
    /**
     * Devuelve todas las ordenes de trabajo
     * @return 
     */
    @RequestMapping(path = "/workorder",method = RequestMethod.GET)
    public List<WorkOrder> workOrder(){
        List<WorkOrder> workOrders = new ArrayList<>();
        workOrders.add(new WorkOrder("1","name1", Calendar.getInstance().getTime(),"",""));
        workOrders.add(new WorkOrder("2","nam21", Calendar.getInstance().getTime(),"",""));
        workOrders.add(new WorkOrder("3","name3", Calendar.getInstance().getTime(),"",""));
        
        return workOrders;
    }
    /**
     * Crea una orden de trabajo
     * @param workOrder Orden de trabajo a crear
     * @return 
     */
    @RequestMapping(path="/workorder", method = RequestMethod.POST)
    public WorkOrder createWorkOrder(@RequestBody WorkOrder workOrder){
        return workOrder;
    }
    
    /**
     * Actualiza los valores de la orden de trabajo
     * @param workOrder Nueva información de la orden de trabajo
     * @param id Identificador de la orden de trabajo
     * @return 
     */
    @RequestMapping(path = "/workorder/{id}",method = RequestMethod.PATCH)
    public WorkOrder updateWorkOrder(@RequestBody WorkOrder workOrder, @PathVariable Long id){       
        return new WorkOrder("3","name3", Calendar.getInstance().getTime(),"","");
    }
    
}