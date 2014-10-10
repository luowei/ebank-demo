package com.rootls.common.convert;

import com.rootls.common.Config;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;

public abstract class CertStoreFactory {

    private static HashMap<String, CertStore> certStoreMap = null;

    public static CertStore getCertStore(String name) {
        if (certStoreMap == null || certStoreMap.get(name) == null) {
            myRefresh(name);
            if (certStoreMap == null)
                return null;
        }
        return certStoreMap.get(name) == null ? null : certStoreMap.get(name);
    }

    public static void myRefresh(String path) {
        if (certStoreMap == null) {
            certStoreMap = new HashMap<String, CertStore>();
        }
        CertStore c_store = null;

        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DESede");
            c_store = new CertStore();

            InputStream input = CertStoreFactory.class.getClassLoader().getResourceAsStream(path + "/" + Config.public_name);
            if (input != null) {
                byte[] p_data = new byte[input.available()];
                input.read(p_data);
                close(input);
                PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(ConvertBase64.decodeBase64(p_data)));
                c_store.setPublicKey(publicKey);
            }

            input = CertStoreFactory.class.getClassLoader().getResourceAsStream(path + "/" + Config.private_name);
            if (input != null) {
                byte[] pr_data = new byte[input.available()];
                input.read(pr_data);
                close(input);
                PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(ConvertBase64.decodeBase64(pr_data)));
                c_store.setPrivateKey(privateKey);
            }

            input = CertStoreFactory.class.getClassLoader().getResourceAsStream(path + "/" + Config.secret_name);
            if (input != null) {
                byte[] s_data = new byte[input.available()];
                input.read(s_data);
                close(input);
                SecretKey secretKey = skf.generateSecret(new DESedeKeySpec(ConvertBase64.decodeBase64(s_data)));
                c_store.setSecretKey(secretKey);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        certStoreMap.put(path, c_store);
    }


    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
