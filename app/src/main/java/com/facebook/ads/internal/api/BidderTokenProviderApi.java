package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;

@Keep
/* loaded from: classes.dex */
public interface BidderTokenProviderApi {
    @WorkerThread
    String getBidderToken(Context context);
}
