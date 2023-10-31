package com.vungle.warren.downloader;

import android.util.Log;
import com.vungle.warren.downloader.AssetDownloadListener;

/* renamed from: com.vungle.warren.downloader.c */
/* loaded from: classes3.dex */
public final class RunnableC9776c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DownloadRequest f19489a;

    /* renamed from: b */
    public final /* synthetic */ AssetDownloadListener f19490b;

    public RunnableC9776c(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.Progress progress) {
        this.f19489a = downloadRequest;
        this.f19490b = assetDownloadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = AssetDownloader.f19448n;
        Log.d(str, "On progress " + this.f19489a);
        this.f19490b.mo1509b();
    }
}
