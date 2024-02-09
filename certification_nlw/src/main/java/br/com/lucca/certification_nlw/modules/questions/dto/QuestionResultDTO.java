package br.com.lucca.certification_nlw.modules.questions.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResultDTO {
    
    private UUID id;
    private String technology;
    private String description;

    private List<AlternativeResultDTO> alternatives;
}
