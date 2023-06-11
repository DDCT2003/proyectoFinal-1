package Interfaz;


import Clases.Usuario;

import javax.swing.*;

public class AdministradorCRUD extends JFrame {

    private Usuario usuario;
    private JPanel panelUsuario;

    public AdministradorCRUD(String title, Usuario usuarioactual) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelUsuario);
        this.pack();
        usuario=usuarioactual;
    }

}
