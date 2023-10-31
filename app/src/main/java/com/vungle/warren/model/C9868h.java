package com.vungle.warren.model;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.C8686j;
import com.google.gson.C8688k;
import com.google.gson.reflect.C8696a;
import com.vungle.warren.persistence.InterfaceC9918b;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.vungle.warren.model.h */
/* loaded from: classes3.dex */
public final class C9868h implements InterfaceC9918b<C9867g> {

    /* renamed from: a */
    public final C8686j f19828a = new C8688k().m3226a();

    /* renamed from: b */
    public final Type f19829b = new C9869a().getType();

    /* renamed from: c */
    public final Type f19830c = new C9870b().getType();

    /* renamed from: d */
    public final Type f19831d = new C9871c().getType();

    /* renamed from: e */
    public final Type f19832e = new C9872d().getType();

    /* renamed from: com.vungle.warren.model.h$a */
    /* loaded from: classes3.dex */
    public class C9869a extends C8696a<Map<String, Boolean>> {
    }

    /* renamed from: com.vungle.warren.model.h$b */
    /* loaded from: classes3.dex */
    public class C9870b extends C8696a<Map<String, Integer>> {
    }

    /* renamed from: com.vungle.warren.model.h$c */
    /* loaded from: classes3.dex */
    public class C9871c extends C8696a<Map<String, Long>> {
    }

    /* renamed from: com.vungle.warren.model.h$d */
    /* loaded from: classes3.dex */
    public class C9872d extends C8696a<Map<String, String>> {
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    /* renamed from: a */
    public final ContentValues mo1413a(C9867g c9867g) {
        C9867g c9867g2 = c9867g;
        ContentValues contentValues = new ContentValues();
        contentValues.put(FirebaseAnalytics.Param.ITEM_ID, c9867g2.f19827e);
        Map<String, Boolean> map = c9867g2.f19824b;
        Type type = this.f19829b;
        C8686j c8686j = this.f19828a;
        contentValues.put("bools", c8686j.m3229i(map, type));
        contentValues.put("ints", c8686j.m3229i(c9867g2.f19825c, this.f19830c));
        contentValues.put("longs", c8686j.m3229i(c9867g2.f19826d, this.f19831d));
        contentValues.put("strings", c8686j.m3229i(c9867g2.f19823a, this.f19832e));
        return contentValues;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    @NonNull
    /* renamed from: b */
    public final C9867g mo1412b(ContentValues contentValues) {
        C9867g c9867g = new C9867g(contentValues.getAsString(FirebaseAnalytics.Param.ITEM_ID));
        String asString = contentValues.getAsString("bools");
        Type type = this.f19829b;
        C8686j c8686j = this.f19828a;
        c9867g.f19824b = (Map) c8686j.m3234d(asString, type);
        c9867g.f19826d = (Map) c8686j.m3234d(contentValues.getAsString("longs"), this.f19831d);
        c9867g.f19825c = (Map) c8686j.m3234d(contentValues.getAsString("ints"), this.f19830c);
        c9867g.f19823a = (Map) c8686j.m3234d(contentValues.getAsString("strings"), this.f19832e);
        return c9867g;
    }

    @Override // com.vungle.warren.persistence.InterfaceC9918b
    public final String tableName() {
        return "cookie";
    }
}
