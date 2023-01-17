package com.study.yojulab.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.study.yojulab.beans.BoardBean;


@Service
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
        bundlesData.put("dataWithBoardBean", dataInfors.getDataWithBoardBean());

        bundlesData.put("dataListWithBoardBean", dataInfors.getDataListWithBoardBean());
        return bundlesData;
     }

     public BoardBean getDataWithBoardBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("otto");
        boardBean.setUserName("@mdo");

        return boardBean;
     }

     public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("내가첫쨰야");
        boardBean.setContent("otto");
        boardBean.setUserName("@mdo");
        boardBean.setDate("22.10.12");
        membersList.add(boardBean);

        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("둘째야");
        boardBean02.setContent("Thornton");
        boardBean02.setUserName("@fat");
        boardBean02.setDate("22.10.12");
        membersList.add(boardBean02);

        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("셋째야");
        boardBean03.setContent("Bird");
        boardBean03.setUserName("@twitter");
        boardBean03.setDate("22.10.12");
        membersList.add(boardBean03);

        return membersList;
    }
  

    public BoardBean getDataForBoardBean(String uid){
        ArrayList<BoardBean> boardBeans = getDataListForBoard();
        BoardBean boardBean = new BoardBean();
        for (int i =0; i< boardBeans.size(); i++){
            if(boardBeans.get(i).getUserName().equals(uid)){
                boardBean = boardBeans.get(i);
            }
        }
        return boardBean;
    }
    // 월요일 실습
    public HashMap<String, Object> getDataByUid(String title){
        ArrayList<BoardBean> viewList = getDataListWithBoardBean();
        HashMap<String,Object> hashMap = new HashMap<>();
            for(int i=0; i<viewList.size(); i++){
                BoardBean view = viewList.get(i);
                if(title.equals(view.getTitle())){
                    hashMap.put("title",view.getTitle());
                    hashMap.put("content",view.getContent());
                    hashMap.put("userName",view.getUserName());
                    hashMap.put("date",view.getDate());
                    break;
                }else{
                hashMap.put("title","-");
                hashMap.put("content","-");
                hashMap.put("userName","-");
                hashMap.put("date","-");
            }
        }
        return hashMap;
    }
    // 월요일 실습 데이터 출력
    public HashMap<String,Object> getDataByParam(HashMap<String,String>params){
        HashMap<String, Object> viewData = new HashMap<>();
        viewData.put("title",params.get("title"));
        viewData.put("userName",params.get("userName"));
        viewData.put("content",params.get("content"));
        viewData.put("date",params.get("date"));
        return viewData;     
    }


    public ArrayList<BoardBean> getDataListForBoard() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("병역 기피 논란 석현준, 대한민국 국민으로써 회피할 생각 전혀 없었다");
        boardBean.setContent("석현준은 30일 자신의 인스타그램 계정을 통해 병역 회피설이 불거진 것에 대해 자신의 입장을 밝혔다      그러면서 병역 회피는 결코 없었다고 강조했다  석현준은 수많은 논란이 있었음에도 불구하고 어떠한 입장도 내놓지 않았었다.");
        boardBean.setUserName("sportalkorea");
        boardBean.setDate("2020.01.14");

        membersList.add(boardBean);
        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("벤투호 상대로 힘도 못 썼던 우루과이 간판 FW, 브라질행 임박");
        boardBean02.setContent("카타르 월드컵에서 벤투호를 상대로 힘도 못 쓰면서 가장 먼저 교체로 물러났던 우루과이 간판 공격수 루이스 수아레스가 브라질로 간다.  캄페오나투 브라질레이루 세리 A로 승격한 그레미우와 계약을 맺었다는 보도다.  본 매체(골닷컴) 브라질 에디션은 24일(한국시간) 과거 리버풀(잉글랜드)과 바르셀로나(스페인) 등에서 스타 플레이어로 명성을 떨쳤던  수아레스는 그레미우에 입단하기로 구두 합의를 마쳤다.");
        boardBean02.setUserName("밤낮고구마");
        boardBean02.setDate("2020.01.15");

        membersList.add(boardBean02);
        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("[오피셜] 대한민국, 12월 FIFA 랭킹 25위…브라질 1위·아르헨 2위·일본 20위");
        boardBean03.setContent("대한민국 축구 국가대표팀이 12월 국제축구연맹(FIFA) 세계 랭킹 25위에 올랐다.아시아축구연맹(AFC) 내 순위에서는 일본과 이란에 이어 3위 자리를 유지했다. 카타르 월드컵 성적에 따라 순위에 많은 변화가 생긴 가운데, 대한민국 축구 국가대표팀은 9.19점 오르면서 랭킹 포인트 1539.49점으로 25위에 자리했다.");
        boardBean03.setUserName("강동훈 기자");
        boardBean03.setDate("2020.01.16");

        membersList.add(boardBean03);

        BoardBean boardBean04 = new BoardBean();
        boardBean04.setTitle("극적 16강 결정 벤투호 스마트폰 시청, 카타르 월드컵 10대 명장면");
        boardBean04.setContent("대한민국 축구 대표팀이 극적으로 16강행을 확정 지었던 포르투갈전 이후 스마트폰 시청이 전 세계가 주목하는 월드컵 명장면 중 하나로 선택 받았다. 로이터 통신은 지난 18일(현지시간) 2022 국제축구연맹(FIFA) 카타르 월드컵 명장면 베스트 10을 발표 했다.  이어 마침내 16강 진출이 확정되자 한국 선수들은 감격에 젖은 팬들을 향해 달려갔다라고 선정 이유를 설명했다.");
        boardBean04.setUserName("sportalkorea");
        boardBean04.setDate("2020.01.17");
        membersList.add(boardBean04);
        return membersList;
    }
}

   


     