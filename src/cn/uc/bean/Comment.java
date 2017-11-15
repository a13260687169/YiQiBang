package cn.uc.bean;

import java.util.Date;

/**
 * ���۵�javaBean
 * @author 12644
 *
 */
public class Comment {
	/**
	 * ����id
	 */
    private int id;
    /**
     * ��������
     */
    private String content;
    
    /**
     * ��������
     */
    private int thumbsCount;
    /**
     * ����ʱ��
     */
    private String createTime;
    /**
     * �����û�id
     */
    private int userId;
    /**
     * ��������id
     */
    private int newsId;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getThumbsCount() {
		return thumbsCount;
	}
	public void setThumbsCount(int thumbsCount) {
		this.thumbsCount = thumbsCount;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", thumbsCount=" + thumbsCount + ", createTime="
				+ createTime + ", userId=" + userId + ", newsId=" + newsId + "]";
	}
    
    
}
