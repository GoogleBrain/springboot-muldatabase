package cn.k.springbootmuldatabase.sevice;

import cn.k.springbootmuldatabase.domain.UserInfo;
import cn.k.springbootmuldatabase.mapper.MapperA01;
import cn.k.springbootmuldatabase.mapper.MapperA02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppService {

    @Resource
    private MapperA01 mapperA01;

    @Resource
    private MapperA02 mapperA02;

    /**
     * 查询A01库中的数据
     *
     * @return 用户信息列表
     */
    public List<UserInfo> getUser01() {
        return mapperA01.getAllUser();
    }

    /**
     * 查询A02库中的数据
     *
     * @return 用户信息列表
     */
    public List<UserInfo> getUser02() {
        return mapperA02.getAllUser();
    }
}