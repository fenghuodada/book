package com.applovin.impl.mediation.debugger.p021ui.p025c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2910a;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2914c;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2915d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2964e;
import com.applovin.impl.sdk.utils.C3293f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.C3393R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.b */
/* loaded from: classes.dex */
public class C2953b extends AbstractView$OnClickListenerC2961d {

    /* renamed from: a */
    private final C2911b f7242a;

    /* renamed from: b */
    private List<C2957c> f7243b;

    /* renamed from: d */
    private final List<C2957c> f7244d;

    /* renamed from: e */
    private final List<C2957c> f7245e;

    /* renamed from: f */
    private final List<C2957c> f7246f;

    /* renamed from: g */
    private final List<C2957c> f7247g;

    /* renamed from: h */
    private SpannedString f7248h;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.c.b$a */
    /* loaded from: classes.dex */
    public enum EnumC2954a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public C2953b(C2911b c2911b, Context context) {
        super(context);
        this.f7242a = c2911b;
        if (c2911b.m8401a() == C2911b.EnumC2912a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f7248h = new SpannedString(spannableString);
        } else {
            this.f7248h = new SpannedString("");
        }
        this.f7243b = m8279d();
        this.f7244d = m8285a(c2911b.m8379r());
        this.f7245e = m8286a(c2911b.m8377t());
        this.f7246f = m8283b(c2911b.m8378s());
        this.f7247g = m8274h();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private int m8284a(boolean z) {
        return z ? C3393R.C3395drawable.applovin_ic_check_mark_bordered : C3393R.C3395drawable.applovin_ic_x_mark;
    }

    /* renamed from: a */
    private C2957c m8287a(C2911b.EnumC2913b enumC2913b) {
        C2957c.C2959a m8254p = C2957c.m8254p();
        if (enumC2913b == C2911b.EnumC2913b.READY) {
            m8254p.m8251a(this.f7300c);
        }
        return m8254p.m8249a("Test Mode").m8245b(enumC2913b.m8368a()).m8247b(enumC2913b.m8367b()).m8241d(enumC2913b.m8366c()).m8248a(true).m8253a();
    }

