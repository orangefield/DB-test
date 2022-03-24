package site.metacoding.dbtest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import site.metacoding.dbtest.domain.boardTbl.BoardTbl;
import site.metacoding.dbtest.domain.boardTbl.BoardTblRepository;

@Controller
public class BoardTblController {

    private BoardTblRepository boardTblRepository;

    public BoardTblController(BoardTblRepository boardTblRepository) {
        this.boardTblRepository = boardTblRepository;
    }

    @GetMapping("/search")
    public String search(Model model) {

        List<BoardTbl> boards = boardTblRepository.findAll();
        model.addAttribute("boards", boards);

        return "home";
    }
}
