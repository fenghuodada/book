package com.adcolony.sdk;

import android.content.Context;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C10843j;
import kotlin.p061io.C10805a;
import kotlin.text.C10910b;
import kotlin.text.C10929r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.w1 */
/* loaded from: classes.dex */
public final class C2352w1 extends C2190l2 {
    @NotNull

    /* renamed from: F */
    public String f5664F;
    @NotNull

    /* renamed from: G */
    public String f5665G;

    public C2352w1(@NotNull Context context, int i, @Nullable C2100e2 c2100e2) {
        super(context, i, c2100e2);
        this.f5664F = "";
        this.f5665G = "";
    }

    @Override // com.adcolony.sdk.C2088e1, com.adcolony.sdk.InterfaceC2228o3
    /* renamed from: b */
    public final void mo9473b() {
        long j;
        if (!getDestroyed()) {
            RunnableC2294t1 runnableC2294t1 = new RunnableC2294t1(this);
            if (this.f5079D) {
                j = 1000;
            } else {
                j = 0;
            }
            C2232o6.m9556g(runnableC2294t1, j);
        }
    }

    @Override // com.adcolony.sdk.C2190l2, com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    /* renamed from: n */
    public final void mo9472n() {
        C2367y1 c2367y1;
        C2100e2 message = getMessage();
        if (message == null) {
            c2367y1 = null;
        } else {
            c2367y1 = message.f5098b;
        }
        if (c2367y1 == null) {
            c2367y1 = new C2367y1();
        }
        this.f5664F = c2367y1.m9436w("filepath");
        this.f5665G = c2367y1.m9436w("interstitial_html");
        super.mo9472n();
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: o */
    public final void mo9471o() {
        C2367y1 c2367y1;
        String m9436w;
        boolean z;
        try {
            C2100e2 message = getMessage();
            if (message == null) {
                c2367y1 = null;
            } else {
                c2367y1 = message.f5098b;
            }
            if (c2367y1 == null) {
                c2367y1 = new C2367y1();
            }
            String input = m9648r(m9465z(), C2080d1.m9665c(c2367y1.m9439t("info").m9436w("metadata"), null).m9436w("iab_filepath"));
            Pattern compile = Pattern.compile("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;");
            C10843j.m431e(compile, "compile(pattern)");
            String replacement = Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + ((Object) m9436w) + ';');
            C10843j.m430f(input, "input");
            C10843j.m430f(replacement, "replacement");
            String replaceFirst = compile.matcher(input).replaceFirst(replacement);
            C10843j.m431e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
            String mUrl = getMUrl();
            if (mUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mUrl = getBaseUrl();
            }
            loadDataWithBaseURL(mUrl, replaceFirst, "text/html", null, null);
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            mo9469t(e);
        }
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: p */
    public final /* synthetic */ void mo9470p() {
    }

    @Override // com.adcolony.sdk.C2088e1
    /* renamed from: v */
    public final /* synthetic */ String mo9468v(C2367y1 c2367y1) {
        return this.f5665G.length() > 0 ? "" : super.mo9468v(c2367y1);
    }

    @Override // com.adcolony.sdk.C2088e1
    /* renamed from: y */
    public final void mo9469t(Exception exc) {
        C2201m0.m9588d().m9689n().m9706d(exc.getClass().toString() + " during metadata injection w/ metadata = " + getInfo().m9436w("metadata"), 0, 0, true);
        C2249q remove = C2201m0.m9588d().m9692k().f5266c.remove(getInfo().m9436w("ad_session_id"));
        if (remove != null) {
            remove.m9520b();
        }
    }

    /* renamed from: z */
    public final String m9465z() {
        boolean z;
        String str;
        if (this.f5665G.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Pattern compile = Pattern.compile("script\\s*src\\s*=\\s*\"mraid.js\"");
            C10843j.m431e(compile, "compile(pattern)");
            String replacement = "script src=\"file://" + getMraidFilepath() + '\"';
            String input = this.f5665G;
            C10843j.m430f(input, "input");
            C10843j.m430f(replacement, "replacement");
            String replaceFirst = compile.matcher(input).replaceFirst(replacement);
            C10843j.m431e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
            return replaceFirst;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f5664F);
        try {
            StringBuilder sb = new StringBuilder(fileInputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read < 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read, C10910b.f21450b));
            }
            if (C10929r.m379m(this.f5664F, ".html")) {
                str = sb.toString();
            } else {
                str = "<html><script>" + ((Object) sb) + "</script></html>";
            }
            C10805a.m443a(fileInputStream, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C10805a.m443a(fileInputStream, th);
                throw th2;
            }
        }
    }
}
