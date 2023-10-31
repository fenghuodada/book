package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.AbstractC7238h;
import com.google.android.exoplayer2.text.C7234e;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.cea.a */
/* loaded from: classes.dex */
public final class C7210a extends AbstractC7218d {

    /* renamed from: h */
    public final int f13013h;

    /* renamed from: i */
    public final int f13014i;

    /* renamed from: j */
    public final int f13015j;
    @Nullable

    /* renamed from: n */
    public List<Cue> f13019n;
    @Nullable

    /* renamed from: o */
    public List<Cue> f13020o;

    /* renamed from: p */
    public int f13021p;

    /* renamed from: q */
    public int f13022q;

    /* renamed from: r */
    public boolean f13023r;

    /* renamed from: s */
    public boolean f13024s;

    /* renamed from: t */
    public byte f13025t;

    /* renamed from: u */
    public byte f13026u;

    /* renamed from: w */
    public boolean f13028w;

    /* renamed from: x */
    public long f13029x;

    /* renamed from: y */
    public static final int[] f13010y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f13011z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    public static final int[] f13004A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    public static final int[] f13005B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    public static final int[] f13006C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    public static final int[] f13007D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f13008E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f13009F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    public final C7436v f13012g = new C7436v();

    /* renamed from: l */
    public final ArrayList<C7211a> f13017l = new ArrayList<>();

    /* renamed from: m */
    public C7211a f13018m = new C7211a(0, 4);

    /* renamed from: v */
    public int f13027v = 0;

    /* renamed from: k */
    public final long f13016k = 16000000;

    /* renamed from: com.google.android.exoplayer2.text.cea.a$a */
    /* loaded from: classes.dex */
    public static final class C7211a {

        /* renamed from: a */
        public final ArrayList f13030a;

        /* renamed from: b */
        public final ArrayList f13031b;

        /* renamed from: c */
        public final StringBuilder f13032c;

        /* renamed from: d */
        public int f13033d;

        /* renamed from: e */
        public int f13034e;

        /* renamed from: f */
        public int f13035f;

        /* renamed from: g */
        public int f13036g;

        /* renamed from: h */
        public int f13037h;

        /* renamed from: com.google.android.exoplayer2.text.cea.a$a$a */
        /* loaded from: classes.dex */
        public static class C7212a {

            /* renamed from: a */
            public final int f13038a;

            /* renamed from: b */
            public final boolean f13039b;

            /* renamed from: c */
            public int f13040c;

            public C7212a(int i, boolean z, int i2) {
                this.f13038a = i;
                this.f13039b = z;
                this.f13040c = i2;
            }
        }

        public C7211a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.f13030a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f13031b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.f13032c = sb;
            this.f13036g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.f13033d = 15;
            this.f13034e = 0;
            this.f13035f = 0;
            this.f13037h = i2;
        }

