package com.l2ashdz.calcmvc.controller;

import com.l2ashdz.calcmvc.model.Operacion;
import com.l2ashdz.calcmvc.vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @date 28/03/2021
 * @time 17:52:14
 * @author asael
 */
public class CalcController implements ActionListener {

    private Interfaz vista;
    private Operacion operacion;

    public CalcController(Interfaz vista, Operacion operacion) {
        this.vista = vista;
        this.operacion = operacion;

        this.vista.getBtnSuma().addActionListener(this);
        this.vista.getBtnResta().addActionListener(this);
        this.vista.getBtnMult().addActionListener(this);
        this.vista.getBtnDiv().addActionListener(this);
    }

    public void iniciar() {
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        float num1 = Float.parseFloat(this.vista.getTxtNum1().getText());
        float num2 = Float.parseFloat(this.vista.getTxtNum2().getText());

        operacion.setNumero1(num1);
        operacion.setNumero2(num2);

        if (this.vista.getBtnSuma() == e.getSource()) {
            operacion.sumar();
        } else if (this.vista.getBtnResta() == e.getSource()) {
            operacion.restar();
        } else if (this.vista.getBtnMult() == e.getSource()) {
            operacion.multiplicar();
        } else if (this.vista.getBtnDiv() == e.getSource()) {
            operacion.dividir();
        }
        this.vista.getLblResult().setText("Resultado: " + operacion.getResultado());
    }   

}
