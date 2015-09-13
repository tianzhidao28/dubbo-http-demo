package cn.jpush.services.sms.dao;

import cn.jpush.services.sms.bean.Sms;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by rocyuan on 2015/9/14.
 */
public interface SmsDao {
    @Insert("INSERT INTO Sms(createTime,content,type,sendTime,sendStatus,reSend,extra) VALUE( #{createTime},#{content},#{type},#{sendTime},#{sendStatus},#{reSend},#{extra});")
    void insert(Sms sms);
}
