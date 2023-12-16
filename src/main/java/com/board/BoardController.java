package com.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";  // 'index'는 홈 페이지의 뷰 이름이어야 합니다.
    }


    @RequestMapping(value = "/board/list")
    public String boardList(Model model) {
        model.addAttribute("list", boardService.getBoardList());
        return "list";
    }

    @RequestMapping(value = "/board/add",method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }
    @RequestMapping(value = "/board/addok",method = RequestMethod.POST )
    public String addPostOK(BoardVO vo){
        int i =boardService.insertBoard(vo);
        if(i==0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공!!");
        return "redirect:list";
    }
    @RequestMapping(value = "/board/editform/{seq}",method = RequestMethod.GET)
    public String editpost(@PathVariable("seq")int seq, Model model){
        BoardVO boardVO = boardService.getBoard(seq);
        model.addAttribute("u",boardVO);
        return "editpost";
    }
    @RequestMapping(value = "/board/editok",method = RequestMethod.POST)
    public String editPostOk(BoardVO vo){
        if(boardService.updateBoard(vo)==0)
            System.out.println("데이터 수정 실패");
        else
            System.out.println("데이터 수정 성공!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/board/deleteok/{seq}",method = RequestMethod.GET)
    public String deletePostOk(@PathVariable("seq") int seq){
        int result = boardService.deleteBoard(seq);
        if(result > 0)
            return "redirect:/board/list";
        else
            System.out.println("데이터 삭제 성공!!");
        return "redirect:../list";
    }

}