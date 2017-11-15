package cn.uc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import org.apache.ibatis.session.SqlSession;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import com.sun.media.sound.SoftMixingSourceDataLine;

import cn.uc.bean.Comment;
import cn.uc.dao.CommentDao;
import cn.uc.utils.Constants;
import cn.uc.utils.MyBatisUtils;
import cn.uc.utils.Result;

public class CommentDaoImp   extends BaseDaoImpl<Comment> implements CommentDao {


	
	@Override
	public Result getAllObj() {
		Result result=this.quertList(Constants.commentMapper_selectAll, "");		
		return result;
	}

	@Override
	public Result insertObj(Comment obj) {
		Result result=this.insertObj(Constants.commentMapper_insert, obj);
		return result;
	}

	@Override
	public Result deleteObj(int id) {	
		Comment com=new Comment();
		com.setId(id);
		Result result=this.deleteObj(Constants.commentMapper_delete, com);
		return result;
	}

	@Override
	public Result updateObj(Comment obj) {
		Result result=this.updateObj(Constants.commentMapper_update,obj);
		return result;
	}
public static void main(String[] args) {
	Comment com=new Comment();
	CommentDao cDao=new CommentDaoImp();
	
}
	
}
