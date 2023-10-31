package com.adcolony.sdk;

import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.y */
/* loaded from: classes.dex */
public final class C2365y {

    /* renamed from: a */
    public String f5682a;

    /* renamed from: b */
    public String f5683b;

    /* renamed from: c */
    public int f5684c;

    /* renamed from: d */
    public int f5685d;

    /* renamed from: e */
    public int f5686e;

    /* renamed from: f */
    public int f5687f;

    /* renamed from: g */
    public boolean f5688g;

    public C2365y(@NonNull String str) {
        this.f5682a = str;
    }

    /* renamed from: a */
    public static int m9459a(int i) {
        if (C2201m0.m9586f() && !C2201m0.m9588d().f4960B && !C2201m0.m9588d().f4961C) {
            return i;
        }
        C1169e.m11129c("The AdColonyZone API is not available while AdColony is disabled.", 0, 0, false);
        return 0;
    }
}
