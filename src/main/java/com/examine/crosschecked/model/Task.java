package com.examine.crosschecked.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Task extends Basal{
    @NonNull
    private Double points;
    private Double pointsAttained;
    @NonNull
    private String todo;
    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
