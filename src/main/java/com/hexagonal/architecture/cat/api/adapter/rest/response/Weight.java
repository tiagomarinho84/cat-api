
package com.hexagonal.architecture.cat.api.adapter.rest.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weight {

    @JsonProperty("imperial")
    private String imperial;
    @JsonProperty("metric")
    private String metric;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("imperial")
    public String getImperial() {
        return imperial;
    }

    @JsonProperty("imperial")
    public void setImperial(String imperial) {
        this.imperial = imperial;
    }

    @JsonProperty("metric")
    public String getMetric() {
        return metric;
    }

    @JsonProperty("metric")
    public void setMetric(String metric) {
        this.metric = metric;
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
