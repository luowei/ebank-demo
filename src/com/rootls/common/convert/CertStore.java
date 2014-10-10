package com.rootls.common.convert;

import javax.crypto.SecretKey;
import java.security.PrivateKey;
import java.security.PublicKey;

public class CertStore {
    // 私钥
    private PrivateKey privateKey = null;

    //公钥
    private PublicKey publicKey = null;

    // 对称算法的密钥
    private SecretKey secretKey = null;

    public CertStore() {

    }

    public SecretKey getSecretKey() {

        return this.secretKey;
    }

    public void setSecretKey(SecretKey secretKey) {

        this.secretKey = secretKey;
    }

    public PrivateKey getPrivateKey() {

        return this.privateKey;
    }

    public void setPrivateKey(PrivateKey privateKey) {

        this.privateKey = privateKey;
    }

    public PublicKey getPublicKey() {

        return this.publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {

        this.publicKey = publicKey;
    }

}
