package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.internal.schedulers.C10206b;
import io.reactivex.rxjava3.internal.schedulers.C10211d;
import io.reactivex.rxjava3.internal.schedulers.C10215e;
import io.reactivex.rxjava3.internal.schedulers.C10224l;
import io.reactivex.rxjava3.internal.schedulers.C10226m;
import java.util.Objects;

/* renamed from: io.reactivex.rxjava3.schedulers.a */
/* loaded from: classes3.dex */
public final class C10235a {
    @NonNull

    /* renamed from: a */
    public static final C10206b f20569a;
    @NonNull

    /* renamed from: b */
    public static final C10211d f20570b;

    /* renamed from: io.reactivex.rxjava3.schedulers.a$a */
    /* loaded from: classes3.dex */
    public static final class C10236a {

        /* renamed from: a */
        public static final C10206b f20571a = new C10206b();
    }

    /* renamed from: io.reactivex.rxjava3.schedulers.a$b */
    /* loaded from: classes3.dex */
    public static final class C10237b {

        /* renamed from: a */
        public static final C10211d f20572a = new C10211d();
    }

    /* renamed from: io.reactivex.rxjava3.schedulers.a$c */
    /* loaded from: classes3.dex */
    public static final class C10238c {

        /* renamed from: a */
        public static final C10215e f20573a = new C10215e();
    }

    /* renamed from: io.reactivex.rxjava3.schedulers.a$d */
    /* loaded from: classes3.dex */
    public static final class C10239d {

        /* renamed from: a */
        public static final C10224l f20574a = new C10224l();
    }

    static {
        RuntimeException m1191a;
        try {
            Objects.requireNonNull(C10239d.f20574a, "Scheduler Supplier result can't be null");
            try {
                C10206b c10206b = C10236a.f20571a;
                Objects.requireNonNull(c10206b, "Scheduler Supplier result can't be null");
                f20569a = c10206b;
                try {
                    C10211d c10211d = C10237b.f20572a;
                    Objects.requireNonNull(c10211d, "Scheduler Supplier result can't be null");
                    f20570b = c10211d;
                    int i = C10226m.f20549b;
                    try {
                        Objects.requireNonNull(C10238c.f20573a, "Scheduler Supplier result can't be null");
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
