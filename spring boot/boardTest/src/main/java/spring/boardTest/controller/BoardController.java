package spring.boardTest.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.boardTest.domain.BoardDto;
import spring.boardTest.domain.Member;
import spring.boardTest.service.BoardService;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/write")
    public String writeForm(Model model){
        return "board/write";
    }

    @PostMapping("/write")
    public String write(@ModelAttribute BoardDto dto, HttpSession session) throws IOException {
        Member writer = (Member) session.getAttribute("loginUser");
        boardService.create(dto, writer);
        return "redirect:/";
    }

    @GetMapping
    public String list(Model model){
        model.addAttribute("boards", boardService.list());
        return "board/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model){
        model.addAttribute("board", boardService.findById(id));
        return "board/edit";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Long id, @ModelAttribute BoardDto dto) throws IOException{
        boardService.update(id, dto);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        boardService.delete(id);
        return "redirect:/";
    }
}
