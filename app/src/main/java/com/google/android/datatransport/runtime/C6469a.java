package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.C6503a;
import com.google.android.datatransport.runtime.firebase.transport.C6505b;
import com.google.android.datatransport.runtime.firebase.transport.C6506c;
import com.google.android.datatransport.runtime.firebase.transport.C6508d;
import com.google.android.datatransport.runtime.firebase.transport.C6509e;
import com.google.android.datatransport.runtime.firebase.transport.C6510f;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.runtime.a */
/* loaded from: classes.dex */
public final class C6469a implements Configurator {

    /* renamed from: a */
    public static final C6469a f10168a = new C6469a();

    /* renamed from: com.google.android.datatransport.runtime.a$a */
    /* loaded from: classes.dex */
    public static final class C6470a implements ObjectEncoder<C6503a> {

        /* renamed from: a */
        public static final C6470a f10169a = new C6470a();

        /* renamed from: b */
        public static final FieldDescriptor f10170b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f10171c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        public static final FieldDescriptor f10172d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        public static final FieldDescriptor f10173e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            C6503a c6503a = (C6503a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10170b, c6503a.f10245a);
            objectEncoderContext2.add(f10171c, c6503a.f10246b);
            objectEncoderContext2.add(f10172d, c6503a.f10247c);
            objectEncoderContext2.add(f10173e, c6503a.f10248d);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$b */
    /* loaded from: classes.dex */
    public static final class C6471b implements ObjectEncoder<C6505b> {

        /* renamed from: a */
        public static final C6471b f10174a = new C6471b();

        /* renamed from: b */
        public static final FieldDescriptor f10175b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f10175b, ((C6505b) obj).f10253a);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$c */
    /* loaded from: classes.dex */
    public static final class C6472c implements ObjectEncoder<C6506c> {

        /* renamed from: a */
        public static final C6472c f10176a = new C6472c();

        /* renamed from: b */
        public static final FieldDescriptor f10177b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f10178c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            C6506c c6506c = (C6506c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10177b, c6506c.f10254a);
            objectEncoderContext2.add(f10178c, c6506c.f10255b);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$d */
    /* loaded from: classes.dex */
    public static final class C6473d implements ObjectEncoder<C6508d> {

        /* renamed from: a */
        public static final C6473d f10179a = new C6473d();

        /* renamed from: b */
        public static final FieldDescriptor f10180b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f10181c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            C6508d c6508d = (C6508d) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10180b, c6508d.f10266a);
            objectEncoderContext2.add(f10181c, c6508d.f10267b);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$e */
    /* loaded from: classes.dex */
    public static final class C6474e implements ObjectEncoder<AbstractC6517k> {

        /* renamed from: a */
        public static final C6474e f10182a = new C6474e();

        /* renamed from: b */
        public static final FieldDescriptor f10183b = FieldDescriptor.m3312of("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f10183b, ((AbstractC6517k) obj).m6287a());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$f */
    /* loaded from: classes.dex */
    public static final class C6475f implements ObjectEncoder<C6509e> {

        /* renamed from: a */
        public static final C6475f f10184a = new C6475f();

        /* renamed from: b */
        public static final FieldDescriptor f10185b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f10186c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            C6509e c6509e = (C6509e) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10185b, c6509e.f10268a);
            objectEncoderContext2.add(f10186c, c6509e.f10269b);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.a$g */
    /* loaded from: classes.dex */
    public static final class C6476g implements ObjectEncoder<C6510f> {

        /* renamed from: a */
        public static final C6476g f10187a = new C6476g();

        /* renamed from: b */
        public static final FieldDescriptor f10188b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        public static final FieldDescriptor f10189c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            C6510f c6510f = (C6510f) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f10188b, c6510f.f10270a);
            objectEncoderContext2.add(f10189c, c6510f.f10271b);
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(AbstractC6517k.class, C6474e.f10182a);
        encoderConfig.registerEncoder(C6503a.class, C6470a.f10169a);
        encoderConfig.registerEncoder(C6510f.class, C6476g.f10187a);
        encoderConfig.registerEncoder(C6508d.class, C6473d.f10179a);
        encoderConfig.registerEncoder(C6506c.class, C6472c.f10176a);
        encoderConfig.registerEncoder(C6505b.class, C6471b.f10174a);
        encoderConfig.registerEncoder(C6509e.class, C6475f.f10184a);
    }
}
