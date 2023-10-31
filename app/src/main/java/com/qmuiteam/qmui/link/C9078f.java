package com.qmuiteam.qmui.link;

import com.qmuiteam.qmui.link.C9070d;
import java.util.Comparator;

/* renamed from: com.qmuiteam.qmui.link.f */
/* loaded from: classes3.dex */
public final class C9078f implements Comparator<C9070d.C9075e> {
    @Override // java.util.Comparator
    public final int compare(C9070d.C9075e c9075e, C9070d.C9075e c9075e2) {
        int i;
        int i2;
        C9070d.C9075e c9075e3 = c9075e;
        C9070d.C9075e c9075e4 = c9075e2;
        int i3 = c9075e3.f17397b;
        int i4 = c9075e4.f17397b;
        if (i3 < i4) {
            return -1;
        }
        if (i3 > i4 || (i = c9075e3.f17398c) < (i2 = c9075e4.f17398c)) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        return 0;
    }
}
