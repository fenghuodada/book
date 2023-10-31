package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class zzfap {
    private final Pattern zza;

    @VisibleForTesting
    public zzfap() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgE));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    @Nullable
    public final String zza(@Nullable String str) {
        Pattern pattern = this.zza;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
