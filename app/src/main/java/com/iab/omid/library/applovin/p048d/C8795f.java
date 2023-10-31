package com.iab.omid.library.applovin.p048d;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.iab.omid.library.applovin.d.f */
/* loaded from: classes3.dex */
public final class C8795f {
    /* renamed from: a */
    public static float m3028a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static View m3027b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m3026c(View view) {
        if (view.isAttachedToWindow() && view.isShown()) {
            while (view != null) {
                if (view.getAlpha() == 0.0f) {
                    return false;
                }
                view = m3027b(view);
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m3025d(View view) {
        return m3024e(view) == null;
    }

    /* renamed from: e */
    public static String m3024e(View view) {
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
