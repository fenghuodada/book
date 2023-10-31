package com.vungle.warren.utility;

import com.ambrose.overwall.R;
import java.util.HashSet;

/* renamed from: com.vungle.warren.utility.e */
/* loaded from: classes3.dex */
public final class C10083e {

    /* renamed from: a */
    public static final int[] f20309a = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: b */
    public static final int[] f20310b = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: a */
    public static synchronized void m1275a(String str, HashSet hashSet) {
        synchronized (C10083e.class) {
            hashSet.add(str);
        }
    }

    /* renamed from: b */
    public static synchronized HashSet m1274b(HashSet hashSet) {
        HashSet hashSet2;
        synchronized (C10083e.class) {
            hashSet2 = new HashSet(hashSet);
        }
        return hashSet2;
    }
}
