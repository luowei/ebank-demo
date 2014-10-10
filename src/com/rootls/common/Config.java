package com.rootls.common;

/**
 * Created by luowei on 2014/9/5.
 */
public class Config {

    // 上传URL
    public static final String URL_UPLOAD = "http://15.128.33.252:7001/merchant_new/UploadFile/shzs";

    // 下载URL
    public static final String URL_DOWNLOAD = "http://15.128.33.252:7001/merchant_new/DownloadFile/shzs";

    // 交易URL
    public static final String URL_CHANNEL = "http://15.128.33.252:7001/merchant_new/Tran/shzs";

    //下载银行密钥URL
    public static String getkeys_url = "http://15.128.33.252:7001/merchant_new/KeyTransfer/shzs";


    public static String mch_no = "3100000165";

    public static String mch_name = "shzs";
    public static String encoding = "GBK";
    public static int timeout = 30;
    public static String public_name = "pub_key.dat";
    public static String private_name = "priv_key.dat";
    public static String secret_name = "des_key.dat";
}
