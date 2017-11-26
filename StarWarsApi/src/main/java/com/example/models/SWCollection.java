package com.example.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SWCollection <T extends SWEntity>
{
    private int count;
    private List<T> results;

    @SerializedName("next")
    private String nextPageUrl;

    @SerializedName("previous")
    private String previousPageUrl;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public String getPreviousPageUrl() {
        return previousPageUrl;
    }

    public void setPreviousPageUrl(String previousPageUrl) {
        this.previousPageUrl = previousPageUrl;
    }

    public boolean hasNextPage() {
        return nextPageUrl != null && !nextPageUrl.isEmpty();
    }

    public boolean hasPreviousPage() {
        return previousPageUrl != null && !previousPageUrl.isEmpty();
    }
}

