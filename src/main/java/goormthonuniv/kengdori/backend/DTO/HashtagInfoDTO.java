package goormthonuniv.kengdori.backend.DTO;

import goormthonuniv.kengdori.backend.domain.UserHashtag;
import lombok.Getter;

@Getter
public class HashtagInfoDTO {

    private final String hashtag;
    private final String backgroundColor;
    private final String fontColor;

    public HashtagInfoDTO(UserHashtag userHashtag) {
        this.hashtag = userHashtag.getHashtag();
        this.backgroundColor = userHashtag.getBackgroundColor();
        this.fontColor = userHashtag.getFontColor();
    }
}