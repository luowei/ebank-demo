package com.rootls.common.utils;

/**
 * Created by luowei on 2014/9/2.
 */

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;

public class HttpClientUtil {
    private CloseableHttpClient httpclient = null;
    private HttpPost httppost = null;
    private InputStream in = null;
    private InputStreamEntity xmlEntity = null;
    private HttpResponse response = null;
    private HttpEntity resEntity = null;
    private InputStream inputStream = null;
    private String URL;
    private String filePath;
    private int nTimeout;// 连接超时设置
    private int nMaxRetry; // 最大重复次数

    public HttpClientUtil() {
        httpclient = HttpClients.createDefault();

    }

    public HttpClientUtil createInputStreamEntity() throws FileNotFoundException {
        File file = new File(filePath);
        in = new FileInputStream(file);
        xmlEntity = new InputStreamEntity(in, file.length());
        return this;
    }

    /**
     * 功能： 关闭httpclient
     *
     * @return 无
     * @throws IOException
     */
    public void disConnect() {
        try {
            httpclient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能： 以post方式发送请求
     *
     * @return 无
     */
    public boolean post() {
        int nCnt = 0; // 执行次数
        boolean rtn = false;
        while (nCnt < nMaxRetry) {
            nCnt++;
            // 取得httppost
            httppost = new HttpPost(URL);
            // 设置请求超时
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectionRequestTimeout(nTimeout).setConnectTimeout(nTimeout)
                    .setSocketTimeout(nTimeout).build();

            // 写入报文信息
            httppost.setConfig(requestConfig);
            httppost.setHeader("Content-Type", "application/xml;charset=utf-8");
            httppost.setEntity(xmlEntity);

            try {
                response = httpclient.execute(httppost);
            } catch (IOException e) {
                System.out.println("connection timeout");
                continue;
            }
            //返回结果取得成功时，中断连接
            if (response.getStatusLine().getStatusCode() == 200) {
                rtn = true;
                break;
            }
            try {
                response.getEntity().getContent().close();
            } catch (IOException e) {
                return false;
            }
        }
        return rtn;
    } // 从服务器端读取数据

    public InputStream readData() throws IOException {
        resEntity = response.getEntity();
        inputStream = resEntity.getContent();
        return inputStream;
    }

    public String getURL() {
        return URL;
    }

    public HttpClientUtil setURL(String url) {
        URL = url;
        return this;
    }

    public int getNTimeout() {
        return nTimeout;
    }

    public HttpClientUtil setNTimeout(int timeout) {
        nTimeout = timeout;
        return this;
    }

    public int getNMaxRetry() {
        return nMaxRetry;
    }

    public HttpClientUtil setNMaxRetry(int maxRetry) {
        nMaxRetry = maxRetry;
        return this;
    }

    public String getFilePath() {
        return filePath;
    }

    public HttpClientUtil setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
}