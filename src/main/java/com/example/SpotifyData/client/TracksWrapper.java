package com.example.SpotifyData.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TracksWrapper {
    private Integer total;
    private List<TrackObject> items;

    public TracksWrapper(Integer total, List<TrackObject> items) {
        this.total = total;
        this.items = items;
    }

    public TracksWrapper() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<TrackObject> getItems() {
        return items;
    }

    public void setItems(List<TrackObject> items) {
        this.items = items;
    }
}
