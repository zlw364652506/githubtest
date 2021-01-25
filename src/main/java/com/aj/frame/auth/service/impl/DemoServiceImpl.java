package com.aj.frame.auth.service.impl;

import com.aj.frame.beans.AJInData;
import com.aj.frame.beans.AJOutData;
import com.aj.frame.um.Ids;
import com.aj.frame.um.usm.beans.User;
import com.aj.frame.auth.IdStringToken;
import com.aj.frame.auth.common.util.ProcessorCallerUtil;
import com.aj.frame.auth.service.DemoService;
import org.springframework.stereotype.Service;


@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public User getCurrentUser() throws Exception {
        AJInData inData = new AJInData(IdStringToken.auth.DefaultProcessorIds.DEMO.name());
        AJOutData ajOutData = ProcessorCallerUtil.callWait(inData);
        if (ajOutData.getCode() == Ids.Ajf.Errors.成功.getId()) {
            User rtnInfo = ajOutData.getData(User.class);
            return rtnInfo;
        } else {
            throw new Exception(ajOutData.getMessage());
        }
    }
}
