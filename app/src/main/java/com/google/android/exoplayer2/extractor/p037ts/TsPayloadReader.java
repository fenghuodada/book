package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7436v;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader */
/* loaded from: classes.dex */
public interface TsPayloadReader {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$Flags */
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$a */
    /* loaded from: classes.dex */
    public static final class C6910a {

        /* renamed from: a */
        public final String f11660a;

        /* renamed from: b */
        public final byte[] f11661b;

        public C6910a(String str, byte[] bArr) {
            this.f11660a = str;
            this.f11661b = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$b */
    /* loaded from: classes.dex */
    public static final class C6911b {
        @Nullable

        /* renamed from: a */
        public final String f11662a;

        /* renamed from: b */
        public final List<C6910a> f11663b;

        /* renamed from: c */
        public final byte[] f11664c;

        public C6911b(int i, @Nullable String str, @Nullable ArrayList arrayList, byte[] bArr) {
            this.f11662a = str;
            this.f11663b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f11664c = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$c */
    /* loaded from: classes.dex */
    public interface InterfaceC6912c {
        @Nullable
        /* renamed from: a */
        TsPayloadReader mo5846a(int i, C6911b c6911b);
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$d */
    /* loaded from: classes.dex */
    public static final class C6913d {

        /* renamed from: a */
        public final String f11665a;

        /* renamed from: b */
        public final int f11666b;

        /* renamed from: c */
        public final int f11667c;

        /* renamed from: d */
        public int f11668d;

        /* renamed from: e */
        public String f11669e;

        public C6913d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C6913d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i);
                sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                str = sb.toString();
            } else {
                str = "";
            }
            this.f11665a = str;
            this.f11666b = i2;
            this.f11667c = i3;
            this.f11668d = Integer.MIN_VALUE;
            this.f11669e = "";
        }

        /* renamed from: a */
        public final void m5845a() {
            int i;
            int i2 = this.f11668d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f11666b;
            } else {
                i = i2 + this.f11667c;
            }
            this.f11668d = i;
            String str = this.f11665a;
            this.f11669e = C0510h.m12340a(C0552c.m12193a(str, 11), str, i);
        }

        /* renamed from: b */
        public final void m5844b() {
            if (this.f11668d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    /* renamed from: a */
    void mo5819a(C7404e0 c7404e0, InterfaceC6833i interfaceC6833i, C6913d c6913d);

    /* renamed from: b */
    void mo5818b(int i, C7436v c7436v) throws C7506y0;

    /* renamed from: c */
    void mo5817c();
}
