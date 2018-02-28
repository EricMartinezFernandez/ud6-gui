package Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal {

    private JPanel panel1;
    private JTextField usuarioIntroducido;
    private JTextField contraseñaIntroducida;
    private JButton loginButton;
    private JLabel infoEnPantalla;

    private String contraseña;
    private String usuario;
    private int contraseñaNumerica;
    private int usuarioNumerico;

    public PantallaPrincipal() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                usuario = usuarioIntroducido.getText();
                contraseña = contraseñaIntroducida.getText();

                contraseñaNumerica = Integer.parseInt(contraseña);

                if (contraseñaNumerica == 1234 && usuario.equalsIgnoreCase("admin")) {
                    infoEnPantalla.setText("Tienes permiso");
                } else {
                    infoEnPantalla.setText("El usuario o la contraseña no es correcta");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PantallaPrincipal");
        frame.setContentPane(new PantallaPrincipal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
