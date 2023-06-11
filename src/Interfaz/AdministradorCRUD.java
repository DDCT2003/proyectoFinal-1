package Interfaz;


import Clases.Usuario;

import javax.swing.*;

public class AdministradorCRUD extends JFrame {

    private Usuario usuario;
    private JPanel panelUsuario;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTextField txtAdminCedula;
    private JTextField txtAdminNombre;
    private JTextField txtAdminApellido;
    private JButton btnRegistrarAdmin;
    private JComboBox comboBoxHorarioChofer;
    private JComboBox comboBoxManDia;
    private JComboBox comboBoxManMes;
    private JComboBox comboBoxMananio;
    private JTextField txtNumDefectos;
    private JTextField txtCapacidadPersonas;
    private JComboBox comboBox5;
    private JComboBox ComboBoxHin;
    private JComboBox ComboBoxMin;
    private JComboBox ComboBoxHfin;
    private JComboBox ComoboBoxMfin;
    private JTextField txtPlaca;
    private JTextField txtMatricula;
    private JTextField txtKilometraje;
    private JButton btnRegistrarBus;
    private JTextField txtAsisCedula;
    private JTextField txtAsisNombre;
    private JTextField txtAsisApellido;
    private JPanel txtAsisSucursal;

    public AdministradorCRUD(String title, Usuario usuarioactual) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelUsuario);
        this.pack();
        usuario=usuarioactual;
    }

}
