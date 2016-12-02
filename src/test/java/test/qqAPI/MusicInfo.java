package test.qqAPI;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

public class MusicInfo {
	public static void main(String path[]) throws Exception {
		String secret = "d83866f6f28643f4834fafc171a4bcd1";
		String appId = "25799";
		String keyWord = "她说";
		
		  URL u=new URL("http://route.showapi.com/213-1?showapi_appid="+appId+"&keyword="+keyWord+"&page=1&showapi_sign="+secret);
          InputStream in=u.openStream();
          ByteArrayOutputStream out=new ByteArrayOutputStream();
          try {
              byte buf[]=new byte[1024];
              int read = 0;
              while ((read = in.read(buf)) > 0) {
                  out.write(buf, 0, read);
              }
          }  finally {
              if (in != null) {
                  in.close();
              }
          }
          byte b[]=out.toByteArray( );
          System.out.println(new String(b,"utf-8"));
}
}
