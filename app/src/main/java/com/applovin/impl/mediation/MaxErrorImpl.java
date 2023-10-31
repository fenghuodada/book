package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public class MaxErrorImpl implements MaxError {
    @Nullable
    private String adLoadFailureInfo;
    private final int errorCode;
    private final String errorMessage;
    private String loadTag;
    private final int mediatedNetworkErrorCode;
    private final String mediatedNetworkErrorMessage;
    private MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i) {
        this(i, "");
    }

    public MaxErrorImpl(int i, String str) {
        this(i, str, -1, "");
    }

    public MaxErrorImpl(int i, String str, int i2, String str2) {
        this.errorCode = i;
        this.errorMessage = StringUtils.emptyIfNull(str);
        this.mediatedNetworkErrorCode = i2;
        this.mediatedNetworkErrorMessage = StringUtils.emptyIfNull(str2);
    }

    public MaxErrorImpl(String str) {
        this(-1, str);
    }

    @Override // com.applovin.mediation.MaxError
    @Nullable
    public String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    @Override // com.applovin.mediation.MaxError
    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public String getLoadTag() {
        return this.loadTag;
    }

    @Override // com.applovin.mediation.MaxError
    public int getMediatedNetworkErrorCode() {
        return this.mediatedNetworkErrorCode;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMediatedNetworkErrorMessage() {
        return this.mediatedNetworkErrorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMessage() {
        return this.errorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    @Nullable
    public MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(@Nullable String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(@Nullable String str) {
        this.loadTag = str;
    }

    public void setWaterfall(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxError{code=" + getCode() + ", message=\"" + getMessage() + "\"");
        if (getCode() == -4205) {
            sb.append(", mediatedNetworkErrorCode=");
            sb.append(getMediatedNetworkErrorCode());
            sb.append(", mediatedNetworkErrorMessage=\"");
            sb.append(getMediatedNetworkErrorMessage());
            sb.append("\"");
        }
        sb.append("}");
        return sb.toString();
    }
}
