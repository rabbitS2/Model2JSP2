package com.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.member.db.MemberDAO;
import com.member.db.MemberDTO;

public class MemberUpdateProAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("M : MemberUpdateProAction_execute() 호출! ");
		
        // 세션 제어 
        HttpSession session = request.getSession();
        String id = (String)session.getAttribute("id");
        
        ActionForward forward = new ActionForward();
        if(id == null){
        	forward.setPath("./MemberLogin.me");
        	forward.setRedirect(true);
        	return forward;
        }
        
        
        // 한글처리
        request.setCharacterEncoding("UTF-8");
        
        
        
        
        
        // 전달된 정보를 저장(DTO)
        
        
        MemberDAO mdao = new MemberDAO();
//        MemberDTO mdto = mdao.updateMember(mdao);
        
        
        
        
        
		return null;
	}

}
































