package com.study.yojulab.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.study.yojulab.beans.BoardBean;

public class DataInfors {
    //Search 인풋
    public HashMap<String, String> getSearchFormData() {

        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "이재현");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    // 테이블
    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    // 다른 유형 합치기 모든 유형을 넣어서 골라 쓰기
    public HashMap<String, Object> getBundlesData() {
        DataInfors dataInfors = new DataInfors();
        HashMap<String, String> searchForm = dataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = dataInfors.getTablesListWithString();

        //둘 데이터 합침
        HashMap<String, Object> bundlesData = new HashMap<>();
        
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        //데이터 통채로 담아서 옮기기
        bundlesData.put("dataListWithMemberBean", dataInfors.getDataWithMemberBean());

        bundlesData.put("dataListWithMemberBean", dataInfors.getDataListWithMemberBean());
        return bundlesData;
     }

     public BoardBean getDataWithMemberBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("otto");
        boardBean.setUserName("@mdo");

        return boardBean;
     }

     public ArrayList<BoardBean> getDataListWithMemberBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("otto");
        boardBean.setUserName("@mdo");
        
        boardBean.setDate("22.10.12");
        membersList.add(boardBean);

        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("Jacob");
        boardBean02.setContent("Thornton");
        boardBean02.setUserName("@fat");
        boardBean02.setDate("22.10.12");
        membersList.add(boardBean02);

        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("Larry");
        boardBean03.setContent("Bird");
        boardBean03.setUserName("@twitter");
        boardBean03.setDate("22.10.12");
        membersList.add(boardBean03);

        return membersList;
    }

    public ArrayList<BoardBean> getDataListWithMemberBean2(){
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Hello");
        boardBean.setContent("Hello world!");
        boardBean.setUserName("@mdo");
        boardBean.setDate("22.10.11");
        membersList.add(boardBean);
    
        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("HEY");
        boardBean02.setContent("HELL CODING");
        boardBean02.setUserName("@FUC");
        boardBean02.setDate("23.10.11");
        membersList.add(boardBean02);

        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("YOU");
        boardBean03.setContent("MY NAME IS");
        boardBean03.setUserName("@FCK");
        boardBean03.setDate("21.10.11");
        membersList.add(boardBean03);
    
        return membersList;
    }

    public BoardBean getViewContents(String title) {
        BoardBean boardBean = new BoardBean();
        for (BoardBean viewContent : getDataListWithMemberBean2()){
                if(title.equals(viewContent.getTitle())) {
                    boardBean.setTitle(viewContent.getTitle());
                    boardBean.setContent(viewContent.getContent());
                    boardBean.setUserName(viewContent.getUserName());
                    boardBean.setDate(viewContent.getDate());

                    break;
                } else {
                    boardBean.setTitle("Error");
                    boardBean.setContent("Error");
                    boardBean.setUserName("Error");
                    boardBean.setDate("Error");
                }
        }
                return boardBean;
    }

}

     