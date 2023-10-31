package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.C0470b;

/* loaded from: classes3.dex */
public final class zzhq {
    @GuardedBy("PhenotypeConstants.class")
    private static final C0470b zza = new C0470b();

    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            C0470b c0470b = zza;
            Uri uri = (Uri) c0470b.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c0470b.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
