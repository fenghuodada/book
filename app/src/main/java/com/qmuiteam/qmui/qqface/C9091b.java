package com.qmuiteam.qmui.qqface;

import android.text.Spannable;
import android.util.LruCache;
import com.qmuiteam.qmui.span.AbstractC9139d;
import com.qmuiteam.qmui.util.C9143d;
import com.vungle.warren.utility.C10083e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.qmuiteam.qmui.qqface.b */
/* loaded from: classes3.dex */
public final class C9091b {

    /* renamed from: c */
    public static final HashMap f17458c = new HashMap(4);

    /* renamed from: d */
    public static final C10083e f17459d = new C10083e();

    /* renamed from: a */
    public final LruCache<CharSequence, C9093b> f17460a = new LruCache<>(30);

    /* renamed from: b */
    public final C10083e f17461b;

    /* renamed from: com.qmuiteam.qmui.qqface.b$a */
    /* loaded from: classes3.dex */
    public static class C9092a {

        /* renamed from: a */
        public int f17462a;

        /* renamed from: b */
        public CharSequence f17463b;

        /* renamed from: c */
        public C9093b f17464c;

        /* renamed from: d */
        public AbstractC9139d f17465d;

        /* renamed from: a */
        public static C9092a m2705a(CharSequence charSequence) {
            C9092a c9092a = new C9092a();
            c9092a.f17462a = 1;
            c9092a.f17463b = charSequence;
            return c9092a;
        }

        /* renamed from: b */
        public static C9092a m2704b(CharSequence charSequence, AbstractC9139d abstractC9139d, C9091b c9091b) {
            C9092a c9092a = new C9092a();
            c9092a.f17462a = 4;
            int length = charSequence.length();
            HashMap hashMap = C9091b.f17458c;
            c9092a.f17464c = c9091b.m2706a(charSequence, length, true);
            c9092a.f17465d = abstractC9139d;
            return c9092a;
        }
    }

    /* renamed from: com.qmuiteam.qmui.qqface.b$b */
    /* loaded from: classes3.dex */
    public static class C9093b {

        /* renamed from: b */
        public final int f17467b;

        /* renamed from: a */
        public final int f17466a = 0;

        /* renamed from: c */
        public final ArrayList f17468c = new ArrayList();

        public C9093b(int i) {
            this.f17467b = i;
        }

        /* renamed from: a */
        public final void m2703a(C9092a c9092a) {
            int i = c9092a.f17462a;
            if (i != 2 && i == 5) {
            }
            this.f17468c.add(c9092a);
        }
    }

