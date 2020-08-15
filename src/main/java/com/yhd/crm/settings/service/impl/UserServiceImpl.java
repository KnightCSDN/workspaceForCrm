package com.yhd.crm.settings.service.impl;

import com.yhd.crm.settings.dao.UserDao;
import com.yhd.crm.settings.service.UserService;
import com.yhd.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
