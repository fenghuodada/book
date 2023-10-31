package com.google.gson;

import com.google.gson.EnumC8579c;
import com.google.gson.EnumC8704y;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.gson.k */
/* loaded from: classes3.dex */
public final class C8688k {

    /* renamed from: a */
    public final Excluder f16504a = Excluder.f16317f;

    /* renamed from: b */
    public final EnumC8704y.C8705a f16505b = EnumC8704y.f16519a;

    /* renamed from: c */
    public final EnumC8579c.C8580a f16506c = EnumC8579c.f16313a;

    /* renamed from: d */
    public final HashMap f16507d = new HashMap();

    /* renamed from: e */
    public final ArrayList f16508e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f16509f = new ArrayList();

    /* renamed from: g */
    public final int f16510g = 2;

    /* renamed from: h */
    public final int f16511h = 2;

    /* renamed from: i */
    public boolean f16512i = true;

    /* renamed from: j */
    public boolean f16513j = false;

    /* renamed from: a */
    public final C8686j m3226a() {
        int i;
        ArrayList arrayList = this.f16508e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f16509f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        int i2 = this.f16510g;
        if (i2 != 2 && (i = this.f16511h) != 2) {
            C8575a c8575a = new C8575a(Date.class, i2, i);
            C8575a c8575a2 = new C8575a(Timestamp.class, i2, i);
            C8575a c8575a3 = new C8575a(java.sql.Date.class, i2, i);
            arrayList3.add(TypeAdapters.m3269b(Date.class, c8575a));
            arrayList3.add(TypeAdapters.m3269b(Timestamp.class, c8575a2));
            arrayList3.add(TypeAdapters.m3269b(java.sql.Date.class, c8575a3));
        }
        return new C8686j(this.f16504a, this.f16506c, this.f16507d, this.f16512i, this.f16513j, this.f16505b, arrayList, arrayList2, arrayList3);
    }
}
