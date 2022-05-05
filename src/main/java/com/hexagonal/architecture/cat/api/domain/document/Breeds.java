package com.hexagonal.architecture.cat.api.domain.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "breeds")
public class Breeds {

    @Id
    private String id;
    private String name;
    private String temperament;
    private String lifeSpan;
    private String altNames;
    private String wikipedia_url;
    private String origin;
    private String weigt_imperial;
    private Integer experimental;
    private Integer hairless;
    private Integer natural;
    private Integer rare;
    private Integer rex;
    private Integer suppressed_tail;
    private Integer short_legs;
    private Integer hypoallergenic;
    private Integer adaptability;
    private Integer affection_level;
    private String country_code;
    private Integer child_friendly;
    private Integer dog_friendly;
    private Integer energy_level;
    private Integer grooming;
    private Integer health_issues;
    private Integer intelligence;
    private Integer shedding_level;
    private Integer social_needs;
    private Integer stranger_friendly;
    private Integer vocalisation;
    private String description;

    public Breeds(String origin, String temperament, String description) {
        this.origin = origin;
        this.temperament = temperament;
        this.description = description;
    }
}
