package com.example.gupta.retrofitexample.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Gupta on 6/5/2017.
 */

public class Item {
    @SerializedName("owner")
    @Expose
    private SOAnswersResponse.Owner owner;
    @SerializedName("is_accepted")
    @Expose
    private boolean isAccepted;
    @SerializedName("score")
    @Expose
    private int score;
    @SerializedName("last_activity_date")
    @Expose
    private int lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    private int creationDate;
    @SerializedName("answer_id")
    @Expose
    private int answerId;
    @SerializedName("question_id")
    @Expose
    private int questionId;

    /**
     * No args constructor for use in serialization
     */
    public Item() {
    }

    /**
     * @param creationDate
     * @param questionId
     * @param lastActivityDate
     * @param score
     * @param owner
     * @param answerId
     * @param isAccepted
     */
    public Item(SOAnswersResponse.Owner owner, boolean isAccepted, int score, int lastActivityDate, int creationDate, int answerId, int questionId) {
        super();
        this.owner = owner;
        this.isAccepted = isAccepted;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.creationDate = creationDate;
        this.answerId = answerId;
        this.questionId = questionId;
    }

    public SOAnswersResponse.Owner getOwner() {
        return owner;
    }

    public void setOwner(SOAnswersResponse.Owner owner) {
        this.owner = owner;
    }

    public boolean isIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(int lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

}
