package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeqx implements zzeqq {
    private final zzfwc zza;
    private final Context zzb;

    public zzeqx(zzfwc zzfwcVar, Context context) {
        this.zza = zzfwcVar;
        this.zzb = context;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqx.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(3:3|(1:6)|7)|8|(3:52|53|(15:55|11|12|13|(11:15|16|17|(1:19)(3:34|(3:37|(3:40|(2:43|44)(1:42)|38)|45)|46)|20|(2:22|(5:24|(1:26)(1:32)|(1:28)|29|30))|33|(0)(0)|(0)|29|30)|48|17|(0)(0)|20|(0)|33|(0)(0)|(0)|29|30))|10|11|12|13|(0)|48|17|(0)(0)|20|(0)|33|(0)(0)|(0)|29|30) */
    /* JADX WARN: Incorrect condition in loop: B:6:0x004b */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:18:0x0092, B:20:0x00a0), top: B:55:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeqv zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqx.zzc():com.google.android.gms.internal.ads.zzeqv");
    }
}
