package com.qmuiteam.qmui.skin;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: com.qmuiteam.qmui.skin.i */
/* loaded from: classes3.dex */
public final class C9135i {

    /* renamed from: b */
    public static LinkedList<C9135i> f17562b;

    /* renamed from: a */
    public final HashMap<String, String> f17563a = new HashMap<>();

    /* renamed from: a */
    public static C9135i m2657a() {
        C9135i poll;
        LinkedList<C9135i> linkedList = f17562b;
        return (linkedList == null || (poll = linkedList.poll()) == null) ? new C9135i() : poll;
    }

    /* renamed from: e */
    public static void m2653e(@NonNull C9135i c9135i) {
        c9135i.m2654d();
        if (f17562b == null) {
            f17562b = new LinkedList<>();
        }
        if (f17562b.size() < 2) {
            f17562b.push(c9135i);
        }
    }

    /* renamed from: b */
    public final void m2656b(int i) {
        this.f17563a.put("background", String.valueOf(i));
    }

    /* renamed from: c */
    public final String m2655c() {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hashMap = this.f17563a;
        boolean z = true;
        for (String str : hashMap.keySet()) {
            String str2 = hashMap.get(str);
            if (str2 != null && !str2.isEmpty()) {
                if (!z) {
                    sb.append("|");
                }
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public final void m2654d() {
        this.f17563a.clear();
    }

    /* renamed from: f */
    public final void m2652f(int i) {
        this.f17563a.put("textColor", String.valueOf(i));
    }

    /* renamed from: g */
    public final void m2651g(int i) {
        this.f17563a.put("topSeparator", String.valueOf(i));
    }
}
