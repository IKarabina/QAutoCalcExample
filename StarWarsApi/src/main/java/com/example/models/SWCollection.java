package com.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class SWCollection <T extends SWEntity>
{
    private int count;
    private List<T> results;

    @SerializedName("next")
    private String nextPageUrl;

    @SerializedName("previous")
    private String previousPageUrl;

    public boolean hasNextPage() {
        return nextPageUrl != null && !nextPageUrl.isEmpty();
    }

    public boolean hasPreviousPage() {
        return previousPageUrl != null && !previousPageUrl.isEmpty();
    }
}

