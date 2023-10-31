package com.iab.omid.library.vungle.p054d;

import android.view.View;

/* renamed from: com.iab.omid.library.vungle.d.b */
/* loaded from: classes3.dex */
public final class C8847b {
    /* renamed from: a */
    public static String m2929a(View view) {
        if (view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
            } else if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            } else {
                return null;
            }
        }
        return "notAttached";
    }
}
