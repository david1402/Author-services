package de.telran.blog.dto;

import de.telran.blog.entity.TagsEntity;
import lombok.Data;


@Data
public class TagsDto {

    Long id;
    String text;
    String description;

    public TagsDto(){

    }

    public TagsDto(TagsEntity tagsEntity){
        this.id = tagsEntity.getId();
        this.text = tagsEntity.getText();
        this.description = tagsEntity.getDescription();
    }
}
