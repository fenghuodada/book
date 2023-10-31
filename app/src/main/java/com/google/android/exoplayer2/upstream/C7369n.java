package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.profileinstaller.C1544f;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C6642d0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.upstream.InterfaceC7352d;
import com.google.android.exoplayer2.util.C7397b0;
import com.google.android.exoplayer2.util.C7431t;
import com.google.android.exoplayer2.util.C7440z;
import com.google.android.exoplayer2.util.InterfaceC7396b;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.collect.AbstractC8007q;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.AbstractC8021u;
import com.google.common.collect.C7998n0;
import com.google.common.collect.C8018t;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.upstream.n */
/* loaded from: classes.dex */
public final class C7369n implements InterfaceC7352d, InterfaceC7351c0 {

    /* renamed from: n */
    public static final C8018t<String, Integer> f13785n = m5161h();

    /* renamed from: o */
    public static final C7998n0 f13786o = AbstractC8013s.m4244s(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* renamed from: p */
    public static final C7998n0 f13787p = AbstractC8013s.m4244s(248000L, 160000L, 142000L, 127000L, 113000L);

    /* renamed from: q */
    public static final C7998n0 f13788q = AbstractC8013s.m4244s(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* renamed from: r */
    public static final C7998n0 f13789r = AbstractC8013s.m4244s(4400000L, 2300000L, 1500000L, 1100000L, 640000L);

    /* renamed from: s */
    public static final C7998n0 f13790s = AbstractC8013s.m4244s(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* renamed from: t */
    public static final C7998n0 f13791t = AbstractC8013s.m4244s(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    @Nullable

    /* renamed from: u */
    public static C7369n f13792u;

    /* renamed from: a */
    public final AbstractC8021u<Integer, Long> f13793a;

    /* renamed from: b */
    public final InterfaceC7352d.InterfaceC7353a.C7354a f13794b;

    /* renamed from: c */
    public final C7440z f13795c;

    /* renamed from: d */
    public final InterfaceC7396b f13796d;

    /* renamed from: e */
    public final boolean f13797e;

    /* renamed from: f */
    public int f13798f;

    /* renamed from: g */
    public long f13799g;

    /* renamed from: h */
    public long f13800h;

    /* renamed from: i */
    public int f13801i;

    /* renamed from: j */
    public long f13802j;

    /* renamed from: k */
    public long f13803k;

    /* renamed from: l */
    public long f13804l;

    /* renamed from: m */
    public long f13805m;

    /* renamed from: com.google.android.exoplayer2.upstream.n$a */
    /* loaded from: classes.dex */
    public static final class C7370a {
        @Nullable

        /* renamed from: a */
        public final Context f13806a;

        /* renamed from: b */
        public final HashMap f13807b;

        /* renamed from: c */
        public final int f13808c;

        /* renamed from: d */
        public final C7397b0 f13809d;

        /* renamed from: e */
        public final boolean f13810e;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
            if (android.text.TextUtils.isEmpty(r14) == false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C7370a(android.content.Context r14) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C7369n.C7370a.<init>(android.content.Context):void");
        }
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, com.google.android.exoplayer2.upstream.m] */
    public C7369n(Context context, HashMap hashMap, int i, C7397b0 c7397b0, boolean z) {
        int i2;
        AbstractC8021u<Integer, Long> m4229a;
        final C7431t c7431t;
        if ((hashMap instanceof AbstractC8021u) && !(hashMap instanceof SortedMap)) {
            m4229a = (AbstractC8021u) hashMap;
            m4229a.mo4230d();
        } else {
            Set<Map.Entry> entrySet = hashMap.entrySet();
            boolean z2 = entrySet instanceof Collection;
            if (z2) {
                i2 = entrySet.size();
            } else {
                i2 = 4;
            }
            AbstractC8021u.C8022a c8022a = new AbstractC8021u.C8022a(i2);
            if (z2) {
                int size = (entrySet.size() + c8022a.f15830b) * 2;
                Object[] objArr = c8022a.f15829a;
                if (size > objArr.length) {
                    c8022a.f15829a = Arrays.copyOf(objArr, AbstractC8007q.AbstractC8009b.m4249a(objArr.length, size));
                }
            }
            for (Map.Entry entry : entrySet) {
                c8022a.m4228b(entry.getKey(), entry.getValue());
            }
            m4229a = c8022a.m4229a();
        }
        this.f13793a = m4229a;
        this.f13794b = new InterfaceC7352d.InterfaceC7353a.C7354a();
        this.f13795c = new C7440z(i);
        this.f13796d = c7397b0;
        this.f13797e = z;
        if (context != null) {
            synchronized (C7431t.class) {
                if (C7431t.f13967e == null) {
                    C7431t.f13967e = new C7431t(context);
                }
                c7431t = C7431t.f13967e;
            }
            int m5033b = c7431t.m5033b();
            this.f13801i = m5033b;
            this.f13804l = m5160i(m5033b);
            final ?? r6 = new C7431t.InterfaceC7432a() { // from class: com.google.android.exoplayer2.upstream.m
                @Override // com.google.android.exoplayer2.util.C7431t.InterfaceC7432a
                /* renamed from: a */
                public final void mo5032a(int i3) {
                    int i4;
                    C7369n c7369n = C7369n.this;
                    synchronized (c7369n) {
                        int i5 = c7369n.f13801i;
                        if ((i5 == 0 || c7369n.f13797e) && i5 != i3) {
                            c7369n.f13801i = i3;
                            if (i3 != 1 && i3 != 0 && i3 != 8) {
                                c7369n.f13804l = c7369n.m5160i(i3);
                                long elapsedRealtime = c7369n.f13796d.elapsedRealtime();
                                if (c7369n.f13798f > 0) {
                                    i4 = (int) (elapsedRealtime - c7369n.f13799g);
                                } else {
                                    i4 = 0;
                                }
                                c7369n.m5159j(i4, c7369n.f13800h, c7369n.f13804l);
                                c7369n.f13799g = elapsedRealtime;
                                c7369n.f13800h = 0L;
                                c7369n.f13803k = 0L;
                                c7369n.f13802j = 0L;
                                C7440z c7440z = c7369n.f13795c;
                                c7440z.f13988b.clear();
                                c7440z.f13990d = -1;
                                c7440z.f13991e = 0;
                                c7440z.f13992f = 0;
                            }
                        }
                    }
                }
            };
            CopyOnWriteArrayList<WeakReference<C7431t.InterfaceC7432a>> copyOnWriteArrayList = c7431t.f13969b;
            Iterator<WeakReference<C7431t.InterfaceC7432a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<C7431t.InterfaceC7432a> next = it.next();
                if (next.get() == null) {
                    copyOnWriteArrayList.remove(next);
                }
            }
            copyOnWriteArrayList.add(new WeakReference<>(r6));
            c7431t.f13968a.post(new Runnable() { // from class: com.google.android.exoplayer2.util.s
                @Override // java.lang.Runnable
                public final void run() {
                    r6.mo5032a(C7431t.this.m5033b());
                }
            });
            return;
        }
        this.f13801i = 0;
        this.f13804l = m5160i(0);
    }

    /* renamed from: h */
    public static C8018t<String, Integer> m5161h() {
        C8018t.C8019a m4236f = C8018t.m4236f();
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "AD");
        m4236f.m4234b(new Integer[]{1, 4, 4, 4, 2, 2}, "AE");
        m4236f.m4234b(new Integer[]{4, 4, 3, 4, 2, 2}, "AF");
        m4236f.m4234b(new Integer[]{4, 2, 1, 4, 2, 2}, "AG");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "AI");
        m4236f.m4234b(new Integer[]{1, 1, 1, 1, 2, 2}, "AL");
        m4236f.m4234b(new Integer[]{2, 2, 1, 3, 2, 2}, "AM");
        m4236f.m4234b(new Integer[]{3, 4, 3, 1, 2, 2}, "AO");
        m4236f.m4234b(new Integer[]{2, 4, 2, 1, 2, 2}, "AR");
        m4236f.m4234b(new Integer[]{2, 2, 3, 3, 2, 2}, "AS");
        m4236f.m4234b(new Integer[]{0, 1, 0, 0, 0, 2}, "AT");
        m4236f.m4234b(new Integer[]{0, 2, 0, 1, 1, 2}, "AU");
        m4236f.m4234b(new Integer[]{1, 2, 0, 4, 2, 2}, "AW");
        m4236f.m4234b(new Integer[]{0, 2, 2, 2, 2, 2}, "AX");
        m4236f.m4234b(new Integer[]{3, 3, 3, 4, 4, 2}, "AZ");
        m4236f.m4234b(new Integer[]{1, 1, 0, 1, 2, 2}, "BA");
        m4236f.m4234b(new Integer[]{0, 2, 0, 0, 2, 2}, "BB");
        m4236f.m4234b(new Integer[]{2, 0, 3, 3, 2, 2}, "BD");
        m4236f.m4234b(new Integer[]{0, 0, 2, 3, 2, 2}, "BE");
        m4236f.m4234b(new Integer[]{4, 4, 4, 2, 2, 2}, "BF");
        m4236f.m4234b(new Integer[]{0, 1, 0, 0, 2, 2}, "BG");
        m4236f.m4234b(new Integer[]{1, 0, 2, 4, 2, 2}, "BH");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "BI");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "BJ");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "BL");
        m4236f.m4234b(new Integer[]{0, 2, 0, 0, 2, 2}, "BM");
        m4236f.m4234b(new Integer[]{3, 2, 1, 0, 2, 2}, "BN");
        m4236f.m4234b(new Integer[]{1, 2, 4, 2, 2, 2}, "BO");
        m4236f.m4234b(new Integer[]{1, 2, 1, 2, 2, 2}, "BQ");
        m4236f.m4234b(new Integer[]{2, 4, 3, 2, 2, 2}, "BR");
        m4236f.m4234b(new Integer[]{2, 2, 1, 3, 2, 2}, "BS");
        m4236f.m4234b(new Integer[]{3, 0, 3, 2, 2, 2}, "BT");
        m4236f.m4234b(new Integer[]{3, 4, 1, 1, 2, 2}, "BW");
        m4236f.m4234b(new Integer[]{1, 1, 1, 2, 2, 2}, "BY");
        m4236f.m4234b(new Integer[]{2, 2, 2, 2, 2, 2}, "BZ");
        m4236f.m4234b(new Integer[]{0, 3, 1, 2, 4, 2}, "CA");
        m4236f.m4234b(new Integer[]{4, 2, 2, 1, 2, 2}, "CD");
        m4236f.m4234b(new Integer[]{4, 2, 3, 2, 2, 2}, "CF");
        m4236f.m4234b(new Integer[]{3, 4, 2, 2, 2, 2}, "CG");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 1, 2}, "CH");
        m4236f.m4234b(new Integer[]{3, 3, 3, 3, 2, 2}, "CI");
        m4236f.m4234b(new Integer[]{2, 2, 3, 0, 2, 2}, "CK");
        m4236f.m4234b(new Integer[]{1, 1, 2, 2, 2, 2}, "CL");
        m4236f.m4234b(new Integer[]{3, 4, 3, 2, 2, 2}, "CM");
        m4236f.m4234b(new Integer[]{2, 2, 2, 1, 3, 2}, "CN");
        m4236f.m4234b(new Integer[]{2, 3, 4, 2, 2, 2}, "CO");
        m4236f.m4234b(new Integer[]{2, 3, 4, 4, 2, 2}, "CR");
        m4236f.m4234b(new Integer[]{4, 4, 2, 2, 2, 2}, "CU");
        m4236f.m4234b(new Integer[]{2, 3, 1, 0, 2, 2}, "CV");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "CW");
        m4236f.m4234b(new Integer[]{1, 1, 0, 0, 2, 2}, "CY");
        m4236f.m4234b(new Integer[]{0, 1, 0, 0, 1, 2}, "CZ");
        m4236f.m4234b(new Integer[]{0, 0, 1, 1, 0, 2}, "DE");
        m4236f.m4234b(new Integer[]{4, 0, 4, 4, 2, 2}, "DJ");
        m4236f.m4234b(new Integer[]{0, 0, 1, 0, 0, 2}, "DK");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "DM");
        m4236f.m4234b(new Integer[]{3, 4, 4, 4, 2, 2}, "DO");
        m4236f.m4234b(new Integer[]{3, 3, 4, 4, 2, 4}, "DZ");
        m4236f.m4234b(new Integer[]{2, 4, 3, 1, 2, 2}, "EC");
        m4236f.m4234b(new Integer[]{0, 1, 0, 0, 2, 2}, "EE");
        m4236f.m4234b(new Integer[]{3, 4, 3, 3, 2, 2}, "EG");
        m4236f.m4234b(new Integer[]{2, 2, 2, 2, 2, 2}, "EH");
        m4236f.m4234b(new Integer[]{4, 2, 2, 2, 2, 2}, "ER");
        m4236f.m4234b(new Integer[]{0, 1, 1, 1, 2, 2}, "ES");
        m4236f.m4234b(new Integer[]{4, 4, 4, 1, 2, 2}, "ET");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 0, 2}, "FI");
        m4236f.m4234b(new Integer[]{3, 0, 2, 3, 2, 2}, "FJ");
        m4236f.m4234b(new Integer[]{4, 2, 2, 2, 2, 2}, "FK");
        m4236f.m4234b(new Integer[]{3, 2, 4, 4, 2, 2}, "FM");
        m4236f.m4234b(new Integer[]{1, 2, 0, 1, 2, 2}, "FO");
        m4236f.m4234b(new Integer[]{1, 1, 2, 0, 1, 2}, "FR");
        m4236f.m4234b(new Integer[]{3, 4, 1, 1, 2, 2}, "GA");
        m4236f.m4234b(new Integer[]{0, 0, 1, 1, 1, 2}, "GB");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "GD");
        m4236f.m4234b(new Integer[]{1, 1, 1, 2, 2, 2}, "GE");
        m4236f.m4234b(new Integer[]{2, 2, 2, 3, 2, 2}, "GF");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "GG");
        m4236f.m4234b(new Integer[]{3, 1, 3, 2, 2, 2}, "GH");
        m4236f.m4234b(new Integer[]{0, 2, 0, 0, 2, 2}, "GI");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "GL");
        m4236f.m4234b(new Integer[]{4, 3, 2, 4, 2, 2}, "GM");
        m4236f.m4234b(new Integer[]{4, 3, 4, 2, 2, 2}, "GN");
        m4236f.m4234b(new Integer[]{2, 1, 2, 3, 2, 2}, "GP");
        m4236f.m4234b(new Integer[]{4, 2, 2, 4, 2, 2}, "GQ");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "GR");
        m4236f.m4234b(new Integer[]{3, 2, 3, 1, 2, 2}, "GT");
        m4236f.m4234b(new Integer[]{1, 2, 3, 4, 2, 2}, "GU");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "GW");
        m4236f.m4234b(new Integer[]{3, 3, 3, 4, 2, 2}, "GY");
        m4236f.m4234b(new Integer[]{0, 1, 2, 3, 2, 0}, "HK");
        m4236f.m4234b(new Integer[]{3, 1, 3, 3, 2, 2}, "HN");
        m4236f.m4234b(new Integer[]{1, 1, 0, 0, 3, 2}, "HR");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "HT");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 0, 2}, "HU");
        m4236f.m4234b(new Integer[]{3, 2, 3, 3, 2, 2}, "ID");
        m4236f.m4234b(new Integer[]{0, 0, 1, 1, 3, 2}, "IE");
        m4236f.m4234b(new Integer[]{1, 0, 2, 3, 4, 2}, "IL");
        m4236f.m4234b(new Integer[]{0, 2, 0, 1, 2, 2}, "IM");
        m4236f.m4234b(new Integer[]{2, 1, 3, 3, 2, 2}, "IN");
        m4236f.m4234b(new Integer[]{4, 2, 2, 4, 2, 2}, "IO");
        m4236f.m4234b(new Integer[]{3, 3, 4, 4, 2, 2}, "IQ");
        m4236f.m4234b(new Integer[]{3, 2, 3, 2, 2, 2}, "IR");
        m4236f.m4234b(new Integer[]{0, 2, 0, 0, 2, 2}, "IS");
        m4236f.m4234b(new Integer[]{0, 4, 0, 1, 2, 2}, "IT");
        m4236f.m4234b(new Integer[]{2, 2, 1, 2, 2, 2}, "JE");
        m4236f.m4234b(new Integer[]{3, 3, 4, 4, 2, 2}, "JM");
        m4236f.m4234b(new Integer[]{2, 2, 1, 1, 2, 2}, "JO");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 2, 1}, "JP");
        m4236f.m4234b(new Integer[]{3, 4, 2, 2, 2, 2}, "KE");
        m4236f.m4234b(new Integer[]{2, 0, 1, 1, 2, 2}, "KG");
        m4236f.m4234b(new Integer[]{1, 0, 4, 3, 2, 2}, "KH");
        m4236f.m4234b(new Integer[]{4, 2, 4, 3, 2, 2}, "KI");
        m4236f.m4234b(new Integer[]{4, 3, 2, 3, 2, 2}, "KM");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "KN");
        m4236f.m4234b(new Integer[]{4, 2, 2, 2, 2, 2}, "KP");
        m4236f.m4234b(new Integer[]{0, 0, 1, 3, 1, 2}, "KR");
        m4236f.m4234b(new Integer[]{1, 3, 1, 1, 1, 2}, "KW");
        m4236f.m4234b(new Integer[]{1, 2, 0, 2, 2, 2}, "KY");
        m4236f.m4234b(new Integer[]{2, 2, 2, 3, 2, 2}, "KZ");
        m4236f.m4234b(new Integer[]{1, 2, 1, 1, 2, 2}, "LA");
        m4236f.m4234b(new Integer[]{3, 2, 0, 0, 2, 2}, "LB");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "LC");
        m4236f.m4234b(new Integer[]{0, 2, 2, 2, 2, 2}, "LI");
        m4236f.m4234b(new Integer[]{2, 0, 2, 3, 2, 2}, "LK");
        m4236f.m4234b(new Integer[]{3, 4, 4, 3, 2, 2}, "LR");
        m4236f.m4234b(new Integer[]{3, 3, 2, 3, 2, 2}, "LS");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 2, 2}, "LT");
        m4236f.m4234b(new Integer[]{1, 0, 1, 1, 2, 2}, "LU");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 2, 2}, "LV");
        m4236f.m4234b(new Integer[]{4, 2, 4, 3, 2, 2}, "LY");
        m4236f.m4234b(new Integer[]{3, 2, 2, 1, 2, 2}, RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        m4236f.m4234b(new Integer[]{0, 2, 0, 0, 2, 2}, "MC");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "MD");
        m4236f.m4234b(new Integer[]{1, 2, 0, 1, 2, 2}, "ME");
        m4236f.m4234b(new Integer[]{2, 2, 1, 1, 2, 2}, "MF");
        m4236f.m4234b(new Integer[]{3, 4, 2, 2, 2, 2}, "MG");
        m4236f.m4234b(new Integer[]{4, 2, 2, 4, 2, 2}, "MH");
        m4236f.m4234b(new Integer[]{1, 1, 0, 0, 2, 2}, "MK");
        m4236f.m4234b(new Integer[]{4, 4, 2, 2, 2, 2}, "ML");
        m4236f.m4234b(new Integer[]{2, 3, 3, 3, 2, 2}, "MM");
        m4236f.m4234b(new Integer[]{2, 4, 2, 2, 2, 2}, "MN");
        m4236f.m4234b(new Integer[]{0, 2, 4, 4, 2, 2}, "MO");
        m4236f.m4234b(new Integer[]{0, 2, 2, 2, 2, 2}, "MP");
        m4236f.m4234b(new Integer[]{2, 2, 2, 3, 2, 2}, "MQ");
        m4236f.m4234b(new Integer[]{3, 0, 4, 3, 2, 2}, "MR");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "MS");
        m4236f.m4234b(new Integer[]{0, 2, 0, 0, 2, 2}, "MT");
        m4236f.m4234b(new Integer[]{2, 1, 1, 2, 2, 2}, "MU");
        m4236f.m4234b(new Integer[]{4, 3, 2, 4, 2, 2}, "MV");
        m4236f.m4234b(new Integer[]{4, 2, 1, 0, 2, 2}, "MW");
        m4236f.m4234b(new Integer[]{2, 4, 4, 4, 4, 2}, "MX");
        m4236f.m4234b(new Integer[]{1, 0, 3, 2, 2, 2}, "MY");
        m4236f.m4234b(new Integer[]{3, 3, 2, 1, 2, 2}, "MZ");
        m4236f.m4234b(new Integer[]{4, 3, 3, 2, 2, 2}, "NA");
        m4236f.m4234b(new Integer[]{3, 0, 4, 4, 2, 2}, "NC");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "NE");
        m4236f.m4234b(new Integer[]{2, 2, 2, 2, 2, 2}, "NF");
        m4236f.m4234b(new Integer[]{3, 3, 2, 3, 2, 2}, "NG");
        m4236f.m4234b(new Integer[]{2, 1, 4, 4, 2, 2}, "NI");
        m4236f.m4234b(new Integer[]{0, 2, 3, 2, 0, 2}, "NL");
        m4236f.m4234b(new Integer[]{0, 1, 2, 0, 0, 2}, "NO");
        m4236f.m4234b(new Integer[]{2, 0, 4, 2, 2, 2}, "NP");
        m4236f.m4234b(new Integer[]{3, 2, 3, 1, 2, 2}, "NR");
        m4236f.m4234b(new Integer[]{4, 2, 2, 2, 2, 2}, "NU");
        m4236f.m4234b(new Integer[]{0, 2, 1, 2, 4, 2}, "NZ");
        m4236f.m4234b(new Integer[]{2, 2, 1, 3, 3, 2}, "OM");
        m4236f.m4234b(new Integer[]{1, 3, 3, 3, 2, 2}, "PA");
        m4236f.m4234b(new Integer[]{2, 3, 4, 4, 2, 2}, "PE");
        m4236f.m4234b(new Integer[]{2, 2, 2, 1, 2, 2}, "PF");
        m4236f.m4234b(new Integer[]{4, 4, 3, 2, 2, 2}, RequestConfiguration.MAX_AD_CONTENT_RATING_PG);
        m4236f.m4234b(new Integer[]{2, 1, 3, 3, 3, 2}, "PH");
        m4236f.m4234b(new Integer[]{3, 2, 3, 3, 2, 2}, "PK");
        m4236f.m4234b(new Integer[]{1, 0, 1, 2, 3, 2}, "PL");
        m4236f.m4234b(new Integer[]{0, 2, 2, 2, 2, 2}, "PM");
        m4236f.m4234b(new Integer[]{2, 1, 2, 2, 4, 3}, "PR");
        m4236f.m4234b(new Integer[]{3, 3, 2, 2, 2, 2}, "PS");
        m4236f.m4234b(new Integer[]{0, 1, 1, 0, 2, 2}, "PT");
        m4236f.m4234b(new Integer[]{1, 2, 4, 1, 2, 2}, "PW");
        m4236f.m4234b(new Integer[]{2, 0, 3, 2, 2, 2}, "PY");
        m4236f.m4234b(new Integer[]{2, 3, 1, 2, 3, 2}, "QA");
        m4236f.m4234b(new Integer[]{1, 0, 2, 2, 2, 2}, "RE");
        m4236f.m4234b(new Integer[]{0, 1, 0, 1, 0, 2}, "RO");
        m4236f.m4234b(new Integer[]{1, 2, 0, 0, 2, 2}, "RS");
        m4236f.m4234b(new Integer[]{0, 1, 0, 1, 4, 2}, "RU");
        m4236f.m4234b(new Integer[]{3, 3, 3, 1, 2, 2}, "RW");
        m4236f.m4234b(new Integer[]{2, 2, 2, 1, 1, 2}, "SA");
        m4236f.m4234b(new Integer[]{4, 2, 3, 2, 2, 2}, "SB");
        m4236f.m4234b(new Integer[]{4, 2, 1, 3, 2, 2}, "SC");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "SD");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 0, 2}, "SE");
        m4236f.m4234b(new Integer[]{1, 0, 1, 2, 3, 2}, "SG");
        m4236f.m4234b(new Integer[]{4, 2, 2, 2, 2, 2}, "SH");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 2, 2}, "SI");
        m4236f.m4234b(new Integer[]{2, 2, 2, 2, 2, 2}, "SJ");
        m4236f.m4234b(new Integer[]{0, 1, 0, 0, 2, 2}, "SK");
        m4236f.m4234b(new Integer[]{4, 3, 4, 0, 2, 2}, "SL");
        m4236f.m4234b(new Integer[]{0, 2, 2, 2, 2, 2}, "SM");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "SN");
        m4236f.m4234b(new Integer[]{3, 3, 3, 4, 2, 2}, "SO");
        m4236f.m4234b(new Integer[]{3, 2, 2, 2, 2, 2}, "SR");
        m4236f.m4234b(new Integer[]{4, 4, 3, 3, 2, 2}, "SS");
        m4236f.m4234b(new Integer[]{2, 2, 1, 2, 2, 2}, "ST");
        m4236f.m4234b(new Integer[]{2, 1, 4, 3, 2, 2}, "SV");
        m4236f.m4234b(new Integer[]{2, 2, 1, 0, 2, 2}, "SX");
        m4236f.m4234b(new Integer[]{4, 3, 3, 2, 2, 2}, "SY");
        m4236f.m4234b(new Integer[]{3, 3, 2, 4, 2, 2}, "SZ");
        m4236f.m4234b(new Integer[]{2, 2, 2, 0, 2, 2}, "TC");
        m4236f.m4234b(new Integer[]{4, 3, 4, 4, 2, 2}, "TD");
        m4236f.m4234b(new Integer[]{3, 2, 2, 4, 2, 2}, "TG");
        m4236f.m4234b(new Integer[]{0, 3, 2, 3, 2, 2}, "TH");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "TJ");
        m4236f.m4234b(new Integer[]{4, 0, 4, 4, 2, 2}, "TL");
        m4236f.m4234b(new Integer[]{4, 2, 4, 3, 2, 2}, "TM");
        m4236f.m4234b(new Integer[]{2, 1, 1, 2, 2, 2}, "TN");
        m4236f.m4234b(new Integer[]{3, 3, 4, 3, 2, 2}, "TO");
        m4236f.m4234b(new Integer[]{1, 2, 1, 1, 2, 2}, "TR");
        m4236f.m4234b(new Integer[]{1, 4, 0, 1, 2, 2}, "TT");
        m4236f.m4234b(new Integer[]{3, 2, 2, 4, 2, 2}, "TV");
        m4236f.m4234b(new Integer[]{0, 0, 0, 0, 1, 0}, "TW");
        m4236f.m4234b(new Integer[]{3, 3, 3, 2, 2, 2}, "TZ");
        m4236f.m4234b(new Integer[]{0, 3, 1, 1, 2, 2}, "UA");
        m4236f.m4234b(new Integer[]{3, 2, 3, 3, 2, 2}, "UG");
        m4236f.m4234b(new Integer[]{1, 1, 2, 2, 4, 2}, "US");
        m4236f.m4234b(new Integer[]{2, 2, 1, 1, 2, 2}, "UY");
        m4236f.m4234b(new Integer[]{2, 1, 3, 4, 2, 2}, "UZ");
        m4236f.m4234b(new Integer[]{1, 2, 2, 2, 2, 2}, "VC");
        m4236f.m4234b(new Integer[]{4, 4, 4, 4, 2, 2}, "VE");
        m4236f.m4234b(new Integer[]{2, 2, 1, 1, 2, 2}, "VG");
        m4236f.m4234b(new Integer[]{1, 2, 1, 2, 2, 2}, "VI");
        m4236f.m4234b(new Integer[]{0, 1, 3, 4, 2, 2}, "VN");
        m4236f.m4234b(new Integer[]{4, 0, 3, 1, 2, 2}, "VU");
        m4236f.m4234b(new Integer[]{4, 2, 2, 4, 2, 2}, "WF");
        m4236f.m4234b(new Integer[]{3, 1, 3, 1, 2, 2}, "WS");
        m4236f.m4234b(new Integer[]{0, 1, 1, 0, 2, 2}, "XK");
        m4236f.m4234b(new Integer[]{4, 4, 4, 3, 2, 2}, "YE");
        m4236f.m4234b(new Integer[]{4, 2, 2, 3, 2, 2}, "YT");
        m4236f.m4234b(new Integer[]{3, 3, 2, 1, 2, 2}, "ZA");
        m4236f.m4234b(new Integer[]{3, 2, 3, 3, 2, 2}, "ZM");
        m4236f.m4234b(new Integer[]{3, 2, 4, 3, 2, 2}, "ZW");
        return m4236f.m4235a();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7351c0
    /* renamed from: a */
    public final synchronized void mo5168a(DataSpec dataSpec, boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            if ((dataSpec.f13720i & 8) == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        this.f13800h += i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0005, B:16:0x0018, B:19:0x001d, B:21:0x003a, B:23:0x0053, B:26:0x0065, B:25:0x005c, B:27:0x0073), top: B:33:0x0005 }] */
    @Override // com.google.android.exoplayer2.upstream.InterfaceC7351c0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo5167b(com.google.android.exoplayer2.upstream.DataSpec r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L13
            int r10 = r10.f13720i     // Catch: java.lang.Throwable -> L7a
            r11 = 8
            r10 = r10 & r11
            if (r10 != r11) goto Le
            r10 = r0
            goto Lf
        Le:
            r10 = r1
        Lf:
            if (r10 != 0) goto L13
            r10 = r0
            goto L14
        L13:
            r10 = r1
        L14:
            if (r10 != 0) goto L18
            monitor-exit(r9)
            return
        L18:
            int r10 = r9.f13798f     // Catch: java.lang.Throwable -> L7a
            if (r10 <= 0) goto L1d
            r1 = r0
        L1d:
            com.google.android.exoplayer2.util.C7394a.m5131d(r1)     // Catch: java.lang.Throwable -> L7a
            com.google.android.exoplayer2.util.b r10 = r9.f13796d     // Catch: java.lang.Throwable -> L7a
            long r10 = r10.elapsedRealtime()     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f13799g     // Catch: java.lang.Throwable -> L7a
            long r1 = r10 - r1
            int r4 = (int) r1     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f13802j     // Catch: java.lang.Throwable -> L7a
            long r5 = (long) r4     // Catch: java.lang.Throwable -> L7a
            long r1 = r1 + r5
            r9.f13802j = r1     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f13803k     // Catch: java.lang.Throwable -> L7a
            long r5 = r9.f13800h     // Catch: java.lang.Throwable -> L7a
            long r1 = r1 + r5
            r9.f13803k = r1     // Catch: java.lang.Throwable -> L7a
            if (r4 <= 0) goto L73
            float r1 = (float) r5     // Catch: java.lang.Throwable -> L7a
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r1 = r1 * r2
            float r2 = (float) r4     // Catch: java.lang.Throwable -> L7a
            float r1 = r1 / r2
            com.google.android.exoplayer2.util.z r2 = r9.f13795c     // Catch: java.lang.Throwable -> L7a
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L7a
            double r5 = java.lang.Math.sqrt(r5)     // Catch: java.lang.Throwable -> L7a
            int r3 = (int) r5     // Catch: java.lang.Throwable -> L7a
            r2.m4981a(r1, r3)     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f13802j     // Catch: java.lang.Throwable -> L7a
            r5 = 2000(0x7d0, double:9.88E-321)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L5c
            long r1 = r9.f13803k     // Catch: java.lang.Throwable -> L7a
            r5 = 524288(0x80000, double:2.590327E-318)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L65
        L5c:
            com.google.android.exoplayer2.util.z r1 = r9.f13795c     // Catch: java.lang.Throwable -> L7a
            float r1 = r1.m4980b()     // Catch: java.lang.Throwable -> L7a
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L7a
            r9.f13804l = r1     // Catch: java.lang.Throwable -> L7a
        L65:
            long r5 = r9.f13800h     // Catch: java.lang.Throwable -> L7a
            long r7 = r9.f13804l     // Catch: java.lang.Throwable -> L7a
            r3 = r9
            r3.m5159j(r4, r5, r7)     // Catch: java.lang.Throwable -> L7a
            r9.f13799g = r10     // Catch: java.lang.Throwable -> L7a
            r10 = 0
            r9.f13800h = r10     // Catch: java.lang.Throwable -> L7a
        L73:
            int r10 = r9.f13798f     // Catch: java.lang.Throwable -> L7a
            int r10 = r10 - r0
            r9.f13798f = r10     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r9)
            return
        L7a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C7369n.mo5167b(com.google.android.exoplayer2.upstream.DataSpec, boolean):void");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7351c0
    /* renamed from: c */
    public final void mo5166c() {
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7352d
    /* renamed from: d */
    public final C7369n mo5165d() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7352d
    /* renamed from: e */
    public final void mo5164e(C6642d0 c6642d0) {
        this.f13794b.m5176a(c6642d0);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7351c0
    /* renamed from: f */
    public final synchronized void mo5163f(DataSpec dataSpec, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            if ((dataSpec.f13720i & 8) == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (this.f13798f == 0) {
            this.f13799g = this.f13796d.elapsedRealtime();
        }
        this.f13798f++;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7352d
    /* renamed from: g */
    public final void mo5162g(Handler handler, InterfaceC7352d.InterfaceC7353a interfaceC7353a) {
        interfaceC7353a.getClass();
        InterfaceC7352d.InterfaceC7353a.C7354a c7354a = this.f13794b;
        c7354a.getClass();
        c7354a.m5176a(interfaceC7353a);
        c7354a.f13743a.add(new InterfaceC7352d.InterfaceC7353a.C7354a.C7355a(handler, interfaceC7353a));
    }

    /* renamed from: i */
    public final long m5160i(int i) {
        Integer valueOf = Integer.valueOf(i);
        AbstractC8021u<Integer, Long> abstractC8021u = this.f13793a;
        Long l = abstractC8021u.get(valueOf);
        if (l == null) {
            l = abstractC8021u.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: j */
    public final void m5159j(final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == this.f13805m) {
            return;
        }
        this.f13805m = j2;
        Iterator<InterfaceC7352d.InterfaceC7353a.C7354a.C7355a> it = this.f13794b.f13743a.iterator();
        while (it.hasNext()) {
            final InterfaceC7352d.InterfaceC7353a.C7354a.C7355a next = it.next();
            if (!next.f13746c) {
                next.f13744a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC7188p.C7189a next2;
                        InterfaceC7188p.C7189a c7189a;
                        InterfaceC7188p.C7189a c7189a2;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        C6642d0 c6642d0 = (C6642d0) InterfaceC7352d.InterfaceC7353a.C7354a.C7355a.this.f13745b;
                        C6642d0.C6643a c6643a = c6642d0.f10574c;
                        if (c6643a.f10581b.isEmpty()) {
                            c7189a2 = null;
                        } else {
                            AbstractC8013s<InterfaceC7188p.C7189a> abstractC8013s = c6643a.f10581b;
                            if (abstractC8013s instanceof List) {
                                if (!abstractC8013s.isEmpty()) {
                                    c7189a = abstractC8013s.get(abstractC8013s.size() - 1);
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                Iterator<InterfaceC7188p.C7189a> it2 = abstractC8013s.iterator();
                                do {
                                    next2 = it2.next();
                                } while (it2.hasNext());
                                c7189a = next2;
                            }
                            c7189a2 = c7189a;
                        }
                        AnalyticsListener.C6634a m6140S = c6642d0.m6140S(c7189a2);
                        c6642d0.m6137V(m6140S, 1006, new C1544f(m6140S, i2, j3, j4));
                    }
                });
            }
        }
    }
}