        /* renamed from: a */
        public final void m5366a(char c) {
            StringBuilder sb = this.f13032c;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        /* renamed from: b */
        public final void m5365b() {
            C7212a c7212a;
            int i;
            StringBuilder sb = this.f13032c;
            int length = sb.length();
            if (length <= 0) {
                return;
            }
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f13030a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0 || (i = (c7212a = (C7212a) arrayList.get(size)).f13040c) != length) {
                    return;
                }
                c7212a.f13040c = i - 1;
            }
        }

        @Nullable
        /* renamed from: c */
        public final Cue m5364c(int i) {
            float f;
            int i2 = this.f13034e + this.f13035f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i4 = 0;
            while (true) {
                ArrayList arrayList = this.f13031b;
                if (i4 >= arrayList.size()) {
                    break;
                }
                CharSequence charSequence = (CharSequence) arrayList.get(i4);
                int i5 = C7408g0.f13905a;
                if (charSequence.length() > i3) {
                    charSequence = charSequence.subSequence(0, i3);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
                i4++;
            }
            SpannableString m5363d = m5363d();
            int i6 = C7408g0.f13905a;
            int length = m5363d.length();
            CharSequence charSequence2 = m5363d;
            if (length > i3) {
                charSequence2 = m5363d.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i3 - spannableStringBuilder.length();
            int i7 = i2 - length2;
            if (i == Integer.MIN_VALUE) {
                if (this.f13036g == 2 && (Math.abs(i7) < 3 || length2 < 0)) {
                    i = 1;
                } else if (this.f13036g == 2 && i7 > 0) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length2;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i8 = this.f13033d;
            if (i8 > 7) {
                i8 = (i8 - 15) - 2;
            } else if (this.f13036g == 1) {
                i8 -= this.f13037h - 1;
            }
            Cue.C7206a c7206a = new Cue.C7206a();
            c7206a.f12986a = spannableStringBuilder;
            c7206a.f12988c = Layout.Alignment.ALIGN_NORMAL;
            c7206a.f12990e = i8;
            c7206a.f12991f = 1;
            c7206a.f12993h = f;
            c7206a.f12994i = i;
            return c7206a.m5372a();
        }

        /* renamed from: d */
        public final SpannableString m5363d() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13032c);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (true) {
                ArrayList arrayList = this.f13030a;
                if (i6 >= arrayList.size()) {
                    break;
                }
                C7212a c7212a = (C7212a) arrayList.get(i6);
                boolean z3 = c7212a.f13039b;
                int i8 = c7212a.f13038a;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i5 = C7210a.f13004A[i8];
                    }
                    z2 = z;
                }
                int i9 = c7212a.f13040c;
                i6++;
                if (i6 < arrayList.size()) {
                    i = ((C7212a) arrayList.get(i6)).f13040c;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i2 != -1 && !z3) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i9, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i9, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        if (i4 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, i9, 33);
                        }
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (i3 != -1 && i3 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
            }
            if (i7 != length && i4 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public final boolean m5362e() {
            return this.f13030a.isEmpty() && this.f13031b.isEmpty() && this.f13032c.length() == 0;
        }
    }

    public C7210a(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f13013h = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                    } else {
                        this.f13015j = 1;
                    }
                } else {
                    this.f13015j = 0;
                }
                this.f13014i = 1;
                m5367k(0);
                m5368j();
                this.f13028w = true;
                this.f13029x = -9223372036854775807L;
            }
            this.f13015j = 1;
            this.f13014i = 0;
            m5367k(0);
            m5368j();
            this.f13028w = true;
            this.f13029x = -9223372036854775807L;
        }
        this.f13015j = 0;
        this.f13014i = 0;
        m5367k(0);
        m5368j();
        this.f13028w = true;
        this.f13029x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d
    /* renamed from: e */
    public final C7221e mo5349e() {
        List<Cue> list = this.f13019n;
        this.f13020o = list;
        list.getClass();
        return new C7221e(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x026e, code lost:
        if (r0 != 3) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5348f(com.google.android.exoplayer2.text.cea.AbstractC7218d.C7219a r15) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.C7210a.mo5348f(com.google.android.exoplayer2.text.cea.d$a):void");
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d, com.google.android.exoplayer2.decoder.InterfaceC6746d
    public final void flush() {
        super.flush();
        this.f13019n = null;
        this.f13020o = null;
        m5367k(0);
        this.f13022q = 4;
        this.f13018m.f13037h = 4;
        m5368j();
        this.f13023r = false;
        this.f13024s = false;
        this.f13025t = (byte) 0;
        this.f13026u = (byte) 0;
        this.f13027v = 0;
        this.f13028w = true;
        this.f13029x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d, com.google.android.exoplayer2.decoder.InterfaceC6746d
    @Nullable
    /* renamed from: g */
    public final AbstractC7238h mo5352b() throws C7234e {
        boolean z;
        AbstractC7238h pollFirst;
        AbstractC7238h mo5352b = super.mo5352b();
        if (mo5352b != null) {
            return mo5352b;
        }
        long j = this.f13016k;
        if (j != -9223372036854775807L) {
            long j2 = this.f13029x;
            if (j2 != -9223372036854775807L && this.f13094e - j2 >= j) {
                z = true;
                if (!z && (pollFirst = this.f13091b.pollFirst()) != null) {
                    this.f13019n = Collections.emptyList();
                    this.f13029x = -9223372036854775807L;
                    pollFirst.m5337i(this.f13094e, mo5349e(), Long.MAX_VALUE);
                    return pollFirst;
                }
            }
        }
        z = false;
        return !z ? null : null;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d
    /* renamed from: h */
    public final boolean mo5346h() {
        return this.f13019n != this.f13020o;
    }

    /* renamed from: i */
    public final List<Cue> m5369i() {
        ArrayList<C7211a> arrayList = this.f13017l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            Cue m5364c = arrayList.get(i2).m5364c(Integer.MIN_VALUE);
            arrayList2.add(m5364c);
            if (m5364c != null) {
                i = Math.min(i, m5364c.f12977i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Cue cue = (Cue) arrayList2.get(i3);
            if (cue != null) {
                if (cue.f12977i != i) {
                    cue = arrayList.get(i3).m5364c(i);
                    cue.getClass();
                }
                arrayList3.add(cue);
            }
        }
        return arrayList3;
    }

    /* renamed from: j */
    public final void m5368j() {
        C7211a c7211a = this.f13018m;
        c7211a.f13036g = this.f13021p;
        c7211a.f13030a.clear();
        c7211a.f13031b.clear();
        c7211a.f13032c.setLength(0);
        c7211a.f13033d = 15;
        c7211a.f13034e = 0;
        c7211a.f13035f = 0;
        ArrayList<C7211a> arrayList = this.f13017l;
        arrayList.clear();
        arrayList.add(this.f13018m);
    }

    /* renamed from: k */
    public final void m5367k(int i) {
        int i2 = this.f13021p;
        if (i2 == i) {
            return;
        }
        this.f13021p = i;
        if (i == 3) {
            int i3 = 0;
            while (true) {
                ArrayList<C7211a> arrayList = this.f13017l;
                if (i3 < arrayList.size()) {
                    arrayList.get(i3).f13036g = i;
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            m5368j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f13019n = Collections.emptyList();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d, com.google.android.exoplayer2.decoder.InterfaceC6746d
    public final void release() {
    }
}
