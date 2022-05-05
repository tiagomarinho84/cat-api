package com.hexagonal.architecture.cat.api.domain.document;

import com.hexagonal.architecture.cat.api.adapter.rest.response.Image;
import com.hexagonal.architecture.cat.api.adapter.rest.response.Weight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "allBreeds")
public class AllBreeds {

    private Weight weight;
    @Id
    private String id;
    private String name;
    private String temperament;
    private String origin;
    private String countryCodes;
    private String countryCode;
    private String description;
    private String lifeSpan;
    private Integer indoor;
    private Integer lap;
    private String altNames;
    private Integer adaptability;
    private Integer affectionLevel;
    private Integer childFriendly;
    private Integer dogFriendly;
    private Integer energyLevel;
    private Integer grooming;
    private Integer healthIssues;
    private Integer intelligence;
    private Integer sheddingLevel;
    private Integer socialNeeds;
    private Integer strangerFriendly;
    private Integer vocalisation;
    private Integer experimental;
    private Integer hairless;
    private Integer natural;
    private Integer rare;
    private Integer rex;
    private Integer suppressedTail;
    private Integer shortLegs;
    private String wikipediaUrl;
    private Integer hypoallergenic;
    private String referenceImageId;
    private Image image;
}
