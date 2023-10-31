package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcft implements Runnable {
    final /* synthetic */ zzcfu zza;

    public zzcft(zzcfu zzcfuVar) {
        this.zza = zzcfuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
