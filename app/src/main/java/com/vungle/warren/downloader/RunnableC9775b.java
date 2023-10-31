package com.vungle.warren.downloader;

import com.vungle.warren.C9804i;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.warren.downloader.b */
/* loaded from: classes3.dex */
public final class RunnableC9775b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DownloadRequest f19486a;

    /* renamed from: b */
    public final /* synthetic */ AssetDownloadListener f19487b;

    /* renamed from: c */
    public final /* synthetic */ AssetDownloader f19488c;

    public RunnableC9775b(AssetDownloader assetDownloader, DownloadRequest downloadRequest, C9804i c9804i) {
        this.f19488c = assetDownloader;
        this.f19486a = downloadRequest;
        this.f19487b = c9804i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19488c.m1570P(this.f19486a, this.f19487b, new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1));
    }
}
