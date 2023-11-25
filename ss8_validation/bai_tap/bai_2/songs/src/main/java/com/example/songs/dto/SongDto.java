package com.example.songs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SongDto implements Validator {
    private int id;
    private String artist; // nghệ sĩ
    private String nameSong; // tên bài hát
    private String kindOfMusic; // thể loại nhạc

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SongDto songDto = (SongDto) target;
        if ("".equals(songDto.artist)){
            errors.rejectValue("artist",null,"yêu cầu nhập");
        }else if (songDto.artist.length()>300){
            errors.rejectValue("artist",null,"Không được quá 800 ký tự");
        } else if (!songDto.artist.matches("^[^<>'\"/;`%@!#$&,%^*()-+{}\\[\\]]*$")) {
            errors.rejectValue("artist",null,"Không chứa các kí tự đặc biệt như @ ; , . = - + , ….");
        } else if ("".equals(songDto.nameSong)) {
            errors.rejectValue("nameSong",null,"Yêu cầu nhập");
        } else if (!songDto.nameSong.matches("^[^<>'\"/;`%@!#$&,%^*()-+{}\\[\\]]*$")) {
            errors.rejectValue("nameSong", null,"Không chứa các kí tự đặc biệt như @ ; , . = - + , ….");
        } else if (songDto.nameSong.length()>800) {
            errors.rejectValue("nameSong",null,"Không vượt quá 1000 ký tự");
        } else if ("".equals(songDto.kindOfMusic)) {
            errors.rejectValue("kindOfMusic", null," Yêu cầu nhập");
        } else if (songDto.kindOfMusic.length()>1000) {
            errors.rejectValue("kindOfMusic",null,"Không vượt quá 1000 ký tự");
        } else if (!songDto.kindOfMusic.matches("^[^<>'\"/;`%@!#$&%^*()-+{}\\[\\]]*$")) {
            errors.rejectValue("kindOfMusic",null,"Không chứa các kí tự đặc biệt như @ ; . = - + , ….");
        }
    }
}
