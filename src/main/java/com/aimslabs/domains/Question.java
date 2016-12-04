package com.aimslabs.domains;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by sayemkcn on 11/9/16.
 */
@Entity
public class Question extends BaseEntity {

    //change the name of the field. Instead of name. questionTitle is added
    private String questionTitle;
    @Column(unique = true)
    private int questionId;
    @Column(length = 10000000)
    @Basic(fetch = FetchType.LAZY, optional = true)
    private byte[] file;
    private String positiveText;
    private String negativeText;
    private boolean autismDetectedForPositiveText;
    private boolean critical;

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getPositiveText() {
        return positiveText;
    }

    public void setPositiveText(String positiveText) {
        this.positiveText = positiveText;
    }

    public String getNegativeText() {
        return negativeText;
    }

    public void setNegativeText(String negativeText) {
        this.negativeText = negativeText;
    }

    public boolean isAutismDetectedForPositiveText() {
        return autismDetectedForPositiveText;
    }

    public void setAutismDetectedForPositiveText(boolean autismDetectedForPositiveText) {
        this.autismDetectedForPositiveText = autismDetectedForPositiveText;
    }

    public boolean isCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionTitle='" + questionTitle + '\'' +
                ", questionId=" + questionId +
                ", file=" + Arrays.toString(file) +
                ", positiveText='" + positiveText + '\'' +
                ", negativeText='" + negativeText + '\'' +
                ", autismDetectedForPositiveText=" + autismDetectedForPositiveText +
                ", critical=" + critical +
                '}';
    }
}