    /* renamed from: a */
    private List<C2957c> m8286a(C2914c c2914c) {
        ArrayList arrayList = new ArrayList(1);
        if (c2914c.m8365a()) {
            boolean m8364b = c2914c.m8364b();
            arrayList.add(C2957c.m8267a(m8364b ? C2957c.EnumC2960b.RIGHT_DETAIL : C2957c.EnumC2960b.DETAIL).m8249a("Cleartext Traffic").m8246b(m8364b ? null : this.f7248h).m8241d(c2914c.m8363c()).m8252a(m8284a(m8364b)).m8243c(m8282b(m8364b)).m8248a(true ^ m8364b).m8253a());
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C2957c> m8285a(List<C2915d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C2915d c2915d : list) {
                boolean m8360c = c2915d.m8360c();
                arrayList.add(C2957c.m8267a(m8360c ? C2957c.EnumC2960b.RIGHT_DETAIL : C2957c.EnumC2960b.DETAIL).m8249a(c2915d.m8362a()).m8246b(m8360c ? null : this.f7248h).m8241d(c2915d.m8361b()).m8252a(m8284a(m8360c)).m8243c(m8282b(m8360c)).m8248a(!m8360c).m8253a());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m8282b(boolean z) {
        return C3293f.m7029a(z ? C3393R.C3394color.applovin_sdk_checkmarkColor : C3393R.C3394color.applovin_sdk_xmarkColor, this.f7300c);
    }

    /* renamed from: b */
    private List<C2957c> m8283b(List<C2910a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C2910a c2910a : list) {
                boolean m8403c = c2910a.m8403c();
                arrayList.add(C2957c.m8267a(m8403c ? C2957c.EnumC2960b.RIGHT_DETAIL : C2957c.EnumC2960b.DETAIL).m8249a(c2910a.m8406a()).m8246b(m8403c ? null : this.f7248h).m8241d(c2910a.m8404b()).m8252a(m8284a(m8403c)).m8243c(m8282b(m8403c)).m8248a(!m8403c).m8253a());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private C2957c m8280c(List<String> list) {
        return C2957c.m8254p().m8249a("Region/VPN Required").m8245b(CollectionUtils.implode(list, ", ", list.size())).m8253a();
    }

    /* renamed from: d */
    private List<C2957c> m8279d() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m8278e());
        arrayList.add(m8276f());
        arrayList.add(m8275g());
        return arrayList;
    }

    /* renamed from: e */
    private C2957c m8278e() {
        C2957c.C2959a m8245b = C2957c.m8254p().m8249a("SDK").m8245b(this.f7242a.m8387j());
        if (TextUtils.isEmpty(this.f7242a.m8387j())) {
            m8245b.m8252a(m8284a(this.f7242a.m8393d())).m8243c(m8282b(this.f7242a.m8393d()));
        }
        return m8245b.m8253a();
    }

    /* renamed from: e */
    private String m8277e(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    /* renamed from: f */
    private C2957c m8276f() {
        C2957c.C2959a m8245b = C2957c.m8254p().m8249a("Adapter").m8245b(this.f7242a.m8386k());
        if (TextUtils.isEmpty(this.f7242a.m8386k())) {
            m8245b.m8252a(m8284a(this.f7242a.m8392e())).m8243c(m8282b(this.f7242a.m8392e()));
        }
        return m8245b.m8253a();
    }

    /* renamed from: g */
    private C2957c m8275g() {
        return C2957c.m8254p().m8249a("Initialization Status").m8245b(m8277e(this.f7242a.m8395b())).m8248a(false).m8253a();
    }

    /* renamed from: h */
    private List<C2957c> m8274h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f7242a.m8376u())) {
            arrayList.add(C2957c.m8267a(C2957c.EnumC2960b.DETAIL).m8249a(this.f7242a.m8376u()).m8253a());
        }
        if (this.f7242a.m8394c() != C2911b.EnumC2913b.NOT_SUPPORTED) {
            if (this.f7242a.m8383n() != null) {
                arrayList.add(m8280c(this.f7242a.m8383n()));
            }
            arrayList.add(m8287a(this.f7242a.m8394c()));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: a */
    public int mo8225a(int i) {
        return (i == EnumC2954a.INTEGRATIONS.ordinal() ? this.f7243b : i == EnumC2954a.PERMISSIONS.ordinal() ? this.f7244d : i == EnumC2954a.CONFIGURATION.ordinal() ? this.f7245e : i == EnumC2954a.DEPENDENCIES.ordinal() ? this.f7246f : this.f7247g).size();
    }

    /* renamed from: a */
    public C2911b m8288a() {
        return this.f7242a;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: b */
    public int mo8224b() {
        return EnumC2954a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: b */
    public C2957c mo8223b(int i) {
        return i == EnumC2954a.INTEGRATIONS.ordinal() ? new C2964e("INTEGRATIONS") : i == EnumC2954a.PERMISSIONS.ordinal() ? new C2964e("PERMISSIONS") : i == EnumC2954a.CONFIGURATION.ordinal() ? new C2964e("CONFIGURATION") : i == EnumC2954a.DEPENDENCIES.ordinal() ? new C2964e("DEPENDENCIES") : new C2964e("TEST ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
    /* renamed from: c */
    public List<C2957c> mo8222c(int i) {
        return i == EnumC2954a.INTEGRATIONS.ordinal() ? this.f7243b : i == EnumC2954a.PERMISSIONS.ordinal() ? this.f7244d : i == EnumC2954a.CONFIGURATION.ordinal() ? this.f7245e : i == EnumC2954a.DEPENDENCIES.ordinal() ? this.f7246f : this.f7247g;
    }

    /* renamed from: c */
    public void m8281c() {
        this.f7243b = m8279d();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
