package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.datatransport.cct.internal.AbstractC6453j;
import com.google.android.datatransport.cct.internal.C6438b;
import com.google.android.datatransport.runtime.backends.InterfaceC6494o;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.google.android.datatransport.cct.c */
/* loaded from: classes.dex */
public final class C6433c implements InterfaceC6494o {

    /* renamed from: a */
    public final DataEncoder f10066a = new JsonDataEncoderBuilder().configureWith(C6438b.f10079a).ignoreNullValues(true).build();

    /* renamed from: b */
    public final ConnectivityManager f10067b;

    /* renamed from: c */
    public final Context f10068c;

    /* renamed from: d */
    public final URL f10069d;

    /* renamed from: e */
    public final InterfaceC6611a f10070e;

    /* renamed from: f */
    public final InterfaceC6611a f10071f;

    /* renamed from: g */
    public final int f10072g;

    /* renamed from: com.google.android.datatransport.cct.c$a */
    /* loaded from: classes.dex */
    public static final class C6434a {

        /* renamed from: a */
        public final URL f10073a;

        /* renamed from: b */
        public final AbstractC6453j f10074b;
        @Nullable

        /* renamed from: c */
        public final String f10075c;

        public C6434a(URL url, AbstractC6453j abstractC6453j, @Nullable String str) {
            this.f10073a = url;
            this.f10074b = abstractC6453j;
            this.f10075c = str;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.c$b */
    /* loaded from: classes.dex */
    public static final class C6435b {

        /* renamed from: a */
        public final int f10076a;
        @Nullable

        /* renamed from: b */
        public final URL f10077b;

        /* renamed from: c */
        public final long f10078c;

        public C6435b(int i, @Nullable URL url, long j) {
            this.f10076a = i;
            this.f10077b = url;
            this.f10078c = j;
        }
    }

    public C6433c(Context context, InterfaceC6611a interfaceC6611a, InterfaceC6611a interfaceC6611a2) {
        this.f10068c = context;
        this.f10067b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = C6431a.f10060c;
        try {
            this.f10069d = new URL(str);
            this.f10070e = interfaceC6611a2;
            this.f10071f = interfaceC6611a;
            this.f10072g = 130000;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C0552c.m12192b("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        if (com.google.android.datatransport.cct.internal.AbstractC6460o.EnumC6461a.f10158a.get(r0) != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6494o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.runtime.C6477b mo6303a(com.google.android.datatransport.runtime.AbstractC6512h r7) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.C6433c.mo6303a(com.google.android.datatransport.runtime.h):com.google.android.datatransport.runtime.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0382 A[Catch: IOException -> 0x0485, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x038c A[Catch: IOException -> 0x0485, TRY_LEAVE, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043b A[Catch: IOException -> 0x0485, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x044a A[Catch: IOException -> 0x0485, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044f A[Catch: IOException -> 0x0485, EDGE_INSN: B:222:0x044f->B:175:0x044f ?: BREAK  , TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0455 A[Catch: IOException -> 0x0485, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x044f A[ADDED_TO_REGION, EDGE_INSN: B:222:0x044f->B:175:0x044f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x044f A[EDGE_INSN: B:222:0x044f->B:175:0x044f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0319 A[Catch: IOException -> 0x0485, TRY_LEAVE, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033b A[Catch: IOException -> 0x040e, EncodingException -> 0x0410, UnknownHostException -> 0x0412, ConnectException -> 0x0414, TRY_ENTER, TRY_LEAVE, TryCatch #8 {EncodingException -> 0x0410, ConnectException -> 0x0414, UnknownHostException -> 0x0412, IOException -> 0x040e, blocks: (B:89:0x031e, B:94:0x033b, B:156:0x040d, B:155:0x040a), top: B:206:0x031e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0350 A[Catch: IOException -> 0x0485, TryCatch #10 {IOException -> 0x0485, blocks: (B:78:0x02a4, B:81:0x02b2, B:85:0x02c5, B:86:0x02d3, B:88:0x0319, B:95:0x033e, B:97:0x0350, B:98:0x035f, B:107:0x0382, B:168:0x0437, B:170:0x043b, B:173:0x044a, B:175:0x044f, B:177:0x0455, B:186:0x046b, B:188:0x0473, B:190:0x047c, B:108:0x038c, B:118:0x03be, B:138:0x03e0, B:165:0x0416, B:167:0x0427, B:109:0x0390, B:111:0x039a, B:116:0x03b9, B:114:0x03a1), top: B:205:0x02a4 }] */
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6494o
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.runtime.backends.C6480b mo6302b(com.google.android.datatransport.runtime.backends.C6479a r31) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.C6433c.mo6302b(com.google.android.datatransport.runtime.backends.a):com.google.android.datatransport.runtime.backends.b");
    }
}
