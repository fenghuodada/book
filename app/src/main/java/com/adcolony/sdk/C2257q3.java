package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C2088e1;
import java.io.File;
import java.util.regex.Pattern;
import kotlin.C10868p;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.q3 */
/* loaded from: classes.dex */
public final class C2257q3 extends C2088e1 {

    /* renamed from: E */
    public final int f5500E;
    @Nullable

    /* renamed from: F */
    public ImageView f5501F;
    @NotNull

    /* renamed from: G */
    public String f5502G;
    @NotNull

    /* renamed from: H */
    public String f5503H;

    /* renamed from: I */
    public int f5504I;

    /* renamed from: J */
    public int f5505J;

    /* renamed from: K */
    public boolean f5506K;

    /* renamed from: L */
    public boolean f5507L;

    /* renamed from: com.adcolony.sdk.q3$a */
    /* loaded from: classes.dex */
    public final class C2258a extends C2088e1.C2091c {
        public C2258a() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2091c, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2263f().m9513a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.q3$b */
    /* loaded from: classes.dex */
    public final class C2259b extends C2088e1.C2092d {
        public C2259b() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2092d, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2263f().m9513a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.q3$c */
    /* loaded from: classes.dex */
    public final class C2260c extends C2088e1.C2093e {
        public C2260c() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2093e, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2263f().m9513a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.q3$d */
    /* loaded from: classes.dex */
    public final class C2261d extends C2088e1.C2094f {
        public C2261d() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2094f, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2263f().m9513a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.q3$e */
    /* loaded from: classes.dex */
    public final class C2262e extends C2088e1.C2095g {
        public C2262e() {
            super();
        }

        @Override // com.adcolony.sdk.C2088e1.C2095g, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2263f().m9513a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.q3$f */
    /* loaded from: classes.dex */
    public final class C2263f {
        public C2263f() {
        }

        /* renamed from: a */
        public final void m9513a() {
            C2257q3 c2257q3 = C2257q3.this;
            if (c2257q3.getModuleInitialized()) {
                return;
            }
            C2201m0.m9588d().m9691l().getClass();
            float m9524g = C2247p4.m9524g();
            C2367y1 info = c2257q3.getInfo();
            C2080d1.m9657k(C2232o6.m9543t(C2232o6.m9539x()), info, "app_orientation");
            C2080d1.m9657k(C2232o6.m9561b(c2257q3), info, "x");
            C2080d1.m9657k(C2232o6.m9553j(c2257q3), info, "y");
            C2080d1.m9657k((int) (c2257q3.getCurrentWidth() / m9524g), info, "width");
            C2080d1.m9657k((int) (c2257q3.getCurrentHeight() / m9524g), info, "height");
            C2080d1.m9660h(info, "ad_session_id", c2257q3.getAdSessionId());
        }
    }

    public C2257q3(@NotNull Context context, int i, @Nullable C2100e2 c2100e2, int i2) {
        super(context, i, c2100e2);
        this.f5500E = i2;
        this.f5502G = "";
        this.f5503H = "";
    }

    @Override // com.adcolony.sdk.C2088e1
    public /* synthetic */ int getAdc3ModuleId() {
        return this.f5500E;
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C2259b();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C2260c();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C2261d();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C2262e();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C2258a();
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    /* renamed from: h */
    public final void mo9517h(C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        this.f5502G = c2367y1.m9436w("ad_choices_filepath");
        this.f5503H = c2367y1.m9436w("ad_choices_url");
        this.f5504I = c2367y1.m9441r("ad_choices_width");
        this.f5505J = c2367y1.m9441r("ad_choices_height");
        this.f5506K = c2367y1.m9444o("ad_choices_snap_to_webview");
        this.f5507L = c2367y1.m9444o("disable_ad_choices");
        super.mo9517h(c2100e2, i, c2135i1);
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: k */
    public final /* synthetic */ boolean mo9516k(C2367y1 c2367y1, String str) {
        if (super.mo9516k(c2367y1, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: l */
    public final void mo9515l() {
        boolean z;
        Context context;
        super.mo9515l();
        boolean z2 = false;
        if (this.f5502G.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f5503H.length() > 0) {
                z2 = true;
            }
            if (z2 && (context = C2201m0.f5363a) != null && getParentContainer() != null && !this.f5507L) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                gradientDrawable.setShape(1);
                ImageView imageView = new ImageView(context);
                imageView.setImageURI(Uri.fromFile(new File(this.f5502G)));
                imageView.setBackground(gradientDrawable);
                imageView.setOnClickListener(new View$OnClickListenerC2277r3(this));
                C10868p c10868p = C10868p.f21418a;
                this.f5501F = imageView;
                m9514x();
                addView(this.f5501F);
            }
        }
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: p */
    public final void mo9470p() {
        boolean z;
        if (getMraidFilepath().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Pattern compile = Pattern.compile("script\\s*src\\s*=\\s*\"mraid.js\"");
            C10843j.m431e(compile, "compile(pattern)");
            String replacement = "script src=\"file://" + getMraidFilepath() + '\"';
            String input = getMUrl();
            C10843j.m430f(input, "input");
            C10843j.m430f(replacement, "replacement");
            String replaceFirst = compile.matcher(input).replaceFirst(replacement);
            C10843j.m431e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
            setMUrl(m9648r(replaceFirst, getInfo().m9439t("device_info").m9436w("iab_filepath")));
        }
    }

    @Override // com.adcolony.sdk.C2218o0
    public /* synthetic */ void setBounds(C2100e2 c2100e2) {
        super.setBounds(c2100e2);
        m9514x();
    }

    /* renamed from: x */
    public final void m9514x() {
        int width;
        int height;
        ImageView imageView = this.f5501F;
        if (imageView == null) {
            return;
        }
        C2201m0.m9588d().m9691l().getClass();
        Rect m9523h = C2247p4.m9523h();
        if (this.f5506K) {
            width = getCurrentWidth() + getCurrentX();
        } else {
            width = m9523h.width();
        }
        if (this.f5506K) {
            height = getCurrentHeight() + getCurrentY();
        } else {
            height = m9523h.height();
        }
        C2201m0.m9588d().m9691l().getClass();
        float m9524g = C2247p4.m9524g();
        int i = (int) (this.f5504I * m9524g);
        int i2 = (int) (this.f5505J * m9524g);
        imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, width - i, height - i2));
    }
}
