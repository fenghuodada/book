package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.C7408g0;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.drm.v */
/* loaded from: classes.dex */
public final class C6801v implements InterfaceC6800u {

    /* renamed from: d */
    public static final boolean f11049d;

    /* renamed from: a */
    public final UUID f11050a;

    /* renamed from: b */
    public final byte[] f11051b;

    /* renamed from: c */
    public final boolean f11052c;

    static {
        boolean z;
        if ("Amazon".equals(C7408g0.f13907c)) {
            String str = C7408g0.f13908d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f11049d = z;
            }
        }
        z = false;
        f11049d = z;
    }

    public C6801v(UUID uuid, byte[] bArr, boolean z) {
        this.f11050a = uuid;
        this.f11051b = bArr;
        this.f11052c = z;
    }
}
