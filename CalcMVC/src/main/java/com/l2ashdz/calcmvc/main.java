package com.l2ashdz.calcmvc;

import com.l2ashdz.calcmvc.controller.CalcController;
import com.l2ashdz.calcmvc.model.Operacion;
import com.l2ashdz.calcmvc.vista.Interfaz;

/**
 *
 * @date 28/03/2021
 * @time 18:00:12
 * @author asael
 */
public class main {
    
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Operacion modelo = new Operacion();
        CalcController controller = new CalcController(vista, modelo);
        controller.iniciar();
    }
}
