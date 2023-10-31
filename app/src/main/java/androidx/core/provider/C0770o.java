package androidx.core.provider;

import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.provider.o */
/* loaded from: classes.dex */
public final class C0770o {

    /* renamed from: a */
    public final Uri f2462a;

    /* renamed from: b */
    public final int f2463b;

    /* renamed from: c */
    public final int f2464c;

    /* renamed from: d */
    public final boolean f2465d;

    /* renamed from: e */
    public final int f2466e;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public C0770o(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, m13044to = 1000) int i2, boolean z, int i3) {
        uri.getClass();
        this.f2462a = uri;
        this.f2463b = i;
        this.f2464c = i2;
        this.f2465d = z;
        this.f2466e = i3;
    }
}
