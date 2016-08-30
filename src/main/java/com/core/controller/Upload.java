package com.core.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class Upload {

	public void cc() {
		try {
			//上传本地文件到服务器
			// String url = "C:\\Users\\esen\\Desktop\\sun.m4a";
			// File file = new File(url);
			// byte[] buf = FileUtils.readFileToByteArray(file);

			URL ss = new URL(
					"http://song.music.response.itmf.cn/794f4b5e86df8dbf83700f32541f8cbc/57c545a7/G007/M01/1A/04/Rw0DAFS2CQGANeLaABKVEk0zum0928.m4a");
			HttpURLConnection urlc = (HttpURLConnection) ss.openConnection();
			urlc.setDoInput(true);// 设置是否要从 URL 连接读取数据,默认为true
			urlc.connect();
			InputStream bufin = urlc.getInputStream();
			ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
			int len = bufin.available();
			byte[] b = new byte[len];
			int rc = 0;
			while ((rc = bufin.read(b, 0, len)) > 0) {
				swapStream.write(b, 0, rc);
			}
			byte[] in2b = swapStream.toByteArray();
			// 实例化Jersey
			Client client = new Client();
			// 保存到数据库的名字
			String path = "http://localhost:8080/music/music/sunaa.m4a";
			// 设置请求路径
			WebResource resource = client.resource(path);
			// 发送开始 PUT
			try {
				resource.put(String.class, in2b);
				System.out.println(7);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		cc();
	}

}
