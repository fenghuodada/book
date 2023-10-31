package com.google.android.datatransport.cct.internal;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.internal.b */
/* loaded from: classes.dex */
public final class C6438b implements Configurator {

    /* renamed from: a */
    public static final C6438b f10079a = new C6438b();

    /* renamed from: com.google.android.datatransport.cct.internal.b$a */
    /* loaded from: classes.dex */
    public static final class C6439a implements ObjectEncoder<AbstractC6437a> {

        /* renamed from: a */
        public static final C6439a f10080a = new C6439a();

        /* renamed from: b */
        public static final FieldDescriptor f10081b = FieldDescriptor.m3312of("sdkVersion");

        /* renamed from: c */
        public static final FieldDescriptor f10082c = FieldDescriptor.m3312of("model");

        /* renamed from: d */
        public static final FieldDescriptor f10083d = FieldDescriptor.m3312of("hardware");

        /* renamed from: e */
        public static final FieldDescriptor f10084e = FieldDescriptor.m3312of("device");

        /* renamed from: f */
        public static final FieldDescriptor f10085f = FieldDescriptor.m3312of(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* renamed from: g */
        public static final FieldDescriptor f10086g = FieldDescriptor.m3312of("osBuild");

        /* renamed from: h */
        public static final FieldDescriptor f10087h = FieldDescriptor.m3312of("manufacturer");

        /* renamed from: i */
        public static final FieldDescriptor f10088i = FieldDescriptor.m3312of("fingerprint");

        /* renamed from: j */
        public static final FieldDescriptor f10089j = FieldDescriptor.m3312of("locale");

        /* renamed from: k */
        public static final FieldDescriptor f10090k = FieldDescriptor.m3312of("country");

        /* renamed from: l */
        public static final FieldDescriptor f10091l = FieldDescriptor.m3312of("mccMnc");

        /* renamed from: m */
        public static final FieldDescriptor f10092m = FieldDescriptor.m3312of("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AbstractC6437a abstractC6437a = (AbstractC6437a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10081b, abstractC6437a.mo6338l());
            objectEncoderContext2.add(f10082c, abstractC6437a.mo6341i());
            objectEncoderContext2.add(f10083d, abstractC6437a.mo6345e());
            objectEncoderContext2.add(f10084e, abstractC6437a.mo6347c());
            objectEncoderContext2.add(f10085f, abstractC6437a.mo6339k());
            objectEncoderContext2.add(f10086g, abstractC6437a.mo6340j());
            objectEncoderContext2.add(f10087h, abstractC6437a.mo6343g());
            objectEncoderContext2.add(f10088i, abstractC6437a.mo6346d());
            objectEncoderContext2.add(f10089j, abstractC6437a.mo6344f());
            objectEncoderContext2.add(f10090k, abstractC6437a.mo6348b());
            objectEncoderContext2.add(f10091l, abstractC6437a.mo6342h());
            objectEncoderContext2.add(f10092m, abstractC6437a.mo6349a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$b */
    /* loaded from: classes.dex */
    public static final class C6440b implements ObjectEncoder<AbstractC6453j> {

        /* renamed from: a */
        public static final C6440b f10093a = new C6440b();

        /* renamed from: b */
        public static final FieldDescriptor f10094b = FieldDescriptor.m3312of("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f10094b, ((AbstractC6453j) obj).mo6337a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$c */
    /* loaded from: classes.dex */
    public static final class C6441c implements ObjectEncoder<AbstractC6454k> {

        /* renamed from: a */
        public static final C6441c f10095a = new C6441c();

        /* renamed from: b */
        public static final FieldDescriptor f10096b = FieldDescriptor.m3312of("clientType");

        /* renamed from: c */
        public static final FieldDescriptor f10097c = FieldDescriptor.m3312of("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AbstractC6454k abstractC6454k = (AbstractC6454k) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10096b, abstractC6454k.mo6335b());
            objectEncoderContext2.add(f10097c, abstractC6454k.mo6336a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$d */
    /* loaded from: classes.dex */
    public static final class C6442d implements ObjectEncoder<AbstractC6456l> {

        /* renamed from: a */
        public static final C6442d f10098a = new C6442d();

        /* renamed from: b */
        public static final FieldDescriptor f10099b = FieldDescriptor.m3312of("eventTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f10100c = FieldDescriptor.m3312of("eventCode");

        /* renamed from: d */
        public static final FieldDescriptor f10101d = FieldDescriptor.m3312of("eventUptimeMs");

        /* renamed from: e */
        public static final FieldDescriptor f10102e = FieldDescriptor.m3312of("sourceExtension");

        /* renamed from: f */
        public static final FieldDescriptor f10103f = FieldDescriptor.m3312of("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final FieldDescriptor f10104g = FieldDescriptor.m3312of("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final FieldDescriptor f10105h = FieldDescriptor.m3312of("networkConnectionInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AbstractC6456l abstractC6456l = (AbstractC6456l) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10099b, abstractC6456l.mo6333b());
            objectEncoderContext2.add(f10100c, abstractC6456l.mo6334a());
            objectEncoderContext2.add(f10101d, abstractC6456l.mo6332c());
            objectEncoderContext2.add(f10102e, abstractC6456l.mo6330e());
            objectEncoderContext2.add(f10103f, abstractC6456l.mo6329f());
            objectEncoderContext2.add(f10104g, abstractC6456l.mo6328g());
            objectEncoderContext2.add(f10105h, abstractC6456l.mo6331d());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$e */
    /* loaded from: classes.dex */
    public static final class C6443e implements ObjectEncoder<AbstractC6458m> {

        /* renamed from: a */
        public static final C6443e f10106a = new C6443e();

        /* renamed from: b */
        public static final FieldDescriptor f10107b = FieldDescriptor.m3312of("requestTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f10108c = FieldDescriptor.m3312of("requestUptimeMs");

        /* renamed from: d */
        public static final FieldDescriptor f10109d = FieldDescriptor.m3312of("clientInfo");

        /* renamed from: e */
        public static final FieldDescriptor f10110e = FieldDescriptor.m3312of("logSource");

        /* renamed from: f */
        public static final FieldDescriptor f10111f = FieldDescriptor.m3312of("logSourceName");

        /* renamed from: g */
        public static final FieldDescriptor f10112g = FieldDescriptor.m3312of("logEvent");

        /* renamed from: h */
        public static final FieldDescriptor f10113h = FieldDescriptor.m3312of("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AbstractC6458m abstractC6458m = (AbstractC6458m) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10107b, abstractC6458m.mo6322f());
            objectEncoderContext2.add(f10108c, abstractC6458m.mo6321g());
            objectEncoderContext2.add(f10109d, abstractC6458m.mo6327a());
            objectEncoderContext2.add(f10110e, abstractC6458m.mo6325c());
            objectEncoderContext2.add(f10111f, abstractC6458m.mo6324d());
            objectEncoderContext2.add(f10112g, abstractC6458m.mo6326b());
            objectEncoderContext2.add(f10113h, abstractC6458m.mo6323e());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$f */
    /* loaded from: classes.dex */
    public static final class C6444f implements ObjectEncoder<AbstractC6460o> {

        /* renamed from: a */
        public static final C6444f f10114a = new C6444f();

        /* renamed from: b */
        public static final FieldDescriptor f10115b = FieldDescriptor.m3312of("networkType");

        /* renamed from: c */
        public static final FieldDescriptor f10116c = FieldDescriptor.m3312of("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AbstractC6460o abstractC6460o = (AbstractC6460o) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10115b, abstractC6460o.mo6317b());
            objectEncoderContext2.add(f10116c, abstractC6460o.mo6318a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        C6440b c6440b = C6440b.f10093a;
        encoderConfig.registerEncoder(AbstractC6453j.class, c6440b);
        encoderConfig.registerEncoder(C6446d.class, c6440b);
        C6443e c6443e = C6443e.f10106a;
        encoderConfig.registerEncoder(AbstractC6458m.class, c6443e);
        encoderConfig.registerEncoder(C6450g.class, c6443e);
        C6441c c6441c = C6441c.f10095a;
        encoderConfig.registerEncoder(AbstractC6454k.class, c6441c);
        encoderConfig.registerEncoder(C6447e.class, c6441c);
        C6439a c6439a = C6439a.f10080a;
        encoderConfig.registerEncoder(AbstractC6437a.class, c6439a);
        encoderConfig.registerEncoder(C6445c.class, c6439a);
        C6442d c6442d = C6442d.f10098a;
        encoderConfig.registerEncoder(AbstractC6456l.class, c6442d);
        encoderConfig.registerEncoder(C6448f.class, c6442d);
        C6444f c6444f = C6444f.f10114a;
        encoderConfig.registerEncoder(AbstractC6460o.class, c6444f);
        encoderConfig.registerEncoder(C6452i.class, c6444f);
    }
}
