package com.demo.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.InputStream;

/**
 * @program: Spring-Boot
 * @description: FileController
 * @author: lau
 * @create: 2019-09-10 20:22
 **/
@Controller
@RequestMapping("/file")
public class FileController {
    // 获得SpringBoot提供的mongodb的GridFS对象
    @Autowired
    private GridFsTemplate gridFsTemplate;


    /**
     * 文件上传
     *
     * @param request
     *
     * @return
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public void uploadFile(HttpServletRequest request) throws Exception {
//        UserAO user = (UserAO) SecurityUtils.getSubject().getPrincipal();
        Part part = request.getPart("file");
        // 获得提交的文件名
        String fileName = part.getSubmittedFileName();
        // 获得文件输入流
        InputStream ins = part.getInputStream();
        // 获得文件类型
        String contentType = part.getContentType();
        // 将文件存储到mongodb中,mongodb 将会返回这个文件的具体信息
        ObjectId gridFSFile = gridFsTemplate.store(ins, fileName, contentType);

        return;
//        FileInfoAO fileInfo = new FileInfoAO();
//        fileInfo.setContentType(contentType);
//        fileInfo.setFileName(fileName);
//        fileInfo.setLastUpdateBy(user != null ? user.getId() : null);
//        fileInfo.setMongoFileId(gridFSFile.getId().toString());
//        return ServiceResultHelper.genResultWithSuccess(fileInfo);
    }

}
