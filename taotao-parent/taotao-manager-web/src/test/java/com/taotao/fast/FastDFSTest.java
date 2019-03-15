package com.taotao.fast;

import com.taotao.common.pojo.FastDFSClient;
import org.csource.fastdfs.*;
import org.junit.Test;

public class FastDFSTest {

    @Test
    public void testFileUpload() throws Exception {
        // 1、加载配置文件，配置文件中的内容就是tracker服务的地址。
        ClientGlobal.init("C:/Users/Administrator/IdeaProjects/taotao/taotao-parent/taotao-manager-web/src/main/resources/resource/client.conf");
        // 2、创建一个TrackerClient对象。直接new一个。
        TrackerClient trackerClient = new TrackerClient();
        // 3、使用TrackerClient对象创建连接，获得一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 4、创建一个StorageServer的引用，值为null
        StorageServer storageServer = null;
        // 5、创建一个StorageClient对象，需要两个参数TrackerServer对象、StorageServer的引用
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 6、使用StorageClient对象上传图片。
        //扩展名不带“.”
        String[] strings = storageClient.upload_file("D:/20160630235428.jpg", "jpg", null);
        // 7、返回数组。包含组名和图片的路径。
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void testFastDfsClient() throws Exception {
        FastDFSClient fastDFSClient = new FastDFSClient("C:/Users/Administrator/IdeaProjects/taotao/taotao-parent/taotao-manager-web/src/main/resources/resource/client.conf");
        String file = fastDFSClient.uploadFile("D:/c76d0a0828381f30c2a1c53aa4014c086f06f0af.jpg");
        System.out.println(file);
    }
}
