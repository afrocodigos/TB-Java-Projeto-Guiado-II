package Information;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.swing.JOptionPane;

public class FeedbackUsuario {
    // Defina o logger para esta classe
    private static final Logger LOGGER = Logger.getLogger(FeedbackUsuario.class.getName());

    static {
        try {
            // Configura o FileHandler para direcionar os logs para um arquivo de texto na pasta Information
            String logFilePath = Paths.get("./InformationFeedback").toString();
            FileHandler fileHandler = new FileHandler(logFilePath, true);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao configurar o FileHandler", e);
        }
    }

    public static void main(String[] args) {
        // Solicita ao usuário para fornecer feedback
        String feedback = JOptionPane.showInputDialog(null, "Por favor, compartilhe seu feedback sobre a aplicação:");
        // Verifica se o feedback foi fornecido
        if (feedback != null && !feedback.isEmpty()) {
            // Se o feedback foi fornecido, registra no arquivo de log
            registrarFeedback(feedback);
            JOptionPane.showMessageDialog(null, "Obrigado pelo seu feedback! Ele é muito valioso para nós.");
        } else {
            JOptionPane.showMessageDialog(null, "Obrigado por tentar! Seu feedback é importante para nós.");
        }
    }
    // Método para registrar o feedback no arquivo de log
    private static void registrarFeedback(String feedback) {
        // Registra o feedback no log com nível INFO
        LOGGER.info("Feedback do usuário: " + feedback);
    }
}
