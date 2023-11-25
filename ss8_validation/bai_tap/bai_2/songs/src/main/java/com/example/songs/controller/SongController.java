package com.example.songs.controller;

import com.example.songs.dto.SongDto;
import com.example.songs.model.Song;
import com.example.songs.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/home")
    public String showHome(Model model) {
        List<Song> songList = songService.findAll();
        model.addAttribute("song", songList);
        return "/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("songDto", new Song());
        return "/create";
    }

    @PostMapping("/save")
    public String create(@Validated @ModelAttribute SongDto songDto, BindingResult bindingResult, RedirectAttributes attributes) {

        Song song = new Song();
        // custom thì phải thêm đoạn code dưới
        new SongDto().validate(songDto, bindingResult);
        //
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        // copy dữ liệu từ songDto sang song
        BeanUtils.copyProperties(songDto, song);
        songService.save(song);
        attributes.addFlashAttribute("mess", "them moi thanh cong");
        return "redirect:/home";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam int id, Model model) {
        Song song = songService.finById(id);
        model.addAttribute("songDto", song);
        return "/update";
    }

    @PostMapping("/updateSong")
    public String update(@Validated @ModelAttribute SongDto songDto, BindingResult bindingResult, RedirectAttributes attributes) {
        Song song1 = new Song();
        // custom thì phải thêm đoạn code dưới

        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            attributes.addFlashAttribute("id",songDto.getId());
            return "/update";
        }
        // copy dữ liệu từ songDto sang song1
        BeanUtils.copyProperties(songDto, song1);
        songService.save(song1);
        attributes.addFlashAttribute("mess","chinh sua thanh cong");
        return "redirect:/home";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam int id, Model model) {
        model.addAttribute("song", songService.finById(id));
        return "/detail";
    }
}
