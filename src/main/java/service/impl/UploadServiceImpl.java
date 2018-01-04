package service.impl;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.MomentsMapper;
import dao.UserMapper;
import model.Moments;
import service.UploadService;
@Service(value="UploadService")
public class UploadServiceImpl implements UploadService{
	@Resource
    private MomentsMapper momentsMapper;

	/**
	 * 上传照片前的数据插入数据库
	 * @param moments
	 * @return 文件夹路径
	 */
	public String addContent(Moments moments) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String time = moments.getTime();
		File file = new File(this.getClass().getResource("/").getPath());
		String destDirectory = file.getParentFile().getParentFile().getParent() + "/images/" + moments.numberDataTime();
		File directory = new File(destDirectory);
		if (!directory.exists()) {
			directory.mkdirs();
		}
		moments.setDirectory(destDirectory);
		momentsMapper.insertOne(moments);
		return destDirectory;
	}

	public void uploadImage() {
		// TODO Auto-generated method stub
		
	}

}
