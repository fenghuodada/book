package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6964f;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.cea.AbstractC7218d;
import com.google.android.exoplayer2.text.cea.C7214c;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import okio.Utf8;

/* renamed from: com.google.android.exoplayer2.text.cea.c */
/* loaded from: classes.dex */
public final class C7214c extends AbstractC7218d {

    /* renamed from: g */
    public final C7436v f13041g = new C7436v();

    /* renamed from: h */
    public final C7435u f13042h = new C7435u();

    /* renamed from: i */
    public int f13043i = -1;

    /* renamed from: j */
    public final int f13044j;

    /* renamed from: k */
    public final C7216b[] f13045k;

    /* renamed from: l */
    public C7216b f13046l;
    @Nullable

    /* renamed from: m */
    public List<Cue> f13047m;
    @Nullable

    /* renamed from: n */
    public List<Cue> f13048n;
    @Nullable

    /* renamed from: o */
    public C7217c f13049o;

    /* renamed from: p */
    public int f13050p;

    /* renamed from: com.google.android.exoplayer2.text.cea.c$a */
    /* loaded from: classes.dex */
    public static final class C7215a {

        /* renamed from: c */
        public static final C7213b f13051c = new Comparator() { // from class: com.google.android.exoplayer2.text.cea.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((C7214c.C7215a) obj2).f13053b, ((C7214c.C7215a) obj).f13053b);
            }
        };

        /* renamed from: a */
        public final Cue f13052a;

        /* renamed from: b */
        public final int f13053b;

        public C7215a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            Cue.C7206a c7206a = new Cue.C7206a();
            c7206a.f12986a = spannableStringBuilder;
            c7206a.f12988c = alignment;
            c7206a.f12990e = f;
            c7206a.f12991f = 0;
            c7206a.f12992g = i;
            c7206a.f12993h = f2;
            c7206a.f12994i = i2;
            c7206a.f12997l = -3.4028235E38f;
            if (z) {
                c7206a.f13000o = i3;
                c7206a.f12999n = true;
            }
            this.f13052a = c7206a.m5372a();
            this.f13053b = i4;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.cea.c$b */
    /* loaded from: classes.dex */
    public static final class C7216b {

        /* renamed from: A */
        public static final int[] f13054A;

        /* renamed from: B */
        public static final boolean[] f13055B;

        /* renamed from: C */
        public static final int[] f13056C;

        /* renamed from: D */
        public static final int[] f13057D;

        /* renamed from: E */
        public static final int[] f13058E;

        /* renamed from: F */
        public static final int[] f13059F;

