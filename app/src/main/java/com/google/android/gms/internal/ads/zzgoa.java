package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzgoa extends IOException {
    public zzgoa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgoa(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzgoa(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
