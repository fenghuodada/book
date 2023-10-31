package com.vungle.warren.downloader;

import android.util.Log;
import com.vungle.warren.C9804i;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.AssetDownloader;
import java.io.IOException;

/* renamed from: com.vungle.warren.downloader.a */
/* loaded from: classes3.dex */
public final class C9774a extends AssetDownloader.AbstractRunnableC9772f {

    /* renamed from: e */
    public final /* synthetic */ DownloadRequest f19483e;

    /* renamed from: f */
    public final /* synthetic */ AssetDownloadListener f19484f;

    /* renamed from: g */
    public final /* synthetic */ AssetDownloader f19485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9774a(AssetDownloader assetDownloader, C9777d c9777d, DownloadRequest downloadRequest, C9804i c9804i) {
        super(c9777d);
        this.f19485g = assetDownloader;
        this.f19483e = downloadRequest;
        this.f19484f = c9804i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AssetDownloadListener assetDownloadListener = this.f19484f;
        AssetDownloader assetDownloader = this.f19485g;
        String str = AssetDownloader.f19448n;
        DownloadRequest downloadRequest = this.f19483e;
        VungleLogger.m1600f(str, "ttDownloadContext", String.format("Start to download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
        try {
            AssetDownloader.m1560l(assetDownloader, downloadRequest, assetDownloadListener);
        } catch (IOException e) {
            VungleLogger.m1603c("AssetDownloader#download; loadAd sequence", "cannot launch request due to " + e);
            Log.e(AssetDownloader.f19448n, "Error on launching request", e);
            assetDownloader.m1570P(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, e, 1));
        }
    }
}
