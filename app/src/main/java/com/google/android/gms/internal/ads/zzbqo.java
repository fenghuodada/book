package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbqo implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbqq zza;

    public zzbqo(zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent zzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzP(context, zzb);
    }
}
