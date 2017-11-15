package cn.uc.utils;
/**
 * 字符串的参数拼接类
 * @author Administrator
 *
 */
public class Constants {

	public static final int RetCode_Success=0;
	public static final int RetCode_failed=1;
	//定义mapper包的根路径
	public static final String root="cn.uc.mapper";

	/**
	 * Comment的操作方法名
	 */
	public static final String commentMapper=".CommentMapper";

	public static final String selectAll=".selectAll";
	public static final String deleteComment=".deleteComment";
	public static final String insertComment=".insertComment";
	public static final String updateComment=".updateComment";
	
	/**
	 * commet具体的操作
	 */
	public static final String commentMapper_selectAll=root+commentMapper+selectAll;
	public static final String commentMapper_delete=root+commentMapper+deleteComment;
	public static final String commentMapper_insert=root+commentMapper+insertComment;
	public static final String commentMapper_update=root+commentMapper+updateComment;
	
	/**
	 * User的操作方法名
	 */
	public static final String userMapper=".UserMapper";	
	
	public static final String selectAllUser=".getAllObj";
	public static final String deleteUser=".deleteUser";
	public static final String insertUser=".insertUser";
	public static final String updateUser=".updateUser";
	public static final String queryUserbynicknameorusername=".selectbynicknameorusername";
	public static final String userLogin=".userLogin";
	
	public static final String userMapper_selectAll=root+userMapper+selectAllUser;
	public static final String userMapper_deleteUser=root+userMapper+deleteUser;
	public static final String USERMAPPER_INSERTUSER=root+userMapper+insertUser;
	public static final String USERMAPPER_UPDATEUSER=root+userMapper+updateUser;
	public static final String USERMAPPER_SELECTUSERYNICKNAMEANDUSERNAME=root+userMapper+queryUserbynicknameorusername;
	public static final String USERMAPPER_USERLOGIN=root+userMapper+userLogin;


	/**
	 * Admin 的操作方法名
	 */
	
	public static final String AdminMapper="..AdminMapper";	
	
	public static final String adminlogin=".AdminLogin";
	
	
	public static final String ADMINMAPPER_ADMINLOGIN=root+AdminMapper+adminlogin;

	
	/**
	 * News 的操作方法名
	 */
	public static final String NewsPostMapper=".NewsPostMapper";
	
	public static final String selectAllNews=".selectAllNewsPost";
	public static final String deleteByPrimaryKey=".deleteByPrimaryKey";
	public static final String selectByLike=".selectByLike";
	public static final String insertNews=".insertNews";
	public static final String updataNews=".updateNews";
	
	
	public static final String NEWSMAPPER_SELECTBYLIKE=root+NewsPostMapper+selectByLike;
	public static final String NEWSMAPPER_SELECTALLNEWS=root+NewsPostMapper+selectAllNews;
	public static final String NEWSMAPPER_DELETEBYPRIMARYKEY=root+NewsPostMapper+deleteByPrimaryKey;
	public static final String NEWSMAPPER_INSERTNEWS=root+NewsPostMapper+insertNews;
	public static final String NEWSMAPPER_UPDATANEWS=root+NewsPostMapper+updataNews;

	
	/**
	 * NewsType的操作方法名
	 */

	public static final String NewsTypeMapper=".NewsTypeMapper";
	
	public static final String selectnewTypeByid=".selectByid";
	public static final String selectAllType=".selectAllType";
	public static final String deleteById=".deleteByid";
	public static final String insertNewType=".insertNewType";
	
	public static final String NEWSTYPEMAPPER_SELECTBYID=root+NewsTypeMapper+selectnewTypeByid;
	public static final String NEWSTYPEMAPPER_SELECTALLTYPE=root+NewsTypeMapper+selectAllType;
	public static final String NEWSTYPEMAPPER_DELETEBYID=root+NewsTypeMapper+deleteById;
	public static final String NEWSTYPEMAPPER_INSERTNEWTYPE=root+NewsTypeMapper+insertNewType;

}
