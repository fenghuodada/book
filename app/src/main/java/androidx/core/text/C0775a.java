package androidx.core.text;

import android.text.SpannableStringBuilder;
import androidx.core.text.C0790l;

/* renamed from: androidx.core.text.a */
/* loaded from: classes.dex */
public final class C0775a {

    /* renamed from: d */
    public static final String f2475d;

    /* renamed from: e */
    public static final String f2476e;

    /* renamed from: f */
    public static final C0775a f2477f;

    /* renamed from: g */
    public static final C0775a f2478g;

    /* renamed from: a */
    public final boolean f2479a;

    /* renamed from: b */
    public final int f2480b;

    /* renamed from: c */
    public final InterfaceC0789k f2481c;

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes.dex */
    public static class C0776a {

        /* renamed from: e */
        public static final byte[] f2482e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f2483a;

        /* renamed from: b */
        public final int f2484b;

        /* renamed from: c */
        public int f2485c;

        /* renamed from: d */
        public char f2486d;

        static {
            for (int i = 0; i < 1792; i++) {
                f2482e[i] = Character.getDirectionality(i);
            }
        }

        public C0776a(CharSequence charSequence) {
            this.f2483a = charSequence;
            this.f2484b = charSequence.length();
        }

        /* renamed from: a */
        public final byte m11819a() {
            CharSequence charSequence = this.f2483a;
            char charAt = charSequence.charAt(this.f2485c - 1);
            this.f2486d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f2485c);
                this.f2485c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2485c--;
            char c = this.f2486d;
            if (c < 1792) {
                return f2482e[c];
            }
            return Character.getDirectionality(c);
        }
    }

    static {
        C0790l.C0794d c0794d = C0790l.f2494c;
        f2475d = Character.toString((char) 8206);
        f2476e = Character.toString((char) 8207);
        f2477f = new C0775a(false, 2, c0794d);
        f2478g = new C0775a(true, 2, c0794d);
    }

    public C0775a(boolean z, int i, C0790l.C0794d c0794d) {
        this.f2479a = z;
        this.f2480b = i;
        this.f2481c = c0794d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.f2485c <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        switch(r0.m11819a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L59;
            case 17: goto L59;
            case 18: goto L55;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m11822a(java.lang.CharSequence r9) {
        /*
            androidx.core.text.a$a r0 = new androidx.core.text.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f2485c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f2485c
            int r5 = r0.f2484b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f2483a
            char r4 = r5.charAt(r4)
            r0.f2486d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f2485c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f2485c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f2485c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f2485c
            int r4 = r4 + r7
            r0.f2485c = r4
            char r4 = r0.f2486d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = androidx.core.text.C0775a.C0776a.f2482e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.f2485c
            if (r2 <= 0) goto L8f
            byte r2 = r0.m11819a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = r7
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.C0775a.m11822a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        return 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m11821b(java.lang.CharSequence r6) {
        /*
            androidx.core.text.a$a r0 = new androidx.core.text.a$a
            r0.<init>(r6)
            int r6 = r0.f2484b
            r0.f2485c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f2485c
            if (r3 <= 0) goto L41
            byte r3 = r0.m11819a()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.C0775a.m11821b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public final SpannableStringBuilder m11820c(CharSequence charSequence, InterfaceC0789k interfaceC0789k) {
        boolean z;
        C0790l.C0794d c0794d;
        char c;
        C0790l.C0794d c0794d2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean m11799b = ((C0790l.AbstractC0793c) interfaceC0789k).m11799b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f2480b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = f2476e;
        String str3 = f2475d;
        boolean z2 = this.f2479a;
        if (z) {
            if (m11799b) {
                c0794d2 = C0790l.f2493b;
            } else {
                c0794d2 = C0790l.f2492a;
            }
            boolean m11799b2 = c0794d2.m11799b(charSequence, charSequence.length());
            if (!z2 && (m11799b2 || m11822a(charSequence) == 1)) {
                str = str3;
            } else if (!z2 || (m11799b2 && m11822a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (m11799b != z2) {
            if (m11799b) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (m11799b) {
            c0794d = C0790l.f2493b;
        } else {
            c0794d = C0790l.f2492a;
        }
        boolean m11799b3 = c0794d.m11799b(charSequence, charSequence.length());
        if (!z2 && (m11799b3 || m11821b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z2 || (m11799b3 && m11821b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
