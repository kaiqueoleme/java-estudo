
import javax.swing.JOptionPane;

public class criptografia {

    public static void main(String[] args) {

        try {
            //Comando para entrada da String
            String variavelString = JOptionPane.showInputDialog(null, "Entre com uma String: ");
            int valorAsciiOriginal;

            //Separação de caracteres da String de entrada em um vetor de caracteres:
            char [] caracteres = variavelString.toCharArray();
            String mensagem = "";
            for (char c : caracteres) {
                mensagem += c + " ";
            }
            //Exibir a String da entrada
            JOptionPane.showMessageDialog(null, mensagem);

            //Exibir o valor Ascii original
            mensagem = "";
            for (char c : caracteres) {
                valorAsciiOriginal = (int) c;
                mensagem += valorAsciiOriginal + " ";
            }
            JOptionPane.showMessageDialog(null, mensagem);
            
            //Criptografia adicionando +10
            StringBuilder mensagemCriptografada = new StringBuilder();
            mensagem = "";
            for (char c : caracteres) {
                valorAsciiOriginal = (int) c;
                int valorAsciiCriptografado = valorAsciiOriginal + 10;
                mensagem += valorAsciiCriptografado + " ";

                //Converte o novo valor de volta para caractere
                char caractereCriptografado = (char) valorAsciiCriptografado;
                //Adiciona o caractere criptografado à mensagem criptografada
                mensagemCriptografada.append(caractereCriptografado);
            }
            //Exibir a criptografia
            JOptionPane.showMessageDialog(null, mensagem);

            //Exibir a mensagem criptografada
            JOptionPane.showMessageDialog(null, "A mensagem criptografada ficou assim: " + mensagemCriptografada.toString());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Ops", JOptionPane.ERROR_MESSAGE);
        }
    }

}