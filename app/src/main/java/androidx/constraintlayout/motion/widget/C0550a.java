package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.C0235r;

@SuppressLint({"LogConditional"})
/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes.dex */
public final class C0550a {
    /* renamed from: a */
    public static String m12195a(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return C0235r.m12816a("?", i);
            }
        }
        return "UNKNOWN";
    }

    /* renamed from: b */
    public static String m12194b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
