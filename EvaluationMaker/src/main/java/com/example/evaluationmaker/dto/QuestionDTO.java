package com.example.evaluationmaker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private long questionID;
    private long authorID;
    private String subject;
    private String title;
    private String wording;

}
