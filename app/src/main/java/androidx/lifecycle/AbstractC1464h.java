package androidx.lifecycle;

import androidx.annotation.MainThread;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public abstract class AbstractC1464h {

    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    public enum EnumC1465a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        @NotNull
        public static final C1466a Companion = new C1466a();

        /* renamed from: androidx.lifecycle.h$a$a */
        /* loaded from: classes.dex */
        public static final class C1466a {
            @JvmStatic
            @Nullable
            /* renamed from: a */
            public static EnumC1465a m10548a(@NotNull EnumC1468b state) {
                C10843j.m430f(state, "state");
                int ordinal = state.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            return null;
                        }
                        return EnumC1465a.ON_PAUSE;
                    }
                    return EnumC1465a.ON_STOP;
                }
                return EnumC1465a.ON_DESTROY;
            }

            @JvmStatic
            @Nullable
            /* renamed from: b */
            public static EnumC1465a m10547b(@NotNull EnumC1468b state) {
                C10843j.m430f(state, "state");
                int ordinal = state.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            return null;
                        }
                        return EnumC1465a.ON_RESUME;
                    }
                    return EnumC1465a.ON_START;
                }
                return EnumC1465a.ON_CREATE;
            }
        }

        /* renamed from: androidx.lifecycle.h$a$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class C1467b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f3435a;

            static {
                int[] iArr = new int[EnumC1465a.values().length];
                try {
                    iArr[EnumC1465a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1465a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1465a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1465a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1465a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1465a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC1465a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3435a = iArr;
            }
        }

        @NotNull
        /* renamed from: a */
        public final EnumC1468b m10549a() {
            switch (C1467b.f3435a[ordinal()]) {
                case 1:
                case 2:
                    return EnumC1468b.CREATED;
                case 3:
                case 4:
                    return EnumC1468b.STARTED;
                case 5:
                    return EnumC1468b.RESUMED;
                case 6:
                    return EnumC1468b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    /* loaded from: classes.dex */
    public enum EnumC1468b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public final boolean m10546a(@NotNull EnumC1468b state) {
            C10843j.m430f(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public AbstractC1464h() {
        new AtomicReference();
    }

    @MainThread
    /* renamed from: a */
    public abstract void mo10539a(@NotNull InterfaceC1481l interfaceC1481l);

    @MainThread
    @NotNull
    /* renamed from: b */
    public abstract EnumC1468b mo10538b();

    @MainThread
    /* renamed from: c */
    public abstract void mo10537c(@NotNull InterfaceC1481l interfaceC1481l);
}
