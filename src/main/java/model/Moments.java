package model;

import java.util.List;

public class Moments {
	private String content;
	private String time;
	private String location;
	private String directory;
	private String avatarUrl;
	private List<String> imageUrlLlist;

	public List<String> getImageUrlLlist() {
		return imageUrlLlist;
	}

	public void setImageUrlLlist(List<String> imageUrlLlist) {
		this.imageUrlLlist = imageUrlLlist;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String numberDataTime() {
		return this.getTime().replaceAll("\\D", "");
	}


	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
}
