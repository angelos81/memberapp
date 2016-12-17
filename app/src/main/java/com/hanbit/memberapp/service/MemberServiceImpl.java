package com.hanbit.memberapp.service;

import android.content.Context;
import android.util.Log;

import com.hanbit.memberapp.dao.MemberDao;
import com.hanbit.memberapp.domain.MemberBean;

import java.util.List;

/**
 * Created by hb2009 on 2016-12-17.
 */

public class MemberServiceImpl implements MemberService {
    MemberDao dao;

    public MemberServiceImpl(Context applicationContext) {
        dao = new MemberDao(applicationContext);
    }

    @Override
    public MemberBean detail(String id) {
        Log.d("[service.detail] id:", id);

        return dao.detail(id);
    }

    @Override
    public List<MemberBean> find(String keyword) {
        Log.d("[service.find] keyword:", keyword);

        return dao.find(keyword);
    }

    @Override
    public void join(MemberBean param) {
        Log.d("[service.join] id:", param.getId());

        dao.join(param);
    }

    @Override
    public List<MemberBean> list() {
        List<MemberBean> list = dao.list();
        if(list != null){
            Log.d("[service.list] size=", list.size()+"");
        }else{
            Log.d("[service.list]", "size=0");
        }

        return list;
    }

    @Override
    public boolean login(MemberBean param) {
        boolean flag = false;
        flag = dao.login(param);
        Log.d("[service.login] id:", param.getId());

        return flag;
    }

    @Override
    public void update(MemberBean param) {
        Log.d("[service.update] id:", param.getId());

        dao.update(param);
    }

    @Override
    public void delete(String id) {
        Log.d("[service.delete] id:", id);

        dao.delete(id);
    }

    @Override
    public int count() {
        int count = 0;
        count = dao.count();
        Log.d("[service.count] count:", count+"");

        return count;
    }
}
