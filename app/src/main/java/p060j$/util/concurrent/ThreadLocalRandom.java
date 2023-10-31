package p060j$.util.concurrent;

import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p060j$.util.stream.AbstractC10707w0;
import p060j$.util.stream.C10508F;
import p060j$.util.stream.C10657m0;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.concurrent.ThreadLocalRandom */
/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final AtomicInteger f20783d = new AtomicInteger();

    /* renamed from: e */
    private static final AtomicLong f20784e;

    /* renamed from: f */
    private static final ThreadLocal f20785f;

    /* renamed from: g */
    private static final ThreadLocal f20786g;

    /* renamed from: a */
    long f20787a;

    /* renamed from: b */
    int f20788b;

    /* renamed from: c */
    boolean f20789c = true;

    static {
        long m970h;
        if (((Boolean) AccessController.doPrivileged(new C10362x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            m970h = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                m970h = (m970h << 8) | (seed[i] & 255);
            }
        } else {
            m970h = m970h(System.nanoTime()) ^ m970h(System.currentTimeMillis());
        }
        f20784e = new AtomicLong(m970h);
        f20785f = new ThreadLocal();
        f20786g = new C10363y();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final int m977a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f20786g.get()).f20788b = i4;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final int m976b() {
        return ((ThreadLocalRandom) f20786g.get()).f20788b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f20786g.get();
        if (threadLocalRandom.f20788b == 0) {
            m972f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static final void m972f() {
        int addAndGet = f20783d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long m970h = m970h(f20784e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f20786g.get();
        threadLocalRandom.f20787a = m970h;
        threadLocalRandom.f20788b = addAndGet;
    }

    /* renamed from: g */
    private static int m971g(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* renamed from: h */
    private static long m970h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final double m975c(double d, double d2) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d < d2) {
            double d3 = ((d2 - d) * nextLong) + d;
            return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
        }
        return nextLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m974d(int i, int i2) {
        int i3;
        int m971g = m971g(m969i());
        if (i < i2) {
            int i4 = i2 - i;
            int i5 = i4 - 1;
            if ((i4 & i5) == 0) {
                i3 = m971g & i5;
            } else if (i4 > 0) {
                int i6 = m971g >>> 1;
                while (true) {
                    int i7 = i6 + i5;
                    i3 = i6 % i4;
                    if (i7 - i3 >= 0) {
                        break;
                    }
                    i6 = m971g(m969i()) >>> 1;
                }
            } else {
                while (true) {
                    if (m971g >= i && m971g < i2) {
                        return m971g;
                    }
                    m971g = m971g(m969i());
                }
            }
            return i3 + i;
        }
        return m971g;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return C10508F.m815A(AbstractC10707w0.m572a1(new C10364z(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d, double d2) {
        if (d < d2) {
            return C10508F.m815A(AbstractC10707w0.m572a1(new C10364z(0L, Long.MAX_VALUE, d, d2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return C10508F.m815A(AbstractC10707w0.m572a1(new C10364z(0L, j, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d, double d2) {
        if (j >= 0) {
            if (d < d2) {
                return C10508F.m815A(AbstractC10707w0.m572a1(new C10364z(0L, j, d, d2)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final long m973e(long j, long j2) {
        long j3;
        long m970h = m970h(m969i());
        if (j < j2) {
            long j4 = j2 - j;
            long j5 = j4 - 1;
            if ((j4 & j5) == 0) {
                j3 = m970h & j5;
            } else if (j4 > 0) {
                while (true) {
                    long j6 = m970h >>> 1;
                    long j7 = j6 + j5;
                    j3 = j6 % j4;
                    if (j7 - j3 >= 0) {
                        break;
                    }
                    m970h = m970h(m969i());
                }
            } else {
                while (true) {
                    if (m970h >= j && m970h < j2) {
                        return m970h;
                    }
                    m970h = m970h(m969i());
                }
            }
            return j3 + j;
        }
        return m970h;
    }

    /* renamed from: i */
    final long m969i() {
        long j = this.f20787a - 7046029254386353131L;
        this.f20787a = j;
        return j;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC10707w0.m562k1(new C10337A(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i, int i2) {
        if (i < i2) {
            return IntStream.Wrapper.convert(AbstractC10707w0.m562k1(new C10337A(0L, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j) {
        if (j >= 0) {
            return IntStream.Wrapper.convert(AbstractC10707w0.m562k1(new C10337A(0L, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j, int i, int i2) {
        if (j >= 0) {
            if (i < i2) {
                return IntStream.Wrapper.convert(AbstractC10707w0.m562k1(new C10337A(0L, j, i, i2)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C10657m0.m657A(AbstractC10707w0.m560m1(new C10338B(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j >= 0) {
            return C10657m0.m657A(AbstractC10707w0.m560m1(new C10338B(0L, j, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C10657m0.m657A(AbstractC10707w0.m560m1(new C10338B(0L, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j >= 0) {
            if (j2 < j3) {
                return C10657m0.m657A(AbstractC10707w0.m560m1(new C10338B(0L, j, j2, j3)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return (int) (m970h(m969i()) >>> (64 - i));
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m971g(m969i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m970h(m969i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m971g(m969i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f20785f;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                threadLocal.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        return m971g(m969i());
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int m971g = m971g(m969i());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return m971g & i2;
        }
        while (true) {
            int i3 = m971g >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            m971g = m971g(m969i());
        }
    }

    public int nextInt(int i, int i2) {
        if (i < i2) {
            return m974d(i, i2);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m970h(m969i());
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f20789c) {
            throw new UnsupportedOperationException();
        }
    }
}
