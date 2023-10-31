package com.applovin.impl.mediation.debugger.p021ui.p023b.p024a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.sdk.utils.C3293f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C3393R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.a */
/* loaded from: classes.dex */
public class C2944a extends C2957c {

    /* renamed from: a */
    private final C2911b f7198a;

    /* renamed from: o */
    private final Context f7199o;

    public C2944a(C2911b c2911b, Context context) {
        super(C2957c.EnumC2960b.DETAIL);
        this.f7198a = c2911b;
        this.f7199o = context;
        this.f7266d = m8317q();
        this.f7267e = m8316r();
    }

    /* renamed from: q */
    private SpannedString m8317q() {
        return StringUtils.createSpannedString(this.f7198a.m8388i(), mo8266b() ? -16777216 : -7829368, 18, 1);
    }

    /* renamed from: r */
    private SpannedString m8316r() {
        if (mo8266b()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) m8315s());
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) m8314t());
            if (this.f7198a.m8401a() == C2911b.EnumC2912a.INVALID_INTEGRATION) {
                spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
            }
            return new SpannedString(spannableStringBuilder);
        }
        return null;
    }

    /* renamed from: s */
    private SpannedString m8315s() {
        if (this.f7198a.m8393d()) {
            if (TextUtils.isEmpty(this.f7198a.m8387j())) {
                return StringUtils.createListItemDetailSpannedString(this.f7198a.m8392e() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f7198a.m8387j(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    /* renamed from: t */
    private SpannedString m8314t() {
        String str;
        int i;
        if (this.f7198a.m8392e()) {
            i = -16777216;
            if (!TextUtils.isEmpty(this.f7198a.m8386k())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f7198a.m8386k(), -16777216));
                if (this.f7198a.m8391f()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f7198a.m8385l(), -16777216));
                }
                return new SpannedString(spannableStringBuilder);
            }
            str = "Adapter Found";
        } else {
            str = "Adapter Missing";
            i = -65536;
        }
        return StringUtils.createListItemDetailSpannedString(str, i);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: b */
    public boolean mo8266b() {
        return this.f7198a.m8401a() != C2911b.EnumC2912a.MISSING;
    }

    /* renamed from: d */
    public C2911b m8318d() {
        return this.f7198a;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: e */
    public int mo8262e() {
        int m8382o = this.f7198a.m8382o();
        return m8382o > 0 ? m8382o : C3393R.C3395drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: f */
    public int mo8219f() {
        return mo8266b() ? C3393R.C3395drawable.applovin_ic_disclosure_arrow : super.mo8262e();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
    /* renamed from: g */
    public int mo8218g() {
        return C3293f.m7029a(C3393R.C3394color.applovin_sdk_disclosureButtonColor, this.f7199o);
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f7266d) + ", detailText=" + ((Object) this.f7267e) + ", network=" + this.f7198a + "}";
    }
}
