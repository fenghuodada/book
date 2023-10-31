package com.google.android.exoplayer2;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.C7187o;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: c */
    public final int f10472c;
    @Nullable

    /* renamed from: d */
    public final String f10473d;

    /* renamed from: e */
    public final int f10474e;
    @Nullable

    /* renamed from: f */
    public final C7003m0 f10475f;

    /* renamed from: g */
    public final int f10476g;
    @Nullable

    /* renamed from: h */
    public final C7187o f10477h;

    /* renamed from: i */
    public final boolean f10478i;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Type {
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExoPlaybackException(int r14, @androidx.annotation.Nullable java.lang.Throwable r15, int r16, @androidx.annotation.Nullable java.lang.String r17, int r18, @androidx.annotation.Nullable com.google.android.exoplayer2.C7003m0 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r5 = r17
            r8 = r20
            r0 = 2
            if (r4 == 0) goto L69
            r1 = 3
            r2 = 1
            if (r4 == r2) goto L16
            if (r4 == r1) goto L11
            java.lang.String r1 = "Unexpected runtime error"
            goto L13
        L11:
            java.lang.String r1 = "Remote error"
        L13:
            r7 = r18
            goto L6d
        L16:
            java.lang.String r3 = java.lang.String.valueOf(r19)
            java.util.UUID r6 = com.google.android.exoplayer2.C6622C.f10466a
            if (r8 == 0) goto L39
            if (r8 == r2) goto L36
            if (r8 == r0) goto L33
            if (r8 == r1) goto L30
            r1 = 4
            if (r8 != r1) goto L2a
            java.lang.String r1 = "YES"
            goto L3b
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L30:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L3b
        L33:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L3b
        L36:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L3b
        L39:
            java.lang.String r1 = "NO"
        L3b:
            r2 = 53
            int r2 = androidx.constraintlayout.motion.widget.C0552c.m12193a(r5, r2)
            int r6 = r3.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r7 = r18
            r6.append(r7)
            java.lang.String r2 = ", format="
            r6.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r1 = androidx.fragment.app.C1431t.m10577a(r6, r3, r2, r1)
            goto L6d
        L69:
            r7 = r18
            java.lang.String r1 = "Source error"
        L6d:
            r2 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L96
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = ": null"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r0
        L96:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, com.google.android.exoplayer2.m0, int, boolean):void");
    }

    public ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable C7003m0 c7003m0, int i4, @Nullable InterfaceC7188p.C7189a c7189a, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        C7394a.m5134a(!z || i2 == 1);
        C7394a.m5134a((th != null || i2 == 3) ? true : z2);
        this.f10472c = i2;
        this.f10473d = str2;
        this.f10474e = i3;
        this.f10475f = c7003m0;
        this.f10476g = i4;
        this.f10477h = c7189a;
        this.f10478i = z;
    }

    @CheckResult
    /* renamed from: a */
    public final ExoPlaybackException m6214a(@Nullable InterfaceC7188p.C7189a c7189a) {
        String message = getMessage();
        int i = C7408g0.f13905a;
        return new ExoPlaybackException(message, getCause(), this.f10538a, this.f10472c, this.f10473d, this.f10474e, this.f10475f, this.f10476g, c7189a, this.f10539b, this.f10478i);
    }
}