        /* renamed from: w */
        public static final int f13060w = m5356c(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f13061x;

        /* renamed from: y */
        public static final int[] f13062y;

        /* renamed from: z */
        public static final int[] f13063z;

        /* renamed from: a */
        public final ArrayList f13064a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f13065b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f13066c;

        /* renamed from: d */
        public boolean f13067d;

        /* renamed from: e */
        public int f13068e;

        /* renamed from: f */
        public boolean f13069f;

        /* renamed from: g */
        public int f13070g;

        /* renamed from: h */
        public int f13071h;

        /* renamed from: i */
        public int f13072i;

        /* renamed from: j */
        public int f13073j;

        /* renamed from: k */
        public boolean f13074k;

        /* renamed from: l */
        public int f13075l;

        /* renamed from: m */
        public int f13076m;

        /* renamed from: n */
        public int f13077n;

        /* renamed from: o */
        public int f13078o;

        /* renamed from: p */
        public int f13079p;

        /* renamed from: q */
        public int f13080q;

        /* renamed from: r */
        public int f13081r;

        /* renamed from: s */
        public int f13082s;

        /* renamed from: t */
        public int f13083t;

        /* renamed from: u */
        public int f13084u;

        /* renamed from: v */
        public int f13085v;

        static {
            int m5356c = m5356c(0, 0, 0, 0);
            f13061x = m5356c;
            int m5356c2 = m5356c(0, 0, 0, 3);
            f13062y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f13063z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f13054A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f13055B = new boolean[]{false, false, false, true, true, true, false};
            f13056C = new int[]{m5356c, m5356c2, m5356c, m5356c, m5356c2, m5356c, m5356c};
            f13057D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f13058E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f13059F = new int[]{m5356c, m5356c, m5356c, m5356c, m5356c, m5356c2, m5356c2};
        }

        public C7216b() {
            m5355d();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m5356c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                com.google.android.exoplayer2.util.C7394a.m5132c(r4, r0)
                com.google.android.exoplayer2.util.C7394a.m5132c(r5, r0)
                com.google.android.exoplayer2.util.C7394a.m5132c(r6, r0)
                com.google.android.exoplayer2.util.C7394a.m5132c(r7, r0)
                r0 = 0
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.C7214c.C7216b.m5356c(int, int, int, int):int");
        }

        /* renamed from: a */
        public final void m5358a(char c) {
            SpannableStringBuilder spannableStringBuilder = this.f13065b;
            if (c != '\n') {
                spannableStringBuilder.append(c);
                return;
            }
            ArrayList arrayList = this.f13064a;
            arrayList.add(m5357b());
            spannableStringBuilder.clear();
            if (this.f13079p != -1) {
                this.f13079p = 0;
            }
            if (this.f13080q != -1) {
                this.f13080q = 0;
            }
            if (this.f13081r != -1) {
                this.f13081r = 0;
            }
            if (this.f13083t != -1) {
                this.f13083t = 0;
            }
            while (true) {
                if ((!this.f13074k || arrayList.size() < this.f13073j) && arrayList.size() < 15) {
                    return;
                }
                arrayList.remove(0);
            }
        }

        /* renamed from: b */
        public final SpannableString m5357b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13065b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f13079p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f13079p, length, 33);
                }
                if (this.f13080q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13080q, length, 33);
                }
                if (this.f13081r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13082s), this.f13081r, length, 33);
                }
                if (this.f13083t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13084u), this.f13083t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public final void m5355d() {
            this.f13064a.clear();
            this.f13065b.clear();
            this.f13079p = -1;
            this.f13080q = -1;
            this.f13081r = -1;
            this.f13083t = -1;
            this.f13085v = 0;
            this.f13066c = false;
            this.f13067d = false;
            this.f13068e = 4;
            this.f13069f = false;
            this.f13070g = 0;
            this.f13071h = 0;
            this.f13072i = 0;
            this.f13073j = 15;
            this.f13074k = true;
            this.f13075l = 0;
            this.f13076m = 0;
            this.f13077n = 0;
            int i = f13061x;
            this.f13078o = i;
            this.f13082s = f13060w;
            this.f13084u = i;
        }

        /* renamed from: e */
        public final void m5354e(boolean z, boolean z2) {
            int i = this.f13079p;
            SpannableStringBuilder spannableStringBuilder = this.f13065b;
            if (i != -1) {
                if (!z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f13079p, spannableStringBuilder.length(), 33);
                    this.f13079p = -1;
                }
            } else if (z) {
                this.f13079p = spannableStringBuilder.length();
            }
            if (this.f13080q == -1) {
                if (z2) {
                    this.f13080q = spannableStringBuilder.length();
                }
            } else if (z2) {
            } else {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13080q, spannableStringBuilder.length(), 33);
                this.f13080q = -1;
            }
        }

        /* renamed from: f */
        public final void m5353f(int i, int i2) {
            int i3 = this.f13081r;
            SpannableStringBuilder spannableStringBuilder = this.f13065b;
            if (i3 != -1 && this.f13082s != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13082s), this.f13081r, spannableStringBuilder.length(), 33);
            }
            if (i != f13060w) {
                this.f13081r = spannableStringBuilder.length();
                this.f13082s = i;
            }
            if (this.f13083t != -1 && this.f13084u != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13084u), this.f13083t, spannableStringBuilder.length(), 33);
            }
            if (i2 != f13061x) {
                this.f13083t = spannableStringBuilder.length();
                this.f13084u = i2;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.cea.c$c */
    /* loaded from: classes.dex */
    public static final class C7217c {

        /* renamed from: a */
        public final int f13086a;

        /* renamed from: b */
        public final int f13087b;

        /* renamed from: c */
        public final byte[] f13088c;

        /* renamed from: d */
        public int f13089d = 0;

        public C7217c(int i, int i2) {
            this.f13086a = i;
            this.f13087b = i2;
            this.f13088c = new byte[(i2 * 2) - 1];
        }
    }

    public C7214c(int i, @Nullable List<byte[]> list) {
        this.f13044j = i == -1 ? 1 : i;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f13045k = new C7216b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f13045k[i2] = new C7216b();
        }
        this.f13046l = this.f13045k[0];
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d
    /* renamed from: e */
    public final C7221e mo5349e() {
        List<Cue> list = this.f13047m;
        this.f13048n = list;
        list.getClass();
        return new C7221e(list);
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d
    /* renamed from: f */
    public final void mo5348f(AbstractC7218d.C7219a c7219a) {
        boolean z;
        ByteBuffer byteBuffer = c7219a.f10904c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C7436v c7436v = this.f13041g;
        c7436v.m4994x(limit, array);
        while (c7436v.f13980c - c7436v.f13979b >= 3) {
            int m5002p = c7436v.m5002p() & 7;
            int i = m5002p & 3;
            boolean z2 = false;
            if ((m5002p & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte m5002p2 = (byte) c7436v.m5002p();
            byte m5002p3 = (byte) c7436v.m5002p();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m5361i();
                        int i2 = (m5002p2 & 192) >> 6;
                        int i3 = this.f13043i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m5359k();
                            int i4 = this.f13043i;
                            StringBuilder sb = new StringBuilder(71);
                            sb.append("Sequence number discontinuity. previous=");
                            sb.append(i4);
                            sb.append(" current=");
                            sb.append(i2);
                            Log.w("Cea708Decoder", sb.toString());
                        }
                        this.f13043i = i2;
                        int i5 = m5002p2 & Utf8.REPLACEMENT_BYTE;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        C7217c c7217c = new C7217c(i2, i5);
                        this.f13049o = c7217c;
                        int i6 = c7217c.f13089d;
                        c7217c.f13089d = i6 + 1;
                        c7217c.f13088c[i6] = m5002p3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        C7394a.m5134a(z2);
                        C7217c c7217c2 = this.f13049o;
                        if (c7217c2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            int i7 = c7217c2.f13089d;
                            int i8 = i7 + 1;
                            byte[] bArr = c7217c2.f13088c;
                            bArr[i7] = m5002p2;
                            c7217c2.f13089d = i8 + 1;
                            bArr[i8] = m5002p3;
                        }
                    }
                    C7217c c7217c3 = this.f13049o;
                    if (c7217c3.f13089d == (c7217c3.f13087b * 2) - 1) {
                        m5361i();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d, com.google.android.exoplayer2.decoder.InterfaceC6746d
    public final void flush() {
        super.flush();
        this.f13047m = null;
        this.f13048n = null;
        this.f13050p = 0;
        this.f13046l = this.f13045k[0];
        m5359k();
        this.f13049o = null;
    }

    @Override // com.google.android.exoplayer2.text.cea.AbstractC7218d
    /* renamed from: h */
    public final boolean mo5346h() {
        return this.f13047m != this.f13048n;
    }

    /* renamed from: i */
    public final void m5361i() {
        String str;
        boolean z;
        int i;
        C7216b c7216b;
        C7216b c7216b2;
        C7216b c7216b3;
        char c;
        C7216b c7216b4;
        C7216b c7216b5;
        char c2;
        C7217c c7217c = this.f13049o;
        if (c7217c == null) {
            return;
        }
        int i2 = c7217c.f13089d;
        int i3 = 2;
        int i4 = (c7217c.f13087b * 2) - 1;
        String str2 = "Cea708Decoder";
        if (i2 != i4) {
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append(i4);
            sb.append(", but current index is ");
            sb.append(i2);
            sb.append(" (sequence number ");
            sb.append(c7217c.f13086a);
            sb.append(");");
            Log.d("Cea708Decoder", sb.toString());
        }
        C7217c c7217c2 = this.f13049o;
        byte[] bArr = c7217c2.f13088c;
        int i5 = c7217c2.f13089d;
        C7435u c7435u = this.f13042h;
        c7435u.m5023i(i5, bArr);
        int i6 = 3;
        int m5026f = c7435u.m5026f(3);
        int m5026f2 = c7435u.m5026f(5);
        int i7 = 7;
        if (m5026f == 7) {
            c7435u.m5020l(2);
            m5026f = c7435u.m5026f(6);
            if (m5026f < 7) {
                C6964f.m5792c(44, "Invalid extended service number: ", m5026f, "Cea708Decoder");
            }
        }
        if (m5026f2 == 0) {
            if (m5026f != 0) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("serviceNumber is non-zero (");
                sb2.append(m5026f);
                sb2.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb2.toString());
            }
        } else if (m5026f == this.f13044j) {
            boolean z2 = false;
            while (c7435u.m5030b() > 0) {
                int i8 = 8;
                int m5026f3 = c7435u.m5026f(8);
                int i9 = 24;
                if (m5026f3 == 16) {
                    int m5026f4 = c7435u.m5026f(8);
                    if (m5026f4 <= 31) {
                        i7 = 7;
                        if (m5026f4 > 7) {
                            if (m5026f4 > 15) {
                                if (m5026f4 <= 23) {
                                    i8 = 16;
                                } else if (m5026f4 <= 31) {
                                    i8 = 24;
                                }
                            }
                            c7435u.m5020l(i8);
                        }
                    } else {
                        i7 = 7;
                        char c3 = 160;
                        if (m5026f4 <= 127) {
                            if (m5026f4 == 32) {
                                c3 = ' ';
                                c7216b4 = this.f13046l;
                            } else if (m5026f4 == 33) {
                                c7216b4 = this.f13046l;
                            } else if (m5026f4 == 37) {
                                c7216b4 = this.f13046l;
                                c3 = 8230;
                            } else if (m5026f4 == 42) {
                                c7216b4 = this.f13046l;
                                c3 = 352;
                            } else if (m5026f4 == 44) {
                                c7216b4 = this.f13046l;
                                c3 = 338;
                            } else if (m5026f4 == 63) {
                                c7216b4 = this.f13046l;
                                c3 = 376;
                            } else if (m5026f4 == 57) {
                                c7216b4 = this.f13046l;
                                c3 = 8482;
                            } else if (m5026f4 == 58) {
                                c7216b4 = this.f13046l;
                                c3 = 353;
                            } else if (m5026f4 == 60) {
                                c7216b4 = this.f13046l;
                                c3 = 339;
                            } else if (m5026f4 != 61) {
                                switch (m5026f4) {
                                    case 48:
                                        c7216b4 = this.f13046l;
                                        c3 = 9608;
                                        break;
                                    case 49:
                                        c7216b4 = this.f13046l;
                                        c3 = 8216;
                                        break;
                                    case 50:
                                        c7216b4 = this.f13046l;
                                        c3 = 8217;
                                        break;
                                    case 51:
                                        c7216b4 = this.f13046l;
                                        c3 = 8220;
                                        break;
                                    case 52:
                                        c7216b4 = this.f13046l;
                                        c3 = 8221;
                                        break;
                                    case 53:
                                        c7216b4 = this.f13046l;
                                        c3 = 8226;
                                        break;
                                    default:
                                        switch (m5026f4) {
                                            case 118:
                                                c7216b4 = this.f13046l;
                                                c3 = 8539;
                                                break;
                                            case 119:
                                                c7216b4 = this.f13046l;
                                                c3 = 8540;
                                                break;
                                            case 120:
                                                c7216b4 = this.f13046l;
                                                c3 = 8541;
                                                break;
                                            case 121:
                                                c7216b4 = this.f13046l;
                                                c3 = 8542;
                                                break;
                                            case 122:
                                                c7216b4 = this.f13046l;
                                                c3 = 9474;
                                                break;
                                            case 123:
                                                c7216b4 = this.f13046l;
                                                c3 = 9488;
                                                break;
                                            case 124:
                                                c7216b4 = this.f13046l;
                                                c3 = 9492;
                                                break;
                                            case 125:
                                                c7216b4 = this.f13046l;
                                                c3 = 9472;
                                                break;
                                            case 126:
                                                c7216b4 = this.f13046l;
                                                c3 = 9496;
                                                break;
                                            case 127:
                                                c7216b4 = this.f13046l;
                                                c3 = 9484;
                                                break;
                                            default:
                                                C6964f.m5792c(33, "Invalid G2 character: ", m5026f4, str2);
                                                break;
                                        }
                                }
                                i3 = 2;
                                z2 = true;
                            } else {
                                c7216b4 = this.f13046l;
                                c3 = 8480;
                            }
                            c7216b4.m5358a(c3);
                            i3 = 2;
                            z2 = true;
                        } else {
                            int i10 = 32;
                            if (m5026f4 <= 159) {
                                if (m5026f4 > 135) {
                                    if (m5026f4 <= 143) {
                                        i10 = 40;
                                    } else {
                                        i3 = 2;
                                        if (m5026f4 <= 159) {
                                            c7435u.m5020l(2);
                                            i10 = c7435u.m5026f(6) * 8;
                                            c7435u.m5020l(i10);
                                        }
                                    }
                                }
                                i3 = 2;
                                c7435u.m5020l(i10);
                            } else {
                                if (m5026f4 <= 255) {
                                    if (m5026f4 == 160) {
                                        c7216b5 = this.f13046l;
                                        c2 = 13252;
                                    } else {
                                        C6964f.m5792c(33, "Invalid G3 character: ", m5026f4, str2);
                                        c7216b5 = this.f13046l;
                                        c2 = '_';
                                    }
                                    c7216b5.m5358a(c2);
                                    z2 = true;
                                } else {
                                    C6964f.m5792c(37, "Invalid extended command: ", m5026f4, str2);
                                }
                                i3 = 2;
                            }
                        }
                    }
                } else if (m5026f3 <= 31) {
                    if (m5026f3 != 0) {
                        if (m5026f3 == i6) {
                            this.f13047m = m5360j();
                        } else if (m5026f3 != 8) {
                            switch (m5026f3) {
                                case 12:
                                    m5359k();
                                    break;
                                case 13:
                                    this.f13046l.m5358a('\n');
                                    break;
                                case 14:
                                    break;
                                default:
                                    if (m5026f3 < 17 || m5026f3 > 23) {
                                        if (m5026f3 >= 24 && m5026f3 <= 31) {
                                            StringBuilder sb3 = new StringBuilder(54);
                                            sb3.append("Currently unsupported COMMAND_P16 Command: ");
                                            sb3.append(m5026f3);
                                            Log.w(str2, sb3.toString());
                                            c7435u.m5020l(16);
                                            break;
                                        } else {
                                            C6964f.m5792c(31, "Invalid C0 command: ", m5026f3, str2);
                                            break;
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(55);
                                        sb4.append("Currently unsupported COMMAND_EXT1 Command: ");
                                        sb4.append(m5026f3);
                                        Log.w(str2, sb4.toString());
                                        c7435u.m5020l(8);
                                        break;
                                    }
                            }
                        } else {
                            SpannableStringBuilder spannableStringBuilder = this.f13046l.f13065b;
                            int length = spannableStringBuilder.length();
                            if (length > 0) {
                                spannableStringBuilder.delete(length - 1, length);
                            }
                        }
                    }
                } else if (m5026f3 <= 127) {
                    if (m5026f3 == 127) {
                        c7216b3 = this.f13046l;
                        c = 9835;
                    } else {
                        c7216b3 = this.f13046l;
                        c = (char) (m5026f3 & 255);
                    }
                    c7216b3.m5358a(c);
                    z2 = true;
                } else {
                    if (m5026f3 <= 159) {
                        C7216b[] c7216bArr = this.f13045k;
                        switch (m5026f3) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                str = str2;
                                z = true;
                                int i11 = m5026f3 - 128;
                                if (this.f13050p != i11) {
                                    this.f13050p = i11;
                                    i = i6;
                                    c7216b = c7216bArr[i11];
                                    this.f13046l = c7216b;
                                    i6 = i;
                                }
                                z2 = z;
                                str2 = str;
                                break;
                            case 136:
                                str = str2;
                                z2 = true;
                                for (int i12 = 1; i12 <= 8; i12++) {
                                    if (c7435u.m5027e()) {
                                        C7216b c7216b6 = c7216bArr[8 - i12];
                                        c7216b6.f13064a.clear();
                                        c7216b6.f13065b.clear();
                                        c7216b6.f13079p = -1;
                                        c7216b6.f13080q = -1;
                                        c7216b6.f13081r = -1;
                                        c7216b6.f13083t = -1;
                                        c7216b6.f13085v = 0;
                                    }
                                }
                                str2 = str;
                                break;
                            case 137:
                                str = str2;
                                for (int i13 = 1; i13 <= 8; i13++) {
                                    if (c7435u.m5027e()) {
                                        c7216bArr[8 - i13].f13067d = true;
                                    }
                                }
                                z2 = true;
                                str2 = str;
                                break;
                            case 138:
                                str = str2;
                                for (int i14 = 1; i14 <= 8; i14++) {
                                    if (c7435u.m5027e()) {
                                        c7216bArr[8 - i14].f13067d = false;
                                    }
                                }
                                z2 = true;
                                str2 = str;
                                break;
                            case 139:
                                str = str2;
                                for (int i15 = 1; i15 <= 8; i15++) {
                                    if (c7435u.m5027e()) {
                                        c7216bArr[8 - i15].f13067d = !c7216b2.f13067d;
                                    }
                                }
                                z2 = true;
                                str2 = str;
                                break;
                            case 140:
                                str = str2;
                                for (int i16 = 1; i16 <= 8; i16++) {
                                    if (c7435u.m5027e()) {
                                        c7216bArr[8 - i16].m5355d();
                                    }
                                }
                                z2 = true;
                                str2 = str;
                                break;
                            case 141:
                                str = str2;
                                c7435u.m5020l(8);
                                z2 = true;
                                str2 = str;
                                break;
                            case 142:
                                str = str2;
                                z2 = true;
                                str2 = str;
                                break;
                            case 143:
                                str = str2;
                                m5359k();
                                z2 = true;
                                str2 = str;
                                break;
                            case 144:
                                str = str2;
                                if (this.f13046l.f13066c) {
                                    c7435u.m5026f(4);
                                    c7435u.m5026f(2);
                                    c7435u.m5026f(2);
                                    boolean m5027e = c7435u.m5027e();
                                    boolean m5027e2 = c7435u.m5027e();
                                    c7435u.m5026f(3);
                                    c7435u.m5026f(3);
                                    this.f13046l.m5354e(m5027e, m5027e2);
                                    i6 = 3;
                                    z2 = true;
                                    str2 = str;
                                    break;
                                }
                                c7435u.m5020l(16);
                                i6 = 3;
                                z2 = true;
                                str2 = str;
                            case 145:
                                str = str2;
                                if (this.f13046l.f13066c) {
                                    int m5356c = C7216b.m5356c(c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2));
                                    int m5356c2 = C7216b.m5356c(c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2));
                                    c7435u.m5020l(2);
                                    C7216b.m5356c(c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2), 0);
                                    this.f13046l.m5353f(m5356c, m5356c2);
                                    i6 = 3;
                                    z2 = true;
                                    str2 = str;
                                    break;
                                }
                                c7435u.m5020l(i9);
                                i6 = 3;
                                z2 = true;
                                str2 = str;
                            case 146:
                                str = str2;
                                if (this.f13046l.f13066c) {
                                    c7435u.m5020l(4);
                                    int m5026f5 = c7435u.m5026f(4);
                                    c7435u.m5020l(2);
                                    c7435u.m5026f(6);
                                    C7216b c7216b7 = this.f13046l;
                                    if (c7216b7.f13085v != m5026f5) {
                                        c7216b7.m5358a('\n');
                                    }
                                    c7216b7.f13085v = m5026f5;
                                    i6 = 3;
                                    z2 = true;
                                    str2 = str;
                                    break;
                                }
                                c7435u.m5020l(16);
                                i6 = 3;
                                z2 = true;
                                str2 = str;
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                z2 = true;
                                C6964f.m5792c(31, "Invalid C1 command: ", m5026f3, str2);
                                break;
                            case 151:
                                str = str2;
                                if (this.f13046l.f13066c) {
                                    int m5356c3 = C7216b.m5356c(c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2));
                                    c7435u.m5026f(2);
                                    C7216b.m5356c(c7435u.m5026f(2), c7435u.m5026f(2), c7435u.m5026f(2), 0);
                                    c7435u.m5027e();
                                    c7435u.m5027e();
                                    c7435u.m5026f(2);
                                    c7435u.m5026f(2);
                                    int m5026f6 = c7435u.m5026f(2);
                                    c7435u.m5020l(8);
                                    C7216b c7216b8 = this.f13046l;
                                    c7216b8.f13078o = m5356c3;
                                    c7216b8.f13075l = m5026f6;
                                    i6 = 3;
                                    z2 = true;
                                    str2 = str;
                                } else {
                                    i9 = 32;
                                    c7435u.m5020l(i9);
                                    i6 = 3;
                                    z2 = true;
                                    str2 = str;
                                    break;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i17 = m5026f3 - 152;
                                C7216b c7216b9 = c7216bArr[i17];
                                c7435u.m5020l(i3);
                                boolean m5027e3 = c7435u.m5027e();
                                boolean m5027e4 = c7435u.m5027e();
                                c7435u.m5027e();
                                int m5026f7 = c7435u.m5026f(i6);
                                boolean m5027e5 = c7435u.m5027e();
                                int m5026f8 = c7435u.m5026f(i7);
                                int m5026f9 = c7435u.m5026f(8);
                                int m5026f10 = c7435u.m5026f(4);
                                int m5026f11 = c7435u.m5026f(4);
                                c7435u.m5020l(i3);
                                c7435u.m5026f(6);
                                c7435u.m5020l(i3);
                                int m5026f12 = c7435u.m5026f(3);
                                int m5026f13 = c7435u.m5026f(3);
                                str = str2;
                                c7216b9.f13066c = true;
                                c7216b9.f13067d = m5027e3;
                                c7216b9.f13074k = m5027e4;
                                c7216b9.f13068e = m5026f7;
                                c7216b9.f13069f = m5027e5;
                                c7216b9.f13070g = m5026f8;
                                c7216b9.f13071h = m5026f9;
                                c7216b9.f13072i = m5026f10;
                                int i18 = m5026f11 + 1;
                                if (c7216b9.f13073j != i18) {
                                    c7216b9.f13073j = i18;
                                    while (true) {
                                        ArrayList arrayList = c7216b9.f13064a;
                                        if ((m5027e4 && arrayList.size() >= c7216b9.f13073j) || arrayList.size() >= 15) {
                                            arrayList.remove(0);
                                        }
                                    }
                                }
                                if (m5026f12 != 0 && c7216b9.f13076m != m5026f12) {
                                    c7216b9.f13076m = m5026f12;
                                    int i19 = m5026f12 - 1;
                                    int i20 = C7216b.f13056C[i19];
                                    boolean z3 = C7216b.f13055B[i19];
                                    int i21 = C7216b.f13063z[i19];
                                    int i22 = C7216b.f13054A[i19];
                                    int i23 = C7216b.f13062y[i19];
                                    c7216b9.f13078o = i20;
                                    c7216b9.f13075l = i23;
                                }
                                if (m5026f13 != 0 && c7216b9.f13077n != m5026f13) {
                                    c7216b9.f13077n = m5026f13;
                                    int i24 = m5026f13 - 1;
                                    int i25 = C7216b.f13058E[i24];
                                    int i26 = C7216b.f13057D[i24];
                                    c7216b9.m5354e(false, false);
                                    c7216b9.m5353f(C7216b.f13060w, C7216b.f13059F[i24]);
                                }
                                if (this.f13050p != i17) {
                                    this.f13050p = i17;
                                    c7216b = c7216bArr[i17];
                                    i = 3;
                                    z = true;
                                    this.f13046l = c7216b;
                                    i6 = i;
                                    z2 = z;
                                    str2 = str;
                                    break;
                                }
                                i6 = 3;
                                z2 = true;
                                str2 = str;
                                break;
                        }
                    } else if (m5026f3 <= 255) {
                        this.f13046l.m5358a((char) (m5026f3 & 255));
                        z2 = true;
                    } else {
                        C6964f.m5792c(33, "Invalid base command: ", m5026f3, str2);
                    }
                    i7 = 7;
                }
                i3 = 2;
            }
            if (z2) {
                this.f13047m = m5360j();
            }
        }
        this.f13049o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.exoplayer2.text.Cue> m5360j() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.C7214c.m5360j():java.util.List");
    }

    /* renamed from: k */
    public final void m5359k() {
        for (int i = 0; i < 8; i++) {
            this.f13045k[i].m5355d();
        }
    }
}
