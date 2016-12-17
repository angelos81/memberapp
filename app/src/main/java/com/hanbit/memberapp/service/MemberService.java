package com.hanbit.memberapp.service;

import com.hanbit.memberapp.domain.MemberBean;

import java.util.List;

/**
 * Created by hb2009 on 2016-12-17.
 */

public interface MemberService {
    public MemberBean detail(String id);
    public List<MemberBean> find(String keyword);
    public void join(MemberBean param);
    public List<MemberBean> list();
    public boolean login(MemberBean param);     //password가 존재하므로 은닉화
    public void update(MemberBean param);       //password가 존재하므로 은닉화
    public void delete(String id);
    public int count();
}
