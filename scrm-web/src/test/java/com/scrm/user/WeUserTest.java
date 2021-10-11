package com.scrm.user;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.scrm.BaseTest;
import com.scrm.dto.user.UserInfo;
import com.scrm.entity.pojo.user.WeUser;
import com.scrm.service.biz.user.WeUserService;
import com.scrm.transform.user.MWeUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liuKevin
 * @date 2021年10月09日 11:32
 */
@Slf4j
public class WeUserTest extends BaseTest {

    @Autowired
    private WeUserService weUserService;

    @Test
    public void insertTest() {
        WeUser byId = weUserService.getById(10000L);
        WeUser one = weUserService.getOne(Wrappers.lambdaQuery(WeUser.class).eq(WeUser::getUserId, "1111"));
//        List<Object> objects = weUserService.getBaseMapper().selectObjs(Wrappers.lambdaQuery(WeUser.class).eq(WeUser::getId, 10000L));
//        List<Object> objects2 = weUserService.getBaseMapper().selectObjs(Wrappers.lambdaQuery(WeUser.class).eq(WeUser::getUserId, "1111"));
        UserInfo obj = weUserService.getObj(Wrappers.lambdaQuery(WeUser.class).eq(WeUser::getId, 10000L), i -> MWeUserMapper.INSTANCE.userInfoConvert(weUserService.getById((long)i)));
//        weUserService.removeById(obj.getId());
        log.info("sss");
    }


}
