package br.com.labsystem.bean;

import org.apache.commons.codec.binary.Base64;



/**
 *
 * @author Aluno
 */
public class Criptografia {
    
    public  String criptografiaBase64Encoder(String valor) {//ESTOU UTILIZANDO UMA BIBLIOTECA EXTERNA "commons-codec-1.10" PARA CRIPTOGRAFAR E DESCRIPTOGRAFAR 
        return new Base64().encodeToString(valor.getBytes());
    }
    public String descriptografiaBase64Decoder(String valorCriptografado) {
        return new String(new Base64().decode(valorCriptografado));
    }
    
//    public static String criptografar(){
//        String encript = "eusougay123";
//        byte[] criptografia=null;
//        try {
//            KeyGenerator keygenerator = KeyGenerator.getInstance("RC2");
//            SecretKey secret = keygenerator.generateKey();
//            Cipher cipher = Cipher.getInstance("RC2");
//            cipher.init(Cipher.ENCRYPT_MODE, secret);            
//            criptografia = cipher.doFinal(encript.getBytes());
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoSuchPaddingException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InvalidKeyException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        }catch (BadPaddingException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalBlockSizeException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        return String.valueOf(criptografia);
//    }
//    
//    public static void deCriptografar(){
//        String encript = "eusougay123";
//        byte[] criptografia=null;
//        byte[] deCriptografia=null;
//        try {
//            //criptografando
//            KeyGenerator keygenerator = KeyGenerator.getInstance("RC2");
//            SecretKey secret = keygenerator.generateKey();
//            Cipher cipher = Cipher.getInstance("RC2");
//            cipher.init(Cipher.ENCRYPT_MODE, secret);            
//            criptografia = cipher.doFinal(encript.getBytes());
//            //descriptografando
//            cipher.init(Cipher.DECRYPT_MODE, secret);
//            deCriptografia = cipher.doFinal(criptografia);
//            System.out.println("crip: "+criptografia);
//            System.out.println("decrip: "+new String(deCriptografia));
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoSuchPaddingException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InvalidKeyException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        }catch (BadPaddingException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalBlockSizeException ex) {
//            Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        //return String.valueOf(criptografia);
//    }
//    
//    public static void main(String[] args) {
//        Criptografia.deCriptografar();
//    }
}
