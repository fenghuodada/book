package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.AbstractC7207a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.subrip.a */
/* loaded from: classes.dex */
public final class C7252a extends AbstractC7207a {

    /* renamed from: o */
    public static final Pattern f13223o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    public static final Pattern f13224p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m */
    public final StringBuilder f13225m = new StringBuilder();

    /* renamed from: n */
    public final ArrayList<String> f13226n = new ArrayList<>();

    /* renamed from: i */
    public static long m5324i(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + j;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong += Long.parseLong(group4);
        }
        return parseLong * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x026c, code lost:
        return new com.google.android.exoplayer2.text.subrip.C7253b((com.google.android.exoplayer2.text.Cue[]) r2.toArray(new com.google.android.exoplayer2.text.Cue[r5]), java.util.Arrays.copyOf(r3, r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0215  */
    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.text.InterfaceC7209c mo5287h(byte[] r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.subrip.C7252a.mo5287h(byte[], int, boolean):com.google.android.exoplayer2.text.c");
    }
}
