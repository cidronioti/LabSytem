

package br.com.labsystem.bean;

/**
 *
 * @author CIDRONIO
 */
public class ModeloConfigInicialSistema {

    private String portCom;
    private String boudRate;
    private String appKey;
    private String appSecret;
    private String token;
    
    
    public String getPortCom() {
        return portCom;
    }

    public void setPortCom(String portCom) {
        this.portCom = portCom;
    }

    public String getBoudRate() {
        return boudRate;
    }

    public void setBoudRate(String boudRate) {
        this.boudRate = boudRate;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
