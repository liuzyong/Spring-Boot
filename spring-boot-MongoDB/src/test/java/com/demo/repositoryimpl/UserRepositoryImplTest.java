package com.demo.repositoryimpl;

import com.demo.mode.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    UserRepositoryImpl userRepository;

    @Resource
    protected MongoTemplate mongoTemplate;

    @Resource
    GridFsOperations gridOperations;

    @Resource
    MongoDbFactory mongodbFactory;

//    private String collectionName = CollectionName.BD_CommendLatitude;


    @Test
    public void testSaveUser() throws Exception {
        User user = new User();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userRepository.saveUser(user);
    }

    @Test
    public void findUserByUserName() {
        User user = userRepository.findUserByUserName("小明");
        System.out.println("user is " + user);
    }

    @Test
    public void storeFileToGridFs() throws IOException {

//        BD_CommendLatituded commend = new BDCommend();
//        commend.setBzjlbh("123");
//        commend.setHjrq(new Date());
//        commend.setJlbfz("123456");
//        commend.setJlhdz("456132");
//        commend.setJlmc("123456");
//        commend.setJlwh("filename.txt");

        String filePath = "/Users/lau/Documents/办公/H项目计划.xls";
        File sourcefile = new File(filePath);
        // 读取文件内容 (输入流)
        InputStream out = new FileInputStream(sourcefile);

        //上传文件，存储到gridfs
        String id = gridOperations.store(out, "H项目计划.xls").toString();

        System.out.println(id);

//        //查找上传的文件
//        GridFSFile gridFsdbFile = gridOperations.findOne(new Query(GridFsCriteria.where("_id").is(id)));
//
//        //通过ID获取资源文件
//        InputStream downloadStream = GridFSBuckets.create(mongodbFactory.getDb()).openDownloadStream(gridFsdbFile.getObjectId());
//        GridFsResource resource = new GridFsResource(gridFsdbFile, downloadStream);
//
//
//        //获取流并写入到文件
//        InputStream gridStream = resource.getInputStream();
//
//        //读取字节流
//        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//        byte[] buf = new byte[1024 * 100];// 100KB
//        int len = 0;
//        while ((len = gridStream.read(buf)) != -1) {
//            buffer.write(buf, 0, len);
//        }
//
//        FileUtils.writeFile("f:\\aa.txt", buffer.toByteArray());
    }

}