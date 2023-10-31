package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.C6429b;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.g */
/* loaded from: classes.dex */
public final class C6511g {

    /* renamed from: a */
    public final C6429b f10272a;

    /* renamed from: b */
    public final byte[] f10273b;

    public C6511g(@NonNull C6429b c6429b, @NonNull byte[] bArr) {
        if (c6429b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f10272a = c6429b;
        this.f10273b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6511g) {
            C6511g c6511g = (C6511g) obj;
            if (this.f10272a.equals(c6511g.f10272a)) {
                return Arrays.equals(this.f10273b, c6511g.f10273b);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10272a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10273b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f10272a + ", bytes=[...]}";
    }
}
