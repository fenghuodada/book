package com.google.android.exoplayer2.text.ssa;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import com.google.common.base.C7935d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.ssa.a */
/* loaded from: classes.dex */
public final class C7249a extends AbstractC7207a {

    /* renamed from: r */
    public static final Pattern f13210r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m */
    public final boolean f13211m;
    @Nullable

    /* renamed from: n */
    public final C7250b f13212n;

    /* renamed from: o */
    public LinkedHashMap f13213o;

    /* renamed from: p */
    public float f13214p = -3.4028235E38f;

    /* renamed from: q */
    public float f13215q = -3.4028235E38f;

    public C7249a(@Nullable List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.f13211m = true;
            int i = C7408g0.f13905a;
            String str = new String(list.get(0), C7935d.f15693c);
            C7394a.m5134a(str.startsWith("Format:"));
            C7250b m5325a = C7250b.m5325a(str);
            m5325a.getClass();
            this.f13212n = m5325a;
            m5327j(new C7436v(list.get(1)));
            return;
        }
        this.f13211m = false;
        this.f13212n = null;
    }

    /* renamed from: i */
    public static int m5328i(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) arrayList.get(size)).longValue() != j) {
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                return size;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* renamed from: k */
    public static long m5326k(String str) {
        Matcher matcher = f13210r.matcher(str.trim());
        if (matcher.matches()) {
            String group = matcher.group(1);
            int i = C7408g0.f13905a;
            long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
            return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.text.InterfaceC7209c mo5287h(byte[] r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.C7249a.mo5287h(byte[], int, boolean):com.google.android.exoplayer2.text.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5327j(com.google.android.exoplayer2.util.C7436v r35) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.C7249a.m5327j(com.google.android.exoplayer2.util.v):void");
    }
}
