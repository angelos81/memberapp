package com.hanbit.memberapp.dao;

import com.hanbit.memberapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2009 on 2016-12-17.
 */

public class MemberDao {
    public MemberBean detail(String id){
        MemberBean member = new MemberBean();
        return member;
    };

    public List<MemberBean> find(String keyword){
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    };

    public void join(MemberBean param){};

    public List<MemberBean> list(){
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    };

    public boolean login(MemberBean param){         //password가 존재하므로 은닉화
        boolean flag = false;
        return flag;
    };

    public void update(MemberBean param){};         //password가 존재하므로 은닉화

    public void delete(String id){};

    public int count(){
        int count = 0;
        return count;
    };
}
