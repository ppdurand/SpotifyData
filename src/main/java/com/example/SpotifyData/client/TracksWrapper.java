package com.example.SpotifyData.client;

public class TracksWrapper {
    private Integer total;
    private TrackObject items;

    public TracksWrapper(Integer total, TrackObject items) {
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

    public TrackObject getItems() {
        return items;
    }

    public void setItems(TrackObject items) {
        this.items = items;
    }
}
