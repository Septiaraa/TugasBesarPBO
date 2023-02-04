/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package septiarakurnia21103010.tugasbesarpbo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class TugasBesarPBO {

    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login log = new Login();
                    log.setLocationRelativeTo(null);
                    log.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TugasBesarPBO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
