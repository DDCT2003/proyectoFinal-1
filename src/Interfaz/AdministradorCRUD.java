package Interfaz;


import ClaseOperacionales.GestionUsuario;
import Clases.Usuario;
import Validaciones.Validacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel txtInicioNombre;
    private Validacion validar;
    private GestionUsuario gestionUsuario;

    public AdministradorCRUD(String title, Usuario usuarioactual, GestionUsuario gestionUsuario) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelUsuario);
        this.pack();
        usuario=usuarioactual;
        this.gestionUsuario=gestionUsuario;
        validar=new Validacion();
        txtInicioNombre.setText(usuarioactual.getNombre());
        btnRegistrarAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(validar.validarCedula(txtAdminCedula.getText())){
                    if(txtAdminNombre.getText().isBlank()==false&&txtAdminApellido.getText().isBlank()==false){
                           if(gestionUsuario.addUsuario(new Usuario(txtAdminCedula.getText(),txtAdminNombre.getText(),txtAdminApellido.getText()))){
                               JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
                           }else{
                               JOptionPane.showMessageDialog(null, "No se pudo crear el usuario, ya existe en la lista");
                           }
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe llenar los campos Nombre y Apellido");
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese una cédula Ecuatoriana valida");
                }

            }
        });
    }

}
