package com.vasylenko.stampscollector.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "id", includeFieldNames = false)
@Document(collection = "commemorative_stamp")
public class CommemorativeStamp {
    @Id
    private Long id;
    private String emission;
    private String editionId;
    private String imagePath;
    private String inscription;
    private String seriesName;
    private Denomination.CharacterList denomination;
    private String price;
    private LocalDate printingDates;
    private Integer circulation;
    private String design;
}
