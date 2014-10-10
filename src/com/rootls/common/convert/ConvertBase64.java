package com.rootls.common.convert;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class ConvertBase64 {

    private ConvertBase64() {

        super();
    }

    public static byte[] encodeBase64(byte[] data) {

        byte[] e_data = null;

        if (data != null && data.length > 0) {
            e_data = Base64.encodeBase64(data);
        }

        return e_data;
    }
    public static byte[] decodeBase64(byte[] data) {

        byte[] d_data = null;

        if (data != null && data.length > 0) {
            d_data = Base64.decodeBase64(data);
        }

        return d_data;

    }



    public static String encode(byte[] data) {

        String svalue = null;

        if (data != null && data.length > 0) {
            BASE64Encoder en = new BASE64Encoder();
//            svalue = Base64.encodeBase64String(data);
            svalue = en.encodeBuffer(data);
        }

        return svalue;
    }

    public static byte[] decode(String s_value) {

        byte[] d_data = null;

        if (s_value != null && !s_value.trim().equals("")) {
            BASE64Decoder de = new BASE64Decoder();
            try {
                d_data = de.decodeBuffer(s_value);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return d_data;

    }

}
