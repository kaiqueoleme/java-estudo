import javax.swing.*;

public  class videoAula {
    public static void main(String[] args) {
        try {
            //JOptionPane.showMessageDialog(null, "Olá mundo!", "Programa do Kaique", JOptionPane.INFORMATION_MESSAGE);
            //int variavelInt = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor inteiro: "));
            //double variavelDouble = Double.parseDouble(JOptionPane.showInputDialog("Entre com um valor double: "));
            String variavelString = JOptionPane.showInputDialog("Entre com uma mensagem a criptografar");

            //SESSÂO

            //JOptionPane.showMessageDialog(null, "Váriavel inteiro: " + variavelInt, "Programa do Kaique", JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Váriavel Double: " + variavelDouble, "Programa do Kaique", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Váriavel String: " + variavelString, "Programa do Kaique", JOptionPane.INFORMATION_MESSAGE);

            //Tabela Ascii

            char [] caracteres = variavelString.toCharArray();
            for (char c : caracteres) {
                JOptionPane.showMessageDialog(null, c);
            }

            //OBTER O VALOR ASCII DO CARACTER ORIGINAL
            StringBuilder mensagemCriptografada = new StringBuilder();
            for (char c : caracteres) {
                int valorAsciiOriginal = (int) c;
                
                //Exibir o valor Ascii original
                JOptionPane.showMessageDialog(null, "Valor ASCII do caractere: '" + c + "'': "+ valorAsciiOriginal);

                //Adicionar + 2 para criptografar
                int valorAsciiCriptografado = valorAsciiOriginal + 2;

                //Exibir o valor ASCII criptografado
                JOptionPane.showMessageDialog(null, "Valor criptografado: " + valorAsciiCriptografado);
            
                //Converte o novo valor de volta para caractere
                char caractereCriptografado = (char) valorAsciiCriptografado;

                //Adiciona o caractere criptografado à mensagem criptografada
                mensagemCriptografada.append(caractereCriptografado);
            }

            //Exibe a mensagem criptografa usando JOptionPane
            JOptionPane.showMessageDialog(null, "Mensagem criptografada ficou assim: " + mensagemCriptografada.toString());

           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro!", "Ops", JOptionPane.ERROR_MESSAGE);
        }

        
    }
}