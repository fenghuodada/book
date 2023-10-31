package com.qmuiteam.qmui.skin;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.util.C9145f;

/* renamed from: com.qmuiteam.qmui.skin.f */
/* loaded from: classes3.dex */
public final class C9106f {

    /* renamed from: a */
    public static final /* synthetic */ int f17535a = 0;

    static {
        C9135i.m2657a();
    }

    /* renamed from: a */
    public static void m2679a(int i, @NonNull View view) {
        C9145f.m2637d(i, view.getContext(), m2678b(view));
    }

    /* renamed from: b */
    public static Resources.Theme m2678b(@NonNull View view) {
        int i;
        C9108h.C9114f m2668h = C9108h.m2668h(view);
        if (m2668h != null && (i = m2668h.f17561b) >= 0) {
            C9108h.C9113e c9113e = C9108h.m2667i(view.getContext(), m2668h.f17560a).f17553d.get(i);
            if (c9113e != null) {
                return c9113e.m2662a();
            }
            return null;
        }
        return view.getContext().getTheme();
    }

    /* renamed from: c */
    public static void m2677c(@NonNull View view, String str) {
        view.setTag(R.id.qmui_skin_value, str);
        C9108h.C9114f m2668h = C9108h.m2668h(view);
        if (m2668h != null) {
            C9108h m2667i = C9108h.m2667i(view.getContext(), m2668h.f17560a);
            SparseArray<C9108h.C9113e> sparseArray = m2667i.f17553d;
            int i = m2668h.f17561b;
            C9108h.C9113e c9113e = sparseArray.get(i);
            if (c9113e != null) {
                m2667i.m2674b(view, i, c9113e.m2662a());
            }
        }
    }
}
