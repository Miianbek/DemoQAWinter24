package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder //помогает создавать сложные объекты, избегая множество аннотаций

public class TextBoxEntity {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

}
