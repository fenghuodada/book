package com.applovin.impl.mediation.debugger.p021ui.p022a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2905a;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2906b;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2909e;
import com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2964e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.mediation.debugger.ui.a.b */
/* loaded from: classes.dex */
public class C2927b extends AbstractView$OnClickListenerC2961d {

    /* renamed from: a */
    private final C2905a f7154a;
    @Nullable

    /* renamed from: b */
    private final C2906b f7155b;

    /* renamed from: d */
    private final List<C2957c> f7156d;

    /* renamed from: e */
    private final List<C2957c> f7157e;

    /* renamed from: f */
    private final List<C2957c> f7158f;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$a */
    /* loaded from: classes.dex */
    public class C2928a extends C2944a {

        /* renamed from: o */
        private final C2906b f7160o;

        public C2928a(C2906b c2906b, @Nullable String str, boolean z) {
            super(c2906b.m8422a().m8409c(), ((AbstractView$OnClickListenerC2961d) C2927b.this).f7300c);
            this.f7160o = c2906b;
            this.f7266d = StringUtils.createSpannedString(c2906b.m8422a().m8410b(), -16777216, 18, 1);
            this.f7267e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f7265c = z;
        }

        /* renamed from: a */
        public C2906b m8336a() {
            return this.f7160o;
        }

        @Override // com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a, com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
        /* renamed from: b */
        public boolean mo8266b() {
            return this.f7265c;
        }

        @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
        /* renamed from: c */
        public int mo8265c() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b */
    /* loaded from: classes.dex */
    public enum EnumC2929b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public C2927b(C2905a c2905a, @Nullable C2906b c2906b, Context context) {
        super(context);
        this.f7154a = c2905a;
        this.f7155b = c2906b;
        this.f7156d = m8342c();
        this.f7157e = m8341d();
        this.f7158f = m8340e();
        notifyDataSetChanged();
    }

    /* renamed from: c */
    private List<C2957c> m8342c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m8339f());
        arrayList.add(m8338g());
        if (this.f7155b != null) {
            arrayList.add(m8337h());
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C2957c> m8341d() {
        C2906b c2906b = this.f7155b;
        if (c2906b == null || c2906b.m8420c()) {
            List<C2906b> m8417a = this.f7154a.m8425e().m8417a();
            ArrayList arrayList = new ArrayList(m8417a.size());
            for (C2906b c2906b2 : m8417a) {
                C2906b c2906b3 = this.f7155b;
                if (c2906b3 == null || c2906b3.m8422a().m8412a().equals(c2906b2.m8422a().m8412a())) {
                    arrayList.add(new C2928a(c2906b2, c2906b2.m8421b() != null ? c2906b2.m8421b().m8408a() : "", this.f7155b == null));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: e */
    private List<C2957c> m8340e() {
        C2906b c2906b = this.f7155b;
        if (c2906b == null || !c2906b.m8420c()) {
            List<C2906b> m8415b = this.f7154a.m8425e().m8415b();
            ArrayList arrayList = new ArrayList(m8415b.size());
            for (C2906b c2906b2 : m8415b) {
                C2906b c2906b3 = this.f7155b;
                if (c2906b3 == null || c2906b3.m8422a().m8412a().equals(c2906b2.m8422a().m8412a())) {
                    arrayList.add(new C2928a(c2906b2, null, this.f7155b == null));
                    for (C2909e c2909e : c2906b2.m8419d()) {
                        arrayList.add(C2957c.m8254p().m8249a(c2909e.m8408a()).m8245b(c2909e.m8407b()).m8244b(true).m8253a());
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: f */
    private C2957c m8339f() {
        return C2957c.m8254p().m8249a("ID").m8245b(this.f7154a.m8430a()).m8253a();
    }

    /* renamed from: g */
    private C2957c m8338g() {
        return C2957c.m8254p().m8249a("Ad Format").m8245b(this.f7154a.m8427c()).m8253a();
    }

    /* renamed from: h */
    private C2957c m8337h() {
        return C2957c.m8254p().m8249a("Selected Network").m8245b(this.f7155b.m8422a().m8410b()).m8253a();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: a */
    public int mo8225a(int i) {
        return (i == EnumC2929b.INFO.ordinal() ? this.f7156d : i == EnumC2929b.BIDDERS.ordinal() ? this.f7157e : this.f7158f).size();
    }

    /* renamed from: a */
    public String m8344a() {
        return this.f7154a.m8428b();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: b */
    public int mo8224b() {
        return EnumC2929b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: b */
    public C2957c mo8223b(int i) {
        return i == EnumC2929b.INFO.ordinal() ? new C2964e("INFO") : i == EnumC2929b.BIDDERS.ordinal() ? new C2964e("BIDDERS") : new C2964e("WATERFALL");
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: c */
    public List<C2957c> mo8222c(int i) {
        return i == EnumC2929b.INFO.ordinal() ? this.f7156d : i == EnumC2929b.BIDDERS.ordinal() ? this.f7157e : this.f7158f;
    }
}
