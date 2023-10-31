package com.unity3d.services.core.api;

/* loaded from: classes3.dex */
public enum DownloadLatestWebViewStatus {
    INIT_QUEUE_NULL(0),
    INIT_QUEUE_NOT_EMPTY(1),
    MISSING_LATEST_CONFIG(2),
    BACKGROUND_DOWNLOAD_STARTED(3);
    

    /* renamed from: b */
    private final int f18574b;

    DownloadLatestWebViewStatus(int i) {
        this.f18574b = i;
    }

    public int getValue() {
        return this.f18574b;
    }
}
