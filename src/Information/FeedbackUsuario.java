package Information;


import javax.swing.JOptionPane;

public class FeedbackUsuario {
    public static void main(String[] args) {
        String feedback = JOptionPane.showInputDialog(null, "Por favor, compartilhe seu feedback sobre a aplicação:");
        if (feedback != null && !feedback.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Obrigado pelo seu feedback! Ele é muito valioso para nós.");
        } else {
            JOptionPane.showMessageDialog(null, "Obrigado por tentar! Seu feedback é importante para nós.");
        }
    }
}
