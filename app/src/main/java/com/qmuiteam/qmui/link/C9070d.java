package com.qmuiteam.qmui.link;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.Patterns;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0499a;
import com.qmuiteam.qmui.span.InterfaceC9138c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.qmuiteam.qmui.link.d */
/* loaded from: classes3.dex */
public final class C9070d {

    /* renamed from: a */
    public static final Pattern f17390a = Pattern.compile("\\+?(\\d{2,8}([- ]?\\d{3,8}){2,6}|\\d{5,20})");

    /* renamed from: b */
    public static final Pattern f17391b = Pattern.compile("^\\d+(\\.\\d+)+(-\\d+)*$");

    /* renamed from: c */
    public static final C9071a f17392c = new C9071a();

    /* renamed from: d */
    public static final C9072b f17393d = new C9072b();

    /* renamed from: e */
    public static final C9073c f17394e = new C9073c();

    /* renamed from: f */
    public static final C9074d f17395f = new C9074d();

    /* renamed from: com.qmuiteam.qmui.link.d$a */
    /* loaded from: classes3.dex */
    public class C9071a {
    }

    /* renamed from: com.qmuiteam.qmui.link.d$b */
    /* loaded from: classes3.dex */
    public class C9072b {
        /* renamed from: a */
        public final boolean m2733a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            for (int i3 = i; i3 < i2; i3++) {
                try {
                    if (spannableStringBuilder.charAt(i3) > 256) {
                        return false;
                    }
                } catch (Exception unused) {
                }
            }
            try {
                char charAt = spannableStringBuilder.charAt(i2);
                if (charAt < 256 && "[$]".indexOf(charAt) < 0) {
                    if (!Character.isWhitespace(charAt)) {
                        return false;
                    }
                }
            } catch (Exception unused2) {
            }
            if (i == 0) {
                return true;
            }
            return spannableStringBuilder.charAt(i - 1) != '@';
        }
    }

    /* renamed from: com.qmuiteam.qmui.link.d$c */
    /* loaded from: classes3.dex */
    public class C9073c {
        /* renamed from: a */
        public final boolean m2732a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                if (Character.isDigit(spannableStringBuilder.charAt(i)) && (i3 = i3 + 1) >= 7) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }

    /* renamed from: com.qmuiteam.qmui.link.d$d */
    /* loaded from: classes3.dex */
    public class C9074d {
    }

    /* renamed from: com.qmuiteam.qmui.link.d$e */
    /* loaded from: classes3.dex */
    public static class C9075e {

        /* renamed from: a */
        public String f17396a;

        /* renamed from: b */
        public int f17397b;

        /* renamed from: c */
        public int f17398c;
    }

    /* renamed from: com.qmuiteam.qmui.link.d$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC9076f extends URLSpan implements InterfaceC9067a {

        /* renamed from: a */
        public boolean f17399a;

        /* renamed from: b */
        public final String f17400b;

        /* renamed from: c */
        public final InterfaceC9138c f17401c;

        public AbstractC9076f(String str, InterfaceC9138c interfaceC9138c) {
            super(str);
            this.f17399a = false;
            this.f17400b = str;
            this.f17401c = interfaceC9138c;
        }

        @Override // com.qmuiteam.qmui.link.InterfaceC9067a
        /* renamed from: b */
        public final void mo2649b(boolean z) {
            this.f17399a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan, com.qmuiteam.qmui.link.InterfaceC9067a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                com.qmuiteam.qmui.span.c r0 = r9.f17401c
                com.qmuiteam.qmui.widget.textview.QMUILinkTextView r0 = (com.qmuiteam.qmui.widget.textview.QMUILinkTextView) r0
                r0.getClass()
                java.lang.String r1 = r9.f17400b
                java.lang.String r2 = "LinkTextView"
                if (r1 != 0) goto L10
                java.lang.String r0 = "onSpanClick interrupt null text"
                goto L46
            L10:
                long r3 = android.os.SystemClock.uptimeMillis()
                long r5 = r0.f17968r
                long r3 = r3 - r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "onSpanClick clickUpTime: "
                r5.<init>(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                android.util.Log.w(r2, r5)
                com.qmuiteam.qmui.widget.textview.QMUILinkTextView$a r5 = r0.f17969s
                r6 = 1000(0x3e8, float:1.401E-42)
                boolean r7 = r5.hasMessages(r6)
                if (r7 == 0) goto L3a
                r5.removeMessages(r6)
                r1 = 0
                r0.f17968r = r1
                goto L71
            L3a:
                r7 = 200(0xc8, double:9.9E-322)
                int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r0 >= 0) goto L4a
                java.lang.String r0 = "onSpanClick interrupted because of TAP_TIMEOUT: "
                java.lang.String r0 = com.applovin.impl.sdk.p033e.C3132a0.m7696a(r0, r3)
            L46:
                android.util.Log.w(r2, r0)
                goto L71
            L4a:
                android.net.Uri r0 = android.net.Uri.parse(r1)
                java.lang.String r0 = r0.getScheme()
                if (r0 == 0) goto L58
                java.lang.String r0 = r0.toLowerCase()
            L58:
                java.util.HashSet r2 = com.qmuiteam.qmui.widget.textview.QMUILinkTextView.f17961t
                boolean r0 = r2.contains(r0)
                if (r0 == 0) goto L73
                long r7 = com.qmuiteam.qmui.widget.textview.QMUILinkTextView.f17962u
                long r7 = r7 - r3
                r5.removeMessages(r6)
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r6
                r0.obj = r1
                r5.sendMessageDelayed(r0, r7)
            L71:
                r0 = 1
                goto L74
            L73:
                r0 = 0
            L74:
                if (r0 == 0) goto L77
                return
            L77:
                super.onClick(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.link.C9070d.AbstractC9076f.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public static void m2735a(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, Pattern pattern, String[] strArr, C9072b c9072b) {
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (c9072b == null || c9072b.m2733a(spannableStringBuilder, start, end)) {
                C9075e c9075e = new C9075e();
                c9075e.f17396a = m2734b(matcher.group(0), strArr, matcher, null);
                c9075e.f17397b = start;
                c9075e.f17398c = end;
                arrayList.add(c9075e);
            }
        }
    }

    /* renamed from: b */
    public static String m2734b(String str, String[] strArr, Matcher matcher, C9074d c9074d) {
        boolean z;
        if (c9074d != null) {
            str = Patterns.digitsAndPlusOnly(matcher);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArr[i];
                if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                    z = true;
                    if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                        StringBuilder m12383b = C0499a.m12383b(str2);
                        m12383b.append(str.substring(str2.length()));
                        str = m12383b.toString();
                    }
                } else {
                    i++;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return C0484a.m12392a(new StringBuilder(), strArr[0], str);
        }
        return str;
    }
}
