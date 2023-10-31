package com.applovin.impl.mediation.debugger.p021ui.p026d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.C3293f;
import com.applovin.sdk.C3393R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.c */
/* loaded from: classes.dex */
public class C2957c {

    /* renamed from: b */
    protected EnumC2960b f7264b;

    /* renamed from: c */
    protected boolean f7265c;

    /* renamed from: d */
    protected SpannedString f7266d;

    /* renamed from: e */
    protected SpannedString f7267e;

    /* renamed from: f */
    protected String f7268f;

    /* renamed from: g */
    protected String f7269g;

    /* renamed from: h */
    protected int f7270h;

    /* renamed from: i */
    protected int f7271i;

    /* renamed from: j */
    protected int f7272j;

    /* renamed from: k */
    protected int f7273k;

    /* renamed from: l */
    protected int f7274l;

    /* renamed from: m */
    protected int f7275m;

    /* renamed from: n */
    protected boolean f7276n;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$a */
    /* loaded from: classes.dex */
    public static class C2959a {

        /* renamed from: a */
        final EnumC2960b f7277a;

        /* renamed from: b */
        boolean f7278b;

        /* renamed from: c */
        SpannedString f7279c;

        /* renamed from: d */
        SpannedString f7280d;

        /* renamed from: e */
        String f7281e;

        /* renamed from: f */
        String f7282f;

        /* renamed from: g */
        int f7283g = 0;

        /* renamed from: h */
        int f7284h = 0;

        /* renamed from: i */
        int f7285i = -16777216;

        /* renamed from: j */
        int f7286j = -16777216;

        /* renamed from: k */
        int f7287k = 0;

        /* renamed from: l */
        int f7288l = 0;

        /* renamed from: m */
        boolean f7289m;

        public C2959a(EnumC2960b enumC2960b) {
            this.f7277a = enumC2960b;
        }

        /* renamed from: a */
        public C2959a m8252a(int i) {
            this.f7284h = i;
            return this;
        }

        /* renamed from: a */
        public C2959a m8251a(Context context) {
            this.f7284h = C3393R.C3395drawable.applovin_ic_disclosure_arrow;
            this.f7288l = C3293f.m7029a(C3393R.C3394color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        /* renamed from: a */
        public C2959a m8250a(SpannedString spannedString) {
            this.f7279c = spannedString;
            return this;
        }

        /* renamed from: a */
        public C2959a m8249a(String str) {
            return m8250a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: a */
        public C2959a m8248a(boolean z) {
            this.f7278b = z;
            return this;
        }

        /* renamed from: a */
        public C2957c m8253a() {
            return new C2957c(this);
        }

        /* renamed from: b */
        public C2959a m8247b(int i) {
            this.f7286j = i;
            return this;
        }

        /* renamed from: b */
        public C2959a m8246b(SpannedString spannedString) {
            this.f7280d = spannedString;
            return this;
        }

        /* renamed from: b */
        public C2959a m8245b(String str) {
            return m8246b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: b */
        public C2959a m8244b(boolean z) {
            this.f7289m = z;
            return this;
        }

        /* renamed from: c */
        public C2959a m8243c(int i) {
            this.f7288l = i;
            return this;
        }

        /* renamed from: c */
        public C2959a m8242c(String str) {
            this.f7281e = str;
            return this;
        }

        /* renamed from: d */
        public C2959a m8241d(String str) {
            this.f7282f = str;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$b */
    /* loaded from: classes.dex */
    public enum EnumC2960b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: g */
        private final int f7297g;

        EnumC2960b(int i) {
            this.f7297g = i;
        }

        /* renamed from: a */
        public int m8240a() {
            return this.f7297g;
        }

        /* renamed from: b */
        public int m8239b() {
            if (this == SECTION) {
                return C3393R.C3398layout.list_section;
            }
            if (this == SECTION_CENTERED) {
                return C3393R.C3398layout.list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? C3393R.C3398layout.list_item_detail : C3393R.C3398layout.list_item_right_detail;
        }
    }

    private C2957c(C2959a c2959a) {
        this.f7270h = 0;
        this.f7271i = 0;
        this.f7272j = -16777216;
        this.f7273k = -16777216;
        this.f7274l = 0;
        this.f7275m = 0;
        this.f7264b = c2959a.f7277a;
        this.f7265c = c2959a.f7278b;
        this.f7266d = c2959a.f7279c;
        this.f7267e = c2959a.f7280d;
        this.f7268f = c2959a.f7281e;
        this.f7269g = c2959a.f7282f;
        this.f7270h = c2959a.f7283g;
        this.f7271i = c2959a.f7284h;
        this.f7272j = c2959a.f7285i;
        this.f7273k = c2959a.f7286j;
        this.f7274l = c2959a.f7287k;
        this.f7275m = c2959a.f7288l;
        this.f7276n = c2959a.f7289m;
    }

    public C2957c(EnumC2960b enumC2960b) {
        this.f7270h = 0;
        this.f7271i = 0;
        this.f7272j = -16777216;
        this.f7273k = -16777216;
        this.f7274l = 0;
        this.f7275m = 0;
        this.f7264b = enumC2960b;
    }

    /* renamed from: a */
    public static C2959a m8267a(EnumC2960b enumC2960b) {
        return new C2959a(enumC2960b);
    }

    /* renamed from: h */
    public static int m8261h() {
        return EnumC2960b.COUNT.m8240a();
    }

    /* renamed from: p */
    public static C2959a m8254p() {
        return m8267a(EnumC2960b.RIGHT_DETAIL);
    }

    /* renamed from: b */
    public boolean mo8266b() {
        return this.f7265c;
    }

    /* renamed from: c */
    public int mo8265c() {
        return this.f7273k;
    }

    /* renamed from: c_ */
    public SpannedString mo8264c_() {
        return this.f7267e;
    }

    /* renamed from: d_ */
    public boolean mo8263d_() {
        return this.f7276n;
    }

    /* renamed from: e */
    public int mo8262e() {
        return this.f7270h;
    }

    /* renamed from: f */
    public int mo8219f() {
        return this.f7271i;
    }

    /* renamed from: g */
    public int mo8218g() {
        return this.f7275m;
    }

    /* renamed from: i */
    public int m8260i() {
        return this.f7264b.m8240a();
    }

    /* renamed from: j */
    public int m8259j() {
        return this.f7264b.m8239b();
    }

    /* renamed from: k */
    public SpannedString mo8217k() {
        return this.f7266d;
    }

    /* renamed from: l */
    public String m8258l() {
        return this.f7268f;
    }

    /* renamed from: m */
    public String m8257m() {
        return this.f7269g;
    }

    /* renamed from: n */
    public int m8256n() {
        return this.f7272j;
    }

    /* renamed from: o */
    public int m8255o() {
        return this.f7274l;
    }
}
