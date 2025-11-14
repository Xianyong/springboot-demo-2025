package cn.edu.gzist.cs.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.el.parser.AstFalse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @ProjectDetails [文件上传·演示代码]
 */
@RestController
public class FileUploadController {
    @Value("${file.upload-dir}")
    private String uploadDir;

    @Value("${file.upload-local-dir}")
    private String uploadLocalDir;

    @PostMapping("/uploadfile")
    public String uploadfile(String nickname,
                             MultipartFile photo,
                             Boolean islocal,
                             HttpServletRequest request) throws IOException{
        /*注：表单里面提交的参数一定要和方法里面的参数名称和类型一致*/
        System.out.println(nickname);
        //  获取图片的原始名称
        System.out.println(photo.getOriginalFilename());
        //  取文件类型
        System.out.println((photo.getContentType()));
        //  获取Web服务器的运行目录
        String path = request.getServletContext().getRealPath(uploadDir);

        if (islocal == Boolean.TRUE && uploadLocalDir != null){
            path = uploadLocalDir;
        }
        System.out.println(path);
        saveFile(photo,path);
        return "上传成功";
    }
    public void saveFile(MultipartFile photo,String path) throws IOException{
//        判断存储的目录是否存在，如果不存在，则创建
        File dir = new File(path);
        if(!dir.exists()){
//            创建目录
            dir.mkdir();
        }

        File file = new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
