package com.study.yojulab.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.study.yojulab.beans.BoardBean;

@Service
public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "JaeHyun!");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        // bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMamberBean());
        bundlesData.put("dataListWithBoardBean", DataInfors.getDataListWithBoardBean());

        bundlesData.put("dataListWithBoardBean", DataInfors.getDataListWithBoardBean());

        return bundlesData;
    }

    public BoardBean getDataWithBoardBean(){
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        return boardBean;
    }


    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("jacob");
        boardBean.setContent("Thorton");
        boardBean.setUserName("@fat");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Larry");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        membersList.add(boardBean);
        return membersList;
    }
    public ArrayList<BoardBean> getDataListWithBoardBeanNewsList() {
        ArrayList<BoardBean> membersList = new ArrayList<>();

        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("병역 기피 논란 석현준, 대한민국 국민으로써 회피할 생각 전혀 없었다");
        boardBean.setContent("석현준은 30일 자신의 인스타그램 계정을 통해 병역 회피설이 불거진 것에 대해 자신의 입장을 밝혔다.");
        boardBean.setUserName("sportalkorea");
        boardBean.setDate("2022.12.30");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("벤투호 상대로 힘도 못 썼던 우루과이 간판 FW, 브라질행 임박");
        boardBean.setContent("카타르 월드컵에서 벤투호를 상대로 힘도 못 쓰면서 가장 먼저 교체로 물러났던 우루과이 간판 공격수 루이스 수아레스가 브라질로 간다");
        boardBean.setUserName("밤낮고구마");
        boardBean.setDate("2023-01-15");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("[오피셜] 대한민국, 12월 FIFA 랭킹 25위…브라질 1위·아르헨 2위·일본 20위");
        boardBean.setContent("대한민국 축구 국가대표팀이 12월 국제축구연맹(FIFA) 세계 랭킹 25위에 올랐다.");
        boardBean.setUserName("강동훈 기자");
        boardBean.setDate("2022.12.23");
        membersList.add(boardBean);
        return membersList;
    }
    
    public BoardBean getDataListWithBoardBeanNewsView(String title) {
        ArrayList<BoardBean> newsList = getDataListWithBoardBeanNewsList();
        BoardBean boardBean = new BoardBean();

        for(int i = 0; i < newsList.size(); i++) {
            BoardBean view = newsList.get(i);
            if(title.equals(view.getTitle())) {
                boardBean.setTitle(view.getTitle());
                boardBean.setContent(view.getContent());
                boardBean.setUserName(view.getUserName());
                boardBean.setDate(view.getDate());
                
                return boardBean;
            } else {
                boardBean.setTitle("");
                boardBean.setContent("");
                boardBean.setUserName("");
                boardBean.setDate("");
            }
        }
        return boardBean;
    }

    public HashMap<String, Object> getDataByUid(String title) {
        ArrayList<BoardBean> viewList = getDataListWithBoardBean();
        HashMap<String, Object> hashMap = new HashMap<>();
        for(int i = 0; i < viewList.size(); i++){
            BoardBean view = viewList.get(i);
            if(title.equals(view.getTitle())){
                hashMap.put("title", view.getTitle());
                hashMap.put("content", view.getContent());
                hashMap.put("userName", view.getUserName());
                hashMap.put("date", view.getDate());
                break;
            } else {
                hashMap.put("title", "-");
                hashMap.put("content", "-");
                hashMap.put("userName", "-");
                hashMap.put("date", "-");
            }
        }
        return hashMap;
    }

    public HashMap<String, Object> getDataByParam(HashMap<String, String> params){
        HashMap<String, Object> viewData = new HashMap<>();
        viewData.put("title", params.get("title"));
        viewData.put("userName", params.get("userName"));
        viewData.put("content",  params.get("content"));
        viewData.put("date", params.get("date"));
        return viewData;
    }


}