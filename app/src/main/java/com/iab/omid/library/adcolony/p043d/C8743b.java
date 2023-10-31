package com.iab.omid.library.adcolony.p043d;

import android.view.View;

/* renamed from: com.iab.omid.library.adcolony.d.b */
/* loaded from: classes3.dex */
public final class C8743b {
    /* renamed from: a */
    public static String m3172a(View view) {
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
