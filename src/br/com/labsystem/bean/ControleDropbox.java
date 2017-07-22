
package br.com.labsystem.bean;

import br.com.labsystem.view.Tbackup;
import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxEntry;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
import com.dropbox.core.DbxWriteMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CIDRONIO
 */
public class ControleDropbox {
    
        ConectaBanco conecta = new ConectaBanco();
        
        public String retornaToken(){
        String token="";
        conecta.conexao();
        conecta.executaSQL("select * from configuracao");
        try {
            conecta.rs.last();
            token =conecta.rs.getString("token");
        } catch (SQLException ex) {
            Logger.getLogger(Tbackup.class.getName()).log(Level.SEVERE, null, ex);
        }       
        conecta.desconecta();
        return token;
    }

    public String retornaAppKey(){
        String appkey="";
        conecta.conexao();
        conecta.executaSQL("select * from configuracao");
        try {
            conecta.rs.last();
            appkey =conecta.rs.getString("app_key");
        } catch (SQLException ex) {
            Logger.getLogger(Tbackup.class.getName()).log(Level.SEVERE, null, ex);
        }       
        conecta.desconecta();
        return appkey;
    }
    
    public String retornaAppSecret(){
        String appsecret="";
        conecta.conexao();
        conecta.executaSQL("select * from configuracao");
        try {
            conecta.rs.last();
            appsecret =conecta.rs.getString("app_secret");
        } catch (SQLException ex) {
            Logger.getLogger(Tbackup.class.getName()).log(Level.SEVERE, null, ex);
        }       
        conecta.desconecta();
        return appsecret;
    }
}