    public C9091b(C10083e c10083e) {
        this.f17461b = c10083e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.qmuiteam.qmui.span.d] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.text.Spanned, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.qmuiteam.qmui.span.d[], java.lang.Object[]] */
    /* renamed from: a */
    public final C9093b m2706a(CharSequence charSequence, int i, boolean z) {
        int[] iArr;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6 = i;
        int[] iArr2 = 0;
        if (C9143d.m2642c(charSequence)) {
            return null;
        }
        if (charSequence.length() > 0) {
            if (i6 > 0) {
                int length = charSequence.length();
                if (i6 > length) {
                    i6 = length;
                }
                int i7 = 1;
                boolean z4 = false;
                if (!z && (charSequence instanceof Spannable)) {
                    ?? r6 = (Spannable) charSequence;
                    ?? r7 = (AbstractC9139d[]) r6.getSpans(0, charSequence.length() - 1, AbstractC9139d.class);
                    Arrays.sort(r7, new C9090a(r6));
                    if (r7.length > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        iArr2 = new int[r7.length * 2];
                        for (int i8 = 0; i8 < r7.length; i8++) {
                            int i9 = i8 * 2;
                            iArr2[i9] = r6.getSpanStart(r7[i8]);
                            iArr2[i9 + 1] = r6.getSpanEnd(r7[i8]);
                        }
                    }
                    iArr = iArr2;
                    iArr2 = r7;
                } else {
                    iArr = null;
                    z2 = false;
                }
                LruCache<CharSequence, C9093b> lruCache = this.f17460a;
                C9093b c9093b = lruCache.get(charSequence);
                if (!z2 && c9093b != null && c9093b.f17466a == 0 && i6 == c9093b.f17467b) {
                    return c9093b;
                }
                int length2 = charSequence.length();
                if (iArr2 != null && iArr2.length > 0) {
                    int i10 = iArr[0];
                    i4 = iArr[1];
                    i3 = i10;
                    i2 = 0;
                } else {
                    i2 = -1;
                    i3 = Integer.MAX_VALUE;
                    i4 = Integer.MAX_VALUE;
                }
                C9093b c9093b2 = new C9093b(i6);
                int i11 = 0;
                int i12 = 0;
                loop1: while (true) {
                    i5 = i12;
                    boolean z5 = z4;
                    while (i11 < i6) {
                        if (i11 == i3) {
                            if (i11 - i5 > 0) {
                                if (z5) {
                                    i5--;
                                    z5 = z4;
                                }
                                c9093b2.m2703a(C9092a.m2705a(charSequence.subSequence(i5, i11)));
                            }
                            c9093b2.m2703a(C9092a.m2704b(charSequence.subSequence(i3, i4), iArr2[i2], this));
                            i2++;
                            if (i2 >= iArr2.length) {
                                i5 = i4;
                                i11 = i5;
                                i3 = Integer.MAX_VALUE;
                                i4 = Integer.MAX_VALUE;
                            } else {
                                int i13 = i2 * 2;
                                i3 = iArr[i13];
                                i11 = i4;
                                i4 = iArr[i13 + i7];
                                i5 = i11;
                            }
                        } else {
                            char charAt = charSequence.charAt(i11);
                            if (charAt == '[') {
                                if (i11 - i5 > 0) {
                                    c9093b2.m2703a(C9092a.m2705a(charSequence.subSequence(i5, i11)));
                                }
                                i5 = i11;
                                z4 = false;
                                z5 = true;
                                i11++;
                                iArr2 = iArr2;
                            } else {
                                int[] iArr3 = iArr2;
                                C10083e c10083e = this.f17461b;
                                if (charAt == ']' && z5) {
                                    i11++;
                                    if (i11 - i5 > 0) {
                                        charSequence.subSequence(i5, i11).toString();
                                        c10083e.getClass();
                                    }
                                    i12 = i5;
                                    iArr2 = iArr3;
                                    i7 = 1;
                                    z4 = false;
                                } else {
                                    if (charAt == '\n') {
                                        if (z5) {
                                            z5 = false;
                                        }
                                        if (i11 - i5 > 0) {
                                            c9093b2.m2703a(C9092a.m2705a(charSequence.subSequence(i5, i11)));
                                        }
                                        C9092a c9092a = new C9092a();
                                        c9092a.f17462a = 5;
                                        c9093b2.m2703a(c9092a);
                                        i11++;
                                        i5 = i11;
                                        z3 = false;
                                    } else {
                                        if (z5) {
                                            if (i11 - i5 > 8) {
                                                z5 = false;
                                            } else {
                                                z3 = false;
                                                i11++;
                                            }
                                        }
                                        c10083e.getClass();
                                        z3 = false;
                                        int charCount = Character.charCount(Character.codePointAt(charSequence, i11)) + 0;
                                        if (charCount < i6) {
                                            Character.codePointAt(charSequence, charCount);
                                        }
                                        i11++;
                                    }
                                    z4 = z3;
                                    iArr2 = iArr3;
                                }
                            }
                            i7 = 1;
                        }
                    }
                    break loop1;
                }
                if (i5 < i6) {
                    c9093b2.m2703a(C9092a.m2705a(charSequence.subSequence(i5, length2)));
                }
                if (!z2 && !z) {
                    lruCache.put(charSequence, c9093b2);
                }
                return c9093b2;
            }
            throw new IllegalArgumentException("end must > start");
        }
        throw new IllegalArgumentException("start must >= 0 and < text.length");
    }
}
