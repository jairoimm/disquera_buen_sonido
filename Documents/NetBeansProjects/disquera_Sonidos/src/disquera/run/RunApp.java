/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disquera.run;
import disquera.gui.FramePrincipal;
/**
 *
 * @author Jairo
 */
public class RunApp {
    public static void main(String[] args) {
        
        // El código estándar de Swing para asegurar que la interfaz se ejecute correctamente.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Instancia y hace visible tu ventana principal
                new FramePrincipal().setVisible(true);
            }
        });
    }
}
