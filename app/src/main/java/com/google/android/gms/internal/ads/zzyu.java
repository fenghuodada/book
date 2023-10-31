package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyu implements zzyt {
    private final WindowManager zza;

    private zzyu(WindowManager windowManager) {
        this.zza = windowManager;
    }

    @Nullable
    public static zzyt zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzyu(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzb(zzyr zzyrVar) {
        zzyx.zzb(zzyrVar.zza, this.zza.getDefaultDisplay());
    }
}
