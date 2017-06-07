package com.example.gupta.retrofitexample.Model;

/**
 * Created by Gupta on 6/2/2017.
 */

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SOAnswersResponse {

    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("has_more")
    @Expose
    private boolean hasMore;
    @SerializedName("backoff")
    @Expose
    private int backoff;
    @SerializedName("quota_max")
    @Expose
    private int quotaMax;
    @SerializedName("quota_remaining")
    @Expose
    private int quotaRemaining;

    /**
     * No args constructor for use in serialization
     */
    public SOAnswersResponse() {
    }

    /**
     * @param hasMore
     * @param quotaMax
     * @param items
     * @param backoff
     * @param quotaRemaining
     */
    public SOAnswersResponse(List<Item> items, boolean hasMore, int backoff, int quotaMax, int quotaRemaining) {
        super();
        this.items = items;
        this.hasMore = hasMore;
        this.backoff = backoff;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getBackoff() {
        return backoff;
    }

    public void setBackoff(int backoff) {
        this.backoff = backoff;
    }

    public int getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(int quotaMax) {
        this.quotaMax = quotaMax;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

}