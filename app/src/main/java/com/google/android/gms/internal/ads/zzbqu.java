package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class zzbqu implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqv zza;

    public zzbqu(zzbqv zzbqvVar) {
        this.zza = zzbqvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
