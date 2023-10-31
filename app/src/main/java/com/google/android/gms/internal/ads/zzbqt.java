package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbqt implements DialogInterface.OnClickListener {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbqv zzc;

    public zzbqt(zzbqv zzbqvVar, String str, String str2) {
        this.zzc = zzbqvVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.zzc.zzb;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.zza;
            String str2 = this.zzb;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzt.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzc.zzg("Could not store picture.");
        }
    }
}
