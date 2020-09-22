package cn.k.springbootmuldatabase.mapper;

import cn.k.springbootmuldatabase.domain.UserInfo;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@DS(value = "slave_1")
@Mapper
public interface MapperA02 extends BaseMapper<UserInfo> {
    @Select("SELECT * FROM user_info")
    List<UserInfo> getAllUser();
}