package dao;

import java.util.List;

import model.Moments;
import model.User;

public interface MomentsMapper {
	List<Moments> queryAll();
    void insertOne(Moments moments);
    List<String> queryAvatarUrlList();
}
