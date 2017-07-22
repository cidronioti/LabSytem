
package br.com.labsystem.bean;

import com.dropbox.core.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author CIDRONIO
 */
public class IntegracaoDropBox {
    public static void main(String[] args) throws IOException, DbxException {
        // Obtenha sua APP_KEY e APP_SECRET no site de desenvolvedores do Dropbox.
        final String APP_KEY = "60kjebkk5wre1wv";
        final String APP_SECRET = "d47j8v0tbuy53gy";

        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        //LabSys é o nome da pasta do aplicativo no drop box
        DbxRequestConfig config = new DbxRequestConfig("LabSys",
            Locale.getDefault().toString());
        DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);

        // Faça com que o usuário faça login e autorize seu aplicativo.
        String authorizeUrl = webAuth.start();
        System.out.println("1. Go to: " + authorizeUrl);
        System.out.println("2. Click \"Allow\" (you might have to log in first)");
        System.out.println("3. Copy the authorization code.");
        //String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

        // Isso falhará se o usuário inserir um código de autorização inválido.
        String c = "l13VYmmWJF0AAAAAAAABxNTVzN_F9kdNBRe9FsTDhCDQ4xezc7zc8cK1cuSB4k82";
        //DbxAuthFinish authFinish = webAuth.finish(code);
        //String accessToken = authFinish.accessToken;
        
        DbxClient client = new DbxClient(config, c);

        System.out.println("Linked account: " + client.getAccountInfo().displayName);

        File inputFile = new File("bk_26-10-2007.sql");//caminho e nome do arquivo a ser upado
        FileInputStream inputStream = new FileInputStream(inputFile);
        try {
            DbxEntry.File uploadedFile = client.uploadFile("/bk_26-10-2007.sql",//nome que arquivo ficará no drop box
                DbxWriteMode.add(), inputFile.length(), inputStream);
            System.out.println("Uploaded: " + uploadedFile.toString());
        } finally {
            inputStream.close();
        }

        DbxEntry.WithChildren listing = client.getMetadataWithChildren("/");
        System.out.println("Files in the root path:");
        for (DbxEntry child : listing.children) {
            System.out.println("	" + child.name + ": " + child.toString());
        }

        FileOutputStream outputStream = new FileOutputStream("bk_26-10-2012.sql");//caminho e nome do arquivo, onde será salvo no computador
        try {
            DbxEntry.File downloadedFile = client.getFile("/bk_26-10-2007(1).sql", null,//nome do arquivo a ser baixado do dropbox
                outputStream);
            System.out.println("Metadata: " + downloadedFile.toString());
        } finally {
            outputStream.close();
        }
    }
}
