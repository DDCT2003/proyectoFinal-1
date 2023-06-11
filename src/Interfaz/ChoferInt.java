package Interfaz;

import Clases.Chofer;
import Clases.Usuario;

import javax.swing.*;

public class ChoferInt extends JFrame {

    private Chofer usuariochofer;
    private JPanel panelChofer;

    public ChoferInt(String title, Usuario usuarioactual) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelChofer);
        this.pack();
        usuariochofer=(Chofer) usuarioactual;

    }


}
