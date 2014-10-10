
package com.rootls.common.convert;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author suzh
 *         <p/>
 *         2006-8-21
 *         <p/>
 *         生成密钥的方法
 */
public class GenerateKey {

    public GenerateKey() {

    }

    /**
     * 生成RSA密钥对
     *
     * @param pub
     * @param pri
     */
    public void generRSAKey(String pub, String pri) {

        FileOutputStream output = null;

        try {
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            // 密钥的长度
            kpg.initialize(1024);

            KeyPair kp = kpg.genKeyPair();

            PublicKey pbkey = kp.getPublic();

            PrivateKey prkey = kp.getPrivate();

            // 保存公钥

            output = new FileOutputStream(pub);

            output.write(ConvertBase64.encodeBase64(pbkey.getEncoded()));

            output.close();
            // 保存私钥
            output = new FileOutputStream(pri);

            output.write(ConvertBase64.encodeBase64(prkey.getEncoded()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (output != null) {
                    output.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 生成对称算法的密钥对象
     * <p/>
     * 文件路径
     *
     * @return
     */
    public void generSecretKey(String secret) {

        FileOutputStream output = null;

        try {
            output = new FileOutputStream(secret);

            KeyGenerator kg = KeyGenerator.getInstance("DESede");
            // 密钥的长度
            kg.init(112);

            SecretKey secretKey = kg.generateKey();

            output.write(ConvertBase64.encodeBase64(secretKey.getEncoded()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (output != null)
                    output.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        GenerateKey gener = new GenerateKey();
        //非对称密钥对
        gener.generRSAKey("d:/key/pub_key.dat",
                "d:/key/priv_key.dat");

        //对称密钥
        gener.generSecretKey("d:/key/des_key.dat");
    }

}
