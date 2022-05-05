
package com.hexagonal.architecture.cat.api.adapter.rest.response;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BreedsForNameResponse {

    @JsonProperty("weight")
    private Weight weight;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cfa_url")
    private String cfaUrl;
    @JsonProperty("vetstreet_url")
    private String vetstreetUrl;
    @JsonProperty("vcahospitals_url")
    private String vcahospitalsUrl;
    @JsonProperty("temperament")
    private String temperament;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("country_codes")
    private String countryCodes;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("description")
    private String description;
    @JsonProperty("life_span")
    private String lifeSpan;
    @JsonProperty("indoor")
    private Integer indoor;
    @JsonProperty("lap")
    private Integer lap;
    @JsonProperty("alt_names")
    private String altNames;
    @JsonProperty("adaptability")
    private Integer adaptability;
    @JsonProperty("affection_level")
    private Integer affectionLevel;
    @JsonProperty("child_friendly")
    private Integer childFriendly;
    @JsonProperty("dog_friendly")
    private Integer dogFriendly;
    @JsonProperty("energy_level")
    private Integer energyLevel;
    @JsonProperty("grooming")
    private Integer grooming;
    @JsonProperty("health_issues")
    private Integer healthIssues;
    @JsonProperty("intelligence")
    private Integer intelligence;
    @JsonProperty("shedding_level")
    private Integer sheddingLevel;
    @JsonProperty("social_needs")
    private Integer socialNeeds;
    @JsonProperty("stranger_friendly")
    private Integer strangerFriendly;
    @JsonProperty("vocalisation")
    private Integer vocalisation;
    @JsonProperty("experimental")
    private Integer experimental;
    @JsonProperty("hairless")
    private Integer hairless;
    @JsonProperty("natural")
    private Integer natural;
    @JsonProperty("rare")
    private Integer rare;
    @JsonProperty("rex")
    private Integer rex;
    @JsonProperty("suppressed_tail")
    private Integer suppressedTail;
    @JsonProperty("short_legs")
    private Integer shortLegs;
    @JsonProperty("wikipedia_url")
    private String wikipediaUrl;
    @JsonProperty("hypoallergenic")
    private Integer hypoallergenic;
    @JsonProperty("reference_image_id")
    private String referenceImageId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weight")
    public Weight getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("cfa_url")
    public String getCfaUrl() {
        return cfaUrl;
    }

    @JsonProperty("cfa_url")
    public void setCfaUrl(String cfaUrl) {
        this.cfaUrl = cfaUrl;
    }

    @JsonProperty("vetstreet_url")
    public String getVetstreetUrl() {
        return vetstreetUrl;
    }

    @JsonProperty("vetstreet_url")
    public void setVetstreetUrl(String vetstreetUrl) {
        this.vetstreetUrl = vetstreetUrl;
    }

    @JsonProperty("vcahospitals_url")
    public String getVcahospitalsUrl() {
        return vcahospitalsUrl;
    }

    @JsonProperty("vcahospitals_url")
    public void setVcahospitalsUrl(String vcahospitalsUrl) {
        this.vcahospitalsUrl = vcahospitalsUrl;
    }

    @JsonProperty("temperament")
    public String getTemperament() {
        return temperament;
    }

    @JsonProperty("temperament")
    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("country_codes")
    public String getCountryCodes() {
        return countryCodes;
    }

    @JsonProperty("country_codes")
    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("life_span")
    public String getLifeSpan() {
        return lifeSpan;
    }

    @JsonProperty("life_span")
    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @JsonProperty("indoor")
    public Integer getIndoor() {
        return indoor;
    }

    @JsonProperty("indoor")
    public void setIndoor(Integer indoor) {
        this.indoor = indoor;
    }

    @JsonProperty("lap")
    public Integer getLap() {
        return lap;
    }

    @JsonProperty("lap")
    public void setLap(Integer lap) {
        this.lap = lap;
    }

    @JsonProperty("alt_names")
    public String getAltNames() {
        return altNames;
    }

    @JsonProperty("alt_names")
    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    @JsonProperty("adaptability")
    public Integer getAdaptability() {
        return adaptability;
    }

    @JsonProperty("adaptability")
    public void setAdaptability(Integer adaptability) {
        this.adaptability = adaptability;
    }

    @JsonProperty("affection_level")
    public Integer getAffectionLevel() {
        return affectionLevel;
    }

    @JsonProperty("affection_level")
    public void setAffectionLevel(Integer affectionLevel) {
        this.affectionLevel = affectionLevel;
    }

    @JsonProperty("child_friendly")
    public Integer getChildFriendly() {
        return childFriendly;
    }

    @JsonProperty("child_friendly")
    public void setChildFriendly(Integer childFriendly) {
        this.childFriendly = childFriendly;
    }

    @JsonProperty("dog_friendly")
    public Integer getDogFriendly() {
        return dogFriendly;
    }

    @JsonProperty("dog_friendly")
    public void setDogFriendly(Integer dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    @JsonProperty("energy_level")
    public Integer getEnergyLevel() {
        return energyLevel;
    }

    @JsonProperty("energy_level")
    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    @JsonProperty("grooming")
    public Integer getGrooming() {
        return grooming;
    }

    @JsonProperty("grooming")
    public void setGrooming(Integer grooming) {
        this.grooming = grooming;
    }

    @JsonProperty("health_issues")
    public Integer getHealthIssues() {
        return healthIssues;
    }

    @JsonProperty("health_issues")
    public void setHealthIssues(Integer healthIssues) {
        this.healthIssues = healthIssues;
    }

    @JsonProperty("intelligence")
    public Integer getIntelligence() {
        return intelligence;
    }

    @JsonProperty("intelligence")
    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @JsonProperty("shedding_level")
    public Integer getSheddingLevel() {
        return sheddingLevel;
    }

    @JsonProperty("shedding_level")
    public void setSheddingLevel(Integer sheddingLevel) {
        this.sheddingLevel = sheddingLevel;
    }

    @JsonProperty("social_needs")
    public Integer getSocialNeeds() {
        return socialNeeds;
    }

    @JsonProperty("social_needs")
    public void setSocialNeeds(Integer socialNeeds) {
        this.socialNeeds = socialNeeds;
    }

    @JsonProperty("stranger_friendly")
    public Integer getStrangerFriendly() {
        return strangerFriendly;
    }

    @JsonProperty("stranger_friendly")
    public void setStrangerFriendly(Integer strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
    }

    @JsonProperty("vocalisation")
    public Integer getVocalisation() {
        return vocalisation;
    }

    @JsonProperty("vocalisation")
    public void setVocalisation(Integer vocalisation) {
        this.vocalisation = vocalisation;
    }

    @JsonProperty("experimental")
    public Integer getExperimental() {
        return experimental;
    }

    @JsonProperty("experimental")
    public void setExperimental(Integer experimental) {
        this.experimental = experimental;
    }

    @JsonProperty("hairless")
    public Integer getHairless() {
        return hairless;
    }

    @JsonProperty("hairless")
    public void setHairless(Integer hairless) {
        this.hairless = hairless;
    }

    @JsonProperty("natural")
    public Integer getNatural() {
        return natural;
    }

    @JsonProperty("natural")
    public void setNatural(Integer natural) {
        this.natural = natural;
    }

    @JsonProperty("rare")
    public Integer getRare() {
        return rare;
    }

    @JsonProperty("rare")
    public void setRare(Integer rare) {
        this.rare = rare;
    }

    @JsonProperty("rex")
    public Integer getRex() {
        return rex;
    }

    @JsonProperty("rex")
    public void setRex(Integer rex) {
        this.rex = rex;
    }

    @JsonProperty("suppressed_tail")
    public Integer getSuppressedTail() {
        return suppressedTail;
    }

    @JsonProperty("suppressed_tail")
    public void setSuppressedTail(Integer suppressedTail) {
        this.suppressedTail = suppressedTail;
    }

    @JsonProperty("short_legs")
    public Integer getShortLegs() {
        return shortLegs;
    }

    @JsonProperty("short_legs")
    public void setShortLegs(Integer shortLegs) {
        this.shortLegs = shortLegs;
    }

    @JsonProperty("wikipedia_url")
    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    @JsonProperty("wikipedia_url")
    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    @JsonProperty("hypoallergenic")
    public Integer getHypoallergenic() {
        return hypoallergenic;
    }

    @JsonProperty("hypoallergenic")
    public void setHypoallergenic(Integer hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    @JsonProperty("reference_image_id")
    public String getReferenceImageId() {
        return referenceImageId;
    }

    @JsonProperty("reference_image_id")
    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
