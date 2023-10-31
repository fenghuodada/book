package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import kotlin.C10793f;

/* loaded from: classes3.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return C10793f.f21386e.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
