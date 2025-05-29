package loginBoard.board2.controller;

import jakarta.servlet.http.HttpSession;
import loginBoard.board2.dto.BoardDTO;
import loginBoard.board2.entity.Board;
import loginBoard.board2.entity.Member;
import loginBoard.board2.service.BoardService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/boards/write")
    public String writeForm(HttpSession session){
        if(session.getAttribute("loginUser") == null) {
            return "redirect:/login";
        }
        return "board-write";
    }

    @PostMapping("/boards/write")
    public String write(BoardDTO dto, HttpSession session){
        Member writer =(Member)session.getAttribute("loginUser");
        System.out.println(writer);

        if(writer == null) return "redirect:/login";
        Board abc=boardService.create(dto, writer);
        System.out.println(abc.toString());

        boardService.create(dto, writer);
        return "redirect:/boards";
    }

    @GetMapping("boards")
    public String list(Model model, HttpSession session){
        Member loginUser =(Member)session.getAttribute("loginUser");
        model.addAttribute("loginUser", loginUser);
        model.addAttribute("boards", boardService.list());
        return "board-list";
    }



}
