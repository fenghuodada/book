package com.android.tool.adapter.question;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import mva2.adapter.C11180f;
import mva2.adapter.decorator.AbstractC11178a;
import mva2.adapter.internal.C11187d;

/* renamed from: com.android.tool.adapter.question.f */
/* loaded from: classes.dex */
public final class C2546f extends AbstractC11178a {
    public C2546f(C11180f c11180f) {
        super(c11180f);
    }

    @Override // mva2.adapter.decorator.AbstractC11178a
    /* renamed from: a */
    public final void mo89a(@NonNull Rect rect, @NonNull RecyclerView recyclerView, int i) {
        boolean z;
        C11180f c11180f = this.f21835a;
        C11187d c11187d = c11180f.f21842l;
        int i2 = c11187d.f21855a.get(i, -1);
        if (i2 == -1) {
            i2 = c11180f.f21838h.mo75i(i, i, recyclerView.getLayoutManager());
            c11187d.f21855a.append(i, i2);
        }
        if ((i2 & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            rect.left += 0;
            rect.top += 0;
            rect.right += 0;
            rect.bottom += 0;
        }
        rect.left += 0;
        rect.top += 0;
        rect.right += 0;
        rect.bottom++;
    }
}
