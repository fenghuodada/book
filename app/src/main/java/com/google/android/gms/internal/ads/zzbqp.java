package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class zzbqp implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqq zza;

    public zzbqp(zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
